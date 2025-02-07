/**
 * A pure function is referentially transparent, meaning it can be replaced by
 * the value it computes/returns without changing the program's behaviour. It
 * also means that pure functions that are called repeatedly with the same
 * input will always return the same output. This ensures pure functions are
 * easy to understand, predictable, and very safe since they do not have any
 * side effects.
 *
 * Impure functions are functions that produce side effects. Side effects can
 * range from writing or reading data from external sources like files, the
 * console, databases, or web services, to mutating the parameters passed to
 * them, or other hidden states like the fields in their containing class.
 * Despite this, they are needed because they allow real-world applications to
 * interact and communicate with the outside world.
 *
 * Both pure and impure functions offer advantages and disadvantages and
 * typically in practice, we should build the core of our applications using
 * pure functions, and then integrate it with impure functions to allow the
 * application to interact with the outside world.
 *
 * Looking back over the methods written in the MVP, I would say that all of
 * them follow the definition of pure functions; they are referentially
 * transparent: they do not have side effects like modifying outside state,
 * and they always return the same output.
 *
 * Most of the methods written for the Extension task, on the other side, are
 * impure; they are not referentially transparent because they can produce
 * different results when they are repeatedly called with the same input. They
 * also write and read data to and from the console. Not very pure, but needed
 * for interaction with the user, in our case!
 */
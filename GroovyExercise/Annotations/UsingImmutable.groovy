package Annotations
import groovy.transform.Immutable

/**
 * Immutable objects  are  inherently  thread-safe, and it  is  a  good  practice  to
 * mark fields as final. Groovy makes it easier to do the right thing by marking
 * the fields as final and, as a bonus, creating some convenience methods for us
 * if we mark a class with the {@code @Immutable} annotation.
 * <p>
 * Groovy  rewards  our  gesture  by  providing  us  with  a  constructor  where
 * parameters appear in the order of the fields. The fields can’t be changed after
 * the construction time.  In  addition, Groovy adds the {@code hashCode()},  {@code equals()}, and
 * {@code toString()} methods.
 * </p>
 * <p>
 * We can use the {@code @Immutable} annotation to create lightweight immutable-value objects easily. These
 * are ideal instances to pass as messages in the actor-based model in concurrent applications,
 * where thread-safety is a big concern.
 * </p>
 * */
@Immutable
class CreditCard {
    String cardNumber
    int creditLimit
}

def creditCard = new CreditCard("4000-1111-2222-3333", 1000)
println creditCard

// We can't assign anything variables as cardNumber and creditLimit. Since they are final values.
// creditCard.cardNumber = "2222-1111-4444-5555"
// creditCard.creditLimit = "999999999999999999999"
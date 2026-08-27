import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Iterators;
import com.google.common.collect.PeekingIterator;
import java.util.Comparator;
import java.util.Iterator;

public class gcq<T> extends AbstractIterator<T> {
   private final PeekingIterator<T> a;
   private final PeekingIterator<T> b;
   private final Comparator<T> c;

   public gcq(Iterator<T> $$0, Iterator<T> $$1, Comparator<T> $$2) {
      this.a = Iterators.peekingIterator($$0);
      this.b = Iterators.peekingIterator($$1);
      this.c = $$2;
   }

   protected T computeNext() {
      boolean $$0 = !this.a.hasNext();
      boolean $$1 = !this.b.hasNext();
      if ($$0 && $$1) {
         return (T)this.endOfData();
      } else if ($$0) {
         return (T)this.b.next();
      } else if ($$1) {
         return (T)this.a.next();
      } else {
         int $$2 = this.c.compare((T)this.a.peek(), (T)this.b.peek());
         if ($$2 == 0) {
            this.b.next();
         }

         return (T)($$2 <= 0 ? this.a.next() : this.b.next());
      }
   }
}

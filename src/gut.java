import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Iterators;
import com.google.common.collect.PeekingIterator;
import java.util.Comparator;
import java.util.Iterator;

public class gut<T> extends AbstractIterator<T> {
   private final PeekingIterator<T> a;
   private final PeekingIterator<T> b;
   private final Comparator<T> c;

   public gut(Iterator<T> $$0, Iterator<T> $$1, Comparator<T> $$2) {
      this.a = Iterators.peekingIterator($$0);
      this.b = Iterators.peekingIterator($$1);
      this.c = $$2;
   }

   protected T computeNext() {
      while (this.a.hasNext() && this.b.hasNext()) {
         int $$0 = this.c.compare((T)this.a.peek(), (T)this.b.peek());
         if ($$0 == 0) {
            this.b.next();
            return (T)this.a.next();
         }

         if ($$0 < 0) {
            this.a.next();
         } else {
            this.b.next();
         }
      }

      return (T)this.endOfData();
   }
}

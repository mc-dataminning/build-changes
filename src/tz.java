import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public sealed interface tz extends Iterable<va>, va permits ug, tx, ue, uh {
   void clear();

   boolean a(int var1, va var2);

   boolean b(int var1, va var2);

   va d(int var1);

   va c(int var1);

   int size();

   default boolean isEmpty() {
      return this.size() == 0;
   }

   @Override
   default Iterator<va> iterator() {
      return new Iterator<va>() {
         private int b;

         @Override
         public boolean hasNext() {
            return this.b < tz.this.size();
         }

         public va a() {
            if (!this.hasNext()) {
               throw new NoSuchElementException();
            } else {
               return tz.this.c(this.b++);
            }
         }
      };
   }

   default Stream<va> stream() {
      return StreamSupport.stream(this.spliterator(), false);
   }
}

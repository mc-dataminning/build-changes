import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public sealed interface ty extends Iterable<uy>, uy permits uf, tw, ud, ug {
   void clear();

   boolean a(int var1, uy var2);

   boolean b(int var1, uy var2);

   uy d(int var1);

   uy c(int var1);

   int size();

   default boolean isEmpty() {
      return this.size() == 0;
   }

   @Override
   default Iterator<uy> iterator() {
      return new Iterator<uy>() {
         private int b;

         @Override
         public boolean hasNext() {
            return this.b < ty.this.size();
         }

         public uy a() {
            if (!this.hasNext()) {
               throw new NoSuchElementException();
            } else {
               return ty.this.c(this.b++);
            }
         }
      };
   }

   default Stream<uy> stream() {
      return StreamSupport.stream(this.spliterator(), false);
   }
}

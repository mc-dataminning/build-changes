import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface xw {
   int a = 4096;

   static <T extends uw, P extends xv<? super T>> xw a(final xz<P> $$0, final Function<Iterable<xx<? super T>>, P> $$1, final xu<? super T> $$2) {
      return new xw() {
         @Override
         public void a(xx<?> $$0x, Consumer<xx<?>> $$1x) {
            if ($$0.a() == $$0) {
               P $$2 = (P)$$0;
               $$1.accept($$2);
               $$2.b().forEach($$1);
               $$1.accept($$2);
            } else {
               $$1.accept($$0);
            }
         }

         @Nullable
         @Override
         public xw.a a(xx<?> $$0x) {
            return $$0 == $$2 ? new xw.a() {
               private final List<xx<? super T>> b = new ArrayList<>();

               @Nullable
               @Override
               public xx<?> a(xx<?> $$0x) {
                  if ($$0 == $$2) {
                     return $$1.apply(this.b);
                  } else if (this.b.size() >= 4096) {
                     throw new IllegalStateException("Too many packets in a bundle");
                  } else {
                     this.b.add((xx<? super T>)$$0);
                     return null;
                  }
               }
            } : null;
         }
      };
   }

   void a(xx<?> var1, Consumer<xx<?>> var2);

   @Nullable
   xw.a a(xx<?> var1);

   public interface a {
      @Nullable
      xx<?> a(xx<?> var1);
   }
}

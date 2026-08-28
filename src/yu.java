import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface yu {
   int a = 4096;

   static <T extends vu, P extends yt<? super T>> yu a(final yx<P> $$0, final Function<Iterable<yv<? super T>>, P> $$1, final ys<? super T> $$2) {
      return new yu() {
         @Override
         public void a(yv<?> $$0x, Consumer<yv<?>> $$1x) {
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
         public yu.a a(yv<?> $$0x) {
            return $$0 == $$2 ? new yu.a() {
               private final List<yv<? super T>> b = new ArrayList<>();

               @Nullable
               @Override
               public yv<?> a(yv<?> $$0x) {
                  if ($$0 == $$2) {
                     return $$1.apply(this.b);
                  } else if (this.b.size() >= 4096) {
                     throw new IllegalStateException("Too many packets in a bundle");
                  } else {
                     this.b.add((yv<? super T>)$$0);
                     return null;
                  }
               }
            } : null;
         }
      };
   }

   void a(yv<?> var1, Consumer<yv<?>> var2);

   @Nullable
   yu.a a(yv<?> var1);

   public interface a {
      @Nullable
      yv<?> a(yv<?> var1);
   }
}

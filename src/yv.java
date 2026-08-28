import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface yv {
   int a = 4096;

   static <T extends vv, P extends yu<? super T>> yv a(final yy<P> $$0, final Function<Iterable<yw<? super T>>, P> $$1, final yt<? super T> $$2) {
      return new yv() {
         @Override
         public void a(yw<?> $$0x, Consumer<yw<?>> $$1x) {
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
         public yv.a a(yw<?> $$0x) {
            return $$0 == $$2 ? new yv.a() {
               private final List<yw<? super T>> b = new ArrayList<>();

               @Nullable
               @Override
               public yw<?> a(yw<?> $$0x) {
                  if ($$0 == $$2) {
                     return $$1.apply(this.b);
                  } else if (this.b.size() >= 4096) {
                     throw new IllegalStateException("Too many packets in a bundle");
                  } else {
                     this.b.add((yw<? super T>)$$0);
                     return null;
                  }
               }
            } : null;
         }
      };
   }

   void a(yw<?> var1, Consumer<yw<?>> var2);

   @Nullable
   yv.a a(yw<?> var1);

   public interface a {
      @Nullable
      yw<?> a(yw<?> var1);
   }
}

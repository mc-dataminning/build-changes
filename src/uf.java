import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface uf {
   static uf a(final Runnable $$0) {
      return new uf() {
         @Override
         public void a() {
            $$0.run();
         }

         @Nullable
         @Override
         public wo<?> b() {
            $$0.run();
            return null;
         }
      };
   }

   static uf a(final Supplier<wo<?>> $$0) {
      return new uf() {
         @Nullable
         @Override
         public wo<?> b() {
            return $$0.get();
         }
      };
   }

   default void a() {
   }

   @Nullable
   default wo<?> b() {
      return null;
   }
}

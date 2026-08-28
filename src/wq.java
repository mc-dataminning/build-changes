import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface wq {
   static wq a(final Runnable $$0) {
      return new wq() {
         @Override
         public void a() {
            $$0.run();
         }

         @Nullable
         @Override
         public zq<?> b() {
            $$0.run();
            return null;
         }
      };
   }

   static wq a(final Supplier<zq<?>> $$0) {
      return new wq() {
         @Nullable
         @Override
         public zq<?> b() {
            return $$0.get();
         }
      };
   }

   default void a() {
   }

   @Nullable
   default zq<?> b() {
      return null;
   }
}

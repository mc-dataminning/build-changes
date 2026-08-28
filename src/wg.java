import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface wg {
   static wg a(final Runnable $$0) {
      return new wg() {
         @Override
         public void a() {
            $$0.run();
         }

         @Nullable
         @Override
         public zg<?> b() {
            $$0.run();
            return null;
         }
      };
   }

   static wg a(final Supplier<zg<?>> $$0) {
      return new wg() {
         @Nullable
         @Override
         public zg<?> b() {
            return $$0.get();
         }
      };
   }

   default void a() {
   }

   @Nullable
   default zg<?> b() {
      return null;
   }
}

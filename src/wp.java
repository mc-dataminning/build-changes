import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface wp {
   static wp a(final Runnable $$0) {
      return new wp() {
         @Override
         public void a() {
            $$0.run();
         }

         @Nullable
         @Override
         public zp<?> b() {
            $$0.run();
            return null;
         }
      };
   }

   static wp a(final Supplier<zp<?>> $$0) {
      return new wp() {
         @Nullable
         @Override
         public zp<?> b() {
            return $$0.get();
         }
      };
   }

   default void a() {
   }

   @Nullable
   default zp<?> b() {
      return null;
   }
}

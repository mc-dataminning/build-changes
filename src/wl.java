import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface wl {
   static wl a(final Runnable $$0) {
      return new wl() {
         @Override
         public void a() {
            $$0.run();
         }

         @Nullable
         @Override
         public zl<?> b() {
            $$0.run();
            return null;
         }
      };
   }

   static wl a(final Supplier<zl<?>> $$0) {
      return new wl() {
         @Nullable
         @Override
         public zl<?> b() {
            return $$0.get();
         }
      };
   }

   default void a() {
   }

   @Nullable
   default zl<?> b() {
      return null;
   }
}

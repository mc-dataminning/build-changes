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
         public zo<?> b() {
            $$0.run();
            return null;
         }
      };
   }

   static wl a(final Supplier<zo<?>> $$0) {
      return new wl() {
         @Nullable
         @Override
         public zo<?> b() {
            return $$0.get();
         }
      };
   }

   default void a() {
   }

   @Nullable
   default zo<?> b() {
      return null;
   }
}

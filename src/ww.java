import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface ww {
   static ww a(final Runnable $$0) {
      return new ww() {
         @Override
         public void a() {
            $$0.run();
         }

         @Nullable
         @Override
         public zw<?> b() {
            $$0.run();
            return null;
         }
      };
   }

   static ww a(final Supplier<zw<?>> $$0) {
      return new ww() {
         @Nullable
         @Override
         public zw<?> b() {
            return $$0.get();
         }
      };
   }

   default void a() {
   }

   @Nullable
   default zw<?> b() {
      return null;
   }
}

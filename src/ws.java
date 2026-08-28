import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface ws {
   static ws a(final Runnable $$0) {
      return new ws() {
         @Override
         public void a() {
            $$0.run();
         }

         @Nullable
         @Override
         public zs<?> b() {
            $$0.run();
            return null;
         }
      };
   }

   static ws a(final Supplier<zs<?>> $$0) {
      return new ws() {
         @Nullable
         @Override
         public zs<?> b() {
            return $$0.get();
         }
      };
   }

   default void a() {
   }

   @Nullable
   default zs<?> b() {
      return null;
   }
}

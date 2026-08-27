import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface uq {
   static uq a(final Runnable $$0) {
      return new uq() {
         @Override
         public void a() {
            $$0.run();
         }

         @Nullable
         @Override
         public xg<?> b() {
            $$0.run();
            return null;
         }
      };
   }

   static uq a(final Supplier<xg<?>> $$0) {
      return new uq() {
         @Nullable
         @Override
         public xg<?> b() {
            return $$0.get();
         }
      };
   }

   default void a() {
   }

   @Nullable
   default xg<?> b() {
      return null;
   }
}

import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface up {
   static up a(final Runnable $$0) {
      return new up() {
         @Override
         public void a() {
            $$0.run();
         }

         @Nullable
         @Override
         public xf<?> b() {
            $$0.run();
            return null;
         }
      };
   }

   static up a(final Supplier<xf<?>> $$0) {
      return new up() {
         @Nullable
         @Override
         public xf<?> b() {
            return $$0.get();
         }
      };
   }

   default void a() {
   }

   @Nullable
   default xf<?> b() {
      return null;
   }
}

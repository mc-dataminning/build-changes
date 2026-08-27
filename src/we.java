import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface we {
   static we a(final Runnable $$0) {
      return new we() {
         @Override
         public void a() {
            $$0.run();
         }

         @Nullable
         @Override
         public ze<?> b() {
            $$0.run();
            return null;
         }
      };
   }

   static we a(final Supplier<ze<?>> $$0) {
      return new we() {
         @Nullable
         @Override
         public ze<?> b() {
            return $$0.get();
         }
      };
   }

   default void a() {
   }

   @Nullable
   default ze<?> b() {
      return null;
   }
}

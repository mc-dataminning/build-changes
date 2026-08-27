import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface ss {
   static ss a(final Runnable $$0) {
      return new ss() {
         @Override
         public void a() {
            $$0.run();
         }

         @Nullable
         @Override
         public va<?> b() {
            $$0.run();
            return null;
         }
      };
   }

   static ss a(final Supplier<va<?>> $$0) {
      return new ss() {
         @Nullable
         @Override
         public va<?> b() {
            return $$0.get();
         }
      };
   }

   default void a() {
   }

   @Nullable
   default va<?> b() {
      return null;
   }
}

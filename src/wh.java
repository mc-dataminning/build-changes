import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface wh {
   static wh a(final Runnable $$0) {
      return new wh() {
         @Override
         public void a() {
            $$0.run();
         }

         @Nullable
         @Override
         public zh<?> b() {
            $$0.run();
            return null;
         }
      };
   }

   static wh a(final Supplier<zh<?>> $$0) {
      return new wh() {
         @Nullable
         @Override
         public zh<?> b() {
            return $$0.get();
         }
      };
   }

   default void a() {
   }

   @Nullable
   default zh<?> b() {
      return null;
   }
}

import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface sp {
   static sp a(final Runnable $$0) {
      return new sp() {
         @Override
         public void a() {
            $$0.run();
         }

         @Nullable
         @Override
         public ux<?> b() {
            $$0.run();
            return null;
         }
      };
   }

   static sp a(final Supplier<ux<?>> $$0) {
      return new sp() {
         @Nullable
         @Override
         public ux<?> b() {
            return $$0.get();
         }
      };
   }

   default void a() {
   }

   @Nullable
   default ux<?> b() {
      return null;
   }
}

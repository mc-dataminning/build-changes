import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface ub {
   static ub a(final Runnable $$0) {
      return new ub() {
         @Override
         public void a() {
            $$0.run();
         }

         @Nullable
         @Override
         public wk<?> b() {
            $$0.run();
            return null;
         }
      };
   }

   static ub a(final Supplier<wk<?>> $$0) {
      return new ub() {
         @Nullable
         @Override
         public wk<?> b() {
            return $$0.get();
         }
      };
   }

   default void a() {
   }

   @Nullable
   default wk<?> b() {
      return null;
   }
}

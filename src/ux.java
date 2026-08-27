import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface ux {
   static ux a(final Runnable $$0) {
      return new ux() {
         @Override
         public void a() {
            $$0.run();
         }

         @Nullable
         @Override
         public xx<?> b() {
            $$0.run();
            return null;
         }
      };
   }

   static ux a(final Supplier<xx<?>> $$0) {
      return new ux() {
         @Nullable
         @Override
         public xx<?> b() {
            return $$0.get();
         }
      };
   }

   default void a() {
   }

   @Nullable
   default xx<?> b() {
      return null;
   }
}

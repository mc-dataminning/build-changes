import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface sx {
   static sx a(final Runnable $$0) {
      return new sx() {
         @Override
         public void a() {
            $$0.run();
         }

         @Nullable
         @Override
         public vf<?> b() {
            $$0.run();
            return null;
         }
      };
   }

   static sx a(final Supplier<vf<?>> $$0) {
      return new sx() {
         @Nullable
         @Override
         public vf<?> b() {
            return $$0.get();
         }
      };
   }

   default void a() {
   }

   @Nullable
   default vf<?> b() {
      return null;
   }
}

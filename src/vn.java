import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface vn {
   static vn a(final Runnable $$0) {
      return new vn() {
         @Override
         public void a() {
            $$0.run();
         }

         @Nullable
         @Override
         public yn<?> b() {
            $$0.run();
            return null;
         }
      };
   }

   static vn a(final Supplier<yn<?>> $$0) {
      return new vn() {
         @Nullable
         @Override
         public yn<?> b() {
            return $$0.get();
         }
      };
   }

   default void a() {
   }

   @Nullable
   default yn<?> b() {
      return null;
   }
}

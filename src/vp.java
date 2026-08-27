import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface vp {
   static vp a(final Runnable $$0) {
      return new vp() {
         @Override
         public void a() {
            $$0.run();
         }

         @Nullable
         @Override
         public yp<?> b() {
            $$0.run();
            return null;
         }
      };
   }

   static vp a(final Supplier<yp<?>> $$0) {
      return new vp() {
         @Nullable
         @Override
         public yp<?> b() {
            return $$0.get();
         }
      };
   }

   default void a() {
   }

   @Nullable
   default yp<?> b() {
      return null;
   }
}

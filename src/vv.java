import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface vv {
   static vv a(final Runnable $$0) {
      return new vv() {
         @Override
         public void a() {
            $$0.run();
         }

         @Nullable
         @Override
         public yv<?> b() {
            $$0.run();
            return null;
         }
      };
   }

   static vv a(final Supplier<yv<?>> $$0) {
      return new vv() {
         @Nullable
         @Override
         public yv<?> b() {
            return $$0.get();
         }
      };
   }

   default void a() {
   }

   @Nullable
   default yv<?> b() {
      return null;
   }
}

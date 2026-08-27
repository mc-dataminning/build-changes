import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface vb {
   static vb a(final Runnable $$0) {
      return new vb() {
         @Override
         public void a() {
            $$0.run();
         }

         @Nullable
         @Override
         public yb<?> b() {
            $$0.run();
            return null;
         }
      };
   }

   static vb a(final Supplier<yb<?>> $$0) {
      return new vb() {
         @Nullable
         @Override
         public yb<?> b() {
            return $$0.get();
         }
      };
   }

   default void a() {
   }

   @Nullable
   default yb<?> b() {
      return null;
   }
}

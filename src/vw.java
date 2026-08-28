import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface vw {
   static vw a(final Runnable $$0) {
      return new vw() {
         @Override
         public void a() {
            $$0.run();
         }

         @Nullable
         @Override
         public yw<?> b() {
            $$0.run();
            return null;
         }
      };
   }

   static vw a(final Supplier<yw<?>> $$0) {
      return new vw() {
         @Nullable
         @Override
         public yw<?> b() {
            return $$0.get();
         }
      };
   }

   default void a() {
   }

   @Nullable
   default yw<?> b() {
      return null;
   }
}

import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface xc {
   static xc a(final Runnable $$0) {
      return new xc() {
         @Override
         public void a() {
            $$0.run();
         }

         @Nullable
         @Override
         public aac<?> b() {
            $$0.run();
            return null;
         }
      };
   }

   static xc a(final Supplier<aac<?>> $$0) {
      return new xc() {
         @Nullable
         @Override
         public aac<?> b() {
            return $$0.get();
         }
      };
   }

   default void a() {
   }

   @Nullable
   default aac<?> b() {
      return null;
   }
}

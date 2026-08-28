import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface wc {
   static wc a(final Runnable $$0) {
      return new wc() {
         @Override
         public void a() {
            $$0.run();
         }

         @Nullable
         @Override
         public zc<?> b() {
            $$0.run();
            return null;
         }
      };
   }

   static wc a(final Supplier<zc<?>> $$0) {
      return new wc() {
         @Nullable
         @Override
         public zc<?> b() {
            return $$0.get();
         }
      };
   }

   default void a() {
   }

   @Nullable
   default zc<?> b() {
      return null;
   }
}

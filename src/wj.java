import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface wj {
   static wj a(final Runnable $$0) {
      return new wj() {
         @Override
         public void a() {
            $$0.run();
         }

         @Nullable
         @Override
         public zj<?> b() {
            $$0.run();
            return null;
         }
      };
   }

   static wj a(final Supplier<zj<?>> $$0) {
      return new wj() {
         @Nullable
         @Override
         public zj<?> b() {
            return $$0.get();
         }
      };
   }

   default void a() {
   }

   @Nullable
   default zj<?> b() {
      return null;
   }
}

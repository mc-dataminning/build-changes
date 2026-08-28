import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface wd {
   static wd a(final Runnable $$0) {
      return new wd() {
         @Override
         public void a() {
            $$0.run();
         }

         @Nullable
         @Override
         public zd<?> b() {
            $$0.run();
            return null;
         }
      };
   }

   static wd a(final Supplier<zd<?>> $$0) {
      return new wd() {
         @Nullable
         @Override
         public zd<?> b() {
            return $$0.get();
         }
      };
   }

   default void a() {
   }

   @Nullable
   default zd<?> b() {
      return null;
   }
}

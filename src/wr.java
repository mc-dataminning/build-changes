import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface wr {
   static wr a(final Runnable $$0) {
      return new wr() {
         @Override
         public void a() {
            $$0.run();
         }

         @Nullable
         @Override
         public zr<?> b() {
            $$0.run();
            return null;
         }
      };
   }

   static wr a(final Supplier<zr<?>> $$0) {
      return new wr() {
         @Nullable
         @Override
         public zr<?> b() {
            return $$0.get();
         }
      };
   }

   default void a() {
   }

   @Nullable
   default zr<?> b() {
      return null;
   }
}

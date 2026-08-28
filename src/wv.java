import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface wv {
   static wv a(final Runnable $$0) {
      return new wv() {
         @Override
         public void a() {
            $$0.run();
         }

         @Nullable
         @Override
         public zv<?> b() {
            $$0.run();
            return null;
         }
      };
   }

   static wv a(final Supplier<zv<?>> $$0) {
      return new wv() {
         @Nullable
         @Override
         public zv<?> b() {
            return $$0.get();
         }
      };
   }

   default void a() {
   }

   @Nullable
   default zv<?> b() {
      return null;
   }
}

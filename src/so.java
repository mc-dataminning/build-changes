import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface so {
   static so a(final Runnable $$0) {
      return new so() {
         @Override
         public void a() {
            $$0.run();
         }

         @Nullable
         @Override
         public uw<?> b() {
            $$0.run();
            return null;
         }
      };
   }

   static so a(final Supplier<uw<?>> $$0) {
      return new so() {
         @Nullable
         @Override
         public uw<?> b() {
            return $$0.get();
         }
      };
   }

   default void a() {
   }

   @Nullable
   default uw<?> b() {
      return null;
   }
}

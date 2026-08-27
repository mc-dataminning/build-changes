import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface ul {
   static ul a(final Runnable $$0) {
      return new ul() {
         @Override
         public void a() {
            $$0.run();
         }

         @Nullable
         @Override
         public wu<?> b() {
            $$0.run();
            return null;
         }
      };
   }

   static ul a(final Supplier<wu<?>> $$0) {
      return new ul() {
         @Nullable
         @Override
         public wu<?> b() {
            return $$0.get();
         }
      };
   }

   default void a() {
   }

   @Nullable
   default wu<?> b() {
      return null;
   }
}

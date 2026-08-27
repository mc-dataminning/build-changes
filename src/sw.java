import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface sw {
   static sw a(final Runnable $$0) {
      return new sw() {
         @Override
         public void a() {
            $$0.run();
         }

         @Nullable
         @Override
         public ve<?> b() {
            $$0.run();
            return null;
         }
      };
   }

   static sw a(final Supplier<ve<?>> $$0) {
      return new sw() {
         @Nullable
         @Override
         public ve<?> b() {
            return $$0.get();
         }
      };
   }

   default void a() {
   }

   @Nullable
   default ve<?> b() {
      return null;
   }
}

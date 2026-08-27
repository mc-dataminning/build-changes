import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface un {
   static un a(final Runnable $$0) {
      return new un() {
         @Override
         public void a() {
            $$0.run();
         }

         @Nullable
         @Override
         public xd<?> b() {
            $$0.run();
            return null;
         }
      };
   }

   static un a(final Supplier<xd<?>> $$0) {
      return new un() {
         @Nullable
         @Override
         public xd<?> b() {
            return $$0.get();
         }
      };
   }

   default void a() {
   }

   @Nullable
   default xd<?> b() {
      return null;
   }
}

import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface uz {
   static uz a(final Runnable $$0) {
      return new uz() {
         @Override
         public void a() {
            $$0.run();
         }

         @Nullable
         @Override
         public xz<?> b() {
            $$0.run();
            return null;
         }
      };
   }

   static uz a(final Supplier<xz<?>> $$0) {
      return new uz() {
         @Nullable
         @Override
         public xz<?> b() {
            return $$0.get();
         }
      };
   }

   default void a() {
   }

   @Nullable
   default xz<?> b() {
      return null;
   }
}

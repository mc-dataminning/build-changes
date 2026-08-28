import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface wo {
   static wo a(final Runnable $$0) {
      return new wo() {
         @Override
         public void a() {
            $$0.run();
         }

         @Nullable
         @Override
         public zo<?> b() {
            $$0.run();
            return null;
         }
      };
   }

   static wo a(final Supplier<zo<?>> $$0) {
      return new wo() {
         @Nullable
         @Override
         public zo<?> b() {
            return $$0.get();
         }
      };
   }

   default void a() {
   }

   @Nullable
   default zo<?> b() {
      return null;
   }
}

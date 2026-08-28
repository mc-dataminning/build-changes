import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface wb {
   static wb a(final Runnable $$0) {
      return new wb() {
         @Override
         public void a() {
            $$0.run();
         }

         @Nullable
         @Override
         public zb<?> b() {
            $$0.run();
            return null;
         }
      };
   }

   static wb a(final Supplier<zb<?>> $$0) {
      return new wb() {
         @Nullable
         @Override
         public zb<?> b() {
            return $$0.get();
         }
      };
   }

   default void a() {
   }

   @Nullable
   default zb<?> b() {
      return null;
   }
}

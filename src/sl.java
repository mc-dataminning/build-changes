import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface sl {
   static sl a(final Runnable $$0) {
      return new sl() {
         @Override
         public void a() {
            $$0.run();
         }

         @Nullable
         @Override
         public uo<?> b() {
            $$0.run();
            return null;
         }
      };
   }

   static sl a(final Supplier<uo<?>> $$0) {
      return new sl() {
         @Nullable
         @Override
         public uo<?> b() {
            return $$0.get();
         }
      };
   }

   default void a() {
   }

   @Nullable
   default uo<?> b() {
      return null;
   }
}

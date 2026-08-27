import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface vz {
   static vz a(final Runnable $$0) {
      return new vz() {
         @Override
         public void a() {
            $$0.run();
         }

         @Nullable
         @Override
         public yz<?> b() {
            $$0.run();
            return null;
         }
      };
   }

   static vz a(final Supplier<yz<?>> $$0) {
      return new vz() {
         @Nullable
         @Override
         public yz<?> b() {
            return $$0.get();
         }
      };
   }

   default void a() {
   }

   @Nullable
   default yz<?> b() {
      return null;
   }
}

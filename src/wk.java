import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface wk {
   static wk a(final Runnable $$0) {
      return new wk() {
         @Override
         public void a() {
            $$0.run();
         }

         @Nullable
         @Override
         public zk<?> b() {
            $$0.run();
            return null;
         }
      };
   }

   static wk a(final Supplier<zk<?>> $$0) {
      return new wk() {
         @Nullable
         @Override
         public zk<?> b() {
            return $$0.get();
         }
      };
   }

   default void a() {
   }

   @Nullable
   default zk<?> b() {
      return null;
   }
}

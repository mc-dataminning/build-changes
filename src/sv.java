import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface sv {
   static sv a(final Runnable $$0) {
      return new sv() {
         @Override
         public void a() {
            $$0.run();
         }

         @Nullable
         @Override
         public vd<?> b() {
            $$0.run();
            return null;
         }
      };
   }

   static sv a(final Supplier<vd<?>> $$0) {
      return new sv() {
         @Nullable
         @Override
         public vd<?> b() {
            return $$0.get();
         }
      };
   }

   default void a() {
   }

   @Nullable
   default vd<?> b() {
      return null;
   }
}

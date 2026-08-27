import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface ts {
   static ts a(final Runnable $$0) {
      return new ts() {
         @Override
         public void a() {
            $$0.run();
         }

         @Nullable
         @Override
         public wb<?> b() {
            $$0.run();
            return null;
         }
      };
   }

   static ts a(final Supplier<wb<?>> $$0) {
      return new ts() {
         @Nullable
         @Override
         public wb<?> b() {
            return $$0.get();
         }
      };
   }

   default void a() {
   }

   @Nullable
   default wb<?> b() {
      return null;
   }
}

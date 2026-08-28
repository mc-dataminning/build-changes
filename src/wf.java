import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface wf {
   static wf a(final Runnable $$0) {
      return new wf() {
         @Override
         public void a() {
            $$0.run();
         }

         @Nullable
         @Override
         public zf<?> b() {
            $$0.run();
            return null;
         }
      };
   }

   static wf a(final Supplier<zf<?>> $$0) {
      return new wf() {
         @Nullable
         @Override
         public zf<?> b() {
            return $$0.get();
         }
      };
   }

   default void a() {
   }

   @Nullable
   default zf<?> b() {
      return null;
   }
}

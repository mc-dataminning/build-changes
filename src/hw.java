import javax.annotation.Nullable;

public interface hw<T> {
   void a(hu<T> var1);

   void a(@Nullable hy var1);

   @Nullable
   hy a();

   hx b();

   static <T extends ex<T>> hw<T> a(final hv<T> $$0, final hx $$1) {
      return new hw<T>() {
         @Override
         public void a(hu<T> $$0x) {
            $$0.a(new hr<>($$1, $$0));
         }

         @Override
         public void a(@Nullable hy $$0x) {
            $$0.a($$0);
         }

         @Nullable
         @Override
         public hy a() {
            return $$0.b();
         }

         @Override
         public hx b() {
            return $$1;
         }
      };
   }
}

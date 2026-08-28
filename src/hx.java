import javax.annotation.Nullable;

public interface hx<T> {
   void a(hv<T> var1);

   void a(@Nullable hz var1);

   @Nullable
   hz a();

   hy b();

   static <T extends ey<T>> hx<T> a(final hw<T> $$0, final hy $$1) {
      return new hx<T>() {
         @Override
         public void a(hv<T> $$0x) {
            $$0.a(new hs<>($$1, $$0));
         }

         @Override
         public void a(@Nullable hz $$0x) {
            $$0.a($$0);
         }

         @Nullable
         @Override
         public hz a() {
            return $$0.b();
         }

         @Override
         public hy b() {
            return $$1;
         }
      };
   }
}

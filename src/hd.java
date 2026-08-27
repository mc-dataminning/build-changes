import javax.annotation.Nullable;

public interface hd<T> {
   void a(hb<T> var1);

   void a(@Nullable hf var1);

   @Nullable
   hf a();

   he b();

   static <T extends ef<T>> hd<T> a(final hc<T> $$0, final he $$1) {
      return new hd<T>() {
         @Override
         public void a(hb<T> $$0x) {
            $$0.a(new gy<>($$1, $$0));
         }

         @Override
         public void a(@Nullable hf $$0x) {
            $$0.a($$0);
         }

         @Nullable
         @Override
         public hf a() {
            return $$0.b();
         }

         @Override
         public he b() {
            return $$1;
         }
      };
   }
}

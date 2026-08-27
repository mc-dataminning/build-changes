import javax.annotation.Nullable;

public interface hc<T> {
   void a(ha<T> var1);

   void a(@Nullable he var1);

   @Nullable
   he a();

   hd b();

   static <T extends ee<T>> hc<T> a(final hb<T> $$0, final hd $$1) {
      return new hc<T>() {
         @Override
         public void a(ha<T> $$0x) {
            $$0.a(new gx<>($$1, $$0));
         }

         @Override
         public void a(@Nullable he $$0x) {
            $$0.a($$0);
         }

         @Nullable
         @Override
         public he a() {
            return $$0.b();
         }

         @Override
         public hd b() {
            return $$1;
         }
      };
   }
}

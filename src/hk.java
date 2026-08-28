import javax.annotation.Nullable;

public interface hk<T> {
   void a(hi<T> var1);

   void a(@Nullable hm var1);

   @Nullable
   hm a();

   hl b();

   static <T extends ek<T>> hk<T> a(final hj<T> $$0, final hl $$1) {
      return new hk<T>() {
         @Override
         public void a(hi<T> $$0x) {
            $$0.a(new hf<>($$1, $$0));
         }

         @Override
         public void a(@Nullable hm $$0x) {
            $$0.a($$0);
         }

         @Nullable
         @Override
         public hm a() {
            return $$0.b();
         }

         @Override
         public hl b() {
            return $$1;
         }
      };
   }
}

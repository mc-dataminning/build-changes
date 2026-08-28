import javax.annotation.Nullable;

public interface hl<T> {
   void a(hj<T> var1);

   void a(@Nullable hn var1);

   @Nullable
   hn a();

   hm b();

   static <T extends el<T>> hl<T> a(final hk<T> $$0, final hm $$1) {
      return new hl<T>() {
         @Override
         public void a(hj<T> $$0x) {
            $$0.a(new hg<>($$1, $$0));
         }

         @Override
         public void a(@Nullable hn $$0x) {
            $$0.a($$0);
         }

         @Nullable
         @Override
         public hn a() {
            return $$0.b();
         }

         @Override
         public hm b() {
            return $$1;
         }
      };
   }
}

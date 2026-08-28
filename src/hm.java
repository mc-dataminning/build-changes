import javax.annotation.Nullable;

public interface hm<T> {
   void a(hk<T> var1);

   void a(@Nullable ho var1);

   @Nullable
   ho a();

   hn b();

   static <T extends em<T>> hm<T> a(final hl<T> $$0, final hn $$1) {
      return new hm<T>() {
         @Override
         public void a(hk<T> $$0x) {
            $$0.a(new hh<>($$1, $$0));
         }

         @Override
         public void a(@Nullable ho $$0x) {
            $$0.a($$0);
         }

         @Nullable
         @Override
         public ho a() {
            return $$0.b();
         }

         @Override
         public hn b() {
            return $$1;
         }
      };
   }
}

import javax.annotation.Nullable;

public interface hu<T> {
   void a(hs<T> var1);

   void a(@Nullable hw var1);

   @Nullable
   hw a();

   hv b();

   static <T extends ev<T>> hu<T> a(final ht<T> $$0, final hv $$1) {
      return new hu<T>() {
         @Override
         public void a(hs<T> $$0x) {
            $$0.a(new hp<>($$1, $$0));
         }

         @Override
         public void a(@Nullable hw $$0x) {
            $$0.a($$0);
         }

         @Nullable
         @Override
         public hw a() {
            return $$0.b();
         }

         @Override
         public hv b() {
            return $$1;
         }
      };
   }
}

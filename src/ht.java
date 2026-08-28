import javax.annotation.Nullable;

public interface ht<T> {
   void a(hr<T> var1);

   void a(@Nullable hv var1);

   @Nullable
   hv a();

   hu b();

   static <T extends ev<T>> ht<T> a(final hs<T> $$0, final hu $$1) {
      return new ht<T>() {
         @Override
         public void a(hr<T> $$0x) {
            $$0.a(new ho<>($$1, $$0));
         }

         @Override
         public void a(@Nullable hv $$0x) {
            $$0.a($$0);
         }

         @Nullable
         @Override
         public hv a() {
            return $$0.b();
         }

         @Override
         public hu b() {
            return $$1;
         }
      };
   }
}

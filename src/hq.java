import javax.annotation.Nullable;

public interface hq<T> {
   void a(ho<T> var1);

   void a(@Nullable hs var1);

   @Nullable
   hs a();

   hr b();

   static <T extends es<T>> hq<T> a(final hp<T> $$0, final hr $$1) {
      return new hq<T>() {
         @Override
         public void a(ho<T> $$0x) {
            $$0.a(new hl<>($$1, $$0));
         }

         @Override
         public void a(@Nullable hs $$0x) {
            $$0.a($$0);
         }

         @Nullable
         @Override
         public hs a() {
            return $$0.b();
         }

         @Override
         public hr b() {
            return $$1;
         }
      };
   }
}

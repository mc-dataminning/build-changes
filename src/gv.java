import javax.annotation.Nullable;

public interface gv<T> {
   void a(gt<T> var1);

   void a(@Nullable gx var1);

   @Nullable
   gx a();

   gw b();

   static <T extends dx<T>> gv<T> a(final gu<T> $$0, final gw $$1) {
      return new gv<T>() {
         @Override
         public void a(gt<T> $$0x) {
            $$0.a(new gq<>($$1, $$0));
         }

         @Override
         public void a(@Nullable gx $$0x) {
            $$0.a($$0);
         }

         @Nullable
         @Override
         public gx a() {
            return $$0.b();
         }

         @Override
         public gw b() {
            return $$1;
         }
      };
   }
}

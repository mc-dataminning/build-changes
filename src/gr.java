import javax.annotation.Nullable;

public interface gr<T> {
   void a(gp<T> var1);

   void a(@Nullable gt var1);

   @Nullable
   gt a();

   gs b();

   static <T extends dw<T>> gr<T> a(final gq<T> $$0, final gs $$1) {
      return new gr<T>() {
         @Override
         public void a(gp<T> $$0x) {
            $$0.a(new gm<>($$1, $$0));
         }

         @Override
         public void a(@Nullable gt $$0x) {
            $$0.a($$0);
         }

         @Nullable
         @Override
         public gt a() {
            return $$0.b();
         }

         @Override
         public gs b() {
            return $$1;
         }
      };
   }
}

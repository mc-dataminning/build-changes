import javax.annotation.Nullable;

public interface gp<T> {
   void a(gn<T> var1);

   void a(@Nullable gr var1);

   @Nullable
   gr a();

   gq b();

   static <T extends dw<T>> gp<T> a(final go<T> $$0, final gq $$1) {
      return new gp<T>() {
         @Override
         public void a(gn<T> $$0x) {
            $$0.a(new gk<>($$1, $$0));
         }

         @Override
         public void a(@Nullable gr $$0x) {
            $$0.a($$0);
         }

         @Nullable
         @Override
         public gr a() {
            return $$0.b();
         }

         @Override
         public gq b() {
            return $$1;
         }
      };
   }
}

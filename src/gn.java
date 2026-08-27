import javax.annotation.Nullable;

public interface gn<T> {
   void a(gl<T> var1);

   void a(@Nullable gp var1);

   @Nullable
   gp a();

   go b();

   static <T extends du<T>> gn<T> a(final gm<T> $$0, final go $$1) {
      return new gn<T>() {
         @Override
         public void a(gl<T> $$0x) {
            $$0.a(new gi<>($$1, $$0));
         }

         @Override
         public void a(@Nullable gp $$0x) {
            $$0.a($$0);
         }

         @Nullable
         @Override
         public gp a() {
            return $$0.b();
         }

         @Override
         public go b() {
            return $$1;
         }
      };
   }
}

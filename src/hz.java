import javax.annotation.Nullable;

public interface hz<T> {
   void a(hx<T> var1);

   void a(@Nullable ib var1);

   @Nullable
   ib a();

   ia b();

   static <T extends ez<T>> hz<T> a(final hy<T> $$0, final ia $$1) {
      return new hz<T>() {
         @Override
         public void a(hx<T> $$0x) {
            $$0.a(new hu<>($$1, $$0));
         }

         @Override
         public void a(@Nullable ib $$0x) {
            $$0.a($$0);
         }

         @Nullable
         @Override
         public ib a() {
            return $$0.b();
         }

         @Override
         public ia b() {
            return $$1;
         }
      };
   }
}

import javax.annotation.Nullable;

public interface hy<T> {
   void a(hw<T> var1);

   void a(@Nullable ia var1);

   @Nullable
   ia a();

   hz b();

   static <T extends ez<T>> hy<T> a(final hx<T> $$0, final hz $$1) {
      return new hy<T>() {
         @Override
         public void a(hw<T> $$0x) {
            $$0.a(new ht<>($$1, $$0));
         }

         @Override
         public void a(@Nullable ia $$0x) {
            $$0.a($$0);
         }

         @Nullable
         @Override
         public ia a() {
            return $$0.b();
         }

         @Override
         public hz b() {
            return $$1;
         }
      };
   }
}

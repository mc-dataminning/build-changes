import javax.annotation.Nullable;

public interface hp<T> {
   void a(hn<T> var1);

   void a(@Nullable hr var1);

   @Nullable
   hr a();

   hq b();

   static <T extends er<T>> hp<T> a(final ho<T> $$0, final hq $$1) {
      return new hp<T>() {
         @Override
         public void a(hn<T> $$0x) {
            $$0.a(new hk<>($$1, $$0));
         }

         @Override
         public void a(@Nullable hr $$0x) {
            $$0.a($$0);
         }

         @Nullable
         @Override
         public hr a() {
            return $$0.b();
         }

         @Override
         public hq b() {
            return $$1;
         }
      };
   }
}

import javax.annotation.Nullable;

public interface hv<T> {
   void a(ht<T> var1);

   void a(@Nullable hx var1);

   @Nullable
   hx a();

   hw b();

   static <T extends ew<T>> hv<T> a(final hu<T> $$0, final hw $$1) {
      return new hv<T>() {
         @Override
         public void a(ht<T> $$0x) {
            $$0.a(new hq<>($$1, $$0));
         }

         @Override
         public void a(@Nullable hx $$0x) {
            $$0.a($$0);
         }

         @Nullable
         @Override
         public hx a() {
            return $$0.b();
         }

         @Override
         public hw b() {
            return $$1;
         }
      };
   }
}

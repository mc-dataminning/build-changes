import javax.annotation.Nullable;

public interface he<T> {
   void a(hc<T> var1);

   void a(@Nullable hg var1);

   @Nullable
   hg a();

   hf b();

   static <T extends eg<T>> he<T> a(final hd<T> $$0, final hf $$1) {
      return new he<T>() {
         @Override
         public void a(hc<T> $$0x) {
            $$0.a(new gz<>($$1, $$0));
         }

         @Override
         public void a(@Nullable hg $$0x) {
            $$0.a($$0);
         }

         @Nullable
         @Override
         public hg a() {
            return $$0.b();
         }

         @Override
         public hf b() {
            return $$1;
         }
      };
   }
}

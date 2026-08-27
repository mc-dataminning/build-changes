import javax.annotation.Nullable;

public interface gt<T> {
   void a(gr<T> var1);

   void a(@Nullable gv var1);

   @Nullable
   gv a();

   gu b();

   static <T extends dw<T>> gt<T> a(final gs<T> $$0, final gu $$1) {
      return new gt<T>() {
         @Override
         public void a(gr<T> $$0x) {
            $$0.a(new go<>($$1, $$0));
         }

         @Override
         public void a(@Nullable gv $$0x) {
            $$0.a($$0);
         }

         @Nullable
         @Override
         public gv a() {
            return $$0.b();
         }

         @Override
         public gu b() {
            return $$1;
         }
      };
   }
}

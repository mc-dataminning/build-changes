import javax.annotation.Nullable;

public class md extends lr {
   final cmm<?> a;

   public md(cmm<?> $$0) {
      this.a = $$0;
   }

   public static md a(cmm<? extends clz> $$0) {
      return new md($$0);
   }

   public void a(lv $$0, String $$1) {
      this.a($$0, new aex($$1));
   }

   public void a(lv $$0, final aex $$1) {
      $$0.a(new lr.a(cly.d) {
         @Override
         public cmm<?> c() {
            return md.this.a;
         }

         @Override
         public aex b() {
            return $$1;
         }

         @Nullable
         @Override
         public af d() {
            return null;
         }
      });
   }
}

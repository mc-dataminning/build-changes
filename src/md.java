import javax.annotation.Nullable;

public class md extends lr {
   final cmo<?> a;

   public md(cmo<?> $$0) {
      this.a = $$0;
   }

   public static md a(cmo<? extends cmb> $$0) {
      return new md($$0);
   }

   public void a(lv $$0, String $$1) {
      this.a($$0, new aey($$1));
   }

   public void a(lv $$0, final aey $$1) {
      $$0.a(new lr.a(cma.d) {
         @Override
         public cmo<?> c() {
            return md.this.a;
         }

         @Override
         public aey b() {
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

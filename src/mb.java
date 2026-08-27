import javax.annotation.Nullable;

public class mb extends lp {
   final cmm<?> a;

   public mb(cmm<?> $$0) {
      this.a = $$0;
   }

   public static mb a(cmm<? extends clz> $$0) {
      return new mb($$0);
   }

   public void a(lt $$0, String $$1) {
      this.a($$0, new aew($$1));
   }

   public void a(lt $$0, final aew $$1) {
      $$0.a(new lp.a(cly.d) {
         @Override
         public cmm<?> c() {
            return mb.this.a;
         }

         @Override
         public aew b() {
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

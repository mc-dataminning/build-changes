import javax.annotation.Nullable;

public class mb extends lp {
   final cms<?> a;

   public mb(cms<?> $$0) {
      this.a = $$0;
   }

   public static mb a(cms<? extends cmf> $$0) {
      return new mb($$0);
   }

   public void a(lt $$0, String $$1) {
      this.a($$0, new aez($$1));
   }

   public void a(lt $$0, final aez $$1) {
      $$0.a(new lp.a(cme.d) {
         @Override
         public cms<?> c() {
            return mb.this.a;
         }

         @Override
         public aez b() {
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

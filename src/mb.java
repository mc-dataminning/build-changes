import javax.annotation.Nullable;

public class mb extends lp {
   final cmh<?> a;

   public mb(cmh<?> $$0) {
      this.a = $$0;
   }

   public static mb a(cmh<? extends clu> $$0) {
      return new mb($$0);
   }

   public void a(lt $$0, String $$1) {
      this.a($$0, new aeu($$1));
   }

   public void a(lt $$0, final aeu $$1) {
      $$0.a(new lp.a(clt.d) {
         @Override
         public cmh<?> c() {
            return mb.this.a;
         }

         @Override
         public aeu b() {
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

import java.util.List;

public class gva implements gun<eaz> {
   private final gtd a;

   public gva(guo.a $$0) {
      this.a = $$0.b();
   }

   public void a(eaz $$0, float $$1, flo $$2, gsa $$3, int $$4, int $$5, ffq $$6) {
      djx $$7 = $$0.i();
      if ($$7 != null) {
         iv $$8 = $$0.aB_().a($$0.f().g());
         ebe $$9 = $$0.j();
         if (!$$9.l()) {
            gtf.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$9.a(dne.bJ) && $$0.a($$1) <= 4.0F) {
               $$9 = $$9.b(eax.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$8, $$9, $$2, $$3, $$7, false, $$5);
            } else if ($$0.d() && !$$0.a()) {
               ecg $$10 = $$9.a(dne.by) ? ecg.b : ecg.a;
               ebe $$11 = dne.bJ.m().b(eax.c, $$10).b(eax.a, $$9.c(eaw.a));
               $$11 = $$11.b(eax.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$8, $$11, $$2, $$3, $$7, false, $$5);
               iv $$12 = $$8.a($$0.f());
               $$2.b();
               $$2.a();
               $$9 = $$9.b(eaw.c, Boolean.valueOf(true));
               this.a($$12, $$9, $$2, $$3, $$7, true, $$5);
            } else {
               this.a($$8, $$9, $$2, $$3, $$7, false, $$5);
            }

            $$2.b();
            gtf.b();
         }
      }
   }

   private void a(iv $$0, ebe $$1, flo $$2, gsa $$3, djx $$4, boolean $$5, int $$6) {
      gsl $$7 = grs.b($$1);
      flr $$8 = $$3.getBuffer($$7);
      List<gtm> $$9 = this.a.a($$1).a(azx.a($$1.b($$0)));
      this.a.b().a($$4, $$9, $$1, $$0, $$2, $$8, $$5, $$6);
   }

   @Override
   public int aV_() {
      return 68;
   }
}

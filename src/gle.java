public class gle implements gks<dvf> {
   private final gjk a;

   public gle(gkt.a $$0) {
      this.a = $$0.b();
   }

   public void a(dvf $$0, float $$1, feb $$2, gih $$3, int $$4, int $$5) {
      dfb $$6 = $$0.i();
      if ($$6 != null) {
         jh $$7 = $$0.aB_().a($$0.f().g());
         dvj $$8 = $$0.j();
         if (!$$8.l()) {
            gjm.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(dig.bz) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.b(dvd.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.d() && !$$0.b()) {
               dwl $$9 = $$8.a(dig.br) ? dwl.b : dwl.a;
               dvj $$10 = dig.bz.m().b(dvd.c, $$9).b(dvd.a, $$8.c(dvc.a));
               $$10 = $$10.b(dvd.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               jh $$11 = $$7.a($$0.f());
               $$2.b();
               $$2.a();
               $$8 = $$8.b(dvc.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            gjm.b();
         }
      }
   }

   private void a(jh $$0, dvj $$1, feb $$2, gih $$3, dfb $$4, boolean $$5, int $$6) {
      gir $$7 = ghz.b($$1);
      fef $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, azs.a(), $$1.b($$0), $$6);
   }

   @Override
   public int aU_() {
      return 68;
   }
}

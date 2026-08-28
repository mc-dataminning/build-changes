public class gkt implements gkh<duz> {
   private final giz a;

   public gkt(gki.a $$0) {
      this.a = $$0.b();
   }

   public void a(duz $$0, float $$1, fdt $$2, ghw $$3, int $$4, int $$5) {
      dev $$6 = $$0.i();
      if ($$6 != null) {
         jg $$7 = $$0.aC_().a($$0.f().g());
         dvd $$8 = $$0.j();
         if (!$$8.l()) {
            gjb.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(dia.bz) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.b(dux.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.d() && !$$0.b()) {
               dwf $$9 = $$8.a(dia.br) ? dwf.b : dwf.a;
               dvd $$10 = dia.bz.m().b(dux.c, $$9).b(dux.a, $$8.c(duw.a));
               $$10 = $$10.b(dux.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               jg $$11 = $$7.a($$0.f());
               $$2.b();
               $$2.a();
               $$8 = $$8.b(duw.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            gjb.b();
         }
      }
   }

   private void a(jg $$0, dvd $$1, fdt $$2, ghw $$3, dev $$4, boolean $$5, int $$6) {
      gig $$7 = gho.b($$1);
      fdx $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, azr.a(), $$1.b($$0), $$6);
   }

   @Override
   public int aV_() {
      return 68;
   }
}

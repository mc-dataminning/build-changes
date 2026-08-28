public class gow implements gok<dwt> {
   private final gnc a;

   public gow(gol.a $$0) {
      this.a = $$0.b();
   }

   public void a(dwt $$0, float $$1, ffu $$2, gly $$3, int $$4, int $$5) {
      dgi $$6 = $$0.i();
      if ($$6 != null) {
         ji $$7 = $$0.aA_().a($$0.f().g());
         dwx $$8 = $$0.j();
         if (!$$8.l()) {
            gne.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(djo.bG) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.b(dwr.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.d() && !$$0.b()) {
               dxy $$9 = $$8.a(djo.by) ? dxy.b : dxy.a;
               dwx $$10 = djo.bG.m().b(dwr.c, $$9).b(dwr.a, $$8.c(dwq.a));
               $$10 = $$10.b(dwr.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               ji $$11 = $$7.a($$0.f());
               $$2.b();
               $$2.a();
               $$8 = $$8.b(dwq.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            gne.b();
         }
      }
   }

   private void a(ji $$0, dwx $$1, ffu $$2, gly $$3, dgi $$4, boolean $$5, int $$6) {
      gmi $$7 = glr.b($$1);
      ffy $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, azh.a(), $$1.b($$0), $$6);
   }

   @Override
   public int aU_() {
      return 68;
   }
}

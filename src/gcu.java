public class gcu implements gci<dpe> {
   private final gbc a;

   public gcu(gcj.a $$0) {
      this.a = $$0.b();
   }

   public void a(dpe $$0, float $$1, ewr $$2, gai $$3, int $$4, int $$5) {
      czg $$6 = $$0.i();
      if ($$6 != null) {
         id $$7 = $$0.az_().a($$0.f().g());
         dpi $$8 = $$0.j();
         if (!$$8.i()) {
            gbe.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(dcj.bz) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.a(dpc.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.d() && !$$0.b()) {
               dqk $$9 = $$8.a(dcj.br) ? dqk.b : dqk.a;
               dpi $$10 = dcj.bz.n().a(dpc.c, $$9).a(dpc.a, $$8.c(dpb.a));
               $$10 = $$10.a(dpc.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               id $$11 = $$7.a($$0.f());
               $$2.b();
               $$2.a();
               $$8 = $$8.a(dpb.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            gbe.b();
         }
      }
   }

   private void a(id $$0, dpi $$1, ewr $$2, gai $$3, czg $$4, boolean $$5, int $$6) {
      gaq $$7 = gad.b($$1);
      ewv $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, axt.a(), $$1.a($$0), $$6);
   }

   @Override
   public int aP_() {
      return 68;
   }
}

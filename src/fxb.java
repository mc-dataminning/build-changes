public class fxb extends fww<bvi, fgo<bvi>> {
   private final foe a;
   private final ftm b;

   public fxb(fuj<bvi, fgo<bvi>> $$0, foe $$1, ftm $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(elg $$0, fnl $$1, int $$2, bvi $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.q()) {
         boolean $$10 = eqm.O().b($$3) && $$3.cd();
         if (!$$3.cd() || $$10) {
            $$0.a();
            this.c().c().a($$0);
            float $$11 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            ciy $$12 = new ciy(csn.ef);
            if ($$10) {
               dfa $$13 = csn.ef.n();
               gam $$14 = this.a.a($$13);
               int $$15 = ftp.c($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(fnt.q(fyk.e)), $$13, $$14, 0.0F, 0.0F, 0.0F, $$2, $$15);
            } else {
               this.b.a($$3, $$12, civ.f, false, $$0, $$1, $$3.dK(), $$2, ftp.c($$3, 0.0F), $$3.ah());
            }

            $$0.b();
         }
      }
   }
}

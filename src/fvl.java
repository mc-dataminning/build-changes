public class fvl implements fvg<dha> {
   private static final float a = 0.375F;
   private final fzk b;

   public fvl(fvh.a $$0) {
      this.b = $$0.d();
   }

   public void a(dha $$0, float $$1, eqa $$2, ftg $$3, int $$4, int $$5) {
      ic $$6 = $$0.r().c(cxd.f);
      iq<cmx> $$7 = $$0.c();
      int $$8 = (int)$$0.aB_().a();

      for (int $$9 = 0; $$9 < $$7.size(); $$9++) {
         cmx $$10 = $$7.get($$9);
         if ($$10 != cmx.f) {
            $$2.a();
            $$2.a(0.5F, 0.44921875F, 0.5F);
            ic $$11 = ic.b(($$9 + $$6.e()) % 4);
            float $$12 = -$$11.p();
            $$2.a(a.d.rotationDegrees($$12));
            $$2.a(a.b.rotationDegrees(90.0F));
            $$2.a(-0.3125F, -0.3125F, 0.0F);
            $$2.b(0.375F, 0.375F, 0.375F);
            this.b.a($$10, cmu.i, $$4, $$5, $$2, $$3, $$0.i(), $$8 + $$9);
            $$2.b();
         }
      }
   }
}

public class gpu implements gpj<dvx> {
   private final gci a;

   public gpu(gpk.a $$0) {
      this.a = new gci($$0.a(ggb.J));
   }

   public void a(dvx $$0, float $$1, fgr $$2, gmx $$3, int $$4, int $$5) {
      dxq $$6 = $$0.m();
      if ($$6.c(dot.d)) {
         $$2.a();
         $$2.a(0.5F, 1.0625F, 0.5F);
         float $$7 = $$6.c(dot.b).h().p();
         $$2.a(a.d.rotationDegrees(-$$7));
         $$2.a(a.f.rotationDegrees(67.5F));
         $$2.a(0.0F, -0.125F, 0.0F);
         this.a.a(0.0F, 0.1F, 0.9F, 1.2F);
         fgv $$8 = gps.a.a($$3, gnh::d);
         this.a.a($$2, $$8, $$4, $$5);
         $$2.b();
      }
   }
}

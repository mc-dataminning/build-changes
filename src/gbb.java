public class gbb extends gbe {
   private final fuy a;
   private final gdy b = gdy.i(gis.a);

   gbb(fxx $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new fuj(ffh.Q().aR().a(fxb.V));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public gbi b() {
      return gbi.e;
   }

   @Override
   public void a(fae $$0, fes $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * ayz.a($$3 * (float) Math.PI);
      faa $$5 = new faa();
      $$5.a($$1.f());
      $$5.a(a.b.rotationDegrees(150.0F * $$3 - 60.0F));
      $$5.b(-1.0F, -1.0F, 1.0F);
      $$5.a(0.0F, -1.101F, 1.5F);
      gdq.a $$6 = ffh.Q().aQ().c();
      fae $$7 = $$6.getBuffer(this.b);
      this.a.a($$5, $$7, 15728880, gos.d, 1.0F, 1.0F, 1.0F, $$4);
      $$6.b();
   }

   public static class a implements gbh<lm> {
      public gbe a(lm $$0, fxx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gbb($$1, $$2, $$3, $$4);
      }
   }
}

public class gbi extends gbl {
   private final fve a;
   private final gef b = gef.i(giz.a);

   gbi(fyd $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new fup(ffn.Q().aR().a(fxh.V));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public gbp b() {
      return gbp.e;
   }

   @Override
   public void a(fak $$0, fey $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * aye.a($$3 * (float) Math.PI);
      fag $$5 = new fag();
      $$5.a($$1.f());
      $$5.a(a.b.rotationDegrees(150.0F * $$3 - 60.0F));
      $$5.b(-1.0F, -1.0F, 1.0F);
      $$5.a(0.0F, -1.101F, 1.5F);
      gdx.a $$6 = ffn.Q().aQ().c();
      fak $$7 = $$6.getBuffer(this.b);
      this.a.a($$5, $$7, 15728880, goz.d, 1.0F, 1.0F, 1.0F, $$4);
      $$6.b();
   }

   public static class a implements gbo<ln> {
      public gbl a(ln $$0, fyd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gbi($$1, $$2, $$3, $$4);
      }
   }
}

public class gay extends gbb {
   private final fuv a;
   private final gdv b = gdv.i(gip.a);

   gay(fxu $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new fug(ffe.Q().aR().a(fwy.V));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public gbf b() {
      return gbf.e;
   }

   @Override
   public void a(fab $$0, fep $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * ayy.a($$3 * (float) Math.PI);
      ezx $$5 = new ezx();
      $$5.a($$1.f());
      $$5.a(a.b.rotationDegrees(150.0F * $$3 - 60.0F));
      $$5.b(-1.0F, -1.0F, 1.0F);
      $$5.a(0.0F, -1.101F, 1.5F);
      gdn.a $$6 = ffe.Q().aQ().c();
      fab $$7 = $$6.getBuffer(this.b);
      this.a.a($$5, $$7, 15728880, gop.d, 1.0F, 1.0F, 1.0F, $$4);
      $$6.b();
   }

   public static class a implements gbe<lm> {
      public gbb a(lm $$0, fxu $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gay($$1, $$2, $$3, $$4);
      }
   }
}

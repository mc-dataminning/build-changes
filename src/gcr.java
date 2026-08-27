public class gcr extends gcu {
   private final fwn a;
   private final gfo b = gfo.i(gkj.a);

   gcr(fzn $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new fvx(fgj.Q().aS().a(fyr.W));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public gcy b() {
      return gcy.e;
   }

   @Override
   public void a(fbg $$0, ffu $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * aym.a($$3 * (float) Math.PI);
      fbc $$5 = new fbc();
      $$5.a($$1.f());
      $$5.a(a.b.rotationDegrees(150.0F * $$3 - 60.0F));
      $$5.b(-1.0F, -1.0F, 1.0F);
      $$5.a(0.0F, -1.101F, 1.5F);
      gfg.a $$6 = fgj.Q().aR().c();
      fbg $$7 = $$6.getBuffer(this.b);
      this.a.a($$5, $$7, 15728880, gqp.d, 1.0F, 1.0F, 1.0F, $$4);
      $$6.b();
   }

   public static class a implements gcx<le> {
      public gcu a(le $$0, fzn $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gcr($$1, $$2, $$3, $$4);
      }
   }
}

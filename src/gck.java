public class gck extends gcn {
   private final fwg a;
   private final gfh b = gfh.i(gkc.a);

   gck(fzf $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new fvr(fgo.Q().aP().a(fyj.W));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public gcr b() {
      return gcr.e;
   }

   @Override
   public void a(fbm $$0, ffy $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * ayo.a($$3 * (float) Math.PI);
      int $$5 = axy.b.a($$4, 1.0F, 1.0F, 1.0F);
      fbi $$6 = new fbi();
      $$6.a($$1.f());
      $$6.a(a.b.rotationDegrees(150.0F * $$3 - 60.0F));
      $$6.b(1.0F, -1.0F, -1.0F);
      $$6.a(0.0F, -1.101F, 1.5F);
      gez.a $$7 = fgo.Q().aO().c();
      fbm $$8 = $$7.getBuffer(this.b);
      this.a.a($$6, $$8, 15728880, gqc.d, $$5);
      $$7.b();
   }

   public static class a implements gcq<lq> {
      public gcn a(lq $$0, fzf $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gck($$1, $$2, $$3, $$4);
      }
   }
}

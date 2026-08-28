public class gci extends gcl {
   private final fwe a;
   private final gff b = gff.i(gka.a);

   gci(fzd $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new fvp(fgm.Q().aP().a(fyh.W));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public gcp b() {
      return gcp.e;
   }

   @Override
   public void a(fbk $$0, ffw $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * ayo.a($$3 * (float) Math.PI);
      int $$5 = axy.b.a($$4, 1.0F, 1.0F, 1.0F);
      fbg $$6 = new fbg();
      $$6.a($$1.f());
      $$6.a(a.b.rotationDegrees(150.0F * $$3 - 60.0F));
      $$6.b(1.0F, -1.0F, -1.0F);
      $$6.a(0.0F, -1.101F, 1.5F);
      gex.a $$7 = fgm.Q().aO().c();
      fbk $$8 = $$7.getBuffer(this.b);
      this.a.a($$6, $$8, 15728880, gqa.d, $$5);
      $$7.b();
   }

   public static class a implements gco<lq> {
      public gcl a(lq $$0, fzd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gci($$1, $$2, $$3, $$4);
      }
   }
}

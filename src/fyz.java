public class fyz extends fzc {
   private final fsx a;
   private final gbw b = gbw.i(ggq.a);

   fyz(fvw $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new fsi(fde.Q().aS().a(fva.V));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public fzg b() {
      return fzg.e;
   }

   @Override
   public void a(eyb $$0, fcp $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * axz.a($$3 * (float) Math.PI);
      exx $$5 = new exx();
      $$5.a($$1.f());
      $$5.a(a.b.rotationDegrees(150.0F * $$3 - 60.0F));
      $$5.b(-1.0F, -1.0F, 1.0F);
      $$5.a(0.0F, -1.101F, 1.5F);
      gbo.a $$6 = fde.Q().aR().c();
      eyb $$7 = $$6.getBuffer(this.b);
      this.a.a($$5, $$7, 15728880, gmp.d, 1.0F, 1.0F, 1.0F, $$4);
      $$6.b();
   }

   public static class a implements fzf<la> {
      public fzc a(la $$0, fvw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fyz($$1, $$2, $$3, $$4);
      }
   }
}

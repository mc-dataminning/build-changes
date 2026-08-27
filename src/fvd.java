public class fvd extends fvg {
   private final fpb a;
   private final fya b = fya.i(gcu.a);

   fvd(fsa $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new fol(ezi.Q().aR().a(fre.V));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public fvk b() {
      return fvk.e;
   }

   @Override
   public void a(euf $$0, eyt $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * aww.a($$3 * (float) Math.PI);
      eub $$5 = new eub();
      $$5.a($$1.f());
      $$5.a(a.b.rotationDegrees(150.0F * $$3 - 60.0F));
      $$5.b(-1.0F, -1.0F, 1.0F);
      $$5.a(0.0F, -1.101F, 1.5F);
      fxs.a $$6 = ezi.Q().aQ().c();
      euf $$7 = $$6.getBuffer(this.b);
      this.a.a($$5, $$7, 15728880, git.d, 1.0F, 1.0F, 1.0F, $$4);
      $$6.b();
   }

   public static class a implements fvj<kf> {
      public fvg a(kf $$0, fsa $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fvd($$1, $$2, $$3, $$4);
      }
   }
}

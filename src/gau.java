public class gau extends gax {
   private final fur a;
   private final gdr b = gdr.i(gil.a);

   gau(fxq $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new fuc(ffa.Q().aR().a(fwu.V));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public gbb b() {
      return gbb.e;
   }

   @Override
   public void a(ezx $$0, fel $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * ayu.a($$3 * (float) Math.PI);
      ezt $$5 = new ezt();
      $$5.a($$1.f());
      $$5.a(a.b.rotationDegrees(150.0F * $$3 - 60.0F));
      $$5.b(-1.0F, -1.0F, 1.0F);
      $$5.a(0.0F, -1.101F, 1.5F);
      gdj.a $$6 = ffa.Q().aQ().c();
      ezx $$7 = $$6.getBuffer(this.b);
      this.a.a($$5, $$7, 15728880, gol.d, 1.0F, 1.0F, 1.0F, $$4);
      $$6.b();
   }

   public static class a implements gba<lm> {
      public gax a(lm $$0, fxq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gau($$1, $$2, $$3, $$4);
      }
   }
}

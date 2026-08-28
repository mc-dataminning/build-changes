public class gbq extends gbt {
   private final fvm a;
   private final gen b = gen.i(gjh.a);

   gbq(fyl $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new fux(ffw.Q().aP().a(fxp.V));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public gbx b() {
      return gbx.e;
   }

   @Override
   public void a(fas $$0, ffg $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * ayg.a($$3 * (float) Math.PI);
      fao $$5 = new fao();
      $$5.a($$1.f());
      $$5.a(a.b.rotationDegrees(150.0F * $$3 - 60.0F));
      $$5.b(-1.0F, -1.0F, 1.0F);
      $$5.a(0.0F, -1.101F, 1.5F);
      gef.a $$6 = ffw.Q().aO().c();
      fas $$7 = $$6.getBuffer(this.b);
      this.a.a($$5, $$7, 15728880, gph.d, 1.0F, 1.0F, 1.0F, $$4);
      $$6.b();
   }

   public static class a implements gbw<ln> {
      public gbt a(ln $$0, fyl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gbq($$1, $$2, $$3, $$4);
      }
   }
}

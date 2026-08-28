public class gjb extends gje {
   private final gct a;
   private final gmf b = gmf.j(gru.a);

   gjb(gfw $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new gcg(flh.Q().aS().a(gez.aE));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public gji b() {
      return gji.d;
   }

   @Override
   public void a(ffs $$0, glv $$1, fkp $$2, float $$3) {
      float $$4 = ((float)this.s + $$3) / (float)this.t;
      float $$5 = 0.05F + 0.5F * ayy.a($$4 * (float) Math.PI);
      int $$6 = axj.a($$5, 1.0F, 1.0F, 1.0F);
      $$0.a();
      $$0.a($$2.f());
      $$0.a(a.b.rotationDegrees(60.0F - 150.0F * $$4));
      float $$7 = 0.42553192F;
      $$0.b(0.42553192F, -0.42553192F, -0.42553192F);
      $$0.a(0.0F, -0.56F, 3.5F);
      ffw $$8 = $$1.getBuffer(this.b);
      this.a.a($$0, $$8, 15728880, hec.d, $$6);
      $$0.b();
   }

   @Override
   public void a(ffw $$0, fkp $$1, float $$2) {
   }

   public static class a implements gjh<lx> {
      public gje a(lx $$0, gfw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gjb($$1, $$2, $$3, $$4);
      }
   }
}

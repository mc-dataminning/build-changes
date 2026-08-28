public class gvh extends gtl<ckq, haz, ges> {
   private static final akv a = akv.b("textures/entity/wither/wither_invulnerable.png");
   private static final akv b = akv.b("textures/entity/wither/wither.png");

   public gvh(gsf.a $$0) {
      super($$0, new ges($$0.a(gfd.dA)), 1.0F);
      this.a(new gxh(this, $$0.f()));
   }

   protected int a(ckq $$0, ji $$1) {
      return 15;
   }

   public akv a(haz $$0) {
      int $$1 = ayz.d($$0.c);
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : b;
   }

   public haz b() {
      return new haz();
   }

   protected void a(haz $$0, ffv $$1) {
      float $$2 = 2.0F;
      if ($$0.c > 0.0F) {
         $$2 -= $$0.c / 220.0F * 0.5F;
      }

      $$1.b($$2, $$2, $$2);
   }

   public void a(ckq $$0, haz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      int $$3 = $$0.gs();
      $$1.c = $$3 > 0 ? (float)$$3 - $$2 : 0.0F;
      System.arraycopy($$0.x(), 0, $$1.a, 0, $$1.a.length);
      System.arraycopy($$0.t(), 0, $$1.b, 0, $$1.b.length);
      $$1.d = $$0.gt();
   }
}

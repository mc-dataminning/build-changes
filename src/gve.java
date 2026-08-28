public class gve extends gti<cko, haw, geq> {
   private static final aku a = aku.b("textures/entity/wither/wither_invulnerable.png");
   private static final aku b = aku.b("textures/entity/wither/wither.png");

   public gve(gsc.a $$0) {
      super($$0, new geq($$0.a(gfb.dA)), 1.0F);
      this.a(new gxe(this, $$0.f()));
   }

   protected int a(cko $$0, ji $$1) {
      return 15;
   }

   public aku a(haw $$0) {
      int $$1 = ayz.d($$0.c);
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : b;
   }

   public haw b() {
      return new haw();
   }

   protected void a(haw $$0, ffu $$1) {
      float $$2 = 2.0F;
      if ($$0.c > 0.0F) {
         $$2 -= $$0.c / 220.0F * 0.5F;
      }

      $$1.b($$2, $$2, $$2);
   }

   public void a(cko $$0, haw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      int $$3 = $$0.gp();
      $$1.c = $$3 > 0 ? (float)$$3 - $$2 : 0.0F;
      System.arraycopy($$0.x(), 0, $$1.a, 0, $$1.a.length);
      System.arraycopy($$0.t(), 0, $$1.b, 0, $$1.b.length);
      $$1.d = $$0.gq();
   }
}

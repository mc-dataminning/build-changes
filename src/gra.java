public class gra extends gpf<ckd, gwo, gap> {
   private static final alh a = alh.b("textures/entity/wither/wither_invulnerable.png");
   private static final alh b = alh.b("textures/entity/wither/wither.png");

   public gra(gnz.a $$0) {
      super($$0, new gap($$0.a(gba.cZ)), 1.0F);
      this.a(new gta(this, $$0.f()));
   }

   protected int a(ckd $$0, jg $$1) {
      return 15;
   }

   public alh a(gwo $$0) {
      int $$1 = azj.d($$0.c);
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : b;
   }

   public gwo c() {
      return new gwo();
   }

   protected void a(gwo $$0, fdt $$1) {
      float $$2 = 2.0F;
      if ($$0.c > 0.0F) {
         $$2 -= $$0.c / 220.0F * 0.5F;
      }

      $$1.b($$2, $$2, $$2);
   }

   public void a(ckd $$0, gwo $$1, float $$2) {
      super.a($$0, $$1, $$2);
      int $$3 = $$0.gw();
      $$1.c = $$3 > 0 ? (float)$$3 - $$2 : 0.0F;
      System.arraycopy($$0.gv(), 0, $$1.a, 0, $$1.a.length);
      System.arraycopy($$0.y(), 0, $$1.b, 0, $$1.b.length);
      $$1.d = $$0.gx();
   }
}

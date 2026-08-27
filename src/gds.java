public class gds extends gby<cdg, fos<cdg>> {
   private static final aiy a = new aiy("textures/entity/wither/wither_invulnerable.png");
   private static final aiy i = new aiy("textures/entity/wither/wither.png");

   public gds(gas.a $$0) {
      super($$0, new fos<>($$0.a(fpb.bR)), 1.0F);
      this.a(new gfr(this, $$0.f()));
   }

   protected int a(cdg $$0, hz $$1) {
      return 15;
   }

   public aiy a(cdg $$0) {
      int $$1 = $$0.A();
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : i;
   }

   protected void a(cdg $$0, esa $$1, float $$2) {
      float $$3 = 2.0F;
      int $$4 = $$0.A();
      if ($$4 > 0) {
         $$3 -= ((float)$$4 - $$2) / 220.0F * 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}

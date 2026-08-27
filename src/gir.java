public class gir extends ggx<cfy, ftl<cfy>> {
   private static final ajv a = new ajv("textures/entity/wither/wither_invulnerable.png");
   private static final ajv i = new ajv("textures/entity/wither/wither.png");

   public gir(gfr.a $$0) {
      super($$0, new ftl<>($$0.a(ftu.bV)), 1.0F);
      this.a(new gkq(this, $$0.f()));
   }

   protected int a(cfy $$0, id $$1) {
      return 15;
   }

   public ajv a(cfy $$0) {
      int $$1 = $$0.y();
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : i;
   }

   protected void a(cfy $$0, ewr $$1, float $$2) {
      float $$3 = 2.0F;
      int $$4 = $$0.y();
      if ($$4 > 0) {
         $$3 -= ((float)$$4 - $$2) / 220.0F * 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}

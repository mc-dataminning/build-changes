public class gjn extends ght<cgj, fuh<cgj>> {
   private static final akf a = new akf("textures/entity/wither/wither_invulnerable.png");
   private static final akf i = new akf("textures/entity/wither/wither.png");

   public gjn(ggn.a $$0) {
      super($$0, new fuh<>($$0.a(fuq.bV)), 1.0F);
      this.a(new glm(this, $$0.f()));
   }

   protected int a(cgj $$0, im $$1) {
      return 15;
   }

   public akf a(cgj $$0) {
      int $$1 = $$0.y();
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : i;
   }

   protected void a(cgj $$0, exn $$1, float $$2) {
      float $$3 = 2.0F;
      int $$4 = $$0.y();
      if ($$4 > 0) {
         $$3 -= ((float)$$4 - $$2) / 220.0F * 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}

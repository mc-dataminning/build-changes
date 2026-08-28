public class gmh extends gkm<cie, fwy<cie>> {
   private static final akk a = new akk("textures/entity/wither/wither_invulnerable.png");
   private static final akk i = new akk("textures/entity/wither/wither.png");

   public gmh(gjg.a $$0) {
      super($$0, new fwy<>($$0.a(fxh.bV)), 1.0F);
      this.a(new gog(this, $$0.f()));
   }

   protected int a(cie $$0, ja $$1) {
      return 15;
   }

   public akk a(cie $$0) {
      int $$1 = $$0.y();
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : i;
   }

   protected void a(cie $$0, fag $$1, float $$2) {
      float $$3 = 2.0F;
      int $$4 = $$0.y();
      if ($$4 > 0) {
         $$3 -= ((float)$$4 - $$2) / 220.0F * 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}

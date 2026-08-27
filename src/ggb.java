public class ggb extends geh<ces, fqv<ces>> {
   private static final ajh a = new ajh("textures/entity/wither/wither_invulnerable.png");
   private static final ajh i = new ajh("textures/entity/wither/wither.png");

   public ggb(gdb.a $$0) {
      super($$0, new fqv<>($$0.a(fre.bV)), 1.0F);
      this.a(new gia(this, $$0.f()));
   }

   protected int a(ces $$0, ib $$1) {
      return 15;
   }

   public ajh a(ces $$0) {
      int $$1 = $$0.y();
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : i;
   }

   protected void a(ces $$0, eub $$1, float $$2) {
      float $$3 = 2.0F;
      int $$4 = $$0.y();
      if ($$4 > 0) {
         $$3 -= ((float)$$4 - $$2) / 220.0F * 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}

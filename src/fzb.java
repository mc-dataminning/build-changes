public class fzb extends fxi<cag, fkj<cag>> {
   private static final agm a = new agm("textures/entity/wither/wither_invulnerable.png");
   private static final agm i = new agm("textures/entity/wither/wither.png");

   public fzb(fwc.a $$0) {
      super($$0, new fkj<>($$0.a(fks.bO)), 1.0F);
      this.a(new gay(this, $$0.f()));
   }

   protected int a(cag $$0, hx $$1) {
      return 15;
   }

   public agm a(cag $$0) {
      int $$1 = $$0.A();
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : i;
   }

   protected void a(cag $$0, eob $$1, float $$2) {
      float $$3 = 2.0F;
      int $$4 = $$0.A();
      if ($$4 > 0) {
         $$3 -= ((float)$$4 - $$2) / 220.0F * 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}

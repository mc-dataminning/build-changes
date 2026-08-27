public class fyj extends fwq<bzt, fjr<bzt>> {
   private static final agg a = new agg("textures/entity/wither/wither_invulnerable.png");
   private static final agg i = new agg("textures/entity/wither/wither.png");

   public fyj(fvk.a $$0) {
      super($$0, new fjr<>($$0.a(fka.bO)), 1.0F);
      this.a(new gag(this, $$0.f()));
   }

   protected int a(bzt $$0, ht $$1) {
      return 15;
   }

   public agg a(bzt $$0) {
      int $$1 = $$0.y();
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : i;
   }

   protected void a(bzt $$0, enk $$1, float $$2) {
      float $$3 = 2.0F;
      int $$4 = $$0.y();
      if ($$4 > 0) {
         $$3 -= ((float)$$4 - $$2) / 220.0F * 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}

public class geo extends gde<cbm, fmw<cbm>> {
   private final fmw<cbm> a = this.a();
   private final fmw<cbm> i;
   private static final ajc j = new ajc("textures/entity/fish/tropical_a.png");
   private static final ajc k = new ajc("textures/entity/fish/tropical_b.png");

   public geo(gby.a $$0) {
      super($$0, new fpl<>($$0.a(fqe.bH)), 0.15F);
      this.i = new fpm<>($$0.a(fqe.bF));
      this.a(new ggt(this, $$0.f()));
   }

   public ajc a(cbm $$0) {
      return switch ($$0.gw().a()) {
         case a -> j;
         case b -> k;
      };
   }

   public void a(cbm $$0, float $$1, float $$2, etd $$3, fwq $$4, int $$5) {
      fmw<cbm> $$6 = switch ($$0.gw().a()) {
         case a -> this.a;
         case b -> this.i;
      };
      this.f = $$6;
      float[] $$7 = $$0.gu().d();
      $$6.a($$7[0], $$7[1], $$7[2]);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.a(1.0F, 1.0F, 1.0F);
   }

   protected void a(cbm $$0, etd $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = 4.3F * awm.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.aZ()) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}

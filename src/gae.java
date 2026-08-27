public class gae extends fyu<byi, fiq<byi>> {
   private final fiq<byi> a = this.a();
   private final fiq<byi> i;
   private static final agt j = new agt("textures/entity/fish/tropical_a.png");
   private static final agt k = new agt("textures/entity/fish/tropical_b.png");

   public gae(fxo.a $$0) {
      super($$0, new fle<>($$0.a(flx.bI)), 0.15F);
      this.i = new flf<>($$0.a(flx.bG));
      this.a(new gcj(this, $$0.f()));
   }

   public agt a(byi $$0) {
      return switch ($$0.gp().a()) {
         case a -> j;
         case b -> k;
      };
   }

   public void a(byi $$0, float $$1, float $$2, epd $$3, fsi $$4, int $$5) {
      fiq<byi> $$6 = switch ($$0.gp().a()) {
         case a -> this.a;
         case b -> this.i;
      };
      this.f = $$6;
      float[] $$7 = $$0.gn().d();
      $$6.a($$7[0], $$7[1], $$7[2]);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.a(1.0F, 1.0F, 1.0F);
   }

   protected void a(byi $$0, epd $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = 4.3F * aty.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$5));
      if (!$$0.aZ()) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}

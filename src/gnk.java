public class gnk extends glz<cfe, fvi<cfe>> {
   private final fvi<cfe> a = this.a();
   private final fvi<cfe> b;
   private static final akt g = new akt("textures/entity/fish/tropical_a.png");
   private static final akt k = new akt("textures/entity/fish/tropical_b.png");

   public gnk(gkq.a $$0) {
      super($$0, new fxy<>($$0.a(fyr.bR)), 0.15F);
      this.b = new fxz<>($$0.a(fyr.bP));
      this.a(new gps(this, $$0.f()));
   }

   public akt a(cfe $$0) {
      return switch ($$0.gJ().a()) {
         case a -> g;
         case b -> k;
      };
   }

   public void a(cfe $$0, float $$1, float $$2, fbc $$3, gfg $$4, int $$5) {
      fvi<cfe> $$6 = switch ($$0.gJ().a()) {
         case a -> this.a;
         case b -> this.b;
      };
      this.h = $$6;
      float[] $$7 = $$0.gH().d();
      $$6.a($$7[0], $$7[1], $$7[2]);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.a(1.0F, 1.0F, 1.0F);
   }

   protected void a(cfe $$0, fbc $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = 4.3F * aym.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.bi()) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}

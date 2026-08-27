public class gfo extends gee<ccd, fnu<ccd>> {
   private final fnu<ccd> a = this.a();
   private final fnu<ccd> i;
   private static final ajh j = new ajh("textures/entity/fish/tropical_a.png");
   private static final ajh k = new ajh("textures/entity/fish/tropical_b.png");

   public gfo(gcy.a $$0) {
      super($$0, new fqj<>($$0.a(frc.bH)), 0.15F);
      this.i = new fqk<>($$0.a(frc.bF));
      this.a(new ght(this, $$0.f()));
   }

   public ajh a(ccd $$0) {
      return switch ($$0.gy().a()) {
         case a -> j;
         case b -> k;
      };
   }

   public void a(ccd $$0, float $$1, float $$2, etz $$3, fxq $$4, int $$5) {
      fnu<ccd> $$6 = switch ($$0.gy().a()) {
         case a -> this.a;
         case b -> this.i;
      };
      this.f = $$6;
      float[] $$7 = $$0.gw().d();
      $$6.a($$7[0], $$7[1], $$7[2]);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.a(1.0F, 1.0F, 1.0F);
   }

   protected void a(ccd $$0, etz $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = 4.3F * aww.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.bc()) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}

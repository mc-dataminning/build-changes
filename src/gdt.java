public class gdt extends gee<cbp, fos<cbp>> {
   private static final ajh a = new ajh("textures/entity/iron_golem/iron_golem.png");

   public gdt(gcy.a $$0) {
      super($$0, new fos<>($$0.a(frc.ar)), 0.7F);
      this.a(new gha(this));
      this.a(new ghb(this, $$0.c()));
   }

   public ajh a(cbp $$0) {
      return a;
   }

   protected void a(cbp $$0, etz $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!((double)$$0.aT.a() < 0.01)) {
         float $$6 = 13.0F;
         float $$7 = $$0.aT.c($$4) + 6.0F;
         float $$8 = (Math.abs($$7 % 13.0F - 6.5F) - 3.25F) / 3.25F;
         $$1.a(a.f.rotationDegrees(6.5F * $$8));
      }
   }
}

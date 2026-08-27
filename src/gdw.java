public class gdw extends geh<cbq, fou<cbq>> {
   private static final ajh a = new ajh("textures/entity/iron_golem/iron_golem.png");

   public gdw(gdb.a $$0) {
      super($$0, new fou<>($$0.a(fre.av)), 0.7F);
      this.a(new ghd(this));
      this.a(new ghe(this, $$0.c()));
   }

   public ajh a(cbq $$0) {
      return a;
   }

   protected void a(cbq $$0, eub $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!((double)$$0.aT.a() < 0.01)) {
         float $$6 = 13.0F;
         float $$7 = $$0.aT.c($$4) + 6.0F;
         float $$8 = (Math.abs($$7 % 13.0F - 6.5F) - 3.25F) / 3.25F;
         $$1.a(a.f.rotationDegrees(6.5F * $$8));
      }
   }
}

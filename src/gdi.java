public class gdi extends gee<cfs, fog<cfs>> {
   private static final ajh a = new ajh("textures/entity/ghast/ghast.png");
   private static final ajh i = new ajh("textures/entity/ghast/ghast_shooting.png");

   public gdi(gcy.a $$0) {
      super($$0, new fog<>($$0.a(frc.ac)), 1.5F);
   }

   public ajh a(cfs $$0) {
      return $$0.r() ? i : a;
   }

   protected void a(cfs $$0, etz $$1, float $$2) {
      float $$3 = 1.0F;
      float $$4 = 4.5F;
      float $$5 = 4.5F;
      $$1.b(4.5F, 4.5F, 4.5F);
   }
}

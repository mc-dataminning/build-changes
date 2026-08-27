public class gdj extends geh<cbo, fog<cbo>> {
   private static final ajh a = new ajh("textures/entity/fox/fox.png");
   private static final ajh i = new ajh("textures/entity/fox/fox_sleep.png");
   private static final ajh j = new ajh("textures/entity/fox/snow_fox.png");
   private static final ajh k = new ajh("textures/entity/fox/snow_fox_sleep.png");

   public gdj(gdb.a $$0) {
      super($$0, new fog<>($$0.a(fre.ad)), 0.4F);
      this.a(new ggz(this, $$0.d()));
   }

   protected void a(cbo $$0, eub $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$0.gt() || $$0.gn()) {
         float $$6 = -aww.i($$4, $$0.O, $$0.dE());
         $$1.a(a.b.rotationDegrees($$6));
      }
   }

   public ajh a(cbo $$0) {
      if ($$0.s() == cbo.v.a) {
         return $$0.fI() ? i : a;
      } else {
         return $$0.fI() ? k : j;
      }
   }
}

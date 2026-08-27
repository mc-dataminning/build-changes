public class gfz extends ggx<ccs, fqx<ccs>> {
   private static final ajv a = new ajv("textures/entity/fox/fox.png");
   private static final ajv i = new ajv("textures/entity/fox/fox_sleep.png");
   private static final ajv j = new ajv("textures/entity/fox/snow_fox.png");
   private static final ajv k = new ajv("textures/entity/fox/snow_fox_sleep.png");

   public gfz(gfr.a $$0) {
      super($$0, new fqx<>($$0.a(ftu.ad)), 0.4F);
      this.a(new gjp(this, $$0.d()));
   }

   protected void a(ccs $$0, ewr $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$0.gt() || $$0.gn()) {
         float $$6 = -axm.i($$4, $$0.O, $$0.dE());
         $$1.a(a.b.rotationDegrees($$6));
      }
   }

   public ajv a(ccs $$0) {
      if ($$0.u() == ccs.v.a) {
         return $$0.fI() ? i : a;
      } else {
         return $$0.fI() ? k : j;
      }
   }
}

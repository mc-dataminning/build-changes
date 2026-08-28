public class gqj extends gpf<clz, gwb, gad> {
   private static final alh a = alh.b("textures/entity/strider/strider.png");
   private static final alh b = alh.b("textures/entity/strider/strider_cold.png");
   private static final float k = 0.5F;

   public gqj(gnz.a $$0) {
      super($$0, new gad($$0.a(gba.cF)), 0.5F);
      this.a(new gsn<>(this, new gad($$0.a(gba.cG)), alh.b("textures/entity/strider/strider_saddle.png")));
   }

   public alh a(gwb $$0) {
      return $$0.b ? b : a;
   }

   protected float b(gwb $$0) {
      float $$1 = super.g($$0);
      return $$0.ae ? $$1 * 0.5F : $$1;
   }

   public gwb c() {
      return new gwb();
   }

   public void a(clz $$0, gwb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.i();
      $$1.b = $$0.q();
      $$1.c = $$0.cb();
   }

   protected void a(gwb $$0, fdt $$1) {
      float $$2 = $$0.ab;
      $$1.b($$2, $$2, $$2);
   }

   protected boolean c(gwb $$0) {
      return super.a($$0) || $$0.b;
   }
}

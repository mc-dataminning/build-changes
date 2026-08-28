public class guo extends gqx<cmk, hak, gee> {
   private static final akv a = akv.b("textures/entity/strider/strider.png");
   private static final akv b = akv.b("textures/entity/strider/strider_cold.png");
   private static final float k = 0.5F;

   public guo(gsd.a $$0) {
      super($$0, new gee($$0.a(gfb.dd)), new gee($$0.a(gfb.df)), 0.5F);
      this.a(new gwt<>(this, new gee($$0.a(gfb.de)), new gee($$0.a(gfb.dg)), akv.b("textures/entity/strider/strider_saddle.png")));
   }

   public akv a(hak $$0) {
      return $$0.b ? b : a;
   }

   protected float b(hak $$0) {
      float $$1 = super.g($$0);
      return $$0.aj ? $$1 * 0.5F : $$1;
   }

   public hak b() {
      return new hak();
   }

   public void a(cmk $$0, hak $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.j();
      $$1.b = $$0.p();
      $$1.c = $$0.ca();
   }

   protected boolean c(hak $$0) {
      return super.a($$0) || $$0.b;
   }
}

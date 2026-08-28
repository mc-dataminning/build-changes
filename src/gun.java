public class gun extends gqw<cmk, haj, gee> {
   private static final aku a = aku.b("textures/entity/strider/strider.png");
   private static final aku b = aku.b("textures/entity/strider/strider_cold.png");
   private static final float k = 0.5F;

   public gun(gsc.a $$0) {
      super($$0, new gee($$0.a(gfb.dd)), new gee($$0.a(gfb.df)), 0.5F);
      this.a(new gws<>(this, new gee($$0.a(gfb.de)), new gee($$0.a(gfb.dg)), aku.b("textures/entity/strider/strider_saddle.png")));
   }

   public aku a(haj $$0) {
      return $$0.b ? b : a;
   }

   protected float b(haj $$0) {
      float $$1 = super.g($$0);
      return $$0.aj ? $$1 * 0.5F : $$1;
   }

   public haj b() {
      return new haj();
   }

   public void a(cmk $$0, haj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.j();
      $$1.b = $$0.p();
      $$1.c = $$0.ca();
   }

   protected boolean c(haj $$0) {
      return super.a($$0) || $$0.b;
   }
}

public class gux extends gqv<cog, has, gek> {
   private static final aku b = aku.b("textures/entity/villager/villager.png");
   public static final gvu.a a = new gvu.a(-0.1171875F, -0.07421875F, 1.0F);

   public gux(gsb.a $$0) {
      super($$0, new gek($$0.a(gez.dt)), new gek($$0.a(gez.du)), 0.5F);
      this.a(new gvu<>(this, $$0.f(), a));
      this.a(new gxa<>(this, $$0.e(), "villager"));
      this.a(new gvt<>(this));
   }

   public aku a(has $$0) {
      return b;
   }

   protected float b(has $$0) {
      float $$1 = super.g($$0);
      return $$0.aj ? $$1 * 0.5F : $$1;
   }

   public has b() {
      return new has();
   }

   public void a(cog $$0, has $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gyw.a($$0, $$1, this.i);
      $$1.a = $$0.p() > 0;
      $$1.b = $$0.gz();
   }
}

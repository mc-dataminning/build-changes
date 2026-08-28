public class gvb extends gqz<coj, haw, geo> {
   private static final akv b = akv.b("textures/entity/villager/villager.png");
   public static final gvy.a a = new gvy.a(-0.1171875F, -0.07421875F, 1.0F);

   public gvb(gsf.a $$0) {
      super($$0, new geo($$0.a(gfd.dt)), new geo($$0.a(gfd.du)), 0.5F);
      this.a(new gvy<>(this, $$0.f(), a));
      this.a(new gxe<>(this, $$0.e(), "villager"));
      this.a(new gvx<>(this));
   }

   public akv a(haw $$0) {
      return b;
   }

   protected float b(haw $$0) {
      float $$1 = super.g($$0);
      return $$0.aj ? $$1 * 0.5F : $$1;
   }

   public haw b() {
      return new haw();
   }

   public void a(coj $$0, haw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gza.a($$0, $$1, this.i);
      $$1.a = $$0.p() > 0;
      $$1.b = $$0.gC();
   }
}

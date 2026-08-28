public class gva extends gqy<coi, hav, gen> {
   private static final akv b = akv.b("textures/entity/villager/villager.png");
   public static final gvx.a a = new gvx.a(-0.1171875F, -0.07421875F, 1.0F);

   public gva(gse.a $$0) {
      super($$0, new gen($$0.a(gfc.dt)), new gen($$0.a(gfc.du)), 0.5F);
      this.a(new gvx<>(this, $$0.f(), a));
      this.a(new gxd<>(this, $$0.e(), "villager"));
      this.a(new gvw<>(this));
   }

   public akv a(hav $$0) {
      return b;
   }

   protected float b(hav $$0) {
      float $$1 = super.g($$0);
      return $$0.aj ? $$1 * 0.5F : $$1;
   }

   public hav b() {
      return new hav();
   }

   public void a(coi $$0, hav $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gyz.a($$0, $$1, this.i);
      $$1.a = $$0.p() > 0;
      $$1.b = $$0.gC();
   }
}

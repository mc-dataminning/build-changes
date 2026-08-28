public class hbg extends gxe<crl, hhb, gkp> {
   private static final alk j = alk.b("textures/entity/villager/villager.png");
   public static final hcd.a a = new hcd.a(-0.1171875F, -0.07421875F, 1.0F);

   public hbg(gyk.a $$0) {
      super($$0, new gkp($$0.a(glf.dL)), new gkp($$0.a(glf.dM)), 0.5F);
      this.a(new hcd<>(this, $$0.f(), a));
      this.a(new hdj<>(this, $$0.e(), "villager"));
      this.a(new hcc<>(this));
   }

   public alk a(hhb $$0) {
      return j;
   }

   protected float b(hhb $$0) {
      float $$1 = super.g($$0);
      return $$0.aj ? $$1 * 0.5F : $$1;
   }

   public hhb b() {
      return new hhb();
   }

   public void a(crl $$0, hhb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hfg.a($$0, $$1, this.h);
      $$1.a = $$0.q() > 0;
      $$1.b = $$0.gC();
   }
}

public class hbe extends gxc<crj, hgz, gkn> {
   private static final ali j = ali.b("textures/entity/villager/villager.png");
   public static final hcb.a a = new hcb.a(-0.1171875F, -0.07421875F, 1.0F);

   public hbe(gyi.a $$0) {
      super($$0, new gkn($$0.a(gld.dL)), new gkn($$0.a(gld.dM)), 0.5F);
      this.a(new hcb<>(this, $$0.f(), a));
      this.a(new hdh<>(this, $$0.e(), "villager"));
      this.a(new hca<>(this));
   }

   public ali a(hgz $$0) {
      return j;
   }

   protected float b(hgz $$0) {
      float $$1 = super.g($$0);
      return $$0.aj ? $$1 * 0.5F : $$1;
   }

   public hgz b() {
      return new hgz();
   }

   public void a(crj $$0, hgz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hfe.a($$0, $$1, this.h);
      $$1.a = $$0.q() > 0;
      $$1.b = $$0.gC();
   }
}

public class har extends gwp<cru, hgp, gka> {
   private static final alr j = alr.b("textures/entity/villager/villager.png");
   public static final hbo.a a = new hbo.a(-0.1171875F, -0.07421875F, 1.0F);

   public har(gxv.a $$0) {
      super($$0, new gka($$0.a(gkq.dL)), new gka($$0.a(gkq.dM)), 0.5F);
      this.a(new hbo<>(this, $$0.f(), a));
      this.a(new hcu<>(this, $$0.e(), "villager"));
      this.a(new hbn<>(this));
   }

   public alr a(hgp $$0) {
      return j;
   }

   protected float b(hgp $$0) {
      float $$1 = super.g($$0);
      return $$0.am ? $$1 * 0.5F : $$1;
   }

   public hgp b() {
      return new hgp();
   }

   public void a(cru $$0, hgp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      het.a($$0, $$1, this.h);
      $$1.a = $$0.q() > 0;
      $$1.b = $$0.gC();
   }
}

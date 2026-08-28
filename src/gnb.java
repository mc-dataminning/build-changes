public class gnb extends glj<clz, fxq<clz>> {
   private static final akq a = akq.b("textures/entity/warden/warden.png");
   private static final akq i = akq.b("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final akq j = akq.b("textures/entity/warden/warden_heart.png");
   private static final akq k = akq.b("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final akq l = akq.b("textures/entity/warden/warden_pulsating_spots_2.png");

   public gnb(gkd.a $$0) {
      super($$0, new fxq<>($$0.a(fyd.bS)), 0.9F);
      this.a(new gpb<>(this, i, ($$0x, $$1, $$2) -> 1.0F, fxq::e));
      this.a(new gpb<>(this, k, ($$0x, $$1, $$2) -> Math.max(0.0F, ayn.b($$2 * 0.045F) * 0.25F), fxq::f));
      this.a(new gpb<>(this, l, ($$0x, $$1, $$2) -> Math.max(0.0F, ayn.b($$2 * 0.045F + (float) Math.PI) * 0.25F), fxq::f));
      this.a(new gpb<>(this, a, ($$0x, $$1, $$2) -> $$0x.H($$1), fxq::c));
      this.a(new gpb<>(this, j, ($$0x, $$1, $$2) -> $$0x.I($$1), fxq::d));
   }

   public akq a(clz $$0) {
      return a;
   }
}

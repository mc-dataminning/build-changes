public class gkr extends giz<clc, fvi<clc>> {
   private static final akn a = new akn("textures/entity/warden/warden.png");
   private static final akn i = new akn("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final akn j = new akn("textures/entity/warden/warden_heart.png");
   private static final akn k = new akn("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final akn l = new akn("textures/entity/warden/warden_pulsating_spots_2.png");

   public gkr(ght.a $$0) {
      super($$0, new fvi<>($$0.a(fvv.bR)), 0.9F);
      this.a(new gmr<>(this, i, ($$0x, $$1, $$2) -> 1.0F, fvi::e));
      this.a(new gmr<>(this, k, ($$0x, $$1, $$2) -> Math.max(0.0F, ayf.b($$2 * 0.045F) * 0.25F), fvi::f));
      this.a(new gmr<>(this, l, ($$0x, $$1, $$2) -> Math.max(0.0F, ayf.b($$2 * 0.045F + (float) Math.PI) * 0.25F), fvi::f));
      this.a(new gmr<>(this, a, ($$0x, $$1, $$2) -> $$0x.G($$1), fvi::c));
      this.a(new gmr<>(this, j, ($$0x, $$1, $$2) -> $$0x.H($$1), fvi::d));
   }

   public akn a(clc $$0) {
      return a;
   }
}

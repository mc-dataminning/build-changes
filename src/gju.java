public class gju extends gid<ckl, fun<ckl>> {
   private static final akh a = new akh("textures/entity/warden/warden.png");
   private static final akh i = new akh("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final akh j = new akh("textures/entity/warden/warden_heart.png");
   private static final akh k = new akh("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final akh l = new akh("textures/entity/warden/warden_pulsating_spots_2.png");

   public gju(ggx.a $$0) {
      super($$0, new fun<>($$0.a(fva.bR)), 0.9F);
      this.a(new glu<>(this, i, ($$0x, $$1, $$2) -> 1.0F, fun::e));
      this.a(new glu<>(this, k, ($$0x, $$1, $$2) -> Math.max(0.0F, axz.b($$2 * 0.045F) * 0.25F), fun::f));
      this.a(new glu<>(this, l, ($$0x, $$1, $$2) -> Math.max(0.0F, axz.b($$2 * 0.045F + (float) Math.PI) * 0.25F), fun::f));
      this.a(new glu<>(this, a, ($$0x, $$1, $$2) -> $$0x.G($$1), fun::c));
      this.a(new glu<>(this, j, ($$0x, $$1, $$2) -> $$0x.H($$1), fun::d));
   }

   public akh a(ckl $$0) {
      return a;
   }
}

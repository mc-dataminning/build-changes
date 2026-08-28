public class glu extends gkc<cma, fwl<cma>> {
   private static final ale a = new ale("textures/entity/warden/warden.png");
   private static final ale i = new ale("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final ale j = new ale("textures/entity/warden/warden_heart.png");
   private static final ale k = new ale("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final ale l = new ale("textures/entity/warden/warden_pulsating_spots_2.png");

   public glu(giw.a $$0) {
      super($$0, new fwl<>($$0.a(fwy.bR)), 0.9F);
      this.a(new gnu<>(this, i, ($$0x, $$1, $$2) -> 1.0F, fwl::e));
      this.a(new gnu<>(this, k, ($$0x, $$1, $$2) -> Math.max(0.0F, ayy.b($$2 * 0.045F) * 0.25F), fwl::f));
      this.a(new gnu<>(this, l, ($$0x, $$1, $$2) -> Math.max(0.0F, ayy.b($$2 * 0.045F + (float) Math.PI) * 0.25F), fwl::f));
      this.a(new gnu<>(this, a, ($$0x, $$1, $$2) -> $$0x.G($$1), fwl::c));
      this.a(new gnu<>(this, j, ($$0x, $$1, $$2) -> $$0x.H($$1), fwl::d));
   }

   public ale a(cma $$0) {
      return a;
   }
}

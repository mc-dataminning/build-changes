public class gme extends gkm<cll, fwu<cll>> {
   private static final akk a = new akk("textures/entity/warden/warden.png");
   private static final akk i = new akk("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final akk j = new akk("textures/entity/warden/warden_heart.png");
   private static final akk k = new akk("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final akk l = new akk("textures/entity/warden/warden_pulsating_spots_2.png");

   public gme(gjg.a $$0) {
      super($$0, new fwu<>($$0.a(fxh.bR)), 0.9F);
      this.a(new goe<>(this, i, ($$0x, $$1, $$2) -> 1.0F, fwu::e));
      this.a(new goe<>(this, k, ($$0x, $$1, $$2) -> Math.max(0.0F, aye.b($$2 * 0.045F) * 0.25F), fwu::f));
      this.a(new goe<>(this, l, ($$0x, $$1, $$2) -> Math.max(0.0F, aye.b($$2 * 0.045F + (float) Math.PI) * 0.25F), fwu::f));
      this.a(new goe<>(this, a, ($$0x, $$1, $$2) -> $$0x.H($$1), fwu::c));
      this.a(new goe<>(this, j, ($$0x, $$1, $$2) -> $$0x.I($$1), fwu::d));
   }

   public akk a(cll $$0) {
      return a;
   }
}

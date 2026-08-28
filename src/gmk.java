public class gmk extends gks<clo, fxa<clo>> {
   private static final akk a = new akk("textures/entity/warden/warden.png");
   private static final akk i = new akk("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final akk j = new akk("textures/entity/warden/warden_heart.png");
   private static final akk k = new akk("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final akk l = new akk("textures/entity/warden/warden_pulsating_spots_2.png");

   public gmk(gjm.a $$0) {
      super($$0, new fxa<>($$0.a(fxn.bR)), 0.9F);
      this.a(new gok<>(this, i, ($$0x, $$1, $$2) -> 1.0F, fxa::e));
      this.a(new gok<>(this, k, ($$0x, $$1, $$2) -> Math.max(0.0F, ayg.b($$2 * 0.045F) * 0.25F), fxa::f));
      this.a(new gok<>(this, l, ($$0x, $$1, $$2) -> Math.max(0.0F, ayg.b($$2 * 0.045F + (float) Math.PI) * 0.25F), fxa::f));
      this.a(new gok<>(this, a, ($$0x, $$1, $$2) -> $$0x.H($$1), fxa::c));
      this.a(new gok<>(this, j, ($$0x, $$1, $$2) -> $$0x.I($$1), fxa::d));
   }

   public akk a(clo $$0) {
      return a;
   }
}

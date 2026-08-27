public class gbk extends fzt<cem, fmj<cem>> {
   private static final ahg a = new ahg("textures/entity/warden/warden.png");
   private static final ahg i = new ahg("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final ahg j = new ahg("textures/entity/warden/warden_heart.png");
   private static final ahg k = new ahg("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final ahg l = new ahg("textures/entity/warden/warden_pulsating_spots_2.png");

   public gbk(fyn.a $$0) {
      super($$0, new fmj<>($$0.a(fmw.bO)), 0.9F);
      this.a(new gdk<>(this, i, ($$0x, $$1, $$2) -> 1.0F, fmj::e));
      this.a(new gdk<>(this, k, ($$0x, $$1, $$2) -> Math.max(0.0F, auo.b($$2 * 0.045F) * 0.25F), fmj::f));
      this.a(new gdk<>(this, l, ($$0x, $$1, $$2) -> Math.max(0.0F, auo.b($$2 * 0.045F + (float) Math.PI) * 0.25F), fmj::f));
      this.a(new gdk<>(this, a, ($$0x, $$1, $$2) -> $$0x.E($$1), fmj::c));
      this.a(new gdk<>(this, j, ($$0x, $$1, $$2) -> $$0x.F($$1), fmj::d));
   }

   public ahg a(cem $$0) {
      return a;
   }
}

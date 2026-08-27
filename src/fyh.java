public class fyh extends fwq<ccq, fjo<ccq>> {
   private static final agg a = new agg("textures/entity/warden/warden.png");
   private static final agg i = new agg("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final agg j = new agg("textures/entity/warden/warden_heart.png");
   private static final agg k = new agg("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final agg l = new agg("textures/entity/warden/warden_pulsating_spots_2.png");

   public fyh(fvk.a $$0) {
      super($$0, new fjo<>($$0.a(fka.bL)), 0.9F);
      this.a(new gae<>(this, i, ($$0x, $$1, $$2) -> 1.0F, fjo::e));
      this.a(new gae<>(this, k, ($$0x, $$1, $$2) -> Math.max(0.0F, ati.b($$2 * 0.045F) * 0.25F), fjo::f));
      this.a(new gae<>(this, l, ($$0x, $$1, $$2) -> Math.max(0.0F, ati.b($$2 * 0.045F + (float) Math.PI) * 0.25F), fjo::f));
      this.a(new gae<>(this, a, ($$0x, $$1, $$2) -> $$0x.E($$1), fjo::c));
      this.a(new gae<>(this, j, ($$0x, $$1, $$2) -> $$0x.F($$1), fjo::d));
   }

   public agg a(ccq $$0) {
      return a;
   }
}

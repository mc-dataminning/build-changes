public class gdp extends gby<cgl, fon<cgl>> {
   private static final aiy a = new aiy("textures/entity/warden/warden.png");
   private static final aiy i = new aiy("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final aiy j = new aiy("textures/entity/warden/warden_heart.png");
   private static final aiy k = new aiy("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final aiy l = new aiy("textures/entity/warden/warden_pulsating_spots_2.png");

   public gdp(gas.a $$0) {
      super($$0, new fon<>($$0.a(fpb.bN)), 0.9F);
      this.a(new gfp<>(this, i, ($$0x, $$1, $$2) -> 1.0F, fon::e));
      this.a(new gfp<>(this, k, ($$0x, $$1, $$2) -> Math.max(0.0F, awh.b($$2 * 0.045F) * 0.25F), fon::f));
      this.a(new gfp<>(this, l, ($$0x, $$1, $$2) -> Math.max(0.0F, awh.b($$2 * 0.045F + (float) Math.PI) * 0.25F), fon::f));
      this.a(new gfp<>(this, a, ($$0x, $$1, $$2) -> $$0x.E($$1), fon::c));
      this.a(new gfp<>(this, j, ($$0x, $$1, $$2) -> $$0x.F($$1), fon::d));
   }

   public aiy a(cgl $$0) {
      return a;
   }
}

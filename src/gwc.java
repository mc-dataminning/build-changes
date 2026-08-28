public class gwc extends guj<cou, hbv, gfn> {
   private static final aku a = aku.b("textures/entity/warden/warden.png");
   private static final aku b = aku.b("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final aku k = aku.b("textures/entity/warden/warden_heart.png");
   private static final aku l = aku.b("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final aku m = aku.b("textures/entity/warden/warden_pulsating_spots_2.png");

   public gwc(gtd.a $$0) {
      super($$0, new gfn($$0.a(ggb.dz)), 0.9F);
      this.a(new gxl<>(this, b, ($$0x, $$1) -> 1.0F, gfn::d, gnh::k, false));
      this.a(new gxl<>(this, l, ($$0x, $$1) -> Math.max(0.0F, ayz.b($$1 * 0.045F) * 0.25F), gfn::e, gnh::k, false));
      this.a(new gxl<>(this, m, ($$0x, $$1) -> Math.max(0.0F, ayz.b($$1 * 0.045F + (float) Math.PI) * 0.25F), gfn::e, gnh::k, false));
      this.a(new gxl<>(this, a, ($$0x, $$1) -> $$0x.a, gfn::b, gnh::k, false));
      this.a(new gxl<>(this, k, ($$0x, $$1) -> $$0x.b, gfn::c, gnh::k, false));
   }

   public aku a(hbv $$0) {
      return a;
   }

   public hbv b() {
      return new hbv();
   }

   public void a(cou $$0, hbv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.K($$2);
      $$1.b = $$0.L($$2);
      $$1.c.a($$0.a);
      $$1.d.a($$0.b);
      $$1.e.a($$0.c);
      $$1.f.a($$0.d);
      $$1.g.a($$0.bF);
      $$1.h.a($$0.bG);
   }
}

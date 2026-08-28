public class gvb extends gti<cnz, hau, gen> {
   private static final aku a = aku.b("textures/entity/warden/warden.png");
   private static final aku b = aku.b("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final aku k = aku.b("textures/entity/warden/warden_heart.png");
   private static final aku l = aku.b("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final aku m = aku.b("textures/entity/warden/warden_pulsating_spots_2.png");

   public gvb(gsc.a $$0) {
      super($$0, new gen($$0.a(gfb.dx)), 0.9F);
      this.a(new gwk<>(this, b, ($$0x, $$1) -> 1.0F, gen::d, gmh::k, false));
      this.a(new gwk<>(this, l, ($$0x, $$1) -> Math.max(0.0F, ayz.b($$1 * 0.045F) * 0.25F), gen::e, gmh::k, false));
      this.a(new gwk<>(this, m, ($$0x, $$1) -> Math.max(0.0F, ayz.b($$1 * 0.045F + (float) Math.PI) * 0.25F), gen::e, gmh::k, false));
      this.a(new gwk<>(this, a, ($$0x, $$1) -> $$0x.a, gen::b, gmh::k, false));
      this.a(new gwk<>(this, k, ($$0x, $$1) -> $$0x.b, gen::c, gmh::k, false));
   }

   public aku a(hau $$0) {
      return a;
   }

   public hau b() {
      return new hau();
   }

   public void a(cnz $$0, hau $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = $$0.K($$2);
      $$1.c.a($$0.a);
      $$1.d.a($$0.b);
      $$1.e.a($$0.c);
      $$1.f.a($$0.d);
      $$1.g.a($$0.bY);
      $$1.h.a($$0.bZ);
   }
}

public class gqh extends gop<cmy, gvv, fzw> {
   private static final alc a = alc.b("textures/entity/warden/warden.png");
   private static final alc b = alc.b("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final alc k = alc.b("textures/entity/warden/warden_heart.png");
   private static final alc l = alc.b("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final alc m = alc.b("textures/entity/warden/warden_pulsating_spots_2.png");

   public gqh(gnj.a $$0) {
      super($$0, new fzw($$0.a(gak.cV)), 0.9F);
      this.a(new gsh(this, b, ($$0x, $$1) -> 1.0F, fzw::e));
      this.a(new gsh(this, l, ($$0x, $$1) -> Math.max(0.0F, azd.b($$1 * 0.045F) * 0.25F), fzw::f));
      this.a(new gsh(this, m, ($$0x, $$1) -> Math.max(0.0F, azd.b($$1 * 0.045F + (float) Math.PI) * 0.25F), fzw::f));
      this.a(new gsh(this, a, ($$0x, $$1) -> $$0x.a, fzw::c));
      this.a(new gsh(this, k, ($$0x, $$1) -> $$0x.b, fzw::d));
   }

   public alc a(gvv $$0) {
      return a;
   }

   public gvv c() {
      return new gvv();
   }

   public void a(cmy $$0, gvv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = $$0.K($$2);
      $$1.c.a($$0.b);
      $$1.d.a($$0.c);
      $$1.e.a($$0.d);
      $$1.f.a($$0.e);
      $$1.g.a($$0.bY);
      $$1.h.a($$0.bZ);
   }
}

public class gry extends gqg<cnt, gxn, gbn> {
   private static final all a = all.b("textures/entity/warden/warden.png");
   private static final all b = all.b("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final all k = all.b("textures/entity/warden/warden_heart.png");
   private static final all l = all.b("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final all m = all.b("textures/entity/warden/warden_pulsating_spots_2.png");

   public gry(gpa.a $$0) {
      super($$0, new gbn($$0.a(gcb.cV)), 0.9F);
      this.a(new gty(this, b, ($$0x, $$1) -> 1.0F, gbn::d));
      this.a(new gty(this, l, ($$0x, $$1) -> Math.max(0.0F, azn.b($$1 * 0.045F) * 0.25F), gbn::h));
      this.a(new gty(this, m, ($$0x, $$1) -> Math.max(0.0F, azn.b($$1 * 0.045F + (float) Math.PI) * 0.25F), gbn::h));
      this.a(new gty(this, a, ($$0x, $$1) -> $$0x.a, gbn::b));
      this.a(new gty(this, k, ($$0x, $$1) -> $$0x.b, gbn::c));
   }

   public all a(gxn $$0) {
      return a;
   }

   public gxn c() {
      return new gxn();
   }

   public void a(cnt $$0, gxn $$1, float $$2) {
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

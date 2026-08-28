public class ghl<T extends heb> extends gib<T> {
   public ghl(gkr $$0) {
      super($$0);
   }

   public static gkx a() {
      float $$0 = -14.0F;
      gkz $$1 = gib.a(gkv.a, -14.0F);
      glb $$2 = $$1.a();
      glb $$3 = $$2.a("head", gkw.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gkt.a(0.0F, -13.0F, 0.0F));
      $$3.a("hat", gkw.c().a(0, 16).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gkv(-0.5F)), gkt.a);
      $$2.a("body", gkw.c().a(32, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F), gkt.a(0.0F, -14.0F, 0.0F));
      $$2.a("right_arm", gkw.c().a(56, 0).a(-1.0F, -2.0F, -1.0F, 2.0F, 30.0F, 2.0F), gkt.a(-5.0F, -12.0F, 0.0F));
      $$2.a("left_arm", gkw.c().a(56, 0).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 30.0F, 2.0F), gkt.a(5.0F, -12.0F, 0.0F));
      $$2.a("right_leg", gkw.c().a(56, 0).a(-1.0F, 0.0F, -1.0F, 2.0F, 30.0F, 2.0F), gkt.a(-2.0F, -5.0F, 0.0F));
      $$2.a("left_leg", gkw.c().a(56, 0).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 30.0F, 2.0F), gkt.a(2.0F, -5.0F, 0.0F));
      return gkx.a($$1, 64, 32);
   }

   public void a(T $$0) {
      super.a($$0);
      this.o.k = true;
      this.r.e *= 0.5F;
      this.s.e *= 0.5F;
      this.t.e *= 0.5F;
      this.u.e *= 0.5F;
      float $$1 = 0.4F;
      this.r.e = azz.a(this.r.e, -0.4F, 0.4F);
      this.s.e = azz.a(this.s.e, -0.4F, 0.4F);
      this.t.e = azz.a(this.t.e, -0.4F, 0.4F);
      this.u.e = azz.a(this.u.e, -0.4F, 0.4F);
      if ($$0.b != null) {
         this.r.e = -0.5F;
         this.s.e = -0.5F;
         this.r.g = 0.05F;
         this.s.g = -0.05F;
      }

      if ($$0.a) {
         float $$2 = 5.0F;
         this.o.c -= 5.0F;
         this.p.c += 5.0F;
      }
   }
}

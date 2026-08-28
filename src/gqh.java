public class gqh implements gqk<dvh> {
   private final gew a;
   private final gew b;

   public gqh(gql.a $$0) {
      this($$0.f());
   }

   public gqh(ggz $$0) {
      this.a = new gew.a($$0.a(ghc.w), goi::d);
      this.b = new gew.a($$0.a(ghc.v), goi::d);
   }

   public static ghj b() {
      ghl $$0 = new ghl();
      ghn $$1 = $$0.a();
      $$1.a("main", ghi.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), ghf.a);
      $$1.a("left_leg", ghi.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), ghf.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", ghi.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), ghf.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return ghj.a($$0, 64, 64);
   }

   public static ghj c() {
      ghl $$0 = new ghl();
      ghn $$1 = $$0.a();
      $$1.a("main", ghi.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), ghf.a);
      $$1.a("left_leg", ghi.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), ghf.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", ghi.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), ghf.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return ghj.a($$0, 64, 64);
   }

   public void a(dvh $$0, float $$1, fho $$2, gny $$3, int $$4, int $$5) {
      dhp $$6 = $$0.i();
      if ($$6 != null) {
         hiz $$7 = got.a($$0.c());
         dym $$8 = $$0.m();
         dnc.c<? extends dvh> $$9 = dnc.a(dvn.z, dkn::i, dkn::h, dlx.c, $$8, $$6, $$0.aw_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new gqo<>()).get($$4);
         this.a($$2, $$3, $$8.c(dkn.b) == dyz.a ? this.a : this.b, $$8.c(dkn.e), $$7, $$10, $$5, false);
      }
   }

   public void a(fho $$0, gny $$1, int $$2, int $$3, hiz $$4) {
      this.a($$0, $$1, this.a, jo.d, $$4, $$2, $$3, false);
      this.a($$0, $$1, this.b, jo.d, $$4, $$2, $$3, true);
   }

   private void a(fho $$0, gny $$1, gew $$2, jo $$3, hiz $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      fhs $$8 = $$4.a($$1, goi::d);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}

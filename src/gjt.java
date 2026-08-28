public class gjt implements gjw<drr> {
   private final fyj a;
   private final fyj b;

   public gjt(gjx.a $$0) {
      this.a = new fyj.a($$0.a(gap.p), ghv::c);
      this.b = new fyj.a($$0.a(gap.o), ghv::c);
   }

   public static gaw b() {
      gay $$0 = new gay();
      gba $$1 = $$0.a();
      $$1.a("main", gav.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), gas.a);
      $$1.a("left_leg", gav.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), gas.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", gav.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), gas.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return gaw.a($$0, 64, 64);
   }

   public static gaw c() {
      gay $$0 = new gay();
      gba $$1 = $$0.a();
      $$1.a("main", gav.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), gas.a);
      $$1.a("left_leg", gav.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), gas.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", gav.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), gas.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return gaw.a($$0, 64, 64);
   }

   public void a(drr $$0, float $$1, fdi $$2, ghl $$3, int $$4, int $$5) {
      gzm $$6 = gig.r[$$0.c().a()];
      dej $$7 = $$0.i();
      if ($$7 != null) {
         dus $$8 = $$0.m();
         djt.c<? extends drr> $$9 = djt.a(drx.y, dhf::i, dhf::h, dip.c, $$8, $$7, $$0.aC_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new gjz<>()).get($$4);
         this.a($$2, $$3, $$8.c(dhf.b) == dvf.a ? this.a : this.b, $$8.c(dhf.aF), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, jk.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, jk.d, $$6, $$4, $$5, true);
      }
   }

   private void a(fdi $$0, ghl $$1, fyj $$2, jk $$3, gzm $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      fdm $$8 = $$4.a($$1, ghv::c);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}

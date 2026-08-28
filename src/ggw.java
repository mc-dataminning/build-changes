public class ggw implements ggz<dqd> {
   private final fyk a;
   private final fyk b;

   public ggw(gha.a $$0) {
      this.a = $$0.a(fyj.j);
      this.b = $$0.a(fyj.i);
   }

   public static fyq b() {
      fys $$0 = new fys();
      fyt $$1 = $$0.a();
      $$1.a("main", fyp.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fym.a);
      $$1.a("left_leg", fyp.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fym.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", fyp.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fym.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return fyq.a($$0, 64, 64);
   }

   public static fyq c() {
      fys $$0 = new fys();
      fyt $$1 = $$0.a();
      $$1.a("main", fyp.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fym.a);
      $$1.a("left_leg", fyp.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fym.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", fyp.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fym.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return fyq.a($$0, 64, 64);
   }

   public void a(dqd $$0, float $$1, fbi $$2, gez $$3, int $$4, int $$5) {
      gsq $$6 = gfo.r[$$0.c().a()];
      dcw $$7 = $$0.i();
      if ($$7 != null) {
         dtc $$8 = $$0.n();
         dif.c<? extends dqd> $$9 = dif.a(dqj.y, dfr::h, dfr::g, dhb.c, $$8, $$7, $$0.aD_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new ghc<>()).get($$4);
         this.a($$2, $$3, $$8.c(dfr.b) == dtp.a ? this.a : this.b, $$8.c(dfr.aE), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, ji.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, ji.d, $$6, $$4, $$5, true);
      }
   }

   private void a(fbi $$0, gez $$1, fyk $$2, ji $$3, gsq $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      fbm $$8 = $$4.a($$1, gfh::c);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}

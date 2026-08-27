public class ghd implements ghg<dpx> {
   private final fys a;
   private final fys b;

   public ghd(ghh.a $$0) {
      this.a = $$0.a(fyr.k);
      this.b = $$0.a(fyr.j);
   }

   public static fyy b() {
      fza $$0 = new fza();
      fzb $$1 = $$0.a();
      $$1.a("main", fyx.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fyu.a);
      $$1.a("left_leg", fyx.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fyu.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", fyx.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fyu.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return fyy.a($$0, 64, 64);
   }

   public static fyy c() {
      fza $$0 = new fza();
      fzb $$1 = $$0.a();
      $$1.a("main", fyx.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fyu.a);
      $$1.a("left_leg", fyx.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fyu.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", fyx.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fyu.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return fyy.a($$0, 64, 64);
   }

   public void a(dpx $$0, float $$1, fbc $$2, gfg $$3, int $$4, int $$5) {
      gtc $$6 = gfv.p[$$0.c().a()];
      dca $$7 = $$0.i();
      if ($$7 != null) {
         dtc $$8 = $$0.n();
         dhk.c<? extends dpx> $$9 = dhk.a(dqe.z, deu::h, deu::g, dgf.c, $$8, $$7, $$0.az_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new ghj<>()).get($$4);
         this.a($$2, $$3, $$8.c(deu.b) == dtp.a ? this.a : this.b, $$8.c(deu.aE), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, iw.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, iw.d, $$6, $$4, $$5, true);
      }
   }

   private void a(fbc $$0, gfg $$1, fys $$2, iw $$3, gtc $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      fbg $$8 = $$4.a($$1, gfo::c);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}

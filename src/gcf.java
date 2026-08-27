public class gcf implements gci<dmk> {
   private final ftv a;
   private final ftv b;

   public gcf(gcj.a $$0) {
      this.a = $$0.a(ftu.j);
      this.b = $$0.a(ftu.i);
   }

   public static fub b() {
      fud $$0 = new fud();
      fue $$1 = $$0.a();
      $$1.a("main", fua.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), ftx.a);
      $$1.a("left_leg", fua.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), ftx.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", fua.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), ftx.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return fub.a($$0, 64, 64);
   }

   public static fub c() {
      fud $$0 = new fud();
      fue $$1 = $$0.a();
      $$1.a("main", fua.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), ftx.a);
      $$1.a("left_leg", fua.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), ftx.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", fua.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), ftx.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return fub.a($$0, 64, 64);
   }

   public void a(dmk $$0, float $$1, ewr $$2, gai $$3, int $$4, int $$5) {
      gnv $$6 = gax.p[$$0.c().a()];
      czg $$7 = $$0.i();
      if ($$7 != null) {
         dpi $$8 = $$0.n();
         deo.c<? extends dmk> $$9 = deo.a(dmq.y, dca::h, dca::g, ddk.c, $$8, $$7, $$0.az_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new gcl<>()).get($$4);
         this.a($$2, $$3, $$8.c(dca.b) == dpv.a ? this.a : this.b, $$8.c(dca.aE), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, ij.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, ij.d, $$6, $$4, $$5, true);
      }
   }

   private void a(ewr $$0, gai $$1, ftv $$2, ij $$3, gnv $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      ewv $$8 = $$4.a($$1, gaq::c);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}

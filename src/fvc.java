public class fvc implements fvf<dgq> {
   private final fmv a;
   private final fmv b;

   public fvc(fvg.a $$0) {
      this.a = $$0.a(fmu.i);
      this.b = $$0.a(fmu.h);
   }

   public static fnb b() {
      fnd $$0 = new fnd();
      fne $$1 = $$0.a();
      $$1.a("main", fna.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fmx.a);
      $$1.a("left_leg", fna.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fmx.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", fna.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fmx.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return fnb.a($$0, 64, 64);
   }

   public static fnb c() {
      fnd $$0 = new fnd();
      fne $$1 = $$0.a();
      $$1.a("main", fna.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fmx.a);
      $$1.a("left_leg", fna.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fmx.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", fna.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fmx.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return fnb.a($$0, 64, 64);
   }

   public void a(dgq $$0, float $$1, epz $$2, ftf $$3, int $$4, int $$5) {
      ggo $$6 = ftu.p[$$0.d().a()];
      cto $$7 = $$0.i();
      if ($$7 != null) {
         djg $$8 = $$0.r();
         cyw.c<? extends dgq> $$9 = cyw.a(dgw.y, cwi::h, cwi::g, cxs.c, $$8, $$7, $$0.aB_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new fvi<>()).get($$4);
         this.a($$2, $$3, $$8.c(cwi.b) == djt.a ? this.a : this.b, $$8.c(cwi.aE), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, ic.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, ic.d, $$6, $$4, $$5, true);
      }
   }

   private void a(epz $$0, ftf $$1, fmv $$2, ic $$3, ggo $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      eqd $$8 = $$4.a($$1, ftn::c);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}

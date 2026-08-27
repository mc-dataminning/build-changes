public class fyn implements fyq<djh> {
   private final fqf a;
   private final fqf b;

   public fyn(fyr.a $$0) {
      this.a = $$0.a(fqe.j);
      this.b = $$0.a(fqe.i);
   }

   public static fql b() {
      fqn $$0 = new fqn();
      fqo $$1 = $$0.a();
      $$1.a("main", fqk.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fqh.a);
      $$1.a("left_leg", fqk.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fqh.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", fqk.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fqh.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return fql.a($$0, 64, 64);
   }

   public static fql c() {
      fqn $$0 = new fqn();
      fqo $$1 = $$0.a();
      $$1.a("main", fqk.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fqh.a);
      $$1.a("left_leg", fqk.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fqh.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", fqk.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fqh.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return fql.a($$0, 64, 64);
   }

   public void a(djh $$0, float $$1, etd $$2, fwq $$3, int $$4, int $$5) {
      gkc $$6 = fxf.p[$$0.c().a()];
      cwe $$7 = $$0.i();
      if ($$7 != null) {
         dme $$8 = $$0.n();
         dbm.c<? extends djh> $$9 = dbm.a(djn.y, cyy::h, cyy::g, dai.c, $$8, $$7, $$0.aD_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new fyt<>()).get($$4);
         this.a($$2, $$3, $$8.c(cyy.b) == dmr.a ? this.a : this.b, $$8.c(cyy.aE), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, ih.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, ih.d, $$6, $$4, $$5, true);
      }
   }

   private void a(etd $$0, fwq $$1, fqf $$2, ih $$3, gkc $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      eth $$8 = $$4.a($$1, fwy::c);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}

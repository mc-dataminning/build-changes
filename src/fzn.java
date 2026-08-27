public class fzn implements fzq<dkc> {
   private final frd a;
   private final frd b;

   public fzn(fzr.a $$0) {
      this.a = $$0.a(frc.j);
      this.b = $$0.a(frc.i);
   }

   public static frj b() {
      frl $$0 = new frl();
      frm $$1 = $$0.a();
      $$1.a("main", fri.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), frf.a);
      $$1.a("left_leg", fri.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), frf.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", fri.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), frf.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return frj.a($$0, 64, 64);
   }

   public static frj c() {
      frl $$0 = new frl();
      frm $$1 = $$0.a();
      $$1.a("main", fri.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), frf.a);
      $$1.a("left_leg", fri.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), frf.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", fri.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), frf.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return frj.a($$0, 64, 64);
   }

   public void a(dkc $$0, float $$1, etz $$2, fxq $$3, int $$4, int $$5) {
      glc $$6 = fyf.p[$$0.c().a()];
      cwz $$7 = $$0.i();
      if ($$7 != null) {
         dmz $$8 = $$0.n();
         dch.c<? extends dkc> $$9 = dch.a(dki.y, czt::h, czt::g, dbd.c, $$8, $$7, $$0.aC_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new fzt<>()).get($$4);
         this.a($$2, $$3, $$8.c(czt.b) == dnm.a ? this.a : this.b, $$8.c(czt.aE), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, ih.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, ih.d, $$6, $$4, $$5, true);
      }
   }

   private void a(etz $$0, fxq $$1, frd $$2, ih $$3, glc $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      eud $$8 = $$4.a($$1, fxy::c);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}

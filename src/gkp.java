public class gkp implements gks<dsi> {
   private final fzf a;
   private final fzf b;

   public gkp(gkt.a $$0) {
      this.a = new fzf.a($$0.a(gbl.p), gir::c);
      this.b = new fzf.a($$0.a(gbl.o), gir::c);
   }

   public static gbs b() {
      gbu $$0 = new gbu();
      gbw $$1 = $$0.a();
      $$1.a("main", gbr.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), gbo.a);
      $$1.a("left_leg", gbr.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), gbo.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", gbr.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), gbo.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return gbs.a($$0, 64, 64);
   }

   public static gbs c() {
      gbu $$0 = new gbu();
      gbw $$1 = $$0.a();
      $$1.a("main", gbr.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), gbo.a);
      $$1.a("left_leg", gbr.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), gbo.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", gbr.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), gbo.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return gbs.a($$0, 64, 64);
   }

   public void a(dsi $$0, float $$1, feb $$2, gih $$3, int $$4, int $$5) {
      ham $$6 = gjc.r[$$0.c().a()];
      dfb $$7 = $$0.i();
      if ($$7 != null) {
         dvj $$8 = $$0.m();
         dkl.c<? extends dsi> $$9 = dkl.a(dso.y, dhx::i, dhx::h, djh.c, $$8, $$7, $$0.aB_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new gkv<>()).get($$4);
         this.a($$2, $$3, $$8.c(dhx.b) == dvw.a ? this.a : this.b, $$8.c(dhx.aF), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, jm.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, jm.d, $$6, $$4, $$5, true);
      }
   }

   private void a(feb $$0, gih $$1, fzf $$2, jm $$3, ham $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      fef $$8 = $$4.a($$1, gir::c);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}

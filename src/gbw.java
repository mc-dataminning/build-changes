public class gbw implements gbz<dmb> {
   private final ftm a;
   private final ftm b;

   public gbw(gca.a $$0) {
      this.a = $$0.a(ftl.j);
      this.b = $$0.a(ftl.i);
   }

   public static fts b() {
      ftu $$0 = new ftu();
      ftv $$1 = $$0.a();
      $$1.a("main", ftr.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fto.a);
      $$1.a("left_leg", ftr.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fto.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", ftr.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fto.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return fts.a($$0, 64, 64);
   }

   public static fts c() {
      ftu $$0 = new ftu();
      ftv $$1 = $$0.a();
      $$1.a("main", ftr.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fto.a);
      $$1.a("left_leg", ftr.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fto.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", ftr.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fto.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return fts.a($$0, 64, 64);
   }

   public void a(dmb $$0, float $$1, ewi $$2, fzz $$3, int $$4, int $$5) {
      gnm $$6 = gao.p[$$0.c().a()];
      cyx $$7 = $$0.i();
      if ($$7 != null) {
         doz $$8 = $$0.n();
         def.c<? extends dmb> $$9 = def.a(dmh.y, dbr::h, dbr::g, ddb.c, $$8, $$7, $$0.aA_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new gcc<>()).get($$4);
         this.a($$2, $$3, $$8.c(dbr.b) == dpm.a ? this.a : this.b, $$8.c(dbr.aE), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, ih.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, ih.d, $$6, $$4, $$5, true);
      }
   }

   private void a(ewi $$0, fzz $$1, ftm $$2, ih $$3, gnm $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      ewm $$8 = $$4.a($$1, gah::c);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}

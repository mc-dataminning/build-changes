public class giz implements gjc<dra> {
   private final fxv a;
   private final fxv b;

   public giz(gjd.a $$0) {
      this.a = new fxv.a($$0.a(gaa.p), ghe::c);
      this.b = new fxv.a($$0.a(gaa.o), ghe::c);
   }

   public static gah b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      $$1.a("main", gag.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), gad.a);
      $$1.a("left_leg", gag.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), gad.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", gag.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), gad.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return gah.a($$0, 64, 64);
   }

   public static gah c() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      $$1.a("main", gag.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), gad.a);
      $$1.a("left_leg", gag.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), gad.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", gag.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), gad.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return gah.a($$0, 64, 64);
   }

   public void a(dra $$0, float $$1, fcu $$2, ggv $$3, int $$4, int $$5) {
      gyq $$6 = ghm.r[$$0.c().a()];
      dds $$7 = $$0.i();
      if ($$7 != null) {
         dua $$8 = $$0.m();
         djc.c<? extends dra> $$9 = djc.a(drg.y, dgo::i, dgo::h, dhy.c, $$8, $$7, $$0.aD_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new gjf<>()).get($$4);
         this.a($$2, $$3, $$8.c(dgo.b) == dun.a ? this.a : this.b, $$8.c(dgo.aE), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, jj.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, jj.d, $$6, $$4, $$5, true);
      }
   }

   private void a(fcu $$0, ggv $$1, fxv $$2, jj $$3, gyq $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      fcy $$8 = $$4.a($$1, ghe::c);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}

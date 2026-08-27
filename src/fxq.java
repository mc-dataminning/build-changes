public class fxq implements fxt<dit> {
   private final fpj a;
   private final fpj b;

   public fxq(fxu.a $$0) {
      this.a = $$0.a(fpi.j);
      this.b = $$0.a(fpi.i);
   }

   public static fpp b() {
      fpr $$0 = new fpr();
      fps $$1 = $$0.a();
      $$1.a("main", fpo.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fpl.a);
      $$1.a("left_leg", fpo.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fpl.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", fpo.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fpl.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return fpp.a($$0, 64, 64);
   }

   public static fpp c() {
      fpr $$0 = new fpr();
      fps $$1 = $$0.a();
      $$1.a("main", fpo.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fpl.a);
      $$1.a("left_leg", fpo.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fpl.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", fpo.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fpl.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return fpp.a($$0, 64, 64);
   }

   public void a(dit $$0, float $$1, esh $$2, fvt $$3, int $$4, int $$5) {
      gje $$6 = fwi.p[$$0.d().a()];
      cvr $$7 = $$0.i();
      if ($$7 != null) {
         dlj $$8 = $$0.r();
         daz.c<? extends dit> $$9 = daz.a(diz.y, cyl::h, cyl::g, czv.c, $$8, $$7, $$0.aE_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new fxw<>()).get($$4);
         this.a($$2, $$3, $$8.c(cyl.b) == dlw.a ? this.a : this.b, $$8.c(cyl.aE), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, ie.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, ie.d, $$6, $$4, $$5, true);
      }
   }

   private void a(esh $$0, fvt $$1, fpj $$2, ie $$3, gje $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      esl $$8 = $$4.a($$1, fwb::c);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}

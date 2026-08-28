public class goe implements goh<dtt> {
   private final gct a;
   private final gct b;

   public goe(goi.a $$0) {
      this($$0.f());
   }

   public goe(gew $$0) {
      this.a = new gct.a($$0.a(gez.w), gmf::d);
      this.b = new gct.a($$0.a(gez.v), gmf::d);
   }

   public static gfg b() {
      gfi $$0 = new gfi();
      gfk $$1 = $$0.a();
      $$1.a("main", gff.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), gfc.a);
      $$1.a("left_leg", gff.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), gfc.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", gff.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), gfc.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return gfg.a($$0, 64, 64);
   }

   public static gfg c() {
      gfi $$0 = new gfi();
      gfk $$1 = $$0.a();
      $$1.a("main", gff.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), gfc.a);
      $$1.a("left_leg", gff.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), gfc.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", gff.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), gfc.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return gfg.a($$0, 64, 64);
   }

   public void a(dtt $$0, float $$1, ffs $$2, glv $$3, int $$4, int $$5) {
      dgg $$6 = $$0.i();
      if ($$6 != null) {
         hgt $$7 = gmq.a($$0.c());
         dwv $$8 = $$0.m();
         dls.c<? extends dtt> $$9 = dls.a(dtz.z, djd::i, djd::h, dkn.c, $$8, $$6, $$0.aA_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new gok<>()).get($$4);
         this.a($$2, $$3, $$8.c(djd.b) == dxi.a ? this.a : this.b, $$8.c(djd.aF), $$7, $$10, $$5, false);
      }
   }

   public void a(ffs $$0, glv $$1, int $$2, int $$3, hgt $$4) {
      this.a($$0, $$1, this.a, jn.d, $$4, $$2, $$3, false);
      this.a($$0, $$1, this.b, jn.d, $$4, $$2, $$3, true);
   }

   private void a(ffs $$0, glv $$1, gct $$2, jn $$3, hgt $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      ffw $$8 = $$4.a($$1, gmf::d);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}

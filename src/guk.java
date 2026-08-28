public class guk implements gun<dxy> {
   private final giw a;
   private final giw b;

   public guk(guo.a $$0) {
      this($$0.f());
   }

   public guk(gla $$0) {
      this.a = new giw.a($$0.a(gld.w), gsl::d);
      this.b = new giw.a($$0.a(gld.v), gsl::d);
   }

   public static glk b() {
      glm $$0 = new glm();
      glo $$1 = $$0.a();
      $$1.a("main", glj.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), glg.a);
      $$1.a("left_leg", glj.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), glg.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", glj.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), glg.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return glk.a($$0, 64, 64);
   }

   public static glk c() {
      glm $$0 = new glm();
      glo $$1 = $$0.a();
      $$1.a("main", glj.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), glg.a);
      $$1.a("left_leg", glj.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), glg.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", glj.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), glg.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return glk.a($$0, 64, 64);
   }

   public void a(dxy $$0, float $$1, flo $$2, gsa $$3, int $$4, int $$5, ffq $$6) {
      djx $$7 = $$0.i();
      if ($$7 != null) {
         hnh $$8 = gsu.a($$0.c());
         ebe $$9 = $$0.m();
         dpk.c<? extends dxy> $$10 = dpk.a(dye.z, dmv::i, dmv::h, dog.c, $$9, $$7, $$0.aB_(), ($$0x, $$1x) -> false);
         int $$11 = $$10.apply(new gur<>()).get($$4);
         this.a($$2, $$3, $$9.c(dmv.b) == ebr.a ? this.a : this.b, $$9.c(dmv.e), $$8, $$11, $$5, false);
      }
   }

   public void a(flo $$0, gsa $$1, int $$2, int $$3, hnh $$4) {
      this.a($$0, $$1, this.a, jb.d, $$4, $$2, $$3, false);
      this.a($$0, $$1, this.b, jb.d, $$4, $$2, $$3, true);
   }

   private void a(flo $$0, gsa $$1, giw $$2, jb $$3, hnh $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      flr $$8 = $$4.a($$1, gsl::d);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}

public class gum implements gup<dya> {
   private final giy a;
   private final giy b;

   public gum(guq.a $$0) {
      this($$0.f());
   }

   public gum(glc $$0) {
      this.a = new giy.a($$0.a(glf.w), gsn::d);
      this.b = new giy.a($$0.a(glf.v), gsn::d);
   }

   public static glm b() {
      glo $$0 = new glo();
      glq $$1 = $$0.a();
      $$1.a("main", gll.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), gli.a);
      $$1.a("left_leg", gll.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), gli.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", gll.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), gli.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return glm.a($$0, 64, 64);
   }

   public static glm c() {
      glo $$0 = new glo();
      glq $$1 = $$0.a();
      $$1.a("main", gll.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), gli.a);
      $$1.a("left_leg", gll.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), gli.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", gll.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), gli.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return glm.a($$0, 64, 64);
   }

   public void a(dya $$0, float $$1, flq $$2, gsc $$3, int $$4, int $$5, ffs $$6) {
      djz $$7 = $$0.i();
      if ($$7 != null) {
         hnj $$8 = gsw.a($$0.c());
         ebg $$9 = $$0.m();
         dpm.c<? extends dya> $$10 = dpm.a(dyg.z, dmx::i, dmx::h, doi.c, $$9, $$7, $$0.aB_(), ($$0x, $$1x) -> false);
         int $$11 = $$10.apply(new gut<>()).get($$4);
         this.a($$2, $$3, $$9.c(dmx.b) == ebt.a ? this.a : this.b, $$9.c(dmx.e), $$8, $$11, $$5, false);
      }
   }

   public void a(flq $$0, gsc $$1, int $$2, int $$3, hnj $$4) {
      this.a($$0, $$1, this.a, jc.d, $$4, $$2, $$3, false);
      this.a($$0, $$1, this.b, jc.d, $$4, $$2, $$3, true);
   }

   private void a(flq $$0, gsc $$1, giy $$2, jc $$3, hnj $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      flt $$8 = $$4.a($$1, gsn::d);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}

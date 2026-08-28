public class grm implements grp<dwj> {
   private final gfz a;
   private final gfz b;

   public grm(grq.a $$0) {
      this($$0.f());
   }

   public grm(gic $$0) {
      this.a = new gfz.a($$0.a(gif.w), gpn::d);
      this.b = new gfz.a($$0.a(gif.v), gpn::d);
   }

   public static gim b() {
      gio $$0 = new gio();
      giq $$1 = $$0.a();
      $$1.a("main", gil.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), gii.a);
      $$1.a("left_leg", gil.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), gii.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", gil.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), gii.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return gim.a($$0, 64, 64);
   }

   public static gim c() {
      gio $$0 = new gio();
      giq $$1 = $$0.a();
      $$1.a("main", gil.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), gii.a);
      $$1.a("left_leg", gil.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), gii.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", gil.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), gii.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return gim.a($$0, 64, 64);
   }

   public void a(dwj $$0, float $$1, fiq $$2, gpd $$3, int $$4, int $$5) {
      dip $$6 = $$0.i();
      if ($$6 != null) {
         hkg $$7 = gpy.a($$0.c());
         dzo $$8 = $$0.m();
         doc.c<? extends dwj> $$9 = doc.a(dwp.z, dln::i, dln::h, dmx.c, $$8, $$6, $$0.aw_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new grt<>()).get($$4);
         this.a($$2, $$3, $$8.c(dln.b) == eab.a ? this.a : this.b, $$8.c(dln.e), $$7, $$10, $$5, false);
      }
   }

   public void a(fiq $$0, gpd $$1, int $$2, int $$3, hkg $$4) {
      this.a($$0, $$1, this.a, ja.d, $$4, $$2, $$3, false);
      this.a($$0, $$1, this.b, ja.d, $$4, $$2, $$3, true);
   }

   private void a(fiq $$0, gpd $$1, gfz $$2, ja $$3, hkg $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      fiu $$8 = $$4.a($$1, gpn::d);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}

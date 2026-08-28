public class gsb implements gse<dwt> {
   private final ggm a;
   private final ggm b;

   public gsb(gsf.a $$0) {
      this($$0.f());
   }

   public gsb(giq $$0) {
      this.a = new ggm.a($$0.a(git.w), gqc::d);
      this.b = new ggm.a($$0.a(git.v), gqc::d);
   }

   public static gja b() {
      gjc $$0 = new gjc();
      gje $$1 = $$0.a();
      $$1.a("main", giz.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), giw.a);
      $$1.a("left_leg", giz.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), giw.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", giz.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), giw.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return gja.a($$0, 64, 64);
   }

   public static gja c() {
      gjc $$0 = new gjc();
      gje $$1 = $$0.a();
      $$1.a("main", giz.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), giw.a);
      $$1.a("left_leg", giz.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), giw.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", giz.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), giw.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return gja.a($$0, 64, 64);
   }

   public void a(dwt $$0, float $$1, fjc $$2, gps $$3, int $$4, int $$5, fei $$6) {
      div $$7 = $$0.i();
      if ($$7 != null) {
         hkw $$8 = gqn.a($$0.c());
         dzz $$9 = $$0.m();
         doi.c<? extends dwt> $$10 = doi.a(dwz.z, dlt::i, dlt::h, dnd.c, $$9, $$7, $$0.aw_(), ($$0x, $$1x) -> false);
         int $$11 = $$10.apply(new gsi<>()).get($$4);
         this.a($$2, $$3, $$9.c(dlt.b) == eam.a ? this.a : this.b, $$9.c(dlt.e), $$8, $$11, $$5, false);
      }
   }

   public void a(fjc $$0, gps $$1, int $$2, int $$3, hkw $$4) {
      this.a($$0, $$1, this.a, ja.d, $$4, $$2, $$3, false);
      this.a($$0, $$1, this.b, ja.d, $$4, $$2, $$3, true);
   }

   private void a(fjc $$0, gps $$1, ggm $$2, ja $$3, hkw $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      fjg $$8 = $$4.a($$1, gqc::d);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}

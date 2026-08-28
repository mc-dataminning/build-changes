public class goh implements gok<dtv> {
   private final gcw a;
   private final gcw b;

   public goh(gol.a $$0) {
      this($$0.f());
   }

   public goh(gez $$0) {
      this.a = new gcw.a($$0.a(gfc.w), gmi::d);
      this.b = new gcw.a($$0.a(gfc.v), gmi::d);
   }

   public static gfj b() {
      gfl $$0 = new gfl();
      gfn $$1 = $$0.a();
      $$1.a("main", gfi.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), gff.a);
      $$1.a("left_leg", gfi.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), gff.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", gfi.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), gff.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return gfj.a($$0, 64, 64);
   }

   public static gfj c() {
      gfl $$0 = new gfl();
      gfn $$1 = $$0.a();
      $$1.a("main", gfi.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), gff.a);
      $$1.a("left_leg", gfi.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), gff.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", gfi.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), gff.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return gfj.a($$0, 64, 64);
   }

   public void a(dtv $$0, float $$1, ffu $$2, gly $$3, int $$4, int $$5) {
      dgi $$6 = $$0.i();
      if ($$6 != null) {
         hgz $$7 = gmt.a($$0.c());
         dwx $$8 = $$0.m();
         dlu.c<? extends dtv> $$9 = dlu.a(dub.z, djf::i, djf::h, dkp.c, $$8, $$6, $$0.aA_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new gon<>()).get($$4);
         this.a($$2, $$3, $$8.c(djf.b) == dxk.a ? this.a : this.b, $$8.c(djf.aF), $$7, $$10, $$5, false);
      }
   }

   public void a(ffu $$0, gly $$1, int $$2, int $$3, hgz $$4) {
      this.a($$0, $$1, this.a, jn.d, $$4, $$2, $$3, false);
      this.a($$0, $$1, this.b, jn.d, $$4, $$2, $$3, true);
   }

   private void a(ffu $$0, gly $$1, gcw $$2, jn $$3, hgz $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      ffy $$8 = $$4.a($$1, gmi::d);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}

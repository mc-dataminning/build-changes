public class gog implements goj<dtu> {
   private final gcv a;
   private final gcv b;

   public gog(gok.a $$0) {
      this($$0.f());
   }

   public gog(gey $$0) {
      this.a = new gcv.a($$0.a(gfb.w), gmh::d);
      this.b = new gcv.a($$0.a(gfb.v), gmh::d);
   }

   public static gfi b() {
      gfk $$0 = new gfk();
      gfm $$1 = $$0.a();
      $$1.a("main", gfh.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), gfe.a);
      $$1.a("left_leg", gfh.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), gfe.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", gfh.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), gfe.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return gfi.a($$0, 64, 64);
   }

   public static gfi c() {
      gfk $$0 = new gfk();
      gfm $$1 = $$0.a();
      $$1.a("main", gfh.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), gfe.a);
      $$1.a("left_leg", gfh.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), gfe.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", gfh.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), gfe.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return gfi.a($$0, 64, 64);
   }

   public void a(dtu $$0, float $$1, fft $$2, glx $$3, int $$4, int $$5) {
      dgh $$6 = $$0.i();
      if ($$6 != null) {
         hgy $$7 = gms.a($$0.c());
         dww $$8 = $$0.m();
         dlt.c<? extends dtu> $$9 = dlt.a(dua.z, dje::i, dje::h, dko.c, $$8, $$6, $$0.aA_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new gom<>()).get($$4);
         this.a($$2, $$3, $$8.c(dje.b) == dxj.a ? this.a : this.b, $$8.c(dje.aF), $$7, $$10, $$5, false);
      }
   }

   public void a(fft $$0, glx $$1, int $$2, int $$3, hgy $$4) {
      this.a($$0, $$1, this.a, jn.d, $$4, $$2, $$3, false);
      this.a($$0, $$1, this.b, jn.d, $$4, $$2, $$3, true);
   }

   private void a(fft $$0, glx $$1, gcv $$2, jn $$3, hgy $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      ffx $$8 = $$4.a($$1, gmh::d);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}

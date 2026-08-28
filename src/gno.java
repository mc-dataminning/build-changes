public class gno implements gnr<dum> {
   private final gcc a;
   private final gcc b;

   public gno(gns.a $$0) {
      this.a = new gcc.a($$0.a(gei.w), glq::d);
      this.b = new gcc.a($$0.a(gei.v), glq::d);
   }

   public static gep b() {
      ger $$0 = new ger();
      get $$1 = $$0.a();
      $$1.a("main", geo.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), gel.a);
      $$1.a("left_leg", geo.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), gel.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", geo.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), gel.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return gep.a($$0, 64, 64);
   }

   public static gep c() {
      ger $$0 = new ger();
      get $$1 = $$0.a();
      $$1.a("main", geo.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), gel.a);
      $$1.a("left_leg", geo.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), gel.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", geo.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), gel.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return gep.a($$0, 64, 64);
   }

   public void a(dum $$0, float $$1, fgl $$2, glg $$3, int $$4, int $$5) {
      hdp $$6 = gmb.r[$$0.c().a()];
      dgz $$7 = $$0.i();
      if ($$7 != null) {
         dxo $$8 = $$0.m();
         dml.c<? extends dum> $$9 = dml.a(dus.z, djw::i, djw::h, dlg.c, $$8, $$7, $$0.aB_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new gnu<>()).get($$4);
         this.a($$2, $$3, $$8.c(djw.b) == dyb.a ? this.a : this.b, $$8.c(djw.aF), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, jm.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, jm.d, $$6, $$4, $$5, true);
      }
   }

   private void a(fgl $$0, glg $$1, gcc $$2, jm $$3, hdp $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      fgp $$8 = $$4.a($$1, glq::d);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}

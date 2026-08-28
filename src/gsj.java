public class gsj implements gsm<dxb> {
   private final ggu a;
   private final ggu b;

   public gsj(gsn.a $$0) {
      this($$0.f());
   }

   public gsj(giy $$0) {
      this.a = new ggu.a($$0.a(gjb.w), gqk::d);
      this.b = new ggu.a($$0.a(gjb.v), gqk::d);
   }

   public static gji b() {
      gjk $$0 = new gjk();
      gjm $$1 = $$0.a();
      $$1.a("main", gjh.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), gje.a);
      $$1.a("left_leg", gjh.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), gje.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", gjh.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), gje.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return gji.a($$0, 64, 64);
   }

   public static gji c() {
      gjk $$0 = new gjk();
      gjm $$1 = $$0.a();
      $$1.a("main", gjh.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), gje.a);
      $$1.a("left_leg", gjh.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), gje.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", gjh.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), gje.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return gji.a($$0, 64, 64);
   }

   public void a(dxb $$0, float $$1, fjj $$2, gqa $$3, int $$4, int $$5, feq $$6) {
      dja $$7 = $$0.i();
      if ($$7 != null) {
         hle $$8 = gqv.a($$0.c());
         eah $$9 = $$0.m();
         don.c<? extends dxb> $$10 = don.a(dxh.z, dly::i, dly::h, dnj.c, $$9, $$7, $$0.ax_(), ($$0x, $$1x) -> false);
         int $$11 = $$10.apply(new gsq<>()).get($$4);
         this.a($$2, $$3, $$9.c(dly.b) == eau.a ? this.a : this.b, $$9.c(dly.e), $$8, $$11, $$5, false);
      }
   }

   public void a(fjj $$0, gqa $$1, int $$2, int $$3, hle $$4) {
      this.a($$0, $$1, this.a, ja.d, $$4, $$2, $$3, false);
      this.a($$0, $$1, this.b, ja.d, $$4, $$2, $$3, true);
   }

   private void a(fjj $$0, gqa $$1, ggu $$2, ja $$3, hle $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      fjn $$8 = $$4.a($$1, gqk::d);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}

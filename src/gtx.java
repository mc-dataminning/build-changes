public class gtx implements gua<dyk> {
   private final gij a;
   private final gij b;

   public gtx(gub.a $$0) {
      this($$0.f());
   }

   public gtx(gkn $$0) {
      this.a = new gij.a($$0.a(gkq.w), gry::d);
      this.b = new gij.a($$0.a(gkq.v), gry::d);
   }

   public static gkx b() {
      gkz $$0 = new gkz();
      glb $$1 = $$0.a();
      $$1.a("main", gkw.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), gkt.a);
      $$1.a("left_leg", gkw.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), gkt.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", gkw.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), gkt.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return gkx.a($$0, 64, 64);
   }

   public static gkx c() {
      gkz $$0 = new gkz();
      glb $$1 = $$0.a();
      $$1.a("main", gkw.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), gkt.a);
      $$1.a("left_leg", gkw.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), gkt.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", gkw.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), gkt.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return gkx.a($$0, 64, 64);
   }

   public void a(dyk $$0, float $$1, fld $$2, grn $$3, int $$4, int $$5, fgc $$6) {
      dkj $$7 = $$0.i();
      if ($$7 != null) {
         hmx $$8 = gsh.a($$0.c());
         ebq $$9 = $$0.m();
         dpw.c<? extends dyk> $$10 = dpw.a(dyq.z, dnh::i, dnh::h, dos.c, $$9, $$7, $$0.aC_(), ($$0x, $$1x) -> false);
         int $$11 = $$10.apply(new gue<>()).get($$4);
         this.a($$2, $$3, $$9.c(dnh.b) == ecd.a ? this.a : this.b, $$9.c(dnh.e), $$8, $$11, $$5, false);
      }
   }

   public void a(fld $$0, grn $$1, int $$2, int $$3, hmx $$4) {
      this.a($$0, $$1, this.a, jc.d, $$4, $$2, $$3, false);
      this.a($$0, $$1, this.b, jc.d, $$4, $$2, $$3, true);
   }

   private void a(fld $$0, grn $$1, gij $$2, jc $$3, hmx $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      flg $$8 = $$4.a($$1, gry::d);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}

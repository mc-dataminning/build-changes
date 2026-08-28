public class glf implements gli<dsn> {
   private final fzv a;
   private final fzv b;

   public glf(glj.a $$0) {
      this.a = new fzv.a($$0.a(gcb.p), gjh::c);
      this.b = new fzv.a($$0.a(gcb.o), gjh::c);
   }

   public static gci b() {
      gck $$0 = new gck();
      gcm $$1 = $$0.a();
      $$1.a("main", gch.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), gce.a);
      $$1.a("left_leg", gch.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), gce.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", gch.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), gce.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return gci.a($$0, 64, 64);
   }

   public static gci c() {
      gck $$0 = new gck();
      gcm $$1 = $$0.a();
      $$1.a("main", gch.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), gce.a);
      $$1.a("left_leg", gch.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), gce.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", gch.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), gce.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return gci.a($$0, 64, 64);
   }

   public void a(dsn $$0, float $$1, fek $$2, gix $$3, int $$4, int $$5) {
      hbc $$6 = gjs.r[$$0.c().a()];
      dff $$7 = $$0.i();
      if ($$7 != null) {
         dvo $$8 = $$0.m();
         dkq.c<? extends dsn> $$9 = dkq.a(dst.y, dic::i, dic::h, djm.c, $$8, $$7, $$0.aB_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new gll<>()).get($$4);
         this.a($$2, $$3, $$8.c(dic.b) == dwb.a ? this.a : this.b, $$8.c(dic.aF), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, jm.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, jm.d, $$6, $$4, $$5, true);
      }
   }

   private void a(fek $$0, gix $$1, fzv $$2, jm $$3, hbc $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      feo $$8 = $$4.a($$1, gjh::c);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}

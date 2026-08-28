public class gbm extends fza<gxm> implements fzj, gbl {
   private final gcc a;
   private final gcc b;
   private final gcc c;
   private final gcc d;
   private final gcc e;

   public gbm(gcc $$0) {
      super($$0);
      this.a = $$0.b("head");
      this.b = this.a.b("hat");
      this.c = this.b.b("hat_rim");
      this.d = $$0.b("right_leg");
      this.e = $$0.b("left_leg");
   }

   public static gck a() {
      gck $$0 = new gck();
      gcm $$1 = $$0.a();
      float $$2 = 0.5F;
      gcm $$3 = $$1.a("head", gch.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F), gce.a);
      gcm $$4 = $$3.a("hat", gch.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new gcg(0.51F)), gce.a);
      $$4.a("hat_rim", gch.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), gce.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$3.a("nose", gch.c().a(24, 0).a(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F), gce.a(0.0F, -2.0F, 0.0F));
      gcm $$5 = $$1.a("body", gch.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F), gce.a);
      $$5.a("jacket", gch.c().a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new gcg(0.5F)), gce.a);
      $$1.a(
         "arms",
         gch.c()
            .a(44, 22)
            .a(-8.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F)
            .a(44, 22)
            .a(4.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, true)
            .a(40, 38)
            .a(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F),
         gce.a(0.0F, 3.0F, -1.0F, -0.75F, 0.0F, 0.0F)
      );
      $$1.a("right_leg", gch.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gce.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", gch.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gce.a(2.0F, 12.0F, 0.0F));
      return $$0;
   }

   public void a(gxm $$0) {
      super.a($$0);
      this.a.f = $$0.U * (float) (Math.PI / 180.0);
      this.a.e = $$0.V * (float) (Math.PI / 180.0);
      if ($$0.a) {
         this.a.g = 0.3F * azn.a(0.45F * $$0.p);
         this.a.e = 0.4F;
      } else {
         this.a.g = 0.0F;
      }

      this.d.e = azn.b($$0.X * 0.6662F) * 1.4F * $$0.Y * 0.5F;
      this.e.e = azn.b($$0.X * 0.6662F + (float) Math.PI) * 1.4F * $$0.Y * 0.5F;
      this.d.f = 0.0F;
      this.e.f = 0.0F;
   }

   @Override
   public gcc b() {
      return this.a;
   }

   @Override
   public void a(boolean $$0) {
      this.a.k = $$0;
      this.b.k = $$0;
      this.c.k = $$0;
   }
}

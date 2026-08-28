public class fzx extends fyk<gwc> {
   private final gbm a;
   private final gbm b;
   private final gbm c;
   private final gbm d;
   private final gbm e;
   private final gbm f;
   private final gbm g;

   public fzx(gbm $$0) {
      super($$0);
      this.g = $$0.b("neck");
      this.a = this.g.b("head");
      this.b = this.a.b("mouth");
      this.c = $$0.b("right_hind_leg");
      this.d = $$0.b("left_hind_leg");
      this.e = $$0.b("right_front_leg");
      this.f = $$0.b("left_front_leg");
   }

   public static gbs a() {
      gbu $$0 = new gbu();
      gbw $$1 = $$0.a();
      int $$2 = 16;
      gbw $$3 = $$1.a("neck", gbr.c().a(68, 73).a(-5.0F, -1.0F, -18.0F, 10.0F, 10.0F, 18.0F), gbo.a(0.0F, -7.0F, 5.5F));
      gbw $$4 = $$3.a(
         "head", gbr.c().a(0, 0).a(-8.0F, -20.0F, -14.0F, 16.0F, 20.0F, 16.0F).a(0, 0).a(-2.0F, -6.0F, -18.0F, 4.0F, 8.0F, 4.0F), gbo.a(0.0F, 16.0F, -17.0F)
      );
      $$4.a("right_horn", gbr.c().a(74, 55).a(0.0F, -14.0F, -2.0F, 2.0F, 14.0F, 4.0F), gbo.a(-10.0F, -14.0F, -8.0F, 1.0995574F, 0.0F, 0.0F));
      $$4.a("left_horn", gbr.c().a(74, 55).a().a(0.0F, -14.0F, -2.0F, 2.0F, 14.0F, 4.0F), gbo.a(8.0F, -14.0F, -8.0F, 1.0995574F, 0.0F, 0.0F));
      $$4.a("mouth", gbr.c().a(0, 36).a(-8.0F, 0.0F, -16.0F, 16.0F, 3.0F, 16.0F), gbo.a(0.0F, -2.0F, 2.0F));
      $$1.a(
         "body",
         gbr.c().a(0, 55).a(-7.0F, -10.0F, -7.0F, 14.0F, 16.0F, 20.0F).a(0, 91).a(-6.0F, 6.0F, -7.0F, 12.0F, 13.0F, 18.0F),
         gbo.a(0.0F, 1.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F)
      );
      $$1.a("right_hind_leg", gbr.c().a(96, 0).a(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F), gbo.a(-8.0F, -13.0F, 18.0F));
      $$1.a("left_hind_leg", gbr.c().a(96, 0).a().a(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F), gbo.a(8.0F, -13.0F, 18.0F));
      $$1.a("right_front_leg", gbr.c().a(64, 0).a(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F), gbo.a(-8.0F, -13.0F, -5.0F));
      $$1.a("left_front_leg", gbr.c().a(64, 0).a().a(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F), gbo.a(8.0F, -13.0F, -5.0F));
      return gbs.a($$0, 128, 128);
   }

   public void a(gwc $$0) {
      super.a($$0);
      float $$1 = $$0.a;
      float $$2 = $$0.b;
      int $$3 = 10;
      if ($$2 > 0.0F) {
         float $$4 = azk.e($$2, 10.0F);
         float $$5 = (1.0F + $$4) * 0.5F;
         float $$6 = $$5 * $$5 * $$5 * 12.0F;
         float $$7 = $$6 * azk.a(this.g.e);
         this.g.d = -6.5F + $$6;
         this.g.c = -7.0F - $$7;
         if ($$2 > 5.0F) {
            this.b.e = azk.a((-4.0F + $$2) / 4.0F) * (float) Math.PI * 0.4F;
         } else {
            this.b.e = (float) (Math.PI / 20) * azk.a((float) Math.PI * $$2 / 10.0F);
         }
      } else {
         float $$8 = -1.0F;
         float $$9 = -1.0F * azk.a(this.g.e);
         this.g.b = 0.0F;
         this.g.c = -7.0F - $$9;
         this.g.d = 5.5F;
         boolean $$10 = $$1 > 0.0F;
         this.g.e = $$10 ? 0.21991149F : 0.0F;
         this.b.e = (float) Math.PI * ($$10 ? 0.05F : 0.01F);
         if ($$10) {
            double $$11 = (double)$$1 / 40.0;
            this.g.b = (float)Math.sin($$11 * 10.0) * 3.0F;
         } else if ((double)$$0.c > 0.0) {
            float $$12 = azk.a($$0.c * (float) Math.PI * 0.25F);
            this.b.e = (float) (Math.PI / 2) * $$12;
         }
      }

      this.a.e = $$0.V * (float) (Math.PI / 180.0);
      this.a.f = $$0.U * (float) (Math.PI / 180.0);
      float $$13 = $$0.X;
      float $$14 = 0.4F * $$0.Y;
      this.c.e = azk.b($$13 * 0.6662F) * $$14;
      this.d.e = azk.b($$13 * 0.6662F + (float) Math.PI) * $$14;
      this.e.e = azk.b($$13 * 0.6662F + (float) Math.PI) * $$14;
      this.f.e = azk.b($$13 * 0.6662F) * $$14;
   }
}

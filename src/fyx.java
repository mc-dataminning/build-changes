public class fyx extends fxk<gva> {
   private final gal a;
   private final gal b;
   private final gal c;
   private final gal d;
   private final gal e;
   private final gal f;
   private final gal g;
   private final gal i;

   public fyx(gal $$0) {
      this.a = $$0;
      this.i = $$0.b("neck");
      this.b = this.i.b("head");
      this.c = this.b.b("mouth");
      this.d = $$0.b("right_hind_leg");
      this.e = $$0.b("left_hind_leg");
      this.f = $$0.b("right_front_leg");
      this.g = $$0.b("left_front_leg");
   }

   public static gar b() {
      gat $$0 = new gat();
      gav $$1 = $$0.a();
      int $$2 = 16;
      gav $$3 = $$1.a("neck", gaq.c().a(68, 73).a(-5.0F, -1.0F, -18.0F, 10.0F, 10.0F, 18.0F), gan.a(0.0F, -7.0F, 5.5F));
      gav $$4 = $$3.a(
         "head", gaq.c().a(0, 0).a(-8.0F, -20.0F, -14.0F, 16.0F, 20.0F, 16.0F).a(0, 0).a(-2.0F, -6.0F, -18.0F, 4.0F, 8.0F, 4.0F), gan.a(0.0F, 16.0F, -17.0F)
      );
      $$4.a("right_horn", gaq.c().a(74, 55).a(0.0F, -14.0F, -2.0F, 2.0F, 14.0F, 4.0F), gan.a(-10.0F, -14.0F, -8.0F, 1.0995574F, 0.0F, 0.0F));
      $$4.a("left_horn", gaq.c().a(74, 55).a().a(0.0F, -14.0F, -2.0F, 2.0F, 14.0F, 4.0F), gan.a(8.0F, -14.0F, -8.0F, 1.0995574F, 0.0F, 0.0F));
      $$4.a("mouth", gaq.c().a(0, 36).a(-8.0F, 0.0F, -16.0F, 16.0F, 3.0F, 16.0F), gan.a(0.0F, -2.0F, 2.0F));
      $$1.a(
         "body",
         gaq.c().a(0, 55).a(-7.0F, -10.0F, -7.0F, 14.0F, 16.0F, 20.0F).a(0, 91).a(-6.0F, 6.0F, -7.0F, 12.0F, 13.0F, 18.0F),
         gan.a(0.0F, 1.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F)
      );
      $$1.a("right_hind_leg", gaq.c().a(96, 0).a(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F), gan.a(-8.0F, -13.0F, 18.0F));
      $$1.a("left_hind_leg", gaq.c().a(96, 0).a().a(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F), gan.a(8.0F, -13.0F, 18.0F));
      $$1.a("right_front_leg", gaq.c().a(64, 0).a(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F), gan.a(-8.0F, -13.0F, -5.0F));
      $$1.a("left_front_leg", gaq.c().a(64, 0).a().a(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F), gan.a(8.0F, -13.0F, -5.0F));
      return gar.a($$0, 128, 128);
   }

   @Override
   public gal a() {
      return this.a;
   }

   public void a(gva $$0) {
      float $$1 = $$0.a;
      float $$2 = $$0.b;
      int $$3 = 10;
      if ($$2 > 0.0F) {
         float $$4 = azd.e($$2, 10.0F);
         float $$5 = (1.0F + $$4) * 0.5F;
         float $$6 = $$5 * $$5 * $$5 * 12.0F;
         float $$7 = $$6 * azd.a(this.i.e);
         this.i.d = -6.5F + $$6;
         this.i.c = -7.0F - $$7;
         if ($$2 > 5.0F) {
            this.c.e = azd.a((-4.0F + $$2) / 4.0F) * (float) Math.PI * 0.4F;
         } else {
            this.c.e = (float) (Math.PI / 20) * azd.a((float) Math.PI * $$2 / 10.0F);
         }
      } else {
         float $$8 = -1.0F;
         float $$9 = -1.0F * azd.a(this.i.e);
         this.i.b = 0.0F;
         this.i.c = -7.0F - $$9;
         this.i.d = 5.5F;
         boolean $$10 = $$1 > 0.0F;
         this.i.e = $$10 ? 0.21991149F : 0.0F;
         this.c.e = (float) Math.PI * ($$10 ? 0.05F : 0.01F);
         if ($$10) {
            double $$11 = (double)$$1 / 40.0;
            this.i.b = (float)Math.sin($$11 * 10.0) * 3.0F;
         } else if ((double)$$0.c > 0.0) {
            float $$12 = azd.a($$0.c * (float) Math.PI * 0.25F);
            this.c.e = (float) (Math.PI / 2) * $$12;
         }
      }

      this.b.e = $$0.V * (float) (Math.PI / 180.0);
      this.b.f = $$0.U * (float) (Math.PI / 180.0);
      float $$13 = $$0.X;
      float $$14 = 0.4F * $$0.Y;
      this.d.e = azd.b($$13 * 0.6662F) * $$14;
      this.e.e = azd.b($$13 * 0.6662F + (float) Math.PI) * $$14;
      this.f.e = azd.b($$13 * 0.6662F + (float) Math.PI) * $$14;
      this.g.e = azd.b($$13 * 0.6662F) * $$14;
   }
}

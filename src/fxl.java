public class fxl extends fyk<gtw> {
   public static final float a = 1.8849558F;
   public static final gbv b = gbv.scaling(0.5F);
   private final gbm c;
   private final gbm d;
   private final gbm e;
   private final gbm f;
   private final gbm g;
   private final gbm i;
   private final gbm j;
   private final gbm k;
   private final gbm l;
   private final gbm m;

   public fxl(gbm $$0) {
      super($$0);
      this.i = $$0.b("body");
      this.j = this.i.b("head");
      this.e = this.i.b("right_hind_leg");
      this.d = this.i.b("left_hind_leg");
      this.g = this.i.b("right_front_leg");
      this.f = this.i.b("left_front_leg");
      this.c = this.i.b("tail");
      this.k = this.j.b("top_gills");
      this.l = this.j.b("left_gills");
      this.m = this.j.b("right_gills");
   }

   public static gbs a() {
      gbu $$0 = new gbu();
      gbw $$1 = $$0.a();
      gbw $$2 = $$1.a(
         "body", gbr.c().a(0, 11).a(-4.0F, -2.0F, -9.0F, 8.0F, 4.0F, 10.0F).a(2, 17).a(0.0F, -3.0F, -8.0F, 0.0F, 5.0F, 9.0F), gbo.a(0.0F, 20.0F, 5.0F)
      );
      gbq $$3 = new gbq(0.001F);
      gbw $$4 = $$2.a("head", gbr.c().a(0, 1).a(-4.0F, -3.0F, -5.0F, 8.0F, 5.0F, 5.0F, $$3), gbo.a(0.0F, 0.0F, -9.0F));
      gbr $$5 = gbr.c().a(3, 37).a(-4.0F, -3.0F, 0.0F, 8.0F, 3.0F, 0.0F, $$3);
      gbr $$6 = gbr.c().a(0, 40).a(-3.0F, -5.0F, 0.0F, 3.0F, 7.0F, 0.0F, $$3);
      gbr $$7 = gbr.c().a(11, 40).a(0.0F, -5.0F, 0.0F, 3.0F, 7.0F, 0.0F, $$3);
      $$4.a("top_gills", $$5, gbo.a(0.0F, -3.0F, -1.0F));
      $$4.a("left_gills", $$6, gbo.a(-4.0F, 0.0F, -1.0F));
      $$4.a("right_gills", $$7, gbo.a(4.0F, 0.0F, -1.0F));
      gbr $$8 = gbr.c().a(2, 13).a(-1.0F, 0.0F, 0.0F, 3.0F, 5.0F, 0.0F, $$3);
      gbr $$9 = gbr.c().a(2, 13).a(-2.0F, 0.0F, 0.0F, 3.0F, 5.0F, 0.0F, $$3);
      $$2.a("right_hind_leg", $$9, gbo.a(-3.5F, 1.0F, -1.0F));
      $$2.a("left_hind_leg", $$8, gbo.a(3.5F, 1.0F, -1.0F));
      $$2.a("right_front_leg", $$9, gbo.a(-3.5F, 1.0F, -8.0F));
      $$2.a("left_front_leg", $$8, gbo.a(3.5F, 1.0F, -8.0F));
      $$2.a("tail", gbr.c().a(2, 19).a(0.0F, -3.0F, 0.0F, 0.0F, 5.0F, 12.0F), gbo.a(0.0F, 0.0F, 1.0F));
      return gbs.a($$0, 64, 64);
   }

   public void a(gtw $$0) {
      super.a($$0);
      float $$1 = $$0.b;
      float $$2 = $$0.d;
      float $$3 = $$0.e;
      float $$4 = $$0.c;
      float $$5 = 1.0F - $$4;
      float $$6 = 1.0F - Math.min($$3, $$4);
      this.i.f = this.i.f + $$0.U * (float) (Math.PI / 180.0);
      this.a($$0.p, $$0.V, Math.min($$4, $$2));
      this.c($$0.p, Math.min($$5, $$2));
      this.b($$0.p, Math.min($$4, $$3));
      this.a($$0.p, Math.min($$5, $$3));
      this.a($$1);
      this.b($$6);
   }

   private void a(float $$0, float $$1) {
      if (!($$1 <= 1.0E-5F)) {
         float $$2 = $$0 * 0.09F;
         float $$3 = azk.a($$2);
         float $$4 = azk.b($$2);
         float $$5 = $$3 * $$3 - 2.0F * $$3;
         float $$6 = $$4 * $$4 - 3.0F * $$3;
         this.j.e += -0.09F * $$5 * $$1;
         this.j.g += -0.2F * $$1;
         this.c.f += (-0.1F + 0.1F * $$5) * $$1;
         float $$7 = (0.6F + 0.05F * $$6) * $$1;
         this.k.e += $$7;
         this.l.f -= $$7;
         this.m.f += $$7;
         this.d.e += 1.1F * $$1;
         this.d.f += 1.0F * $$1;
         this.f.e += 0.8F * $$1;
         this.f.f += 2.3F * $$1;
         this.f.g -= 0.5F * $$1;
      }
   }

   private void b(float $$0, float $$1) {
      if (!($$1 <= 1.0E-5F)) {
         float $$2 = $$0 * 0.11F;
         float $$3 = azk.b($$2);
         float $$4 = ($$3 * $$3 - 2.0F * $$3) / 5.0F;
         float $$5 = 0.7F * $$3;
         float $$6 = 0.09F * $$3 * $$1;
         this.j.f += $$6;
         this.c.f += $$6;
         float $$7 = (0.6F - 0.08F * ($$3 * $$3 + 2.0F * azk.a($$2))) * $$1;
         this.k.e += $$7;
         this.l.f -= $$7;
         this.m.f += $$7;
         float $$8 = 0.9424779F * $$1;
         float $$9 = 1.0995574F * $$1;
         this.d.e += $$8;
         this.d.f += (1.5F - $$4) * $$1;
         this.d.g += -0.1F * $$1;
         this.f.e += $$9;
         this.f.f += ((float) (Math.PI / 2) - $$5) * $$1;
         this.e.e += $$8;
         this.e.f += (-1.0F - $$4) * $$1;
         this.g.e += $$9;
         this.g.f += ((float) (-Math.PI / 2) - $$5) * $$1;
      }
   }

   private void c(float $$0, float $$1) {
      if (!($$1 <= 1.0E-5F)) {
         float $$2 = $$0 * 0.075F;
         float $$3 = azk.b($$2);
         float $$4 = azk.a($$2) * 0.15F;
         float $$5 = (-0.15F + 0.075F * $$3) * $$1;
         this.i.e += $$5;
         this.i.c -= $$4 * $$1;
         this.j.e -= $$5;
         this.k.e += 0.2F * $$3 * $$1;
         float $$6 = (-0.3F * $$3 - 0.19F) * $$1;
         this.l.f += $$6;
         this.m.f -= $$6;
         this.d.e += ((float) (Math.PI * 3.0 / 4.0) - $$3 * 0.11F) * $$1;
         this.d.f += 0.47123894F * $$1;
         this.d.g += 1.7278761F * $$1;
         this.f.e += ((float) (Math.PI / 4) - $$3 * 0.2F) * $$1;
         this.f.f += 2.042035F * $$1;
         this.c.f += 0.5F * $$3 * $$1;
      }
   }

   private void a(float $$0, float $$1, float $$2) {
      if (!($$2 <= 1.0E-5F)) {
         float $$3 = $$0 * 0.33F;
         float $$4 = azk.a($$3);
         float $$5 = azk.b($$3);
         float $$6 = 0.13F * $$4;
         this.i.e += ($$1 * (float) (Math.PI / 180.0) + $$6) * $$2;
         this.j.e -= $$6 * 1.8F * $$2;
         this.i.c -= 0.45F * $$5 * $$2;
         this.k.e += (-0.5F * $$4 - 0.8F) * $$2;
         float $$7 = (0.3F * $$4 + 0.9F) * $$2;
         this.l.f += $$7;
         this.m.f -= $$7;
         this.c.f = this.c.f + 0.3F * azk.b($$3 * 0.9F) * $$2;
         this.d.e += 1.8849558F * $$2;
         this.d.f += -0.4F * $$4 * $$2;
         this.d.g += (float) (Math.PI / 2) * $$2;
         this.f.e += 1.8849558F * $$2;
         this.f.f += (-0.2F * $$5 - 0.1F) * $$2;
         this.f.g += (float) (Math.PI / 2) * $$2;
      }
   }

   private void a(float $$0) {
      if (!($$0 <= 1.0E-5F)) {
         this.d.e += 1.4137167F * $$0;
         this.d.f += 1.0995574F * $$0;
         this.d.g += (float) (Math.PI / 4) * $$0;
         this.f.e += (float) (Math.PI / 4) * $$0;
         this.f.f += 2.042035F * $$0;
         this.i.e += -0.15F * $$0;
         this.i.g += 0.35F * $$0;
      }
   }

   private void b(float $$0) {
      if (!($$0 <= 1.0E-5F)) {
         this.e.e = this.e.e + this.d.e * $$0;
         gbm var2 = this.e;
         var2.f = var2.f + -this.d.f * $$0;
         var2 = this.e;
         var2.g = var2.g + -this.d.g * $$0;
         this.g.e = this.g.e + this.f.e * $$0;
         var2 = this.g;
         var2.f = var2.f + -this.f.f * $$0;
         var2 = this.g;
         var2.g = var2.g + -this.f.g * $$0;
      }
   }
}

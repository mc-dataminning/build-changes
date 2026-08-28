public class fwb extends fxa<gsd> {
   public static final float a = 1.8849558F;
   public static final gak b = gak.scaling(0.5F);
   private final gab c;
   private final gab d;
   private final gab e;
   private final gab f;
   private final gab g;
   private final gab i;
   private final gab j;
   private final gab k;
   private final gab l;
   private final gab m;
   private final gab n;

   public fwb(gab $$0) {
      this.c = $$0;
      this.j = $$0.b("body");
      this.k = this.j.b("head");
      this.f = this.j.b("right_hind_leg");
      this.e = this.j.b("left_hind_leg");
      this.i = this.j.b("right_front_leg");
      this.g = this.j.b("left_front_leg");
      this.d = this.j.b("tail");
      this.l = this.k.b("top_gills");
      this.m = this.k.b("left_gills");
      this.n = this.k.b("right_gills");
   }

   public static gah b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      gal $$2 = $$1.a(
         "body", gag.c().a(0, 11).a(-4.0F, -2.0F, -9.0F, 8.0F, 4.0F, 10.0F).a(2, 17).a(0.0F, -3.0F, -8.0F, 0.0F, 5.0F, 9.0F), gad.a(0.0F, 20.0F, 5.0F)
      );
      gaf $$3 = new gaf(0.001F);
      gal $$4 = $$2.a("head", gag.c().a(0, 1).a(-4.0F, -3.0F, -5.0F, 8.0F, 5.0F, 5.0F, $$3), gad.a(0.0F, 0.0F, -9.0F));
      gag $$5 = gag.c().a(3, 37).a(-4.0F, -3.0F, 0.0F, 8.0F, 3.0F, 0.0F, $$3);
      gag $$6 = gag.c().a(0, 40).a(-3.0F, -5.0F, 0.0F, 3.0F, 7.0F, 0.0F, $$3);
      gag $$7 = gag.c().a(11, 40).a(0.0F, -5.0F, 0.0F, 3.0F, 7.0F, 0.0F, $$3);
      $$4.a("top_gills", $$5, gad.a(0.0F, -3.0F, -1.0F));
      $$4.a("left_gills", $$6, gad.a(-4.0F, 0.0F, -1.0F));
      $$4.a("right_gills", $$7, gad.a(4.0F, 0.0F, -1.0F));
      gag $$8 = gag.c().a(2, 13).a(-1.0F, 0.0F, 0.0F, 3.0F, 5.0F, 0.0F, $$3);
      gag $$9 = gag.c().a(2, 13).a(-2.0F, 0.0F, 0.0F, 3.0F, 5.0F, 0.0F, $$3);
      $$2.a("right_hind_leg", $$9, gad.a(-3.5F, 1.0F, -1.0F));
      $$2.a("left_hind_leg", $$8, gad.a(3.5F, 1.0F, -1.0F));
      $$2.a("right_front_leg", $$9, gad.a(-3.5F, 1.0F, -8.0F));
      $$2.a("left_front_leg", $$8, gad.a(3.5F, 1.0F, -8.0F));
      $$2.a("tail", gag.c().a(2, 19).a(0.0F, -3.0F, 0.0F, 0.0F, 5.0F, 12.0F), gad.a(0.0F, 0.0F, 1.0F));
      return gah.a($$0, 64, 64);
   }

   public void a(gsd $$0) {
      this.a().e().forEach(gab::c);
      float $$1 = $$0.b;
      float $$2 = $$0.d;
      float $$3 = $$0.e;
      float $$4 = $$0.c;
      float $$5 = 1.0F - $$4;
      float $$6 = 1.0F - Math.min($$3, $$4);
      this.j.f = this.j.f + $$0.U * (float) (Math.PI / 180.0);
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
         float $$3 = azc.a($$2);
         float $$4 = azc.b($$2);
         float $$5 = $$3 * $$3 - 2.0F * $$3;
         float $$6 = $$4 * $$4 - 3.0F * $$3;
         this.k.e += -0.09F * $$5 * $$1;
         this.k.g += -0.2F * $$1;
         this.d.f += (-0.1F + 0.1F * $$5) * $$1;
         float $$7 = (0.6F + 0.05F * $$6) * $$1;
         this.l.e += $$7;
         this.m.f -= $$7;
         this.n.f += $$7;
         this.e.e += 1.1F * $$1;
         this.e.f += 1.0F * $$1;
         this.g.e += 0.8F * $$1;
         this.g.f += 2.3F * $$1;
         this.g.g -= 0.5F * $$1;
      }
   }

   private void b(float $$0, float $$1) {
      if (!($$1 <= 1.0E-5F)) {
         float $$2 = $$0 * 0.11F;
         float $$3 = azc.b($$2);
         float $$4 = ($$3 * $$3 - 2.0F * $$3) / 5.0F;
         float $$5 = 0.7F * $$3;
         float $$6 = 0.09F * $$3 * $$1;
         this.k.f += $$6;
         this.d.f += $$6;
         float $$7 = (0.6F - 0.08F * ($$3 * $$3 + 2.0F * azc.a($$2))) * $$1;
         this.l.e += $$7;
         this.m.f -= $$7;
         this.n.f += $$7;
         float $$8 = 0.9424779F * $$1;
         float $$9 = 1.0995574F * $$1;
         this.e.e += $$8;
         this.e.f += (1.5F - $$4) * $$1;
         this.e.g += -0.1F * $$1;
         this.g.e += $$9;
         this.g.f += ((float) (Math.PI / 2) - $$5) * $$1;
         this.f.e += $$8;
         this.f.f += (-1.0F - $$4) * $$1;
         this.i.e += $$9;
         this.i.f += ((float) (-Math.PI / 2) - $$5) * $$1;
      }
   }

   private void c(float $$0, float $$1) {
      if (!($$1 <= 1.0E-5F)) {
         float $$2 = $$0 * 0.075F;
         float $$3 = azc.b($$2);
         float $$4 = azc.a($$2) * 0.15F;
         float $$5 = (-0.15F + 0.075F * $$3) * $$1;
         this.j.e += $$5;
         this.j.c -= $$4 * $$1;
         this.k.e -= $$5;
         this.l.e += 0.2F * $$3 * $$1;
         float $$6 = (-0.3F * $$3 - 0.19F) * $$1;
         this.m.f += $$6;
         this.n.f -= $$6;
         this.e.e += ((float) (Math.PI * 3.0 / 4.0) - $$3 * 0.11F) * $$1;
         this.e.f += 0.47123894F * $$1;
         this.e.g += 1.7278761F * $$1;
         this.g.e += ((float) (Math.PI / 4) - $$3 * 0.2F) * $$1;
         this.g.f += 2.042035F * $$1;
         this.d.f += 0.5F * $$3 * $$1;
      }
   }

   private void a(float $$0, float $$1, float $$2) {
      if (!($$2 <= 1.0E-5F)) {
         float $$3 = $$0 * 0.33F;
         float $$4 = azc.a($$3);
         float $$5 = azc.b($$3);
         float $$6 = 0.13F * $$4;
         this.j.e += ($$1 * (float) (Math.PI / 180.0) + $$6) * $$2;
         this.k.e -= $$6 * 1.8F * $$2;
         this.j.c -= 0.45F * $$5 * $$2;
         this.l.e += (-0.5F * $$4 - 0.8F) * $$2;
         float $$7 = (0.3F * $$4 + 0.9F) * $$2;
         this.m.f += $$7;
         this.n.f -= $$7;
         this.d.f = this.d.f + 0.3F * azc.b($$3 * 0.9F) * $$2;
         this.e.e += 1.8849558F * $$2;
         this.e.f += -0.4F * $$4 * $$2;
         this.e.g += (float) (Math.PI / 2) * $$2;
         this.g.e += 1.8849558F * $$2;
         this.g.f += (-0.2F * $$5 - 0.1F) * $$2;
         this.g.g += (float) (Math.PI / 2) * $$2;
      }
   }

   private void a(float $$0) {
      if (!($$0 <= 1.0E-5F)) {
         this.e.e += 1.4137167F * $$0;
         this.e.f += 1.0995574F * $$0;
         this.e.g += (float) (Math.PI / 4) * $$0;
         this.g.e += (float) (Math.PI / 4) * $$0;
         this.g.f += 2.042035F * $$0;
         this.j.e += -0.15F * $$0;
         this.j.g += 0.35F * $$0;
      }
   }

   private void b(float $$0) {
      if (!($$0 <= 1.0E-5F)) {
         this.f.e = this.f.e + this.e.e * $$0;
         gab var2 = this.f;
         var2.f = var2.f + -this.e.f * $$0;
         var2 = this.f;
         var2.g = var2.g + -this.e.g * $$0;
         this.i.e = this.i.e + this.g.e * $$0;
         var2 = this.i;
         var2.f = var2.f + -this.g.f * $$0;
         var2 = this.i;
         var2.g = var2.g + -this.g.g * $$0;
      }
   }

   @Override
   public gab a() {
      return this.c;
   }
}

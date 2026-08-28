public class gah extends fzj<gwv> {
   private static final String a = "feather";
   private final gcl b;
   private final gcl c;
   private final gcl d;
   private final gcl e;
   private final gcl f;
   private final gcl g;
   private final gcl i;

   public gah(gcl $$0) {
      super($$0);
      this.b = $$0.b("body");
      this.c = $$0.b("tail");
      this.d = $$0.b("left_wing");
      this.e = $$0.b("right_wing");
      this.f = $$0.b("head");
      this.g = $$0.b("left_leg");
      this.i = $$0.b("right_leg");
   }

   public static gcr a() {
      gct $$0 = new gct();
      gcv $$1 = $$0.a();
      $$1.a("body", gcq.c().a(2, 8).a(-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F), gcn.a(0.0F, 16.5F, -3.0F, 0.4937F, 0.0F, 0.0F));
      $$1.a("tail", gcq.c().a(22, 1).a(-1.5F, -1.0F, -1.0F, 3.0F, 4.0F, 1.0F), gcn.a(0.0F, 21.07F, 1.16F, 1.015F, 0.0F, 0.0F));
      $$1.a("left_wing", gcq.c().a(19, 8).a(-0.5F, 0.0F, -1.5F, 1.0F, 5.0F, 3.0F), gcn.a(1.5F, 16.94F, -2.76F, -0.6981F, (float) -Math.PI, 0.0F));
      $$1.a("right_wing", gcq.c().a(19, 8).a(-0.5F, 0.0F, -1.5F, 1.0F, 5.0F, 3.0F), gcn.a(-1.5F, 16.94F, -2.76F, -0.6981F, (float) -Math.PI, 0.0F));
      gcv $$2 = $$1.a("head", gcq.c().a(2, 2).a(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F), gcn.a(0.0F, 15.69F, -2.76F));
      $$2.a("head2", gcq.c().a(10, 0).a(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 4.0F), gcn.a(0.0F, -2.0F, -1.0F));
      $$2.a("beak1", gcq.c().a(11, 7).a(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F), gcn.a(0.0F, -0.5F, -1.5F));
      $$2.a("beak2", gcq.c().a(16, 7).a(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F), gcn.a(0.0F, -1.75F, -2.45F));
      $$2.a("feather", gcq.c().a(2, 18).a(0.0F, -4.0F, -2.0F, 0.0F, 5.0F, 4.0F), gcn.a(0.0F, -2.15F, 0.15F, -0.2214F, 0.0F, 0.0F));
      gcq $$3 = gcq.c().a(14, 18).a(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F);
      $$1.a("left_leg", $$3, gcn.a(1.0F, 22.0F, -1.05F, -0.0299F, 0.0F, 0.0F));
      $$1.a("right_leg", $$3, gcn.a(-1.0F, 22.0F, -1.05F, -0.0299F, 0.0F, 0.0F));
      return gcr.a($$0, 32, 32);
   }

   public void a(gwv $$0) {
      super.a($$0);
      this.a($$0.c);
      this.f.e = $$0.V * (float) (Math.PI / 180.0);
      this.f.f = $$0.U * (float) (Math.PI / 180.0);
      switch ($$0.c) {
         case b:
            this.g.e = this.g.e + azm.b($$0.X * 0.6662F) * 1.4F * $$0.Y;
            this.i.e = this.i.e + azm.b($$0.X * 0.6662F + (float) Math.PI) * 1.4F * $$0.Y;
         case a:
         case e:
         default:
            float $$3 = $$0.b * 0.3F;
            this.f.c += $$3;
            this.c.e = this.c.e + azm.b($$0.X * 0.6662F) * 0.3F * $$0.Y;
            this.c.c += $$3;
            this.b.c += $$3;
            this.d.g = -0.0873F - $$0.b;
            this.d.c += $$3;
            this.e.g = 0.0873F + $$0.b;
            this.e.c += $$3;
            this.g.c += $$3;
            this.i.c += $$3;
         case c:
            break;
         case d:
            float $$1 = azm.b($$0.p);
            float $$2 = azm.a($$0.p);
            this.f.b += $$1;
            this.f.c += $$2;
            this.f.e = 0.0F;
            this.f.f = 0.0F;
            this.f.g = azm.a($$0.p) * 0.4F;
            this.b.b += $$1;
            this.b.c += $$2;
            this.d.g = -0.0873F - $$0.b;
            this.d.b += $$1;
            this.d.c += $$2;
            this.e.g = 0.0873F + $$0.b;
            this.e.b += $$1;
            this.e.c += $$2;
            this.c.b += $$1;
            this.c.c += $$2;
      }
   }

   private void a(gah.a $$0) {
      switch ($$0) {
         case a:
            this.g.e += (float) (Math.PI * 2.0 / 9.0);
            this.i.e += (float) (Math.PI * 2.0 / 9.0);
         case b:
         case e:
         default:
            break;
         case c:
            float $$1 = 1.9F;
            this.f.c++;
            this.c.e += (float) (Math.PI / 6);
            this.c.c++;
            this.b.c++;
            this.d.g = -0.0873F;
            this.d.c++;
            this.e.g = 0.0873F;
            this.e.c++;
            this.g.c++;
            this.i.c++;
            this.g.e++;
            this.i.e++;
            break;
         case d:
            this.g.g = (float) (-Math.PI / 9);
            this.i.g = (float) (Math.PI / 9);
      }
   }

   public static gah.a a(cho $$0) {
      if ($$0.gz()) {
         return gah.a.d;
      } else if ($$0.v()) {
         return gah.a.c;
      } else {
         return $$0.gB() ? gah.a.a : gah.a.b;
      }
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }
}

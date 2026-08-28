import java.util.Set;

public class fxd extends fxa<gtd> {
   public static final gak a = new fwc(true, 8.0F, 3.35F, Set.of("head"));
   private final gab c;
   public final gab b;
   private final gab d;
   private final gab e;
   private final gab f;
   private final gab g;
   private final gab i;
   private final gab j;
   private static final int k = 6;
   private static final float l = 16.5F;
   private static final float m = 17.5F;
   private float n;

   public fxd(gab $$0) {
      this.c = $$0;
      this.b = $$0.b("head");
      this.d = $$0.b("body");
      this.e = $$0.b("right_hind_leg");
      this.f = $$0.b("left_hind_leg");
      this.g = $$0.b("right_front_leg");
      this.i = $$0.b("left_front_leg");
      this.j = this.d.b("tail");
   }

   public static gah b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      gal $$2 = $$1.a("head", gag.c().a(1, 5).a(-3.0F, -2.0F, -5.0F, 8.0F, 6.0F, 6.0F), gad.a(-1.0F, 16.5F, -3.0F));
      $$2.a("right_ear", gag.c().a(8, 1).a(-3.0F, -4.0F, -4.0F, 2.0F, 2.0F, 1.0F), gad.a);
      $$2.a("left_ear", gag.c().a(15, 1).a(3.0F, -4.0F, -4.0F, 2.0F, 2.0F, 1.0F), gad.a);
      $$2.a("nose", gag.c().a(6, 18).a(-1.0F, 2.01F, -8.0F, 4.0F, 2.0F, 3.0F), gad.a);
      gal $$3 = $$1.a("body", gag.c().a(24, 15).a(-3.0F, 3.999F, -3.5F, 6.0F, 11.0F, 6.0F), gad.a(0.0F, 16.0F, -6.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      gaf $$4 = new gaf(0.001F);
      gag $$5 = gag.c().a(4, 24).a(2.0F, 0.5F, -1.0F, 2.0F, 6.0F, 2.0F, $$4);
      gag $$6 = gag.c().a(13, 24).a(2.0F, 0.5F, -1.0F, 2.0F, 6.0F, 2.0F, $$4);
      $$1.a("right_hind_leg", $$6, gad.a(-5.0F, 17.5F, 7.0F));
      $$1.a("left_hind_leg", $$5, gad.a(-1.0F, 17.5F, 7.0F));
      $$1.a("right_front_leg", $$6, gad.a(-5.0F, 17.5F, 0.0F));
      $$1.a("left_front_leg", $$5, gad.a(-1.0F, 17.5F, 0.0F));
      $$3.a("tail", gag.c().a(30, 0).a(2.0F, 0.0F, -1.0F, 4.0F, 9.0F, 5.0F), gad.a(-4.0F, 15.0F, -1.0F, -0.05235988F, 0.0F, 0.0F));
      return gah.a($$0, 48, 32);
   }

   @Override
   public gab a() {
      return this.c;
   }

   public void a(gtd $$0) {
      this.d.c();
      this.b.c();
      this.j.c();
      this.e.c();
      this.f.c();
      float $$1 = $$0.Y;
      float $$2 = $$0.X;
      this.e.e = azc.b($$2 * 0.6662F) * 1.4F * $$1;
      this.f.e = azc.b($$2 * 0.6662F + (float) Math.PI) * 1.4F * $$1;
      this.g.e = azc.b($$2 * 0.6662F + (float) Math.PI) * 1.4F * $$1;
      this.i.e = azc.b($$2 * 0.6662F) * 1.4F * $$1;
      this.b.g = $$0.a;
      this.e.k = true;
      this.f.k = true;
      this.g.k = true;
      this.i.k = true;
      float $$3 = $$0.ab;
      if ($$0.c) {
         this.d.e += 0.10471976F;
         float $$4 = $$0.b;
         this.d.c += $$4 * $$3;
         this.b.c += $$4 * $$3;
      } else if ($$0.d) {
         this.d.g = (float) (-Math.PI / 2);
         this.d.c += 5.0F * $$3;
         this.j.e = (float) (-Math.PI * 5.0 / 6.0);
         if ($$0.ae) {
            this.j.e = -2.1816616F;
            this.d.d += 2.0F;
         }

         this.b.b += 2.0F * $$3;
         this.b.c += 2.99F * $$3;
         this.b.f = (float) (-Math.PI * 2.0 / 3.0);
         this.b.g = 0.0F;
         this.e.k = false;
         this.f.k = false;
         this.g.k = false;
         this.i.k = false;
      } else if ($$0.e) {
         this.d.e = (float) (Math.PI / 6);
         this.d.c -= 7.0F * $$3;
         this.d.d += 3.0F * $$3;
         this.j.e = (float) (Math.PI / 4);
         this.j.d -= 1.0F * $$3;
         this.b.e = 0.0F;
         this.b.f = 0.0F;
         if ($$0.ae) {
            this.b.c--;
            this.b.d -= 0.375F;
         } else {
            this.b.c -= 6.5F;
            this.b.d += 2.75F;
         }

         this.e.e = (float) (-Math.PI * 5.0 / 12.0);
         this.e.c += 4.0F * $$3;
         this.e.d -= 0.25F * $$3;
         this.f.e = (float) (-Math.PI * 5.0 / 12.0);
         this.f.c += 4.0F * $$3;
         this.f.d -= 0.25F * $$3;
         this.g.e = (float) (-Math.PI / 12);
         this.i.e = (float) (-Math.PI / 12);
      }

      if (!$$0.d && !$$0.f && !$$0.c) {
         this.b.e = $$0.V * (float) (Math.PI / 180.0);
         this.b.f = $$0.U * (float) (Math.PI / 180.0);
      }

      if ($$0.d) {
         this.b.e = 0.0F;
         this.b.f = (float) (-Math.PI * 2.0 / 3.0);
         this.b.g = azc.b($$0.p * 0.027F) / 22.0F;
      }

      if ($$0.c) {
         float $$5 = azc.b($$0.p) * 0.01F;
         this.d.f = $$5;
         this.e.g = $$5;
         this.f.g = $$5;
         this.g.g = $$5 / 2.0F;
         this.i.g = $$5 / 2.0F;
      }

      if ($$0.f) {
         float $$6 = 0.1F;
         this.n += 0.67F;
         this.e.e = azc.b(this.n * 0.4662F) * 0.1F;
         this.f.e = azc.b(this.n * 0.4662F + (float) Math.PI) * 0.1F;
         this.g.e = azc.b(this.n * 0.4662F + (float) Math.PI) * 0.1F;
         this.i.e = azc.b(this.n * 0.4662F) * 0.1F;
      }
   }
}

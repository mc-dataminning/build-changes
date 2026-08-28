import java.util.Set;

public class fxx extends fyk<gua> {
   public static final gak a = new fwc(true, 23.0F, 4.8F, 2.7F, 3.0F, 49.0F, Set.of("head"));

   public fxx(gab $$0) {
      super($$0);
   }

   public static gah b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      $$1.a(
         "head",
         gag.c()
            .a(0, 6)
            .a(-6.5F, -5.0F, -4.0F, 13.0F, 10.0F, 9.0F)
            .a(45, 16)
            .a("nose", -3.5F, 0.0F, -6.0F, 7.0F, 5.0F, 2.0F)
            .a(52, 25)
            .a("left_ear", 3.5F, -8.0F, -1.0F, 5.0F, 4.0F, 1.0F)
            .a(52, 25)
            .a("right_ear", -8.5F, -8.0F, -1.0F, 5.0F, 4.0F, 1.0F),
         gad.a(0.0F, 11.5F, -17.0F)
      );
      $$1.a("body", gag.c().a(0, 25).a(-9.5F, -13.0F, -6.5F, 19.0F, 26.0F, 13.0F), gad.a(0.0F, 10.0F, 0.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      int $$2 = 9;
      int $$3 = 6;
      gag $$4 = gag.c().a(40, 0).a(-3.0F, 0.0F, -3.0F, 6.0F, 9.0F, 6.0F);
      $$1.a("right_hind_leg", $$4, gad.a(-5.5F, 15.0F, 9.0F));
      $$1.a("left_hind_leg", $$4, gad.a(5.5F, 15.0F, 9.0F));
      $$1.a("right_front_leg", $$4, gad.a(-5.5F, 15.0F, -9.0F));
      $$1.a("left_front_leg", $$4, gad.a(5.5F, 15.0F, -9.0F));
      return gah.a($$0, 64, 64);
   }

   public void a(gua $$0) {
      super.a($$0);
      if ($$0.b) {
         this.c.f = 0.35F * azc.a(0.6F * $$0.p);
         this.c.g = 0.35F * azc.a(0.6F * $$0.p);
         this.g.e = -0.75F * azc.a(0.3F * $$0.p);
         this.i.e = 0.75F * azc.a(0.3F * $$0.p);
      } else {
         this.c.g = 0.0F;
      }

      if ($$0.c) {
         if ($$0.d < 15) {
            this.c.e = (float) (-Math.PI / 4) * (float)$$0.d / 14.0F;
         } else if ($$0.d < 20) {
            float $$1 = (float)(($$0.d - 15) / 5);
            this.c.e = (float) (-Math.PI / 4) + (float) (Math.PI / 4) * $$1;
         }
      }

      if ($$0.h > 0.0F) {
         this.d.e = azc.j($$0.h, this.d.e, 1.7407963F);
         this.c.e = azc.j($$0.h, this.c.e, (float) (Math.PI / 2));
         this.g.g = -0.27079642F;
         this.i.g = 0.27079642F;
         this.e.g = 0.5707964F;
         this.f.g = -0.5707964F;
         if ($$0.e) {
            this.c.e = (float) (Math.PI / 2) + 0.2F * azc.a($$0.p * 0.6F);
            this.g.e = -0.4F - 0.2F * azc.a($$0.p * 0.6F);
            this.i.e = -0.4F - 0.2F * azc.a($$0.p * 0.6F);
         }

         if ($$0.f) {
            this.c.e = 2.1707964F;
            this.g.e = -0.9F;
            this.i.e = -0.9F;
         }
      } else {
         this.e.g = 0.0F;
         this.f.g = 0.0F;
         this.g.g = 0.0F;
         this.i.g = 0.0F;
      }

      if ($$0.i > 0.0F) {
         this.e.e = -0.6F * azc.a($$0.p * 0.15F);
         this.f.e = 0.6F * azc.a($$0.p * 0.15F);
         this.g.e = 0.3F * azc.a($$0.p * 0.25F);
         this.i.e = -0.3F * azc.a($$0.p * 0.25F);
         this.c.e = azc.j($$0.i, this.c.e, (float) (Math.PI / 2));
      }

      if ($$0.j > 0.0F) {
         this.c.e = azc.j($$0.j, this.c.e, 2.0561945F);
         this.e.e = -0.5F * azc.a($$0.p * 0.5F);
         this.f.e = 0.5F * azc.a($$0.p * 0.5F);
         this.g.e = 0.5F * azc.a($$0.p * 0.5F);
         this.i.e = -0.5F * azc.a($$0.p * 0.5F);
      }
   }
}

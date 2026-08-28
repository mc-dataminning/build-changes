import java.util.Set;

public class ggc extends gfy<hcw> {
   public static final gjl a = new get(true, 8.0F, 3.35F, Set.of("head"));
   public final gjc b;
   private final gjc c;
   private final gjc d;
   private final gjc e;
   private final gjc f;
   private final gjc g;
   private final gjc i;
   private static final int j = 6;
   private static final float k = 16.5F;
   private static final float l = 17.5F;
   private float m;

   public ggc(gjc $$0) {
      super($$0);
      this.b = $$0.b("head");
      this.c = $$0.b("body");
      this.d = $$0.b("right_hind_leg");
      this.e = $$0.b("left_hind_leg");
      this.f = $$0.b("right_front_leg");
      this.g = $$0.b("left_front_leg");
      this.i = this.c.b("tail");
   }

   public static gji a() {
      gjk $$0 = new gjk();
      gjm $$1 = $$0.a();
      gjm $$2 = $$1.a("head", gjh.c().a(1, 5).a(-3.0F, -2.0F, -5.0F, 8.0F, 6.0F, 6.0F), gje.a(-1.0F, 16.5F, -3.0F));
      $$2.a("right_ear", gjh.c().a(8, 1).a(-3.0F, -4.0F, -4.0F, 2.0F, 2.0F, 1.0F), gje.a);
      $$2.a("left_ear", gjh.c().a(15, 1).a(3.0F, -4.0F, -4.0F, 2.0F, 2.0F, 1.0F), gje.a);
      $$2.a("nose", gjh.c().a(6, 18).a(-1.0F, 2.01F, -8.0F, 4.0F, 2.0F, 3.0F), gje.a);
      gjm $$3 = $$1.a("body", gjh.c().a(24, 15).a(-3.0F, 3.999F, -3.5F, 6.0F, 11.0F, 6.0F), gje.a(0.0F, 16.0F, -6.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      gjg $$4 = new gjg(0.001F);
      gjh $$5 = gjh.c().a(4, 24).a(2.0F, 0.5F, -1.0F, 2.0F, 6.0F, 2.0F, $$4);
      gjh $$6 = gjh.c().a(13, 24).a(2.0F, 0.5F, -1.0F, 2.0F, 6.0F, 2.0F, $$4);
      $$1.a("right_hind_leg", $$6, gje.a(-5.0F, 17.5F, 7.0F));
      $$1.a("left_hind_leg", $$5, gje.a(-1.0F, 17.5F, 7.0F));
      $$1.a("right_front_leg", $$6, gje.a(-5.0F, 17.5F, 0.0F));
      $$1.a("left_front_leg", $$5, gje.a(-1.0F, 17.5F, 0.0F));
      $$3.a("tail", gjh.c().a(30, 0).a(2.0F, 0.0F, -1.0F, 4.0F, 9.0F, 5.0F), gje.a(-4.0F, 15.0F, -1.0F, -0.05235988F, 0.0F, 0.0F));
      return gji.a($$0, 48, 32);
   }

   public void a(hcw $$0) {
      super.a($$0);
      float $$1 = $$0.ae;
      float $$2 = $$0.ad;
      this.d.e = azm.b($$2 * 0.6662F) * 1.4F * $$1;
      this.e.e = azm.b($$2 * 0.6662F + (float) Math.PI) * 1.4F * $$1;
      this.f.e = azm.b($$2 * 0.6662F + (float) Math.PI) * 1.4F * $$1;
      this.g.e = azm.b($$2 * 0.6662F) * 1.4F * $$1;
      this.b.g = $$0.a;
      this.d.k = true;
      this.e.k = true;
      this.f.k = true;
      this.g.k = true;
      float $$3 = $$0.ag;
      if ($$0.c) {
         this.c.e += 0.10471976F;
         float $$4 = $$0.b;
         this.c.c += $$4 * $$3;
         this.b.c += $$4 * $$3;
      } else if ($$0.d) {
         this.c.g = (float) (-Math.PI / 2);
         this.c.c += 5.0F * $$3;
         this.i.e = (float) (-Math.PI * 5.0 / 6.0);
         if ($$0.aj) {
            this.i.e = -2.1816616F;
            this.c.d += 2.0F;
         }

         this.b.b += 2.0F * $$3;
         this.b.c += 2.99F * $$3;
         this.b.f = (float) (-Math.PI * 2.0 / 3.0);
         this.b.g = 0.0F;
         this.d.k = false;
         this.e.k = false;
         this.f.k = false;
         this.g.k = false;
      } else if ($$0.e) {
         this.c.e = (float) (Math.PI / 6);
         this.c.c -= 7.0F * $$3;
         this.c.d += 3.0F * $$3;
         this.i.e = (float) (Math.PI / 4);
         this.i.d -= 1.0F * $$3;
         this.b.e = 0.0F;
         this.b.f = 0.0F;
         if ($$0.aj) {
            this.b.c--;
            this.b.d -= 0.375F;
         } else {
            this.b.c -= 6.5F;
            this.b.d += 2.75F;
         }

         this.d.e = (float) (-Math.PI * 5.0 / 12.0);
         this.d.c += 4.0F * $$3;
         this.d.d -= 0.25F * $$3;
         this.e.e = (float) (-Math.PI * 5.0 / 12.0);
         this.e.c += 4.0F * $$3;
         this.e.d -= 0.25F * $$3;
         this.f.e = (float) (-Math.PI / 12);
         this.g.e = (float) (-Math.PI / 12);
      }

      if (!$$0.d && !$$0.f && !$$0.c) {
         this.b.e = $$0.ab * (float) (Math.PI / 180.0);
         this.b.f = $$0.aa * (float) (Math.PI / 180.0);
      }

      if ($$0.d) {
         this.b.e = 0.0F;
         this.b.f = (float) (-Math.PI * 2.0 / 3.0);
         this.b.g = azm.b($$0.u * 0.027F) / 22.0F;
      }

      if ($$0.c) {
         float $$5 = azm.b($$0.u) * 0.01F;
         this.c.f = $$5;
         this.d.g = $$5;
         this.e.g = $$5;
         this.f.g = $$5 / 2.0F;
         this.g.g = $$5 / 2.0F;
      }

      if ($$0.f) {
         float $$6 = 0.1F;
         this.m += 0.67F;
         this.d.e = azm.b(this.m * 0.4662F) * 0.1F;
         this.e.e = azm.b(this.m * 0.4662F + (float) Math.PI) * 0.1F;
         this.f.e = azm.b(this.m * 0.4662F + (float) Math.PI) * 0.1F;
         this.g.e = azm.b(this.m * 0.4662F) * 0.1F;
      }
   }
}

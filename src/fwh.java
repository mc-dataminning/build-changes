import java.util.Arrays;

public class fwh extends fxa<gts> {
   private final gab a;
   private final gab[] b;
   private final gab c;

   public fwh(gab $$0) {
      this.a = $$0;
      this.c = $$0.b("head");
      this.b = new gab[12];
      Arrays.setAll(this.b, $$1 -> $$0.b(a($$1)));
   }

   private static String a(int $$0) {
      return "part" + $$0;
   }

   public static gah b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      $$1.a("head", gag.c().a(0, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), gad.a);
      float $$2 = 0.0F;
      gag $$3 = gag.c().a(0, 16).a(0.0F, 0.0F, 0.0F, 2.0F, 8.0F, 2.0F);

      for (int $$4 = 0; $$4 < 4; $$4++) {
         float $$5 = azc.b($$2) * 9.0F;
         float $$6 = -2.0F + azc.b((float)($$4 * 2) * 0.25F);
         float $$7 = azc.a($$2) * 9.0F;
         $$1.a(a($$4), $$3, gad.a($$5, $$6, $$7));
         $$2++;
      }

      $$2 = (float) (Math.PI / 4);

      for (int $$8 = 4; $$8 < 8; $$8++) {
         float $$9 = azc.b($$2) * 7.0F;
         float $$10 = 2.0F + azc.b((float)($$8 * 2) * 0.25F);
         float $$11 = azc.a($$2) * 7.0F;
         $$1.a(a($$8), $$3, gad.a($$9, $$10, $$11));
         $$2++;
      }

      $$2 = 0.47123894F;

      for (int $$12 = 8; $$12 < 12; $$12++) {
         float $$13 = azc.b($$2) * 5.0F;
         float $$14 = 11.0F + azc.b((float)$$12 * 1.5F * 0.5F);
         float $$15 = azc.a($$2) * 5.0F;
         $$1.a(a($$12), $$3, gad.a($$13, $$14, $$15));
         $$2++;
      }

      return gah.a($$0, 64, 32);
   }

   @Override
   public gab a() {
      return this.a;
   }

   public void a(gts $$0) {
      float $$1 = $$0.p * (float) Math.PI * -0.1F;

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.b[$$2].c = -2.0F + azc.b(((float)($$2 * 2) + $$0.p) * 0.25F);
         this.b[$$2].b = azc.b($$1) * 9.0F;
         this.b[$$2].d = azc.a($$1) * 9.0F;
         $$1++;
      }

      $$1 = (float) (Math.PI / 4) + $$0.p * (float) Math.PI * 0.03F;

      for (int $$3 = 4; $$3 < 8; $$3++) {
         this.b[$$3].c = 2.0F + azc.b(((float)($$3 * 2) + $$0.p) * 0.25F);
         this.b[$$3].b = azc.b($$1) * 7.0F;
         this.b[$$3].d = azc.a($$1) * 7.0F;
         $$1++;
      }

      $$1 = 0.47123894F + $$0.p * (float) Math.PI * -0.05F;

      for (int $$4 = 8; $$4 < 12; $$4++) {
         this.b[$$4].c = 11.0F + azc.b(((float)$$4 * 1.5F + $$0.p) * 0.5F);
         this.b[$$4].b = azc.b($$1) * 5.0F;
         this.b[$$4].d = azc.a($$1) * 5.0F;
         $$1++;
      }

      this.c.f = $$0.U * (float) (Math.PI / 180.0);
      this.c.e = $$0.V * (float) (Math.PI / 180.0);
   }
}

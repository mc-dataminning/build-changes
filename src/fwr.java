import java.util.Arrays;

public class fwr extends fxk<guj> {
   private final gal a;
   private final gal[] b;
   private final gal c;

   public fwr(gal $$0) {
      this.a = $$0;
      this.c = $$0.b("head");
      this.b = new gal[12];
      Arrays.setAll(this.b, $$1 -> $$0.b(a($$1)));
   }

   private static String a(int $$0) {
      return "part" + $$0;
   }

   public static gar b() {
      gat $$0 = new gat();
      gav $$1 = $$0.a();
      $$1.a("head", gaq.c().a(0, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), gan.a);
      float $$2 = 0.0F;
      gaq $$3 = gaq.c().a(0, 16).a(0.0F, 0.0F, 0.0F, 2.0F, 8.0F, 2.0F);

      for (int $$4 = 0; $$4 < 4; $$4++) {
         float $$5 = azd.b($$2) * 9.0F;
         float $$6 = -2.0F + azd.b((float)($$4 * 2) * 0.25F);
         float $$7 = azd.a($$2) * 9.0F;
         $$1.a(a($$4), $$3, gan.a($$5, $$6, $$7));
         $$2++;
      }

      $$2 = (float) (Math.PI / 4);

      for (int $$8 = 4; $$8 < 8; $$8++) {
         float $$9 = azd.b($$2) * 7.0F;
         float $$10 = 2.0F + azd.b((float)($$8 * 2) * 0.25F);
         float $$11 = azd.a($$2) * 7.0F;
         $$1.a(a($$8), $$3, gan.a($$9, $$10, $$11));
         $$2++;
      }

      $$2 = 0.47123894F;

      for (int $$12 = 8; $$12 < 12; $$12++) {
         float $$13 = azd.b($$2) * 5.0F;
         float $$14 = 11.0F + azd.b((float)$$12 * 1.5F * 0.5F);
         float $$15 = azd.a($$2) * 5.0F;
         $$1.a(a($$12), $$3, gan.a($$13, $$14, $$15));
         $$2++;
      }

      return gar.a($$0, 64, 32);
   }

   @Override
   public gal a() {
      return this.a;
   }

   public void a(guj $$0) {
      float $$1 = $$0.p * (float) Math.PI * -0.1F;

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.b[$$2].c = -2.0F + azd.b(((float)($$2 * 2) + $$0.p) * 0.25F);
         this.b[$$2].b = azd.b($$1) * 9.0F;
         this.b[$$2].d = azd.a($$1) * 9.0F;
         $$1++;
      }

      $$1 = (float) (Math.PI / 4) + $$0.p * (float) Math.PI * 0.03F;

      for (int $$3 = 4; $$3 < 8; $$3++) {
         this.b[$$3].c = 2.0F + azd.b(((float)($$3 * 2) + $$0.p) * 0.25F);
         this.b[$$3].b = azd.b($$1) * 7.0F;
         this.b[$$3].d = azd.a($$1) * 7.0F;
         $$1++;
      }

      $$1 = 0.47123894F + $$0.p * (float) Math.PI * -0.05F;

      for (int $$4 = 8; $$4 < 12; $$4++) {
         this.b[$$4].c = 11.0F + azd.b(((float)$$4 * 1.5F + $$0.p) * 0.5F);
         this.b[$$4].b = azd.b($$1) * 5.0F;
         this.b[$$4].d = azd.a($$1) * 5.0F;
         $$1++;
      }

      this.c.f = $$0.U * (float) (Math.PI / 180.0);
      this.c.e = $$0.V * (float) (Math.PI / 180.0);
   }
}

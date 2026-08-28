import java.util.Arrays;

public class gbe extends gby<gzh> {
   private final gfa[] a;
   private final gfa b;

   public gbe(gfa $$0) {
      super($$0);
      this.b = $$0.b("head");
      this.a = new gfa[12];
      Arrays.setAll(this.a, $$1 -> $$0.b(a($$1)));
   }

   private static String a(int $$0) {
      return "part" + $$0;
   }

   public static gfg a() {
      gfi $$0 = new gfi();
      gfk $$1 = $$0.a();
      $$1.a("head", gff.c().a(0, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), gfc.a);
      float $$2 = 0.0F;
      gff $$3 = gff.c().a(0, 16).a(0.0F, 0.0F, 0.0F, 2.0F, 8.0F, 2.0F);

      for (int $$4 = 0; $$4 < 4; $$4++) {
         float $$5 = ayy.b($$2) * 9.0F;
         float $$6 = -2.0F + ayy.b((float)($$4 * 2) * 0.25F);
         float $$7 = ayy.a($$2) * 9.0F;
         $$1.a(a($$4), $$3, gfc.a($$5, $$6, $$7));
         $$2++;
      }

      $$2 = (float) (Math.PI / 4);

      for (int $$8 = 4; $$8 < 8; $$8++) {
         float $$9 = ayy.b($$2) * 7.0F;
         float $$10 = 2.0F + ayy.b((float)($$8 * 2) * 0.25F);
         float $$11 = ayy.a($$2) * 7.0F;
         $$1.a(a($$8), $$3, gfc.a($$9, $$10, $$11));
         $$2++;
      }

      $$2 = 0.47123894F;

      for (int $$12 = 8; $$12 < 12; $$12++) {
         float $$13 = ayy.b($$2) * 5.0F;
         float $$14 = 11.0F + ayy.b((float)$$12 * 1.5F * 0.5F);
         float $$15 = ayy.a($$2) * 5.0F;
         $$1.a(a($$12), $$3, gfc.a($$13, $$14, $$15));
         $$2++;
      }

      return gfg.a($$0, 64, 32);
   }

   public void a(gzh $$0) {
      super.a($$0);
      float $$1 = $$0.u * (float) Math.PI * -0.1F;

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.a[$$2].c = -2.0F + ayy.b(((float)($$2 * 2) + $$0.u) * 0.25F);
         this.a[$$2].b = ayy.b($$1) * 9.0F;
         this.a[$$2].d = ayy.a($$1) * 9.0F;
         $$1++;
      }

      $$1 = (float) (Math.PI / 4) + $$0.u * (float) Math.PI * 0.03F;

      for (int $$3 = 4; $$3 < 8; $$3++) {
         this.a[$$3].c = 2.0F + ayy.b(((float)($$3 * 2) + $$0.u) * 0.25F);
         this.a[$$3].b = ayy.b($$1) * 7.0F;
         this.a[$$3].d = ayy.a($$1) * 7.0F;
         $$1++;
      }

      $$1 = 0.47123894F + $$0.u * (float) Math.PI * -0.05F;

      for (int $$4 = 8; $$4 < 12; $$4++) {
         this.a[$$4].c = 11.0F + ayy.b(((float)$$4 * 1.5F + $$0.u) * 0.5F);
         this.a[$$4].b = ayy.b($$1) * 5.0F;
         this.a[$$4].d = ayy.a($$1) * 5.0F;
         $$1++;
      }

      this.b.f = $$0.aa * (float) (Math.PI / 180.0);
      this.b.e = $$0.ab * (float) (Math.PI / 180.0);
   }
}

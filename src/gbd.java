import java.util.Arrays;

public class gbd extends fza<gxb> {
   public static final gcl a = gcl.scaling(0.5F);
   private final gcc[] b = new gcc[8];

   public gbd(gcc $$0) {
      super($$0);
      Arrays.setAll(this.b, $$1 -> $$0.b(a($$1)));
   }

   private static String a(int $$0) {
      return "tentacle" + $$0;
   }

   public static gci a() {
      gck $$0 = new gck();
      gcm $$1 = $$0.a();
      gcg $$2 = new gcg(0.02F);
      int $$3 = -16;
      $$1.a("body", gch.c().a(0, 0).a(-6.0F, -8.0F, -6.0F, 12.0F, 16.0F, 12.0F, $$2), gce.a(0.0F, 8.0F, 0.0F));
      int $$4 = 8;
      gch $$5 = gch.c().a(48, 0).a(-1.0F, 0.0F, -1.0F, 2.0F, 18.0F, 2.0F);

      for (int $$6 = 0; $$6 < 8; $$6++) {
         double $$7 = (double)$$6 * Math.PI * 2.0 / 8.0;
         float $$8 = (float)Math.cos($$7) * 5.0F;
         float $$9 = 15.0F;
         float $$10 = (float)Math.sin($$7) * 5.0F;
         $$7 = (double)$$6 * Math.PI * -2.0 / 8.0 + (Math.PI / 2);
         float $$11 = (float)$$7;
         $$1.a(a($$6), $$5, gce.a($$8, 15.0F, $$10, 0.0F, $$11, 0.0F));
      }

      return gci.a($$0, 64, 32);
   }

   public void a(gxb $$0) {
      super.a($$0);

      for (gcc $$1 : this.b) {
         $$1.e = $$0.a;
      }
   }
}

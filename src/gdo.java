import java.util.Arrays;

public class gdo extends gbl<gzs> {
   public static final gew a = gew.scaling(0.5F);
   private final gen[] b = new gen[8];

   public gdo(gen $$0) {
      super($$0);
      Arrays.setAll(this.b, $$1 -> $$0.b(a($$1)));
   }

   private static String a(int $$0) {
      return "tentacle" + $$0;
   }

   public static get a() {
      gev $$0 = new gev();
      gex $$1 = $$0.a();
      ger $$2 = new ger(0.02F);
      int $$3 = -16;
      $$1.a("body", ges.c().a(0, 0).a(-6.0F, -8.0F, -6.0F, 12.0F, 16.0F, 12.0F, $$2), gep.a(0.0F, 8.0F, 0.0F));
      int $$4 = 8;
      ges $$5 = ges.c().a(48, 0).a(-1.0F, 0.0F, -1.0F, 2.0F, 18.0F, 2.0F);

      for (int $$6 = 0; $$6 < 8; $$6++) {
         double $$7 = (double)$$6 * Math.PI * 2.0 / 8.0;
         float $$8 = (float)Math.cos($$7) * 5.0F;
         float $$9 = 15.0F;
         float $$10 = (float)Math.sin($$7) * 5.0F;
         $$7 = (double)$$6 * Math.PI * -2.0 / 8.0 + (Math.PI / 2);
         float $$11 = (float)$$7;
         $$1.a(a($$6), $$5, gep.a($$8, 15.0F, $$10, 0.0F, $$11, 0.0F));
      }

      return get.a($$0, 64, 32);
   }

   public void a(gzs $$0) {
      super.a($$0);

      for (gen $$1 : this.b) {
         $$1.e = $$0.a;
      }
   }
}

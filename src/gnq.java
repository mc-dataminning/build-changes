public class gnq<T extends bto> extends gni<T, fve<T>> {
   public static final ale a = new ale("textures/entity/trident_riptide.png");
   public static final String b = "box";
   private final fwz c;

   public gnq(gks<T, fve<T>> $$0, fwv $$1) {
      super($$0);
      fwz $$2 = $$1.a(fwy.aZ);
      this.c = $$2.b("box");
   }

   public static fxf a() {
      fxh $$0 = new fxh();
      fxi $$1 = $$0.a();
      $$1.a("box", fxe.c().a(0, 0).a(-8.0F, -16.0F, -8.0F, 16.0F, 32.0F, 16.0F), fxb.a);
      return fxf.a($$0, 64, 64);
   }

   public void a(ezx $$0, gdn $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.fr()) {
         fab $$10 = $$1.getBuffer(gdv.e(a));

         for (int $$11 = 0; $$11 < 3; $$11++) {
            $$0.a();
            float $$12 = $$7 * (float)(-(45 + $$11 * 5));
            $$0.a(a.d.rotationDegrees($$12));
            float $$13 = 0.75F * (float)$$11;
            $$0.b($$13, $$13, $$13);
            $$0.a(0.0F, -0.2F + 0.6F * (float)$$11, 0.0F);
            this.c.a($$0, $$10, $$2, gop.d);
            $$0.b();
         }
      }
   }
}

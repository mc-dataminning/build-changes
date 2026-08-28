public class gnp<T extends btn> extends gnh<T, fvd<T>> {
   public static final ale a = new ale("textures/entity/trident_riptide.png");
   public static final String b = "box";
   private final fwy c;

   public gnp(gkr<T, fvd<T>> $$0, fwu $$1) {
      super($$0);
      fwy $$2 = $$1.a(fwx.aZ);
      this.c = $$2.b("box");
   }

   public static fxe a() {
      fxg $$0 = new fxg();
      fxh $$1 = $$0.a();
      $$1.a("box", fxd.c().a(0, 0).a(-8.0F, -16.0F, -8.0F, 16.0F, 32.0F, 16.0F), fxa.a);
      return fxe.a($$0, 64, 64);
   }

   public void a(ezw $$0, gdm $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.fr()) {
         faa $$10 = $$1.getBuffer(gdu.e(a));

         for (int $$11 = 0; $$11 < 3; $$11++) {
            $$0.a();
            float $$12 = $$7 * (float)(-(45 + $$11 * 5));
            $$0.a(a.d.rotationDegrees($$12));
            float $$13 = 0.75F * (float)$$11;
            $$0.b($$13, $$13, $$13);
            $$0.a(0.0F, -0.2F + 0.6F * (float)$$11, 0.0F);
            this.c.a($$0, $$10, $$2, goo.d);
            $$0.b();
         }
      }
   }
}

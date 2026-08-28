public class goa<T extends bsy> extends gns<T, fvn<T>> {
   public static final akk a = new akk("textures/entity/trident_riptide.png");
   public static final String b = "box";
   private final fxi c;

   public goa(glc<T, fvn<T>> $$0, fxe $$1) {
      super($$0);
      fxi $$2 = $$1.a(fxh.aZ);
      this.c = $$2.b("box");
   }

   public static fxo a() {
      fxq $$0 = new fxq();
      fxr $$1 = $$0.a();
      $$1.a("box", fxn.c().a(0, 0).a(-8.0F, -16.0F, -8.0F, 16.0F, 32.0F, 16.0F), fxk.a);
      return fxo.a($$0, 64, 64);
   }

   public void a(fag $$0, gdx $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.fn()) {
         fak $$10 = $$1.getBuffer(gef.e(a));

         for (int $$11 = 0; $$11 < 3; $$11++) {
            $$0.a();
            float $$12 = $$7 * (float)(-(45 + $$11 * 5));
            $$0.a(a.d.rotationDegrees($$12));
            float $$13 = 0.75F * (float)$$11;
            $$0.b($$13, $$13, $$13);
            $$0.a(0.0F, -0.2F + 0.6F * (float)$$11, 0.0F);
            this.c.a($$0, $$10, $$2, goz.d);
            $$0.b();
         }
      }
   }
}

public class fxw<T extends bjg> extends fxp<T, fgi<T>> {
   public static final aew a = new aew("textures/entity/trident_riptide.png");
   public static final String b = "box";
   private final fic c;

   public fxw(fvc<T, fgi<T>> $$0, fhy $$1) {
      super($$0);
      fic $$2 = $$1.a(fib.aT);
      this.c = $$2.b("box");
   }

   public static fii a() {
      fik $$0 = new fik();
      fil $$1 = $$0.a();
      $$1.a("box", fih.c().a(0, 0).a(-8.0F, -16.0F, -8.0F, 16.0F, 32.0F, 16.0F), fie.a);
      return fii.a($$0, 64, 64);
   }

   public void a(elp $$0, foe $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.fi()) {
         elt $$10 = $$1.getBuffer(fom.e(a));

         for (int $$11 = 0; $$11 < 3; $$11++) {
            $$0.a();
            float $$12 = $$7 * (float)(-(45 + $$11 * 5));
            $$0.a(a.d.rotationDegrees($$12));
            float $$13 = 0.75F * (float)$$11;
            $$0.b($$13, $$13, $$13);
            $$0.a(0.0F, -0.2F + 0.6F * (float)$$11, 0.0F);
            this.c.a($$0, $$10, $$2, fyv.d);
            $$0.b();
         }
      }
   }
}

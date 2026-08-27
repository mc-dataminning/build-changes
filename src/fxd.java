public class fxd<T extends biy> extends fww<T, fft<T>> {
   public static final aer a = new aer("textures/entity/trident_riptide.png");
   public static final String b = "box";
   private final fhn c;

   public fxd(fuj<T, fft<T>> $$0, fhj $$1) {
      super($$0);
      fhn $$2 = $$1.a(fhm.aT);
      this.c = $$2.b("box");
   }

   public static fht a() {
      fhv $$0 = new fhv();
      fhw $$1 = $$0.a();
      $$1.a("box", fhs.c().a(0, 0).a(-8.0F, -16.0F, -8.0F, 16.0F, 32.0F, 16.0F), fhp.a);
      return fht.a($$0, 64, 64);
   }

   public void a(elg $$0, fnl $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.fh()) {
         elk $$10 = $$1.getBuffer(fnt.e(a));

         for (int $$11 = 0; $$11 < 3; $$11++) {
            $$0.a();
            float $$12 = $$7 * (float)(-(45 + $$11 * 5));
            $$0.a(a.d.rotationDegrees($$12));
            float $$13 = 0.75F * (float)$$11;
            $$0.b($$13, $$13, $$13);
            $$0.a(0.0F, -0.2F + 0.6F * (float)$$11, 0.0F);
            this.c.a($$0, $$10, $$2, fyc.d);
            $$0.b();
         }
      }
   }
}

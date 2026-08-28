public class gnm<T extends btk> extends gne<T, fva<T>> {
   public static final alb a = new alb("textures/entity/trident_riptide.png");
   public static final String b = "box";
   private final fwv c;

   public gnm(gko<T, fva<T>> $$0, fwr $$1) {
      super($$0);
      fwv $$2 = $$1.a(fwu.aZ);
      this.c = $$2.b("box");
   }

   public static fxb a() {
      fxd $$0 = new fxd();
      fxe $$1 = $$0.a();
      $$1.a("box", fxa.c().a(0, 0).a(-8.0F, -16.0F, -8.0F, 16.0F, 32.0F, 16.0F), fwx.a);
      return fxb.a($$0, 64, 64);
   }

   public void a(ezt $$0, gdj $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.fr()) {
         ezx $$10 = $$1.getBuffer(gdr.e(a));

         for (int $$11 = 0; $$11 < 3; $$11++) {
            $$0.a();
            float $$12 = $$7 * (float)(-(45 + $$11 * 5));
            $$0.a(a.d.rotationDegrees($$12));
            float $$13 = 0.75F * (float)$$11;
            $$0.b($$13, $$13, $$13);
            $$0.a(0.0F, -0.2F + 0.6F * (float)$$11, 0.0F);
            this.c.a($$0, $$10, $$2, gol.d);
            $$0.b();
         }
      }
   }
}

public class gam<T extends blg> extends gaf<T, fiu<T>> {
   public static final agi a = new agi("textures/entity/trident_riptide.png");
   public static final String b = "box";
   private final fko c;

   public gam(fxs<T, fiu<T>> $$0, fkk $$1) {
      super($$0);
      fko $$2 = $$1.a(fkn.aT);
      this.c = $$2.b("box");
   }

   public static fku a() {
      fkw $$0 = new fkw();
      fkx $$1 = $$0.a();
      $$1.a("box", fkt.c().a(0, 0).a(-8.0F, -16.0F, -8.0F, 16.0F, 32.0F, 16.0F), fkq.a);
      return fku.a($$0, 64, 64);
   }

   public void a(enw $$0, fqu $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.fk()) {
         eoa $$10 = $$1.getBuffer(frc.e(a));

         for (int $$11 = 0; $$11 < 3; $$11++) {
            $$0.a();
            float $$12 = $$7 * (float)(-(45 + $$11 * 5));
            $$0.a(a.d.rotationDegrees($$12));
            float $$13 = 0.75F * (float)$$11;
            $$0.b($$13, $$13, $$13);
            $$0.a(0.0F, -0.2F + 0.6F * (float)$$11, 0.0F);
            this.c.a($$0, $$10, $$2, gbl.d);
            $$0.b();
         }
      }
   }
}

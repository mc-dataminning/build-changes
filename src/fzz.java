public class fzz<T extends bky> extends fzs<T, fih<T>> {
   public static final agg a = new agg("textures/entity/trident_riptide.png");
   public static final String b = "box";
   private final fkb c;

   public fzz(fxf<T, fih<T>> $$0, fjx $$1) {
      super($$0);
      fkb $$2 = $$1.a(fka.aT);
      this.c = $$2.b("box");
   }

   public static fkh a() {
      fkj $$0 = new fkj();
      fkk $$1 = $$0.a();
      $$1.a("box", fkg.c().a(0, 0).a(-8.0F, -16.0F, -8.0F, 16.0F, 32.0F, 16.0F), fkd.a);
      return fkh.a($$0, 64, 64);
   }

   public void a(enk $$0, fqh $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.fj()) {
         eno $$10 = $$1.getBuffer(fqp.e(a));

         for (int $$11 = 0; $$11 < 3; $$11++) {
            $$0.a();
            float $$12 = $$7 * (float)(-(45 + $$11 * 5));
            $$0.a(a.d.rotationDegrees($$12));
            float $$13 = 0.75F * (float)$$11;
            $$0.b($$13, $$13, $$13);
            $$0.a(0.0F, -0.2F + 0.6F * (float)$$11, 0.0F);
            this.c.a($$0, $$10, $$2, gay.d);
            $$0.b();
         }
      }
   }
}

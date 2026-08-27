public class ghq<T extends bpo> extends ghj<T, fpi<T>> {
   public static final ajh a = new ajh("textures/entity/trident_riptide.png");
   public static final String b = "box";
   private final frd c;

   public ghq(get<T, fpi<T>> $$0, fqz $$1) {
      super($$0);
      frd $$2 = $$1.a(frc.aV);
      this.c = $$2.b("box");
   }

   public static frj a() {
      frl $$0 = new frl();
      frm $$1 = $$0.a();
      $$1.a("box", fri.c().a(0, 0).a(-8.0F, -16.0F, -8.0F, 16.0F, 32.0F, 16.0F), frf.a);
      return frj.a($$0, 64, 64);
   }

   public void a(etz $$0, fxq $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.fo()) {
         eud $$10 = $$1.getBuffer(fxy.e(a));

         for (int $$11 = 0; $$11 < 3; $$11++) {
            $$0.a();
            float $$12 = $$7 * (float)(-(45 + $$11 * 5));
            $$0.a(a.d.rotationDegrees($$12));
            float $$13 = 0.75F * (float)$$11;
            $$0.b($$13, $$13, $$13);
            $$0.a(0.0F, -0.2F + 0.6F * (float)$$11, 0.0F);
            this.c.a($$0, $$10, $$2, giq.d);
            $$0.b();
         }
      }
   }
}

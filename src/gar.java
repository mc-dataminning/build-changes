public class gar<T extends bll> extends gak<T, fiz<T>> {
   public static final agm a = new agm("textures/entity/trident_riptide.png");
   public static final String b = "box";
   private final fkt c;

   public gar(fxx<T, fiz<T>> $$0, fkp $$1) {
      super($$0);
      fkt $$2 = $$1.a(fks.aT);
      this.c = $$2.b("box");
   }

   public static fkz a() {
      flb $$0 = new flb();
      flc $$1 = $$0.a();
      $$1.a("box", fky.c().a(0, 0).a(-8.0F, -16.0F, -8.0F, 16.0F, 32.0F, 16.0F), fkv.a);
      return fkz.a($$0, 64, 64);
   }

   public void a(eob $$0, fqz $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.fk()) {
         eof $$10 = $$1.getBuffer(frh.e(a));

         for (int $$11 = 0; $$11 < 3; $$11++) {
            $$0.a();
            float $$12 = $$7 * (float)(-(45 + $$11 * 5));
            $$0.a(a.d.rotationDegrees($$12));
            float $$13 = 0.75F * (float)$$11;
            $$0.b($$13, $$13, $$13);
            $$0.a(0.0F, -0.2F + 0.6F * (float)$$11, 0.0F);
            this.c.a($$0, $$10, $$2, gbq.d);
            $$0.b();
         }
      }
   }
}

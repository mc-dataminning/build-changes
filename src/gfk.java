public class gfk<T extends bog> extends gfd<T, fng<T>> {
   public static final aiy a = new aiy("textures/entity/trident_riptide.png");
   public static final String b = "box";
   private final fpc c;

   public gfk(gcn<T, fng<T>> $$0, foy $$1) {
      super($$0);
      fpc $$2 = $$1.a(fpb.aV);
      this.c = $$2.b("box");
   }

   public static fpi a() {
      fpk $$0 = new fpk();
      fpl $$1 = $$0.a();
      $$1.a("box", fph.c().a(0, 0).a(-8.0F, -16.0F, -8.0F, 16.0F, 32.0F, 16.0F), fpe.a);
      return fpi.a($$0, 64, 64);
   }

   public void a(esa $$0, fvl $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.fj()) {
         ese $$10 = $$1.getBuffer(fvt.e(a));

         for (int $$11 = 0; $$11 < 3; $$11++) {
            $$0.a();
            float $$12 = $$7 * (float)(-(45 + $$11 * 5));
            $$0.a(a.d.rotationDegrees($$12));
            float $$13 = 0.75F * (float)$$11;
            $$0.b($$13, $$13, $$13);
            $$0.a(0.0F, -0.2F + 0.6F * (float)$$11, 0.0F);
            this.c.a($$0, $$10, $$2, ggk.d);
            $$0.b();
         }
      }
   }
}

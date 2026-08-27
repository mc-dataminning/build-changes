public class fxm<T extends biy> extends fxf<T, ffy<T>> {
   public static final aer a = new aer("textures/entity/trident_riptide.png");
   public static final String b = "box";
   private final fhs c;

   public fxm(fus<T, ffy<T>> $$0, fho $$1) {
      super($$0);
      fhs $$2 = $$1.a(fhr.aT);
      this.c = $$2.b("box");
   }

   public static fhy a() {
      fia $$0 = new fia();
      fib $$1 = $$0.a();
      $$1.a("box", fhx.c().a(0, 0).a(-8.0F, -16.0F, -8.0F, 16.0F, 32.0F, 16.0F), fhu.a);
      return fhy.a($$0, 64, 64);
   }

   public void a(elf $$0, fnu $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.fh()) {
         elj $$10 = $$1.getBuffer(foc.e(a));

         for (int $$11 = 0; $$11 < 3; $$11++) {
            $$0.a();
            float $$12 = $$7 * (float)(-(45 + $$11 * 5));
            $$0.a(a.d.rotationDegrees($$12));
            float $$13 = 0.75F * (float)$$11;
            $$0.b($$13, $$13, $$13);
            $$0.a(0.0F, -0.2F + 0.6F * (float)$$11, 0.0F);
            this.c.a($$0, $$10, $$2, fyl.d);
            $$0.b();
         }
      }
   }
}

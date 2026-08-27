public class fwy<T extends biw> extends fwr<T, ffp<T>> {
   public static final aep a = new aep("textures/entity/trident_riptide.png");
   public static final String b = "box";
   private final fhj c;

   public fwy(fue<T, ffp<T>> $$0, fhf $$1) {
      super($$0);
      fhj $$2 = $$1.a(fhi.aT);
      this.c = $$2.b("box");
   }

   public static fhp a() {
      fhr $$0 = new fhr();
      fhs $$1 = $$0.a();
      $$1.a("box", fho.c().a(0, 0).a(-8.0F, -16.0F, -8.0F, 16.0F, 32.0F, 16.0F), fhl.a);
      return fhp.a($$0, 64, 64);
   }

   public void a(elh $$0, fng $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.fh()) {
         ell $$10 = $$1.getBuffer(fno.d(a));

         for (int $$11 = 0; $$11 < 3; $$11++) {
            $$0.a();
            float $$12 = $$7 * (float)(-(45 + $$11 * 5));
            $$0.a(a.d.rotationDegrees($$12));
            float $$13 = 0.75F * (float)$$11;
            $$0.b($$13, $$13, $$13);
            $$0.a(0.0F, -0.2F + 0.6F * (float)$$11, 0.0F);
            this.c.a($$0, $$10, $$2, fxx.d);
            $$0.b();
         }
      }
   }
}

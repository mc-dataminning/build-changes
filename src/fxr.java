public class fxr<T extends bjb> extends fxk<T, fgd<T>> {
   public static final aeu a = new aeu("textures/entity/trident_riptide.png");
   public static final String b = "box";
   private final fhx c;

   public fxr(fux<T, fgd<T>> $$0, fht $$1) {
      super($$0);
      fhx $$2 = $$1.a(fhw.aT);
      this.c = $$2.b("box");
   }

   public static fid a() {
      fif $$0 = new fif();
      fig $$1 = $$0.a();
      $$1.a("box", fic.c().a(0, 0).a(-8.0F, -16.0F, -8.0F, 16.0F, 32.0F, 16.0F), fhz.a);
      return fid.a($$0, 64, 64);
   }

   public void a(elk $$0, fnz $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.fh()) {
         elo $$10 = $$1.getBuffer(foh.e(a));

         for (int $$11 = 0; $$11 < 3; $$11++) {
            $$0.a();
            float $$12 = $$7 * (float)(-(45 + $$11 * 5));
            $$0.a(a.d.rotationDegrees($$12));
            float $$13 = 0.75F * (float)$$11;
            $$0.b($$13, $$13, $$13);
            $$0.a(0.0F, -0.2F + 0.6F * (float)$$11, 0.0F);
            this.c.a($$0, $$10, $$2, fyq.d);
            $$0.b();
         }
      }
   }
}

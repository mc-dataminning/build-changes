public class fxy<T extends bji> extends fxr<T, fgk<T>> {
   public static final aey a = new aey("textures/entity/trident_riptide.png");
   public static final String b = "box";
   private final fie c;

   public fxy(fve<T, fgk<T>> $$0, fia $$1) {
      super($$0);
      fie $$2 = $$1.a(fid.aT);
      this.c = $$2.b("box");
   }

   public static fik a() {
      fim $$0 = new fim();
      fin $$1 = $$0.a();
      $$1.a("box", fij.c().a(0, 0).a(-8.0F, -16.0F, -8.0F, 16.0F, 32.0F, 16.0F), fig.a);
      return fik.a($$0, 64, 64);
   }

   public void a(elr $$0, fog $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.fi()) {
         elv $$10 = $$1.getBuffer(foo.e(a));

         for (int $$11 = 0; $$11 < 3; $$11++) {
            $$0.a();
            float $$12 = $$7 * (float)(-(45 + $$11 * 5));
            $$0.a(a.d.rotationDegrees($$12));
            float $$13 = 0.75F * (float)$$11;
            $$0.b($$13, $$13, $$13);
            $$0.a(0.0F, -0.2F + 0.6F * (float)$$11, 0.0F);
            this.c.a($$0, $$10, $$2, fyx.d);
            $$0.b();
         }
      }
   }
}

public class gnt<T extends btr> extends gnl<T, fvh<T>> {
   public static final alf a = new alf("textures/entity/trident_riptide.png");
   public static final String b = "box";
   private final fxc c;

   public gnt(gkv<T, fvh<T>> $$0, fwy $$1) {
      super($$0);
      fxc $$2 = $$1.a(fxb.aZ);
      this.c = $$2.b("box");
   }

   public static fxi a() {
      fxk $$0 = new fxk();
      fxl $$1 = $$0.a();
      $$1.a("box", fxh.c().a(0, 0).a(-8.0F, -16.0F, -8.0F, 16.0F, 32.0F, 16.0F), fxe.a);
      return fxi.a($$0, 64, 64);
   }

   public void a(faa $$0, gdq $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.fr()) {
         fae $$10 = $$1.getBuffer(gdy.e(a));

         for (int $$11 = 0; $$11 < 3; $$11++) {
            $$0.a();
            float $$12 = $$7 * (float)(-(45 + $$11 * 5));
            $$0.a(a.d.rotationDegrees($$12));
            float $$13 = 0.75F * (float)$$11;
            $$0.b($$13, $$13, $$13);
            $$0.a(0.0F, -0.2F + 0.6F * (float)$$11, 0.0F);
            this.c.a($$0, $$10, $$2, gos.d);
            $$0.b();
         }
      }
   }
}

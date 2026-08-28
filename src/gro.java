public class gro extends gsm<gtt, fxm> {
   private static final alh a = alh.b("textures/entity/cat/cat_collar.png");
   private final fxm b;
   private final fxm c;

   public gro(gpv<gtt, fxm> $$0, gax $$1) {
      super($$0);
      this.b = new fxm($$1.a(gba.F));
      this.c = new fxm($$1.a(gba.G));
   }

   public void a(fdt $$0, ghw $$1, int $$2, gtt $$3, float $$4, float $$5) {
      cuu $$6 = $$3.c;
      if ($$6 != null) {
         int $$7 = $$6.d();
         fxm $$8 = $$3.ae ? this.c : this.b;
         a($$8, a, $$0, $$1, $$2, $$3, $$7);
      }
   }
}

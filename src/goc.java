public class goc<T extends clw> extends gos<T, guf> {
   private static final alh a = alh.b("textures/entity/illager/evoker.png");

   public goc(gnz.a $$0) {
      super($$0, new fyn<>($$0.a(gba.ax)), 0.5F);
      this.a(new gsf<guf, fyn<guf>>(this, $$0.b()) {
         public void a(fdt $$0, ghw $$1, int $$2, guf $$3, float $$4, float $$5) {
            if ($$3.a) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
   }

   public alh a(guf $$0) {
      return a;
   }

   public guf c() {
      return new guf();
   }

   public void a(T $$0, guf $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gF();
   }
}

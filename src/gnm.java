public class gnm<T extends clk> extends goc<T, gto> {
   private static final alc a = alc.b("textures/entity/illager/evoker.png");

   public gnm(gnj.a $$0) {
      super($$0, new fxy<>($$0.a(gak.ax)), 0.5F);
      this.a(new grp<gto, fxy<gto>>(this, $$0.b()) {
         public void a(fde $$0, ghg $$1, int $$2, gto $$3, float $$4, float $$5) {
            if ($$3.a) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
   }

   public alc a(gto $$0) {
      return a;
   }

   public gto c() {
      return new gto();
   }

   public void a(T $$0, gto $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gz();
   }
}

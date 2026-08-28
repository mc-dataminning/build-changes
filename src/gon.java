public class gon<T extends cmb> extends gpd<T, guq> {
   private static final ali a = ali.b("textures/entity/illager/evoker.png");

   public gon(gok.a $$0) {
      super($$0, new fyy<>($$0.a(gbl.ax)), 0.5F);
      this.a(new gsq<guq, fyy<guq>>(this, $$0.b()) {
         public void a(feb $$0, gih $$1, int $$2, guq $$3, float $$4, float $$5) {
            if ($$3.a) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
   }

   public ali a(guq $$0) {
      return a;
   }

   public guq c() {
      return new guq();
   }

   public void a(T $$0, guq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gE();
   }
}

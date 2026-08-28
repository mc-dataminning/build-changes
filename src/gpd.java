public class gpd<T extends cmf> extends gpt<T, gvg> {
   private static final all a = all.b("textures/entity/illager/evoker.png");

   public gpd(gpa.a $$0) {
      super($$0, new fzo<>($$0.a(gcb.ax)), 0.5F);
      this.a(new gtg<gvg, fzo<gvg>>(this, $$0.b()) {
         public void a(fek $$0, gix $$1, int $$2, gvg $$3, float $$4, float $$5) {
            if ($$3.a) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
   }

   public all a(gvg $$0) {
      return a;
   }

   public gvg c() {
      return new gvg();
   }

   public void a(T $$0, gvg $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gF();
   }
}

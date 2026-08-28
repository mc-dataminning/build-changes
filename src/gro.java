public class gro<T extends cmy> extends gse<T, gxt> {
   private static final alp a = alp.b("textures/entity/illager/evoker.png");

   public gro(grl.a $$0) {
      super($$0, new gbv<>($$0.a(gei.aL)), 0.5F);
      this.a(new gvs<gxt, gbv<gxt>>(this, $$0.b()) {
         public void a(fgl $$0, glg $$1, int $$2, gxt $$3, float $$4, float $$5) {
            if ($$3.a) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
   }

   public alp a(gxt $$0) {
      return a;
   }

   public gxt b() {
      return new gxt();
   }

   public void a(T $$0, gxt $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gx();
   }
}

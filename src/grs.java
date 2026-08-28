public class grs<T extends cng> extends gsi<T, gxx> {
   private static final alz a = alz.b("textures/entity/illager/evoker.png");

   public grs(grp.a $$0) {
      super($$0, new gbz<>($$0.a(gem.aI)), 0.5F);
      this.a(new gvw<gxx, gbz<gxx>>(this, $$0.b()) {
         public void a(fgr $$0, glk $$1, int $$2, gxx $$3, float $$4, float $$5) {
            if ($$3.a) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
   }

   public alz a(gxx $$0) {
      return a;
   }

   public gxx b() {
      return new gxx();
   }

   public void a(T $$0, gxx $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gx();
   }
}

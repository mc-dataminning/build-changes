public class grm<T extends cnc> extends gsc<T, gxr> {
   private static final alz a = alz.b("textures/entity/illager/evoker.png");

   public grm(grj.a $$0) {
      super($$0, new gbt<>($$0.a(geg.aI)), 0.5F);
      this.a(new gvq<gxr, gbt<gxr>>(this, $$0.b()) {
         public void a(fgl $$0, gle $$1, int $$2, gxr $$3, float $$4, float $$5) {
            if ($$3.a) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
   }

   public alz a(gxr $$0) {
      return a;
   }

   public gxr b() {
      return new gxr();
   }

   public void a(T $$0, gxr $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gv();
   }
}

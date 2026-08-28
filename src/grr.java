public class grr<T extends cng> extends gsh<T, gxw> {
   private static final alz a = alz.b("textures/entity/illager/evoker.png");

   public grr(gro.a $$0) {
      super($$0, new gby<>($$0.a(gel.aI)), 0.5F);
      this.a(new gvv<gxw, gby<gxw>>(this, $$0.b()) {
         public void a(fgq $$0, glj $$1, int $$2, gxw $$3, float $$4, float $$5) {
            if ($$3.a) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
   }

   public alz a(gxw $$0) {
      return a;
   }

   public gxw b() {
      return new gxw();
   }

   public void a(T $$0, gxw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gv();
   }
}

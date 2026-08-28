public class gqf extends goc<clp, guc> {
   private static final alc a = alc.b("textures/entity/illager/vindicator.png");

   public gqf(gnj.a $$0) {
      super($$0, new fxy<>($$0.a(gak.cU)), 0.5F);
      this.a(new grp<guc, fxy<guc>>(this, $$0.b()) {
         public void a(fde $$0, ghg $$1, int $$2, guc $$3, float $$4, float $$5) {
            if ($$3.c) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
   }

   public alc a(guc $$0) {
      return a;
   }

   public guc c() {
      return new guc();
   }
}

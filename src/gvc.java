public class gvc extends gsy<cmo, gzd> {
   private static final akv a = akv.b("textures/entity/illager/vindicator.png");

   public gvc(gsf.a $$0) {
      super($$0, new gcq<>($$0.a(gfd.dv)), 0.5F);
      this.a(new gwm<gzd, gcq<gzd>>(this) {
         public void a(ffv $$0, glz $$1, int $$2, gzd $$3, float $$4, float $$5) {
            if ($$3.c) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
   }

   public akv a(gzd $$0) {
      return a;
   }

   public gzd b() {
      return new gzd();
   }
}

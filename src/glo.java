public class glo extends gjl<ckn> {
   private static final alb a = new alb("textures/entity/illager/vindicator.png");

   public glo(gis.a $$0) {
      super($$0, new fuj<>($$0.a(fwu.bQ)), 0.5F);
      this.a(new gmx<ckn, fuj<ckn>>(this, $$0.d()) {
         public void a(ezt $$0, gdj $$1, int $$2, ckn $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gi()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
   }

   public alb a(ckn $$0) {
      return a;
   }
}

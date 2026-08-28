public class giv<T extends cki> extends gjl<T> {
   private static final alb a = new alb("textures/entity/illager/evoker.png");

   public giv(gis.a $$0) {
      super($$0, new fuj<>($$0.a(fwu.ab)), 0.5F);
      this.a(new gmx<T, fuj<T>>(this, $$0.d()) {
         public void a(ezt $$0, gdj $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gA()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
   }

   public alb a(T $$0) {
      return a;
   }
}

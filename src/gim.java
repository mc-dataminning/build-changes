public class gim extends ggk<chv> {
   private static final ajv a = new ajv("textures/entity/illager/vindicator.png");

   public gim(gfr.a $$0) {
      super($$0, new frj<>($$0.a(ftu.bQ)), 0.5F);
      this.a(new gjv<chv, frj<chv>>(this, $$0.d()) {
         public void a(ewr $$0, gai $$1, int $$2, chv $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gf()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
   }

   public ajv a(chv $$0) {
      return a;
   }
}

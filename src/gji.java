public class gji extends gks<cjg, fum<cjg>> {
   private static final akk a = new akk("textures/entity/enderman/enderman.png");
   private final ayo i = ayo.a();

   public gji(gjm.a $$0) {
      super($$0, new fum<>($$0.a(fxn.X)), 0.5F);
      this.a(new gni<>(this));
      this.a(new gmz(this, $$0.c()));
   }

   public void a(cjg $$0, float $$1, float $$2, fam $$3, ged $$4, int $$5) {
      dsk $$6 = $$0.go();
      fum<cjg> $$7 = this.a();
      $$7.a = $$6 != null;
      $$7.b = $$0.gp();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ewf a(cjg $$0, float $$1) {
      if ($$0.gp()) {
         double $$2 = 0.02 * (double)$$0.ec();
         return new ewf(this.i.k() * $$2, 0.0, this.i.k() * $$2);
      } else {
         return super.a($$0, $$1);
      }
   }

   public akk a(cjg $$0) {
      return a;
   }
}

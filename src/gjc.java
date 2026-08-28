public class gjc extends gkm<cjd, fug<cjd>> {
   private static final akk a = new akk("textures/entity/enderman/enderman.png");
   private final aym i = aym.a();

   public gjc(gjg.a $$0) {
      super($$0, new fug<>($$0.a(fxh.X)), 0.5F);
      this.a(new gnc<>(this));
      this.a(new gmt(this, $$0.c()));
   }

   public void a(cjd $$0, float $$1, float $$2, fag $$3, gdx $$4, int $$5) {
      dsh $$6 = $$0.gn();
      fug<cjd> $$7 = this.a();
      $$7.a = $$6 != null;
      $$7.b = $$0.go();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public evz a(cjd $$0, float $$1) {
      if ($$0.go()) {
         double $$2 = 0.02 * (double)$$0.eb();
         return new evz(this.i.k() * $$2, 0.0, this.i.k() * $$2);
      } else {
         return super.a($$0, $$1);
      }
   }

   public akk a(cjd $$0) {
      return a;
   }
}

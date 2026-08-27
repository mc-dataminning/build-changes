public class ggj extends ght<chh, frp<chh>> {
   private static final akf a = new akf("textures/entity/enderman/enderman.png");
   private final ayd i = ayd.a();

   public ggj(ggn.a $$0) {
      super($$0, new frp<>($$0.a(fuq.X)), 0.5F);
      this.a(new gki<>(this));
      this.a(new gjz(this, $$0.c()));
   }

   public void a(chh $$0, float $$1, float $$2, exn $$3, gbe $$4, int $$5) {
      dpy $$6 = $$0.gp();
      frp<chh> $$7 = this.a();
      $$7.a = $$6 != null;
      $$7.b = $$0.gq();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public etf a(chh $$0, float $$1) {
      if ($$0.gq()) {
         double $$2 = 0.02 * (double)$$0.ec();
         return new etf(this.i.k() * $$2, 0.0, this.i.k() * $$2);
      } else {
         return super.a($$0, $$1);
      }
   }

   public akf a(chh $$0) {
      return a;
   }
}

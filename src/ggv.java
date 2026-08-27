public class ggv extends ght<cdd, frt<cdd>> {
   private static final akf a = new akf("textures/entity/fox/fox.png");
   private static final akf i = new akf("textures/entity/fox/fox_sleep.png");
   private static final akf j = new akf("textures/entity/fox/snow_fox.png");
   private static final akf k = new akf("textures/entity/fox/snow_fox_sleep.png");

   public ggv(ggn.a $$0) {
      super($$0, new frt<>($$0.a(fuq.ad)), 0.4F);
      this.a(new gkl(this, $$0.d()));
   }

   protected void a(cdd $$0, exn $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$0.gv() || $$0.gp()) {
         float $$6 = -axw.i($$4, $$0.P, $$0.dF());
         $$1.a(a.b.rotationDegrees($$6));
      }
   }

   public akf a(cdd $$0) {
      if ($$0.u() == cdd.v.a) {
         return $$0.fJ() ? i : a;
      } else {
         return $$0.fJ() ? k : j;
      }
   }
}

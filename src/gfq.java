public class gfq extends ggo<ccn, fqo<ccn>> {
   private static final ajt a = new ajt("textures/entity/fox/fox.png");
   private static final ajt i = new ajt("textures/entity/fox/fox_sleep.png");
   private static final ajt j = new ajt("textures/entity/fox/snow_fox.png");
   private static final ajt k = new ajt("textures/entity/fox/snow_fox_sleep.png");

   public gfq(gfi.a $$0) {
      super($$0, new fqo<>($$0.a(ftl.ad)), 0.4F);
      this.a(new gjg(this, $$0.d()));
   }

   protected void a(ccn $$0, ewi $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$0.gt() || $$0.gn()) {
         float $$6 = -axk.i($$4, $$0.O, $$0.dE());
         $$1.a(a.b.rotationDegrees($$6));
      }
   }

   public ajt a(ccn $$0) {
      if ($$0.u() == ccn.v.a) {
         return $$0.fI() ? i : a;
      } else {
         return $$0.fI() ? k : j;
      }
   }
}

public class haf extends gzy<hdb, ggj> {
   public static final ale a = ale.b("textures/entity/trident_riptide.png");
   private final ghg b;

   public haf(gxh<hdb, ggj> $$0, gic $$1) {
      super($$0);
      this.b = new ghg($$1.a(gif.cx));
   }

   public void a(fiq $$0, gpd $$1, int $$2, hdb $$3, float $$4, float $$5) {
      if ($$3.al) {
         fiu $$6 = $$1.getBuffer(this.b.a(a));
         this.b.a($$3);
         this.b.a($$0, $$6, $$2, hhp.d);
      }
   }
}

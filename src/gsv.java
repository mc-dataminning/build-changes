public class gsv extends gtn<gxs, fyv> {
   private static final all a = all.b("textures/entity/zombie/drowned_outer_layer.png");
   private final fyv b;
   private final fyv c;

   public gsv(gqw<gxs, fyv> $$0, gby $$1) {
      super($$0);
      this.b = new fyv($$1.a(gcb.al));
      this.c = new fyv($$1.a(gcb.ap));
   }

   public void a(fek $$0, gix $$1, int $$2, gxs $$3, float $$4, float $$5) {
      fyv $$6 = $$3.ae ? this.c : this.b;
      a($$6, a, $$0, $$1, $$2, $$3, -1);
   }
}

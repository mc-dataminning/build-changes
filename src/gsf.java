public class gsf extends gsx<gxc, fyf> {
   private static final ali a = ali.b("textures/entity/zombie/drowned_outer_layer.png");
   private final fyf b;
   private final fyf c;

   public gsf(gqg<gxc, fyf> $$0, gbi $$1) {
      super($$0);
      this.b = new fyf($$1.a(gbl.al));
      this.c = new fyf($$1.a(gbl.ap));
   }

   public void a(feb $$0, gih $$1, int $$2, gxc $$3, float $$4, float $$5) {
      fyf $$6 = $$3.ae ? this.c : this.b;
      a($$6, a, $$0, $$1, $$2, $$3, -1);
   }
}

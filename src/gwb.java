public class gwb extends gwu<hbc, gbx> {
   private static final akv a = akv.b("textures/entity/zombie/drowned_outer_layer.png");
   private final gbx b;
   private final gbx c;

   public gwb(guc<hbc, gbx> $$0, gfa $$1) {
      super($$0);
      this.b = new gbx($$1.a(gfd.aD));
      this.c = new gbx($$1.a(gfd.aA));
   }

   public void a(ffv $$0, glz $$1, int $$2, hbc $$3, float $$4, float $$5) {
      gbx $$6 = $$3.aj ? this.c : this.b;
      a($$6, a, $$0, $$1, $$2, $$3, -1);
   }
}

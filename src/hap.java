public class hap extends hbh<hfp, ggf> {
   private static final alg a = alg.b("textures/entity/zombie/drowned_outer_layer.png");
   private final ggf b;
   private final ggf c;

   public hap(gyq<hfp, ggf> $$0, gjk $$1) {
      super($$0);
      this.b = new ggf($$1.a(gjn.aN));
      this.c = new ggf($$1.a(gjn.aK));
   }

   public void a(fjy $$0, gqm $$1, int $$2, hfp $$3, float $$4, float $$5) {
      ggf $$6 = $$3.aj ? this.c : this.b;
      a($$6, a, $$0, $$1, $$2, $$3, -1);
   }
}

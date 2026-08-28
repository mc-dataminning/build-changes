public class gzv extends han<hev, gfl> {
   private static final alg a = alg.b("textures/entity/zombie/drowned_outer_layer.png");
   private final gfl b;
   private final gfl c;

   public gzv(gxw<hev, gfl> $$0, giq $$1) {
      super($$0);
      this.b = new gfl($$1.a(git.aL));
      this.c = new gfl($$1.a(git.aI));
   }

   public void a(fjc $$0, gps $$1, int $$2, hev $$3, float $$4, float $$5) {
      gfl $$6 = $$3.aj ? this.c : this.b;
      a($$6, a, $$0, $$1, $$2, $$3, -1);
   }
}

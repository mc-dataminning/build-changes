public class gvm extends gwf<hak, gbh> {
   private static final alz a = alz.b("textures/entity/zombie/drowned_outer_layer.png");
   private final gbh b;
   private final gbh c;

   public gvm(gtn<hak, gbh> $$0, gek $$1) {
      super($$0);
      this.b = new gbh($$1.a(gen.aA));
      this.c = new gbh($$1.a(gen.ax));
   }

   public void a(fgs $$0, gll $$1, int $$2, hak $$3, float $$4, float $$5) {
      gbh $$6 = $$3.ae ? this.c : this.b;
      a($$6, a, $$0, $$1, $$2, $$3, -1);
   }
}

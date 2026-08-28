public class guk extends gqg<ckb, gxw, gac<gxw>> {
   private static final alz a = alz.b("textures/entity/horse/horse_zombie.png");
   private static final alz b = alz.b("textures/entity/horse/horse_skeleton.png");
   private final alz k;

   public guk(grq.a $$0, gem $$1, gem $$2, boolean $$3) {
      super($$0, new gbx($$0.a($$1)), new gbx($$0.a($$2)), 1.0F);
      this.k = $$3 ? b : a;
   }

   public alz a(gxw $$0) {
      return this.k;
   }

   public gxw b() {
      return new gxw();
   }
}

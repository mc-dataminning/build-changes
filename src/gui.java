public class gui extends gqe<cka, gxu, gaa<gxu>> {
   private static final alz a = alz.b("textures/entity/horse/horse_zombie.png");
   private static final alz b = alz.b("textures/entity/horse/horse_skeleton.png");
   private final alz k;

   public gui(gro.a $$0, gek $$1, gek $$2, boolean $$3) {
      super($$0, new gbv($$0.a($$1)), new gbv($$0.a($$2)), 1.0F);
      this.k = $$3 ? b : a;
   }

   public alz a(gxu $$0) {
      return this.k;
   }

   public gxu b() {
      return new gxu();
   }
}

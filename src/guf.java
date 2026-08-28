public class guf extends gqb<cjs, gxr, fzv<gxr>> {
   private static final alp a = alp.b("textures/entity/horse/horse_zombie.png");
   private static final alp b = alp.b("textures/entity/horse/horse_skeleton.png");
   private final alp k;

   public guf(grl.a $$0, geh $$1, geh $$2, boolean $$3) {
      super($$0, new gbs($$0.a($$1)), new gbs($$0.a($$2)));
      this.k = $$3 ? b : a;
   }

   public alp a(gxr $$0) {
      return this.k;
   }

   public gxr b() {
      return new gxr();
   }
}

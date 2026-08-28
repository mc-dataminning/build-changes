public class gvx extends grt<cjw, gzk, gbm<gzk>> {
   private static final aku a = aku.b("textures/entity/horse/horse_zombie.png");
   private static final aku b = aku.b("textures/entity/horse/horse_skeleton.png");
   private final aku k;

   public gvx(gtd.a $$0, gga $$1, gga $$2, boolean $$3) {
      super($$0, new gdl($$0.a($$1)), new gdl($$0.a($$2)));
      this.k = $$3 ? b : a;
   }

   public aku a(gzk $$0) {
      return this.k;
   }

   public gzk b() {
      return new gzk();
   }
}

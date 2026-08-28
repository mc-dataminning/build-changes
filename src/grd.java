public class grd extends gnb<civ, guo, fxb<guo>> {
   private static final ali a = ali.b("textures/entity/horse/horse_zombie.png");
   private static final ali b = ali.b("textures/entity/horse/horse_skeleton.png");
   private final ali k;

   public grd(gok.a $$0, gbk $$1, gbk $$2, boolean $$3) {
      super($$0, new fyv($$0.a($$1)), new fyv($$0.a($$2)), 1.0F);
      this.k = $$3 ? b : a;
   }

   public ali a(guo $$0) {
      return this.k;
   }

   public guo c() {
      return new guo();
   }
}

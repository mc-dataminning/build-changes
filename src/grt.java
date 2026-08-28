public class grt extends gnr<ciz, gve, fxr<gve>> {
   private static final all a = all.b("textures/entity/horse/horse_zombie.png");
   private static final all b = all.b("textures/entity/horse/horse_skeleton.png");
   private final all k;

   public grt(gpa.a $$0, gca $$1, gca $$2, boolean $$3) {
      super($$0, new fzl($$0.a($$1)), new fzl($$0.a($$2)), 1.0F);
      this.k = $$3 ? b : a;
   }

   public all a(gve $$0) {
      return this.k;
   }

   public gve c() {
      return new gve();
   }
}

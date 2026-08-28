public class goz<T extends clg> extends gny<T, gts, fzb> {
   private static final alb a = alb.b("textures/entity/spider/spider.png");

   public goz(gms.a $$0) {
      this($$0, gaa.cx);
   }

   public goz(gms.a $$0, fzz $$1) {
      super($$0, new fzb($$0.a($$1)), 0.8F);
      this.a(new grl<>(this));
   }

   @Override
   protected float aX_() {
      return 180.0F;
   }

   public alb b(gts $$0) {
      return a;
   }

   public gts c() {
      return new gts();
   }

   public void a(T $$0, gts $$1, float $$2) {
      super.a($$0, $$1, $$2);
   }
}

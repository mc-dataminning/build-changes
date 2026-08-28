public class goi extends gnj<cme, gue, fyc> {
   private static final alb b = alb.b("textures/entity/piglin/piglin.png");
   private static final alb k = alb.b("textures/entity/piglin/piglin_brute.png");
   public static final gqk.a a = new gqk.a(0.0F, 0.0F, 1.0019531F);

   public goi(gms.a $$0, fzz $$1, fzz $$2, fzz $$3, fzz $$4, fzz $$5, fzz $$6) {
      super($$0, new fyc($$0.a($$1)), new fyc($$0.a($$2)), 0.5F, a);
      this.a(new gqv<>(this, new fxm($$0.a($$3)), new fxm($$0.a($$4)), new fxm($$0.a($$5)), new fxm($$0.a($$5)), $$0.g()));
   }

   public alb a(gue $$0) {
      return $$0.a ? k : b;
   }

   public gue c() {
      return new gue();
   }

   public void a(cme $$0, gue $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.ao() == btq.aB;
      $$1.d = $$0.gq();
      $$1.c = (float)cty.b($$0.fx(), $$0);
      $$1.b = $$0.go();
   }

   protected boolean b(gue $$0) {
      return super.a($$0) || $$0.b;
   }
}

public class gpe extends gof<cmm, gva, fyq> {
   private static final ale b = ale.b("textures/entity/piglin/piglin.png");
   private static final ale k = ale.b("textures/entity/piglin/piglin_brute.png");
   public static final grg.a a = new grg.a(0.0F, 0.0F, 1.0019531F);

   public gpe(gno.a $$0, gao $$1, gao $$2, gao $$3, gao $$4, gao $$5, gao $$6) {
      super($$0, new fyq($$0.a($$1)), new fyq($$0.a($$2)), 0.5F, a);
      this.a(new grr<>(this, new fya($$0.a($$3)), new fya($$0.a($$4)), new fya($$0.a($$5)), new fya($$0.a($$6)), $$0.g()));
   }

   public ale a(gva $$0) {
      return $$0.a ? k : b;
   }

   public gva c() {
      return new gva();
   }

   public void a(cmm $$0, gva $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.ao() == bty.aB;
      $$1.d = $$0.gq();
      $$1.c = (float)cug.b($$0.fx(), $$0);
      $$1.b = $$0.go();
   }

   protected boolean b(gva $$0) {
      return super.a($$0) || $$0.b;
   }
}

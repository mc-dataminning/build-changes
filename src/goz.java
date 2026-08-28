public class goz extends goa<cmj, guv, fym> {
   private static final alc b = alc.b("textures/entity/piglin/piglin.png");
   private static final alc k = alc.b("textures/entity/piglin/piglin_brute.png");
   public static final grb.a a = new grb.a(0.0F, 0.0F, 1.0019531F);

   public goz(gnj.a $$0, gaj $$1, gaj $$2, gaj $$3, gaj $$4, gaj $$5, gaj $$6) {
      super($$0, new fym($$0.a($$1)), new fym($$0.a($$2)), 0.5F, a);
      this.a(new grm<>(this, new fxw($$0.a($$3)), new fxw($$0.a($$4)), new fxw($$0.a($$5)), new fxw($$0.a($$6)), $$0.g()));
   }

   public alc a(guv $$0) {
      return $$0.a ? k : b;
   }

   public guv c() {
      return new guv();
   }

   public void a(cmj $$0, guv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.ao() == btv.aB;
      $$1.d = $$0.gr();
      $$1.c = (float)cud.b($$0.fx(), $$0);
      $$1.b = $$0.gp();
   }

   protected boolean b(guv $$0) {
      return super.a($$0) || $$0.b;
   }
}

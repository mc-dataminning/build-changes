public class gqg extends gsr<ciu, gwu, fzy> {
   private static final alp a = alp.b("textures/entity/allay/allay.png");

   public gqg(grl.a $$0) {
      super($$0, new fzy($$0.a(gei.c)), 0.4F);
      this.a(new gvs<>(this, $$0.b()));
   }

   public alp a(gwu $$0) {
      return a;
   }

   public gwu a() {
      return new gwu();
   }

   public void a(ciu $$0, gwu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.x();
      $$1.b = $$0.go();
      $$1.c = $$0.K($$2);
      $$1.d = $$0.J($$2);
   }

   protected int a(ciu $$0, jh $$1) {
      return 15;
   }
}

public class gqi extends gou<clr, gvx, fzy> {
   private static final ale a = ale.b("textures/entity/illager/vex.png");
   private static final ale b = ale.b("textures/entity/illager/vex_charging.png");

   public gqi(gno.a $$0) {
      super($$0, new fzy($$0.a(gap.cS)), 0.3F);
      this.a(new gru<>(this, $$0.b()));
   }

   protected int a(clr $$0, jf $$1) {
      return 15;
   }

   public ale a(gvx $$0) {
      return $$0.a ? b : a;
   }

   public gvx c() {
      return new gvx();
   }

   public void a(clr $$0, gvx $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.go();
   }
}

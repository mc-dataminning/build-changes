public class gug extends gsr<cnc, gzx, gdr> {
   private static final alp a = alp.b("textures/entity/illager/vex.png");
   private static final alp b = alp.b("textures/entity/illager/vex_charging.png");

   public gug(grl.a $$0) {
      super($$0, new gdr($$0.a(gei.ds)), 0.3F);
      this.a(new gvs<>(this, $$0.b()));
   }

   protected int a(cnc $$0, jh $$1) {
      return 15;
   }

   public alp a(gzx $$0) {
      return $$0.a ? b : a;
   }

   public gzx b() {
      return new gzx();
   }

   public void a(cnc $$0, gzx $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.go();
   }
}

public class gru extends gqg<cmj, gxk, gbk> {
   private static final all a = all.b("textures/entity/illager/vex.png");
   private static final all b = all.b("textures/entity/illager/vex_charging.png");

   public gru(gpa.a $$0) {
      super($$0, new gbk($$0.a(gcb.cS)), 0.3F);
      this.a(new gtg<>(this, $$0.b()));
   }

   protected int a(cmj $$0, jh $$1) {
      return 15;
   }

   public all a(gxk $$0) {
      return $$0.a ? b : a;
   }

   public gxk c() {
      return new gxk();
   }

   public void a(cmj $$0, gxk $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gv();
   }
}

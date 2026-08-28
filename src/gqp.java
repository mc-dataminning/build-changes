public class gqp extends gnv<chm, gwm, gaa> {
   private static final all a = all.b("textures/entity/pig/pig.png");

   public gqp(gpa.a $$0) {
      super($$0, new gaa($$0.a(gcb.bt)), new gaa($$0.a(gcb.bu)), 0.7F);
      this.a(new gto<>(this, new gaa($$0.a(gcb.bv)), new gaa($$0.a(gcb.bw)), all.b("textures/entity/pig/pig_saddle.png")));
   }

   public all a(gwm $$0) {
      return a;
   }

   public gwm c() {
      return new gwm();
   }

   public void a(chm $$0, gwm $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.i();
   }
}

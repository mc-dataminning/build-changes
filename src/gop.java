public class gop extends gnv<chd, guy, fyt> {
   private static final all a = all.b("textures/entity/dolphin.png");

   public gop(gpa.a $$0) {
      super($$0, new fyt($$0.a(gcb.ab)), new fyt($$0.a(gcb.ac)), 0.7F);
      this.a(new gsu(this, $$0.b()));
   }

   public all a(guy $$0) {
      return a;
   }

   public guy a() {
      return new guy();
   }

   public void a(chd $$0, guy $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.dB().j() > 1.0E-7;
   }
}

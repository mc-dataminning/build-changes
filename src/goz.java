public class goz extends gof<chg, gvj, fzc> {
   private static final alj a = alj.b("textures/entity/dolphin.png");

   public goz(gpk.a $$0) {
      super($$0, new fzc($$0.a(gck.al)), new fzc($$0.a(gck.am)), 0.7F);
      this.a(new gtf(this, $$0.b()));
   }

   public alj a(gvj $$0) {
      return a;
   }

   public gvj a() {
      return new gvj();
   }

   public void a(chg $$0, gvj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.dy().j() > 1.0E-7;
   }
}

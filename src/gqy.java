public class gqy extends gqd<cia, gxj, gay> {
   private static final alz a = alz.b("textures/entity/dolphin.png");

   public gqy(grj.a $$0) {
      super($$0, new gay($$0.a(geg.am)), new gay($$0.a(geg.an)), 0.7F);
      this.a(new gve(this, $$0.b()));
   }

   public alz a(gxj $$0) {
      return a;
   }

   public gxj a() {
      return new gxj();
   }

   public void a(cia $$0, gxj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.dy().j() > 1.0E-7;
   }
}

public class gtu extends gsz<cio, haf, gdt> {
   private static final ald a = ald.b("textures/entity/dolphin.png");

   public gtu(guf.a $$0) {
      super($$0, new gdt($$0.a(ghc.at)), new gdt($$0.a(ghc.au)), 0.7F);
      this.a(new gya(this));
   }

   public ald a(haf $$0) {
      return a;
   }

   public haf a() {
      return new haf();
   }

   public void a(cio $$0, haf $$1, float $$2) {
      super.a($$0, $$1, $$2);
      haz.a($$0, $$1, this.h);
      $$1.a = $$0.dy().j() > 1.0E-7;
   }
}

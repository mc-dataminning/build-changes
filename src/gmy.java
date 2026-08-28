public class gmy extends gme<cgi, gtg, fxd> {
   private static final alc a = alc.b("textures/entity/dolphin.png");

   public gmy(gnj.a $$0) {
      super($$0, new fxd($$0.a(gak.ab)), new fxd($$0.a(gak.ac)), 0.7F);
      this.a(new grd(this, $$0.b()));
   }

   public alc a(gtg $$0) {
      return a;
   }

   public gtg a() {
      return new gtg();
   }

   public void a(cgi $$0, gtg $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.dv().j() > 1.0E-7;
   }
}

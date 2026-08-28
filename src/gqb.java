public class gqb extends gme<chb, gvr, fzs> {
   private static final alc a = alc.b("textures/entity/turtle/big_sea_turtle.png");

   public gqb(gnj.a $$0) {
      super($$0, new fzs($$0.a(gak.cQ)), new fzs($$0.a(gak.cR)), 0.7F);
   }

   protected float a(gvr $$0) {
      float $$1 = super.f($$0);
      return $$0.ae ? $$1 * 0.83F : $$1;
   }

   public gvr c() {
      return new gvr();
   }

   public void a(chb $$0, gvr $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = !$$0.bi() && $$0.aH();
      $$1.b = $$0.t();
      $$1.c = !$$0.o_() && $$0.q();
   }

   public alc b(gvr $$0) {
      return a;
   }
}

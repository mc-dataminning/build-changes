public class grc extends gnf<chs, gwt, gat> {
   private static final ali a = ali.b("textures/entity/turtle/big_sea_turtle.png");

   public grc(gok.a $$0) {
      super($$0, new gat($$0.a(gbl.cQ)), new gat($$0.a(gbl.cR)), 0.7F);
   }

   protected float a(gwt $$0) {
      float $$1 = super.g($$0);
      return $$0.ae ? $$1 * 0.83F : $$1;
   }

   public gwt c() {
      return new gwt();
   }

   public void a(chs $$0, gwt $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = !$$0.bk() && $$0.aK();
      $$1.b = $$0.t();
      $$1.c = !$$0.p_() && $$0.q();
   }

   public ali b(gwt $$0) {
      return a;
   }
}

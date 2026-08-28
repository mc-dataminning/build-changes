public class gqo extends gou<clt, gwb, gad> {
   private static final ale a = ale.b("textures/entity/witch.png");

   public gqo(gno.a $$0) {
      super($$0, new gad($$0.a(gap.cY)), 0.5F);
      this.a(new gsn(this, $$0.b()));
   }

   public ale a(gwb $$0) {
      return a;
   }

   public gwb c() {
      return new gwb();
   }

   public void a(clt $$0, gwb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.ap();
      $$1.b = !$$0.eW().f();
   }
}

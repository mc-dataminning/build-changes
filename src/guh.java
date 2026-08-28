public class guh extends gqi<cix, gzz, gdt> {
   private static final alz a = alz.b("textures/entity/turtle/big_sea_turtle.png");

   public guh(gro.a $$0) {
      super($$0, new gdt($$0.a(gel.dl)), new gdt($$0.a(gel.dm)), 0.7F);
   }

   protected float a(gzz $$0) {
      float $$1 = super.g($$0);
      return $$0.ae ? $$1 * 0.83F : $$1;
   }

   public gzz b() {
      return new gzz();
   }

   public void a(cix $$0, gzz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = !$$0.bj() && $$0.aJ();
      $$1.b = $$0.t();
      $$1.c = !$$0.e_() && $$0.p();
   }

   public alz b(gzz $$0) {
      return a;
   }
}

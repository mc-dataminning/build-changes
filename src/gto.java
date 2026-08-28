public class gto extends gqj<cis, gzm, gdb> {
   private static final alz a = alz.b("textures/entity/sheep/sheep.png");

   public gto(grp.a $$0) {
      super($$0, new gdb($$0.a(gem.cw)), new gdb($$0.a(gem.cx)), 0.7F);
      this.a(new gwg(this, $$0.f()));
   }

   public alz a(gzm $$0) {
      return a;
   }

   public gzm b() {
      return new gzm();
   }

   public void a(cis $$0, gzm $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.K($$2);
      $$1.a = $$0.J($$2);
      $$1.c = $$0.x();
      $$1.d = $$0.t();
      $$1.e = $$0.ar();
   }
}

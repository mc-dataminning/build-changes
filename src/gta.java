public class gta extends gqf<cif, gyz, gch> {
   private static final alp a = alp.b("textures/entity/pig/pig.png");

   public gta(grl.a $$0) {
      super($$0, new gch($$0.a(gei.bP)), new gch($$0.a(gei.ca)), 0.7F);
      this.a(new gwb<>(this, new gch($$0.a(gei.cc)), new gch($$0.a(gei.cb)), alp.b("textures/entity/pig/pig_saddle.png")));
   }

   public alp a(gyz $$0) {
      return a;
   }

   public gyz b() {
      return new gyz();
   }

   public void a(cif $$0, gyz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.j();
   }
}

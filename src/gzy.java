public class gzy extends gyz<cql, hga, gjd> {
   private static final ali j = ali.b("textures/entity/piglin/piglin.png");
   private static final ali k = ali.b("textures/entity/piglin/piglin_brute.png");
   public static final hcb.a a = new hcb.a(0.0F, 0.0F, 1.0019531F);

   public gzy(gyi.a $$0, glc $$1, glc $$2, glc $$3, glc $$4, glc $$5, glc $$6) {
      super($$0, new gjd($$0.a($$1)), new gjd($$0.a($$2)), 0.5F, a);
      this.a(new hcl<>(this, new gin($$0.a($$3)), new gin($$0.a($$4)), new gin($$0.a($$5)), new gin($$0.a($$6)), $$0.h()));
   }

   public ali a(hga $$0) {
      return $$0.a ? k : j;
   }

   public hga b() {
      return new hga();
   }

   public void a(cql $$0, hga $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.an() == bxc.aT;
      $$1.d = $$0.x();
      $$1.c = (float)cyr.b($$0.fB(), $$0);
      $$1.b = $$0.q();
   }

   protected boolean b(hga $$0) {
      return super.a($$0) || $$0.b;
   }
}

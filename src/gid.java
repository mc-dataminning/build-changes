public class gid extends gfq<clf> {
   public static final ajv a = new ajv("textures/entity/trident.png");
   private final fta f;

   public gid(gfr.a $$0) {
      super($$0);
      this.f = new fta($$0.a(ftu.bI));
   }

   public void a(clf $$0, float $$1, float $$2, ewr $$3, gai $$4, int $$5) {
      $$3.a();
      $$3.a(a.d.rotationDegrees(axm.i($$2, $$0.N, $$0.dC()) - 90.0F));
      $$3.a(a.f.rotationDegrees(axm.i($$2, $$0.O, $$0.dE()) + 90.0F));
      ewv $$6 = ggp.c($$4, this.f.a(this.a($$0)), false, $$0.H());
      this.f.a($$3, $$6, $$5, glj.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ajv a(clf $$0) {
      return a;
   }
}

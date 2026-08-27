public class ggq extends gfq<cge> {
   private static final ajv a = new ajv("textures/entity/lead_knot.png");
   private final frm<cge> f;

   public ggq(gfr.a $$0) {
      super($$0);
      this.f = new frm<>($$0.a(ftu.aw));
   }

   public void a(cge $$0, float $$1, float $$2, ewr $$3, gai $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.f.a($$0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      ewv $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, glj.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ajv a(cge $$0) {
      return a;
   }
}

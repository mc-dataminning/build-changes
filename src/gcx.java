public class gcx extends gbx<cef> {
   private static final ajc a = new ajc("textures/entity/lead_knot.png");
   private final fnv<cef> f;

   public gcx(gby.a $$0) {
      super($$0);
      this.f = new fnv<>($$0.a(fqe.as));
   }

   public void a(cef $$0, float $$1, float $$2, etd $$3, fwq $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.f.a($$0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      eth $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, ghq.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ajc a(cef $$0) {
      return a;
   }
}

public class guh extends gsp<cpk, gzx, gdr> {
   private static final alz a = alz.b("textures/entity/wandering_trader.png");

   public guh(grj.a $$0) {
      super($$0, new gdr($$0.a(geg.dq)), 0.5F);
      this.a(new gvc<>(this, $$0.f(), $$0.b()));
      this.a(new gvb<>(this, $$0.b()));
   }

   public alz a(gzx $$0) {
      return a;
   }

   protected void a(gzx $$0, fgl $$1) {
      float $$2 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   public gzx b() {
      return new gzx();
   }

   public void a(cpk $$0, gzx $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.p() > 0;
   }
}

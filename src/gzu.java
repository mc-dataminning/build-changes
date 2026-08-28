public class gzu extends gwp<cmr, hfx, gje> {
   private static final alr a = alr.b("textures/entity/sheep/sheep.png");

   public gzu(gxv.a $$0) {
      super($$0, new gje($$0.a(gkq.cN)), new gje($$0.a(gkq.cO)), 0.7F);
      this.a(new hcl(this, $$0.f()));
      this.a(new hck(this, $$0.f()));
   }

   public alr a(hfx $$0) {
      return a;
   }

   public hfx b() {
      return new hfx();
   }

   public void a(cmr $$0, hfx $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.K($$2);
      $$1.a = $$0.J($$2);
      $$1.c = $$0.u();
      $$1.d = $$0.p();
      $$1.e = $$0.ao();
   }
}

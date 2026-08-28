public class gac extends gbu<gww> {
   public gac(gej $$0) {
      super($$0);
   }

   public static gep a(gen $$0) {
      ger $$1 = gbu.a($$0, 0.0F);
      get $$2 = $$1.a();
      get $$3 = $$2.a("head", geo.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), gel.a(0.0F, 1.0F, 0.0F));
      $$3.a("hat", geo.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0.a(0.5F)), gel.a);
      $$2.a("right_leg", geo.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(-0.1F)), gel.a(-1.9F, 11.0F, 0.0F));
      $$2.a("left_leg", geo.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(-0.1F)), gel.a(1.9F, 11.0F, 0.0F));
      return gep.a($$1, 64, 32);
   }

   public void a(gww $$0) {
      super.a($$0);
      this.o.e = (float) (Math.PI / 180.0) * $$0.g.b();
      this.o.f = (float) (Math.PI / 180.0) * $$0.g.c();
      this.o.g = (float) (Math.PI / 180.0) * $$0.g.d();
      this.q.e = (float) (Math.PI / 180.0) * $$0.h.b();
      this.q.f = (float) (Math.PI / 180.0) * $$0.h.c();
      this.q.g = (float) (Math.PI / 180.0) * $$0.h.d();
      this.s.e = (float) (Math.PI / 180.0) * $$0.i.b();
      this.s.f = (float) (Math.PI / 180.0) * $$0.i.c();
      this.s.g = (float) (Math.PI / 180.0) * $$0.i.d();
      this.r.e = (float) (Math.PI / 180.0) * $$0.j.b();
      this.r.f = (float) (Math.PI / 180.0) * $$0.j.c();
      this.r.g = (float) (Math.PI / 180.0) * $$0.j.d();
      this.u.e = (float) (Math.PI / 180.0) * $$0.k.b();
      this.u.f = (float) (Math.PI / 180.0) * $$0.k.c();
      this.u.g = (float) (Math.PI / 180.0) * $$0.k.d();
      this.t.e = (float) (Math.PI / 180.0) * $$0.l.b();
      this.t.f = (float) (Math.PI / 180.0) * $$0.l.c();
      this.t.g = (float) (Math.PI / 180.0) * $$0.l.d();
   }
}

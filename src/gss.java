public class gss extends gro<cqo, gyu> {
   private static final alz a = alz.b("textures/entity/llama/spit.png");
   private final gce b;

   public gss(grp.a $$0) {
      super($$0);
      this.b = new gce($$0.a(gem.bt));
   }

   public void a(gyu $$0, fgr $$1, glk $$2, int $$3) {
      $$1.a();
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees($$0.a - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.b));
      this.b.a($$0);
      fgv $$4 = $$2.getBuffer(this.b.a(a));
      this.b.a($$1, $$4, $$3, hbb.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gyu a() {
      return new gyu();
   }

   public void a(cqo $$0, gyu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.j($$2);
      $$1.a = $$0.k($$2);
   }
}

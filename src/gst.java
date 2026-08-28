public class gst extends grp<cqp, gyv> {
   private static final alz a = alz.b("textures/entity/llama/spit.png");
   private final gcf b;

   public gst(grq.a $$0) {
      super($$0);
      this.b = new gcf($$0.a(gen.bt));
   }

   public void a(gyv $$0, fgs $$1, gll $$2, int $$3) {
      $$1.a();
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees($$0.a - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.b));
      this.b.a($$0);
      fgw $$4 = $$2.getBuffer(this.b.a(a));
      this.b.a($$1, $$4, $$3, hbc.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gyv a() {
      return new gyv();
   }

   public void a(cqp $$0, gyv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.j($$2);
      $$1.a = $$0.k($$2);
   }
}

public class gug extends gtc<cqj, hal> {
   private static final aku a = aku.b("textures/entity/llama/spit.png");
   private final gdt b;

   public gug(gtd.a $$0) {
      super($$0);
      this.b = new gdt($$0.a(ggb.by));
   }

   public void a(hal $$0, fgr $$1, gmx $$2, int $$3) {
      $$1.a();
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees($$0.a - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.b));
      this.b.a($$0);
      fgv $$4 = $$2.getBuffer(this.b.a(a));
      this.b.a($$1, $$4, $$3, hfh.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public hal a() {
      return new hal();
   }

   public void a(cqj $$0, hal $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.k($$2);
      $$1.a = $$0.l($$2);
   }
}

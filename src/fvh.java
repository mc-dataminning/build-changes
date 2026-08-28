public class fvh extends ftw {
   private static final fvl a = new fvl(
      alr.b("widget/tab_selected"), alr.b("widget/tab"), alr.b("widget/tab_selected_highlighted"), alr.b("widget/tab_highlighted")
   );
   private static final int b = 3;
   private static final int c = 1;
   private static final int d = 1;
   private static final int e = 4;
   private static final int f = 2;
   private final fwc m;
   private final fwb n;

   public fvh(fwc $$0, fwb $$1, int $$2, int $$3) {
      super(0, 0, $$2, $$3, $$1.a());
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void b(ftk $$0, int $$1, int $$2, float $$3) {
      $$0.a(gry::H, a.a(this.b(), this.D()), this.F(), this.G(), this.g, this.h);
      fti $$4 = fqq.Q().h;
      int $$5 = this.j ? -1 : -6250336;
      this.a($$0, $$4, $$5);
      if (this.b()) {
         this.a($$0, this.F() + 2, this.G() + 2, this.H() - 2, this.I());
         this.b($$0, $$4, $$5);
      }
   }

   protected void a(ftk $$0, int $$1, int $$2, int $$3, int $$4) {
      fzq.a($$0, fzq.g, $$1, $$2, 0.0F, 0.0F, $$3 - $$1, $$4 - $$2);
   }

   public void a(ftk $$0, fti $$1, int $$2) {
      int $$3 = this.F() + 1;
      int $$4 = this.G() + (this.b() ? 0 : 3);
      int $$5 = this.F() + this.A() - 1;
      int $$6 = this.G() + this.y();
      a($$0, $$1, this.B(), $$3, $$4, $$5, $$6, $$2);
   }

   private void b(ftk $$0, fti $$1, int $$2) {
      int $$3 = Math.min($$1.a(this.B()), this.A() - 4);
      int $$4 = this.F() + (this.A() - $$3) / 2;
      int $$5 = this.G() + this.y() - 2;
      $$0.a($$4, $$5, $$4 + $$3, $$5 + 1, $$2);
   }

   @Override
   protected void a(fxv $$0) {
      $$0.a(fxu.a, xg.a("gui.narrate.tab", this.n.a()));
   }

   @Override
   public void a(hpt $$0) {
   }

   public fwb a() {
      return this.n;
   }

   public boolean b() {
      return this.m.a() == this.n;
   }
}

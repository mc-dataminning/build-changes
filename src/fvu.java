public class fvu extends fuj {
   private static final fvy a = new fvy(
      ali.b("widget/tab_selected"), ali.b("widget/tab"), ali.b("widget/tab_selected_highlighted"), ali.b("widget/tab_highlighted")
   );
   private static final int b = 3;
   private static final int c = 1;
   private static final int d = 1;
   private static final int e = 4;
   private static final int f = 2;
   private final fwp m;
   private final fwo n;

   public fvu(fwp $$0, fwo $$1, int $$2, int $$3) {
      super(0, 0, $$2, $$3, $$1.a());
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void b(ftx $$0, int $$1, int $$2, float $$3) {
      $$0.a(gsl::H, a.a(this.b(), this.D()), this.F(), this.G(), this.g, this.h);
      ftv $$4 = frd.Q().h;
      int $$5 = this.j ? -1 : -6250336;
      this.a($$0, $$4, $$5);
      if (this.b()) {
         this.a($$0, this.F() + 2, this.G() + 2, this.H() - 2, this.I());
         this.b($$0, $$4, $$5);
      }
   }

   protected void a(ftx $$0, int $$1, int $$2, int $$3, int $$4) {
      gad.a($$0, gad.g, $$1, $$2, 0.0F, 0.0F, $$3 - $$1, $$4 - $$2);
   }

   public void a(ftx $$0, ftv $$1, int $$2) {
      int $$3 = this.F() + 1;
      int $$4 = this.G() + (this.b() ? 0 : 3);
      int $$5 = this.F() + this.A() - 1;
      int $$6 = this.G() + this.y();
      a($$0, $$1, this.B(), $$3, $$4, $$5, $$6, $$2);
   }

   private void b(ftx $$0, ftv $$1, int $$2) {
      int $$3 = Math.min($$1.a(this.B()), this.A() - 4);
      int $$4 = this.F() + (this.A() - $$3) / 2;
      int $$5 = this.G() + this.y() - 2;
      $$0.a($$4, $$5, $$4 + $$3, $$5 + 1, $$2);
   }

   @Override
   protected void a(fyi $$0) {
      $$0.a(fyh.a, xa.a("gui.narrate.tab", this.n.a()));
   }

   @Override
   public void a(hqd $$0) {
   }

   public fwo a() {
      return this.n;
   }

   public boolean b() {
      return this.m.a() == this.n;
   }
}

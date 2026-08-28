public class gtk extends gtn<gwo, gaf> {
   private final fzy a;
   private final gwk b = new gwk();

   public gtk(gqw<gwo, gaf> $$0, gby $$1) {
      super($$0);
      this.a = new fzy($$1.a(gcb.br));
      this.b.c = fzy.a.e;
   }

   public void a(fek $$0, gix $$1, int $$2, gwo $$3, float $$4, float $$5) {
      chl.b $$6 = $$3.aE;
      if ($$6 != null) {
         this.a($$0, $$1, $$2, $$3, $$6, $$4, $$5, true);
      }

      chl.b $$7 = $$3.aF;
      if ($$7 != null) {
         this.a($$0, $$1, $$2, $$3, $$7, $$4, $$5, false);
      }
   }

   private void a(fek $$0, gix $$1, int $$2, gwo $$3, chl.b $$4, float $$5, float $$6, boolean $$7) {
      $$0.a();
      $$0.a($$7 ? 0.4F : -0.4F, $$3.I ? -1.3F : -1.5F, 0.0F);
      this.b.p = $$3.p;
      this.b.X = $$3.X;
      this.b.Y = $$3.Y;
      this.b.U = $$5;
      this.b.V = $$6;
      this.a.a(this.b);
      this.a.a($$0, $$1.getBuffer(this.a.a(gqn.a($$4))), $$2, gyk.d);
      $$0.b();
   }
}

public class gcg extends gbc {
   private final bsw a;
   private int b;
   private final int D;
   private final lg E;

   public gcg(fxx $$0, bsw $$1, lg $$2) {
      this($$0, $$1, $$2, 3);
   }

   public gcg(fxx $$0, bsw $$1, lg $$2, int $$3) {
      this($$0, $$1, $$2, $$3, $$1.ds());
   }

   private gcg(fxx $$0, bsw $$1, lg $$2, int $$3, evt $$4) {
      super($$0, $$1.du(), $$1.e(0.5), $$1.dA(), $$4.c, $$4.d, $$4.e);
      this.a = $$1;
      this.D = $$3;
      this.E = $$2;
      this.a();
   }

   @Override
   public void a() {
      for (int $$0 = 0; $$0 < 16; $$0++) {
         double $$1 = (double)(this.r.i() * 2.0F - 1.0F);
         double $$2 = (double)(this.r.i() * 2.0F - 1.0F);
         double $$3 = (double)(this.r.i() * 2.0F - 1.0F);
         if (!($$1 * $$1 + $$2 * $$2 + $$3 * $$3 > 1.0)) {
            double $$4 = this.a.c($$1 / 4.0);
            double $$5 = this.a.e(0.5 + $$2 / 4.0);
            double $$6 = this.a.f($$3 / 4.0);
            this.c.a(this.E, false, $$4, $$5, $$6, $$1, $$2 + 0.2, $$3);
         }
      }

      this.b++;
      if (this.b >= this.D) {
         this.k();
      }
   }
}

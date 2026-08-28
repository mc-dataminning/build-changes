import java.util.List;

public abstract class gat<T extends cvs> extends gau<T> {
   private final ali G;
   private final ali H;
   private final ali I;

   public gat(T $$0, crw $$1, xa $$2, xa $$3, ali $$4, ali $$5, ali $$6, List<gec.a> $$7) {
      super($$0, new gdz($$0, $$3, $$7), $$1, $$2);
      this.G = $$4;
      this.H = $$5;
      this.I = $$6;
   }

   @Override
   public void aS_() {
      super.aS_();
      this.v = (this.s - this.p.a(this.l)) / 2;
   }

   @Override
   protected fyr G() {
      return new fyr(this.C + 20, this.o / 2 - 49);
   }

   @Override
   protected void a(ftx $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.C;
      int $$5 = this.D;
      $$0.a(gsl::H, this.G, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      if (this.z.o()) {
         int $$6 = 14;
         int $$7 = azo.f(this.z.n() * 13.0F) + 1;
         $$0.a(gsl::H, this.H, 14, 14, 0, 14 - $$7, $$4 + 56, $$5 + 36 + 14 - $$7, 14, $$7);
      }

      int $$8 = 24;
      int $$9 = azo.f(this.z.m() * 24.0F);
      $$0.a(gsl::H, this.I, 24, 16, 0, 0, $$4 + 79, $$5 + 34, $$9, 16);
   }
}

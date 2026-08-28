import java.util.List;

public abstract class gag<T extends cwd> extends gah<T> {
   private final alr G;
   private final alr H;
   private final alr I;

   public gag(T $$0, csh $$1, xg $$2, xg $$3, alr $$4, alr $$5, alr $$6, List<gdp.a> $$7) {
      super($$0, new gdm($$0, $$3, $$7), $$1, $$2);
      this.G = $$4;
      this.H = $$5;
      this.I = $$6;
   }

   @Override
   public void aT_() {
      super.aT_();
      this.v = (this.s - this.p.a(this.l)) / 2;
   }

   @Override
   protected fye G() {
      return new fye(this.C + 20, this.o / 2 - 49);
   }

   @Override
   protected void a(ftk $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.C;
      int $$5 = this.D;
      $$0.a(gry::H, this.G, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      if (this.z.o()) {
         int $$6 = 14;
         int $$7 = azz.f(this.z.n() * 13.0F) + 1;
         $$0.a(gry::H, this.H, 14, 14, 0, 14 - $$7, $$4 + 56, $$5 + 36 + 14 - $$7, 14, $$7);
      }

      int $$8 = 24;
      int $$9 = azz.f(this.z.m() * 24.0F);
      $$0.a(gry::H, this.I, 24, 16, 0, 0, $$4 + 79, $$5 + 34, $$9, 16);
   }
}

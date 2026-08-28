import java.util.List;

public abstract class fun<T extends ctd> extends fuo<T> {
   private final alz G;
   private final alz H;
   private final alz I;

   public fun(T $$0, cpv $$1, xv $$2, xv $$3, alz $$4, alz $$5, alz $$6, List<fxu.a> $$7) {
      super($$0, new fxr($$0, $$3, $$7), $$1, $$2);
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
   protected fsl G() {
      return new fsl(this.C + 20, this.o / 2 - 49);
   }

   @Override
   protected void a(fnr $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.C;
      int $$5 = this.D;
      $$0.a(glu::C, this.G, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      if (this.z.o()) {
         int $$6 = 14;
         int $$7 = bae.f(this.z.n() * 13.0F) + 1;
         $$0.a(glu::C, this.H, 14, 14, 0, 14 - $$7, $$4 + 56, $$5 + 36 + 14 - $$7, 14, $$7);
      }

      int $$8 = 24;
      int $$9 = bae.f(this.z.m() * 24.0F);
      $$0.a(glu::C, this.I, 24, 16, 0, 0, $$4 + 79, $$5 + 34, $$9, 16);
   }
}

import java.util.List;

public abstract class fva<T extends cse> extends fvb<T> {
   private final aku G;
   private final aku H;
   private final aku I;

   public fva(T $$0, cow $$1, wo $$2, wo $$3, aku $$4, aku $$5, aku $$6, List<fyh.a> $$7) {
      super($$0, new fye($$0, $$3, $$7), $$1, $$2);
      this.G = $$4;
      this.H = $$5;
      this.I = $$6;
   }

   @Override
   public void aR_() {
      super.aR_();
      this.v = (this.s - this.p.a(this.l)) / 2;
   }

   @Override
   protected fsy G() {
      return new fsy(this.C + 20, this.o / 2 - 49);
   }

   @Override
   protected void a(fod $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.C;
      int $$5 = this.D;
      $$0.a(gmh::H, this.G, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      if (this.z.o()) {
         int $$6 = 14;
         int $$7 = ayz.f(this.z.n() * 13.0F) + 1;
         $$0.a(gmh::H, this.H, 14, 14, 0, 14 - $$7, $$4 + 56, $$5 + 36 + 14 - $$7, 14, $$7);
      }

      int $$8 = 24;
      int $$9 = ayz.f(this.z.m() * 24.0F);
      $$0.a(gmh::H, this.I, 24, 16, 0, 0, $$4 + 79, $$5 + 34, $$9, 16);
   }
}

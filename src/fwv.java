import java.util.List;

public abstract class fwv<T extends ctp> extends fww<T> {
   private final ald G;
   private final ald H;
   private final ald I;

   public fwv(T $$0, cqh $$1, wv $$2, wv $$3, ald $$4, ald $$5, ald $$6, List<gae.a> $$7) {
      super($$0, new gab($$0, $$3, $$7), $$1, $$2);
      this.G = $$4;
      this.H = $$5;
      this.I = $$6;
   }

   @Override
   public void aN_() {
      super.aN_();
      this.v = (this.s - this.p.a(this.l)) / 2;
   }

   @Override
   protected fut G() {
      return new fut(this.C + 20, this.o / 2 - 49);
   }

   @Override
   protected void a(fpz $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.C;
      int $$5 = this.D;
      $$0.a(goi::H, this.G, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      if (this.z.o()) {
         int $$6 = 14;
         int $$7 = azk.f(this.z.n() * 13.0F) + 1;
         $$0.a(goi::H, this.H, 14, 14, 0, 14 - $$7, $$4 + 56, $$5 + 36 + 14 - $$7, 14, $$7);
      }

      int $$8 = 24;
      int $$9 = azk.f(this.z.m() * 24.0F);
      $$0.a(goi::H, this.I, 24, 16, 0, 0, $$4 + 79, $$5 + 34, $$9, 16);
   }
}

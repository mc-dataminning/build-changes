import java.util.List;

public abstract class fyk<T extends cus> extends fyl<T> {
   private final alg G;
   private final alg H;
   private final alg I;

   public fyk(T $$0, cqx $$1, wy $$2, wy $$3, alg $$4, alg $$5, alg $$6, List<gbt.a> $$7) {
      super($$0, new gbq($$0, $$3, $$7), $$1, $$2);
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
   protected fwi G() {
      return new fwi(this.C + 20, this.o / 2 - 49);
   }

   @Override
   protected void a(fro $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.C;
      int $$5 = this.D;
      $$0.a(gqc::H, this.G, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      if (this.z.o()) {
         int $$6 = 14;
         int $$7 = azm.f(this.z.n() * 13.0F) + 1;
         $$0.a(gqc::H, this.H, 14, 14, 0, 14 - $$7, $$4 + 56, $$5 + 36 + 14 - $$7, 14, $$7);
      }

      int $$8 = 24;
      int $$9 = azm.f(this.z.m() * 24.0F);
      $$0.a(gqc::H, this.I, 24, 16, 0, 0, $$4 + 79, $$5 + 34, $$9, 16);
   }
}

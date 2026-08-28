import java.util.List;

public abstract class gav<T extends cvu> extends gaw<T> {
   private final alk G;
   private final alk H;
   private final alk I;

   public gav(T $$0, cry $$1, xc $$2, xc $$3, alk $$4, alk $$5, alk $$6, List<gee.a> $$7) {
      super($$0, new geb($$0, $$3, $$7), $$1, $$2);
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
   protected fyt G() {
      return new fyt(this.C + 20, this.o / 2 - 49);
   }

   @Override
   protected void a(ftz $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.C;
      int $$5 = this.D;
      $$0.a(gsn::H, this.G, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      if (this.z.o()) {
         int $$6 = 14;
         int $$7 = azq.f(this.z.n() * 13.0F) + 1;
         $$0.a(gsn::H, this.H, 14, 14, 0, 14 - $$7, $$4 + 56, $$5 + 36 + 14 - $$7, 14, $$7);
      }

      int $$8 = 24;
      int $$9 = azq.f(this.z.m() * 24.0F);
      $$0.a(gsn::H, this.I, 24, 16, 0, 0, $$4 + 79, $$5 + 34, $$9, 16);
   }
}

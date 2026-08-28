import javax.annotation.Nullable;

public class gxv extends gxq implements dgb {
   public jh a = jh.c;
   public jh b = jh.c;
   public dxo c = dkf.L.m();
   @Nullable
   public jq<dib> d;
   public dgb e = dgn.a;

   @Override
   public float a(jm $$0, boolean $$1) {
      return this.e.a($$0, $$1);
   }

   @Override
   public etf C_() {
      return this.e.C_();
   }

   @Override
   public int a(jh $$0, dgj $$1) {
      return this.d == null ? -1 : $$1.getColor(this.d.a(), (double)$$0.u(), (double)$$0.w());
   }

   @Nullable
   @Override
   public duq c_(jh $$0) {
      return null;
   }

   @Override
   public dxo a_(jh $$0) {
      return $$0.equals(this.b) ? this.c : dkf.a.m();
   }

   @Override
   public etq b_(jh $$0) {
      return this.a_($$0).y();
   }

   @Override
   public int M_() {
      return 1;
   }

   @Override
   public int L_() {
      return this.b.v();
   }
}

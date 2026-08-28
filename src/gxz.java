import javax.annotation.Nullable;

public class gxz extends gxu implements dgj {
   public jh a = jh.c;
   public jh b = jh.c;
   public dxu c = dkn.L.m();
   @Nullable
   public jq<dij> d;
   public dgj e = dgv.a;

   @Override
   public float a(jm $$0, boolean $$1) {
      return this.e.a($$0, $$1);
   }

   @Override
   public etl C_() {
      return this.e.C_();
   }

   @Override
   public int a(jh $$0, dgr $$1) {
      return this.d == null ? -1 : $$1.getColor(this.d.a(), (double)$$0.u(), (double)$$0.w());
   }

   @Nullable
   @Override
   public duw c_(jh $$0) {
      return null;
   }

   @Override
   public dxu a_(jh $$0) {
      return $$0.equals(this.b) ? this.c : dkn.a.m();
   }

   @Override
   public etw b_(jh $$0) {
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

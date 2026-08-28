import javax.annotation.Nullable;

public class gxt extends gxo implements dgc {
   public jh a = jh.c;
   public jh b = jh.c;
   public dxn c = dkg.L.m();
   @Nullable
   public jq<dic> d;
   public dgc e = dgo.a;

   @Override
   public float a(jm $$0, boolean $$1) {
      return this.e.a($$0, $$1);
   }

   @Override
   public ete C_() {
      return this.e.C_();
   }

   @Override
   public int a(jh $$0, dgk $$1) {
      return this.d == null ? -1 : $$1.getColor(this.d.a(), (double)$$0.u(), (double)$$0.w());
   }

   @Nullable
   @Override
   public dup c_(jh $$0) {
      return null;
   }

   @Override
   public dxn a_(jh $$0) {
      return $$0.equals(this.b) ? this.c : dkg.a.m();
   }

   @Override
   public etp b_(jh $$0) {
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

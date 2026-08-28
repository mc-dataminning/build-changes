import javax.annotation.Nullable;

public class gvt extends gvo implements deo {
   public jh a = jh.c;
   public jh b = jh.c;
   public dvv c = dis.I.m();
   @Nullable
   public jq<dgo> d;
   public deo e = dfa.a;

   @Override
   public float a(jm $$0, boolean $$1) {
      return this.e.a($$0, $$1);
   }

   @Override
   public erk B_() {
      return this.e.B_();
   }

   @Override
   public int a(jh $$0, dew $$1) {
      return this.d == null ? -1 : $$1.getColor(this.d.a(), (double)$$0.u(), (double)$$0.w());
   }

   @Nullable
   @Override
   public dsy c_(jh $$0) {
      return null;
   }

   @Override
   public dvv a_(jh $$0) {
      return $$0.equals(this.b) ? this.c : dis.a.m();
   }

   @Override
   public erv b_(jh $$0) {
      return this.a_($$0).y();
   }

   @Override
   public int L_() {
      return 1;
   }

   @Override
   public int K_() {
      return this.b.v();
   }
}

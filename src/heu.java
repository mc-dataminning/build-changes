import javax.annotation.Nullable;

public class heu extends hep implements diy {
   public iv a = iv.c;
   public iv b = iv.c;
   public ebe c = dne.L.m();
   @Nullable
   public jf<dla> d;
   public diy e = djm.a;

   @Override
   public float a(jb $$0, boolean $$1) {
      return this.e.a($$0, $$1);
   }

   @Override
   public exd B_() {
      return this.e.B_();
   }

   @Override
   public int a(iv $$0, djh $$1) {
      return this.d == null ? -1 : $$1.getColor(this.d.a(), (double)$$0.u(), (double)$$0.w());
   }

   @Nullable
   @Override
   public dyc c_(iv $$0) {
      return null;
   }

   @Override
   public ebe a_(iv $$0) {
      return $$0.equals(this.b) ? this.c : dne.a.m();
   }

   @Override
   public exo b_(iv $$0) {
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

import javax.annotation.Nullable;

public class gus extends gun implements ded {
   public jh a = jh.c;
   public jh b = jh.c;
   public dvj c = dig.I.m();
   @Nullable
   public jq<dgc> d;
   public ded e = dep.a;

   @Override
   public float a(jm $$0, boolean $$1) {
      return this.e.a($$0, $$1);
   }

   @Override
   public eqz z_() {
      return this.e.z_();
   }

   @Override
   public int a(jh $$0, del $$1) {
      return this.d == null ? -1 : $$1.getColor(this.d.a(), (double)$$0.u(), (double)$$0.w());
   }

   @Nullable
   @Override
   public dsm c_(jh $$0) {
      return null;
   }

   @Override
   public dvj a_(jh $$0) {
      return $$0.equals(this.b) ? this.c : dig.a.m();
   }

   @Override
   public erk b_(jh $$0) {
      return this.a_($$0).y();
   }

   @Override
   public int J_() {
      return 1;
   }

   @Override
   public int I_() {
      return this.b.v();
   }
}

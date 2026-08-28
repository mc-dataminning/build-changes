import javax.annotation.Nullable;

public class glr implements ded {
   public static final int a = 1;
   public static final int b = 3;
   private final int e;
   private final int f;
   protected final glq[] c;
   protected final dfb d;

   glr(dfb $$0, int $$1, int $$2, glq[] $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.c = $$3;
   }

   @Override
   public dvj a_(jh $$0) {
      return this.a(kj.a($$0.u()), kj.a($$0.w())).b($$0);
   }

   @Override
   public erk b_(jh $$0) {
      return this.a(kj.a($$0.u()), kj.a($$0.w())).b($$0).y();
   }

   @Override
   public float a(jm $$0, boolean $$1) {
      return this.d.a($$0, $$1);
   }

   @Override
   public eqz z_() {
      return this.d.z_();
   }

   @Nullable
   @Override
   public dsm c_(jh $$0) {
      return this.a(kj.a($$0.u()), kj.a($$0.w())).a($$0);
   }

   private glq a(int $$0, int $$1) {
      return this.c[a(this.e, this.f, $$0, $$1)];
   }

   @Override
   public int a(jh $$0, del $$1) {
      return this.d.a($$0, $$1);
   }

   @Override
   public int I_() {
      return this.d.I_();
   }

   @Override
   public int J_() {
      return this.d.J_();
   }

   public static int a(int $$0, int $$1, int $$2, int $$3) {
      return $$2 - $$0 + ($$3 - $$1) * 3;
   }
}

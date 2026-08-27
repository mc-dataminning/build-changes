import javax.annotation.Nullable;

public class gie implements dbd {
   private final int c;
   private final int d;
   protected final gid[][] a;
   protected final dca b;

   gie(dca $$0, int $$1, int $$2, gid[][] $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   @Override
   public dtc a_(ir $$0) {
      int $$1 = jt.a($$0.u()) - this.c;
      int $$2 = jt.a($$0.w()) - this.d;
      return this.a[$$1][$$2].b($$0);
   }

   @Override
   public epe b_(ir $$0) {
      int $$1 = jt.a($$0.u()) - this.c;
      int $$2 = jt.a($$0.w()) - this.d;
      return this.a[$$1][$$2].b($$0).u();
   }

   @Override
   public float a(iw $$0, boolean $$1) {
      return this.b.a($$0, $$1);
   }

   @Override
   public eot y_() {
      return this.b.y_();
   }

   @Nullable
   @Override
   public dqc c_(ir $$0) {
      int $$1 = jt.a($$0.u()) - this.c;
      int $$2 = jt.a($$0.w()) - this.d;
      return this.a[$$1][$$2].a($$0);
   }

   @Override
   public int a(ir $$0, dbl $$1) {
      return this.b.a($$0, $$1);
   }

   @Override
   public int J_() {
      return this.b.J_();
   }

   @Override
   public int K_() {
      return this.b.K_();
   }

   @Override
   public boolean z_() {
      return this.b.z_();
   }
}

import javax.annotation.Nullable;

public class fwq implements cta {
   private final int c;
   private final int d;
   protected final fwp[][] a;
   protected final ctx b;

   fwq(ctx $$0, int $$1, int $$2, fwp[][] $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   @Override
   public djp a_(hx $$0) {
      int $$1 = iz.a($$0.u()) - this.c;
      int $$2 = iz.a($$0.w()) - this.d;
      return this.a[$$1][$$2].b($$0);
   }

   @Override
   public eez b_(hx $$0) {
      int $$1 = iz.a($$0.u()) - this.c;
      int $$2 = iz.a($$0.w()) - this.d;
      return this.a[$$1][$$2].b($$0).u();
   }

   @Override
   public float a(ic $$0, boolean $$1) {
      return this.b.a($$0, $$1);
   }

   @Override
   public eeo z_() {
      return this.b.z_();
   }

   @Nullable
   @Override
   public dhd c_(hx $$0) {
      int $$1 = iz.a($$0.u()) - this.c;
      int $$2 = iz.a($$0.w()) - this.d;
      return this.a[$$1][$$2].a($$0);
   }

   @Override
   public int a(hx $$0, cti $$1) {
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
}

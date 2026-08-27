import javax.annotation.Nullable;

public class fzo implements cvh {
   private final int c;
   private final int d;
   protected final fzn[][] a;
   protected final cwe b;

   fzo(cwe $$0, int $$1, int $$2, fzn[][] $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   @Override
   public dme a_(ib $$0) {
      int $$1 = jd.a($$0.u()) - this.c;
      int $$2 = jd.a($$0.w()) - this.d;
      return this.a[$$1][$$2].b($$0);
   }

   @Override
   public ehr b_(ib $$0) {
      int $$1 = jd.a($$0.u()) - this.c;
      int $$2 = jd.a($$0.w()) - this.d;
      return this.a[$$1][$$2].b($$0).u();
   }

   @Override
   public float a(ih $$0, boolean $$1) {
      return this.b.a($$0, $$1);
   }

   @Override
   public ehg z_() {
      return this.b.z_();
   }

   @Nullable
   @Override
   public djl c_(ib $$0) {
      int $$1 = jd.a($$0.u()) - this.c;
      int $$2 = jd.a($$0.w()) - this.d;
      return this.a[$$1][$$2].a($$0);
   }

   @Override
   public int a(ib $$0, cvp $$1) {
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

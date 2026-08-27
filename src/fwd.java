import javax.annotation.Nullable;

public class fwd implements csr {
   private final int c;
   private final int d;
   protected final fwc[][] a;
   protected final cto b;

   fwd(cto $$0, int $$1, int $$2, fwc[][] $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   @Override
   public djg a_(hx $$0) {
      int $$1 = iz.a($$0.u()) - this.c;
      int $$2 = iz.a($$0.w()) - this.d;
      return this.a[$$1][$$2].b($$0);
   }

   @Override
   public eeq b_(hx $$0) {
      int $$1 = iz.a($$0.u()) - this.c;
      int $$2 = iz.a($$0.w()) - this.d;
      return this.a[$$1][$$2].b($$0).u();
   }

   @Override
   public float a(ic $$0, boolean $$1) {
      return this.b.a($$0, $$1);
   }

   @Override
   public eef z_() {
      return this.b.z_();
   }

   @Nullable
   @Override
   public dgu c_(hx $$0) {
      int $$1 = iz.a($$0.u()) - this.c;
      int $$2 = iz.a($$0.w()) - this.d;
      return this.a[$$1][$$2].a($$0);
   }

   @Override
   public int a(hx $$0, csz $$1) {
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

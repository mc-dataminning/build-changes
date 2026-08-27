import javax.annotation.Nullable;

public class fvw implements csl {
   private final int c;
   private final int d;
   protected final fvv[][] a;
   protected final cti b;

   fvw(cti $$0, int $$1, int $$2, fvv[][] $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   @Override
   public dja a_(hx $$0) {
      int $$1 = iz.a($$0.u()) - this.c;
      int $$2 = iz.a($$0.w()) - this.d;
      return this.a[$$1][$$2].b($$0);
   }

   @Override
   public eek b_(hx $$0) {
      int $$1 = iz.a($$0.u()) - this.c;
      int $$2 = iz.a($$0.w()) - this.d;
      return this.a[$$1][$$2].b($$0).u();
   }

   @Override
   public float a(ic $$0, boolean $$1) {
      return this.b.a($$0, $$1);
   }

   @Override
   public edz z_() {
      return this.b.z_();
   }

   @Nullable
   @Override
   public dgo c_(hx $$0) {
      int $$1 = iz.a($$0.u()) - this.c;
      int $$2 = iz.a($$0.w()) - this.d;
      return this.a[$$1][$$2].a($$0);
   }

   @Override
   public int a(hx $$0, cst $$1) {
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

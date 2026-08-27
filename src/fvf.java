import javax.annotation.Nullable;

public class fvf implements csb {
   private final int c;
   private final int d;
   protected final fve[][] a;
   protected final csy b;

   fvf(csy $$0, int $$1, int $$2, fve[][] $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   @Override
   public dip a_(hv $$0) {
      int $$1 = ix.a($$0.u()) - this.c;
      int $$2 = ix.a($$0.w()) - this.d;
      return this.a[$$1][$$2].b($$0);
   }

   @Override
   public edz b_(hv $$0) {
      int $$1 = ix.a($$0.u()) - this.c;
      int $$2 = ix.a($$0.w()) - this.d;
      return this.a[$$1][$$2].b($$0).u();
   }

   @Override
   public float a(ia $$0, boolean $$1) {
      return this.b.a($$0, $$1);
   }

   @Override
   public edo z_() {
      return this.b.z_();
   }

   @Nullable
   @Override
   public dgd c_(hv $$0) {
      int $$1 = ix.a($$0.u()) - this.c;
      int $$2 = ix.a($$0.w()) - this.d;
      return this.a[$$1][$$2].a($$0);
   }

   @Override
   public int a(hv $$0, csj $$1) {
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

import javax.annotation.Nullable;

public class fyj implements cuq {
   private final int c;
   private final int d;
   protected final fyi[][] a;
   protected final cvn b;

   fyj(cvn $$0, int $$1, int $$2, fyi[][] $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   @Override
   public dlf a_(hz $$0) {
      int $$1 = jb.a($$0.u()) - this.c;
      int $$2 = jb.a($$0.w()) - this.d;
      return this.a[$$1][$$2].b($$0);
   }

   @Override
   public egp b_(hz $$0) {
      int $$1 = jb.a($$0.u()) - this.c;
      int $$2 = jb.a($$0.w()) - this.d;
      return this.a[$$1][$$2].b($$0).u();
   }

   @Override
   public float a(ie $$0, boolean $$1) {
      return this.b.a($$0, $$1);
   }

   @Override
   public ege z_() {
      return this.b.z_();
   }

   @Nullable
   @Override
   public dit c_(hz $$0) {
      int $$1 = jb.a($$0.u()) - this.c;
      int $$2 = jb.a($$0.w()) - this.d;
      return this.a[$$1][$$2].a($$0);
   }

   @Override
   public int a(hz $$0, cuy $$1) {
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

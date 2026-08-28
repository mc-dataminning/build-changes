import javax.annotation.Nullable;

public class ghb implements dbi {
   private final int c;
   private final int d;
   protected final gha[][] a;
   protected final dcf b;

   ghb(dcf $$0, int $$1, int $$2, gha[][] $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   @Override
   public dsk a_(ja $$0) {
      int $$1 = kc.a($$0.u()) - this.c;
      int $$2 = kc.a($$0.w()) - this.d;
      return this.a[$$1][$$2].b($$0);
   }

   @Override
   public eoh b_(ja $$0) {
      int $$1 = kc.a($$0.u()) - this.c;
      int $$2 = kc.a($$0.w()) - this.d;
      return this.a[$$1][$$2].b($$0).u();
   }

   @Override
   public float a(jf $$0, boolean $$1) {
      return this.b.a($$0, $$1);
   }

   @Override
   public enw y_() {
      return this.b.y_();
   }

   @Nullable
   @Override
   public dpp c_(ja $$0) {
      int $$1 = kc.a($$0.u()) - this.c;
      int $$2 = kc.a($$0.w()) - this.d;
      return this.a[$$1][$$2].a($$0);
   }

   @Override
   public int a(ja $$0, dbq $$1) {
      return this.b.a($$0, $$1);
   }

   @Override
   public int I_() {
      return this.b.I_();
   }

   @Override
   public int J_() {
      return this.b.J_();
   }
}

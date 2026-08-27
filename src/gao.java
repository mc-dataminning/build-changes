import javax.annotation.Nullable;

public class gao implements cwc {
   private final int c;
   private final int d;
   protected final gan[][] a;
   protected final cwz b;

   gao(cwz $$0, int $$1, int $$2, gan[][] $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   @Override
   public dmz a_(ib $$0) {
      int $$1 = je.a($$0.u()) - this.c;
      int $$2 = je.a($$0.w()) - this.d;
      return this.a[$$1][$$2].b($$0);
   }

   @Override
   public ein b_(ib $$0) {
      int $$1 = je.a($$0.u()) - this.c;
      int $$2 = je.a($$0.w()) - this.d;
      return this.a[$$1][$$2].b($$0).u();
   }

   @Override
   public float a(ih $$0, boolean $$1) {
      return this.b.a($$0, $$1);
   }

   @Override
   public eic y_() {
      return this.b.y_();
   }

   @Nullable
   @Override
   public dkg c_(ib $$0) {
      int $$1 = je.a($$0.u()) - this.c;
      int $$2 = je.a($$0.w()) - this.d;
      return this.a[$$1][$$2].a($$0);
   }

   @Override
   public int a(ib $$0, cwk $$1) {
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

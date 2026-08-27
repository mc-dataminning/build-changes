import javax.annotation.Nullable;

public class gfi implements daa {
   private final int c;
   private final int d;
   protected final gfh[][] a;
   protected final dax b;

   gfi(dax $$0, int $$1, int $$2, gfh[][] $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   @Override
   public drb a_(io $$0) {
      int $$1 = jq.a($$0.u()) - this.c;
      int $$2 = jq.a($$0.w()) - this.d;
      return this.a[$$1][$$2].b($$0);
   }

   @Override
   public emu b_(io $$0) {
      int $$1 = jq.a($$0.u()) - this.c;
      int $$2 = jq.a($$0.w()) - this.d;
      return this.a[$$1][$$2].b($$0).u();
   }

   @Override
   public float a(it $$0, boolean $$1) {
      return this.b.a($$0, $$1);
   }

   @Override
   public emj y_() {
      return this.b.y_();
   }

   @Nullable
   @Override
   public dog c_(io $$0) {
      int $$1 = jq.a($$0.u()) - this.c;
      int $$2 = jq.a($$0.w()) - this.d;
      return this.a[$$1][$$2].a($$0);
   }

   @Override
   public int a(io $$0, dai $$1) {
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

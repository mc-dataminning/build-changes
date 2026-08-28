import javax.annotation.Nullable;

public class ggm implements dbb {
   private final int c;
   private final int d;
   protected final ggl[][] a;
   protected final dby b;

   ggm(dby $$0, int $$1, int $$2, ggl[][] $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   @Override
   public dsc a_(iz $$0) {
      int $$1 = kb.a($$0.u()) - this.c;
      int $$2 = kb.a($$0.w()) - this.d;
      return this.a[$$1][$$2].b($$0);
   }

   @Override
   public env b_(iz $$0) {
      int $$1 = kb.a($$0.u()) - this.c;
      int $$2 = kb.a($$0.w()) - this.d;
      return this.a[$$1][$$2].b($$0).u();
   }

   @Override
   public float a(je $$0, boolean $$1) {
      return this.b.a($$0, $$1);
   }

   @Override
   public enk y_() {
      return this.b.y_();
   }

   @Nullable
   @Override
   public dph c_(iz $$0) {
      int $$1 = kb.a($$0.u()) - this.c;
      int $$2 = kb.a($$0.w()) - this.d;
      return this.a[$$1][$$2].a($$0);
   }

   @Override
   public int a(iz $$0, dbj $$1) {
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

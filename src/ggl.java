import javax.annotation.Nullable;

public class ggl implements dba {
   private final int c;
   private final int d;
   protected final ggk[][] a;
   protected final dbx b;

   ggl(dbx $$0, int $$1, int $$2, ggk[][] $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   @Override
   public dsb a_(iz $$0) {
      int $$1 = kb.a($$0.u()) - this.c;
      int $$2 = kb.a($$0.w()) - this.d;
      return this.a[$$1][$$2].b($$0);
   }

   @Override
   public enu b_(iz $$0) {
      int $$1 = kb.a($$0.u()) - this.c;
      int $$2 = kb.a($$0.w()) - this.d;
      return this.a[$$1][$$2].b($$0).u();
   }

   @Override
   public float a(je $$0, boolean $$1) {
      return this.b.a($$0, $$1);
   }

   @Override
   public enj y_() {
      return this.b.y_();
   }

   @Nullable
   @Override
   public dpg c_(iz $$0) {
      int $$1 = kb.a($$0.u()) - this.c;
      int $$2 = kb.a($$0.w()) - this.d;
      return this.a[$$1][$$2].a($$0);
   }

   @Override
   public int a(iz $$0, dbi $$1) {
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

import javax.annotation.Nullable;

public class gem implements czg {
   private final int c;
   private final int d;
   protected final gel[][] a;
   protected final dad b;

   gem(dad $$0, int $$1, int $$2, gel[][] $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   @Override
   public dqh a_(in $$0) {
      int $$1 = jp.a($$0.u()) - this.c;
      int $$2 = jp.a($$0.w()) - this.d;
      return this.a[$$1][$$2].b($$0);
   }

   @Override
   public ema b_(in $$0) {
      int $$1 = jp.a($$0.u()) - this.c;
      int $$2 = jp.a($$0.w()) - this.d;
      return this.a[$$1][$$2].b($$0).u();
   }

   @Override
   public float a(is $$0, boolean $$1) {
      return this.b.a($$0, $$1);
   }

   @Override
   public elp y_() {
      return this.b.y_();
   }

   @Nullable
   @Override
   public dnm c_(in $$0) {
      int $$1 = jp.a($$0.u()) - this.c;
      int $$2 = jp.a($$0.w()) - this.d;
      return this.a[$$1][$$2].a($$0);
   }

   @Override
   public int a(in $$0, czo $$1) {
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

import javax.annotation.Nullable;

public class ys implements ve<wx> {
   private final int a;
   private final cfq<?> b;
   private final tm c;

   public ys(int $$0, cfq<?> $$1, tm $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public ys(sp $$0) {
      this.a = $$0.m();
      this.b = $$0.a(jd.s);
      this.c = $$0.l();
   }

   @Override
   public void a(sp $$0) {
      $$0.c(this.a);
      $$0.a(jd.s, this.b);
      $$0.a(this.c);
   }

   public void a(wx $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   @Nullable
   public cfq<?> d() {
      return this.b;
   }

   public tm e() {
      return this.c;
   }
}

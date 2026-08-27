import javax.annotation.Nullable;

public class ys implements vd<ww> {
   private final int a;
   private final cfq<?> b;
   private final tl c;

   public ys(int $$0, cfq<?> $$1, tl $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public ys(so $$0) {
      this.a = $$0.m();
      this.b = $$0.a(jd.s);
      this.c = $$0.l();
   }

   @Override
   public void a(so $$0) {
      $$0.c(this.a);
      $$0.a(jd.s, this.b);
      $$0.a(this.c);
   }

   public void a(ww $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   @Nullable
   public cfq<?> d() {
      return this.b;
   }

   public tl e() {
      return this.c;
   }
}

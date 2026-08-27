import javax.annotation.Nullable;

public class yt implements vf<wy> {
   private final int a;
   private final cfs<?> b;
   private final tn c;

   public yt(int $$0, cfs<?> $$1, tn $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public yt(sq $$0) {
      this.a = $$0.m();
      this.b = $$0.a(jd.s);
      this.c = $$0.l();
   }

   @Override
   public void a(sq $$0) {
      $$0.c(this.a);
      $$0.a(jd.s, this.b);
      $$0.a(this.c);
   }

   public void a(wy $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   @Nullable
   public cfs<?> d() {
      return this.b;
   }

   public tn e() {
      return this.c;
   }
}

import javax.annotation.Nullable;

public class yk implements uw<wo> {
   private final int a;
   private final cfh<?> b;
   private final te c;

   public yk(int $$0, cfh<?> $$1, te $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public yk(sh $$0) {
      this.a = $$0.m();
      this.b = $$0.a(jc.s);
      this.c = $$0.l();
   }

   @Override
   public void a(sh $$0) {
      $$0.c(this.a);
      $$0.a(jc.s, this.b);
      $$0.a(this.c);
   }

   public void a(wo $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   @Nullable
   public cfh<?> d() {
      return this.b;
   }

   public te e() {
      return this.c;
   }
}

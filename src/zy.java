import javax.annotation.Nullable;

public class zy implements wk<yd> {
   private final int a;
   private final chl<?> b;
   private final ur c;

   public zy(int $$0, chl<?> $$1, ur $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public zy(tu $$0) {
      this.a = $$0.n();
      this.b = $$0.a(jy.s);
      this.c = $$0.m();
   }

   @Override
   public void a(tu $$0) {
      $$0.c(this.a);
      $$0.a(jy.s, this.b);
      $$0.a(this.c);
   }

   public void a(yd $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   @Nullable
   public chl<?> d() {
      return this.b;
   }

   public ur e() {
      return this.c;
   }
}

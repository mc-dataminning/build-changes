import javax.annotation.Nullable;

public class yr implements vd<ww> {
   private final int a;
   private final cfq<?> b;
   private final tl c;

   public yr(int $$0, cfq<?> $$1, tl $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public yr(so $$0) {
      this.a = $$0.m();
      this.b = $$0.a(jb.s);
      this.c = $$0.l();
   }

   @Override
   public void a(so $$0) {
      $$0.c(this.a);
      $$0.a(jb.s, this.b);
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

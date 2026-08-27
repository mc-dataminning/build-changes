import javax.annotation.Nullable;

public class ys implements ve<wx> {
   private final int a;
   private final cfw<?> b;
   private final tl c;

   public ys(int $$0, cfw<?> $$1, tl $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public ys(so $$0) {
      this.a = $$0.n();
      this.b = $$0.a(jb.s);
      this.c = $$0.m();
   }

   @Override
   public void a(so $$0) {
      $$0.c(this.a);
      $$0.a(jb.s, this.b);
      $$0.a(this.c);
   }

   public void a(wx $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   @Nullable
   public cfw<?> d() {
      return this.b;
   }

   public tl e() {
      return this.c;
   }
}

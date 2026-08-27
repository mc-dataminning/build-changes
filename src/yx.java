import java.util.List;

public class yx implements wk<yd> {
   private final int a;
   private final int b;
   private final List<clj> c;
   private final clj d;

   public yx(int $$0, int $$1, il<clj> $$2, clj $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = il.a($$2.size(), clj.b);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.c.set($$4, $$2.get($$4).p());
      }

      this.d = $$3.p();
   }

   public yx(tu $$0) {
      this.a = $$0.readUnsignedByte();
      this.b = $$0.n();
      this.c = $$0.a(il::a, tu::r);
      this.d = $$0.r();
   }

   @Override
   public void a(tu $$0) {
      $$0.k(this.a);
      $$0.c(this.b);
      $$0.a(this.c, tu::a);
      $$0.a(this.d);
   }

   public void a(yd $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public List<clj> d() {
      return this.c;
   }

   public clj e() {
      return this.d;
   }

   public int f() {
      return this.b;
   }
}

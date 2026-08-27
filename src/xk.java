import java.util.List;

public class xk implements ux<wp> {
   private final int a;
   private final int b;
   private final List<ciy> c;
   private final ciy d;

   public xk(int $$0, int $$1, hn<ciy> $$2, ciy $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = hn.a($$2.size(), ciy.b);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.c.set($$4, $$2.get($$4).p());
      }

      this.d = $$3.p();
   }

   public xk(si $$0) {
      this.a = $$0.readUnsignedByte();
      this.b = $$0.m();
      this.c = $$0.a(hn::a, si::q);
      this.d = $$0.q();
   }

   @Override
   public void a(si $$0) {
      $$0.k(this.a);
      $$0.c(this.b);
      $$0.a(this.c, si::a);
      $$0.a(this.d);
   }

   public void a(wp $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public List<ciy> d() {
      return this.c;
   }

   public ciy e() {
      return this.d;
   }

   public int f() {
      return this.b;
   }
}

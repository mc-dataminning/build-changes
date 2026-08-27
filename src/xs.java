import java.util.List;

public class xs implements vf<wy> {
   private final int a;
   private final int b;
   private final List<cjh> c;
   private final cjh d;

   public xs(int $$0, int $$1, hp<cjh> $$2, cjh $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = hp.a($$2.size(), cjh.b);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.c.set($$4, $$2.get($$4).p());
      }

      this.d = $$3.p();
   }

   public xs(sq $$0) {
      this.a = $$0.readUnsignedByte();
      this.b = $$0.m();
      this.c = $$0.a(hp::a, sq::q);
      this.d = $$0.q();
   }

   @Override
   public void a(sq $$0) {
      $$0.k(this.a);
      $$0.c(this.b);
      $$0.a(this.c, sq::a);
      $$0.a(this.d);
   }

   public void a(wy $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public List<cjh> d() {
      return this.c;
   }

   public cjh e() {
      return this.d;
   }

   public int f() {
      return this.b;
   }
}

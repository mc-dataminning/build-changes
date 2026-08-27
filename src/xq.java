import java.util.List;

public class xq implements vd<ww> {
   private final int a;
   private final int b;
   private final List<cjf> c;
   private final cjf d;

   public xq(int $$0, int $$1, hn<cjf> $$2, cjf $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = hn.a($$2.size(), cjf.b);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.c.set($$4, $$2.get($$4).p());
      }

      this.d = $$3.p();
   }

   public xq(so $$0) {
      this.a = $$0.readUnsignedByte();
      this.b = $$0.m();
      this.c = $$0.a(hn::a, so::q);
      this.d = $$0.q();
   }

   @Override
   public void a(so $$0) {
      $$0.k(this.a);
      $$0.c(this.b);
      $$0.a(this.c, so::a);
      $$0.a(this.d);
   }

   public void a(ww $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public List<cjf> d() {
      return this.c;
   }

   public cjf e() {
      return this.d;
   }

   public int f() {
      return this.b;
   }
}

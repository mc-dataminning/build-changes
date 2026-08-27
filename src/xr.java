import java.util.List;

public class xr implements ve<wx> {
   private final int a;
   private final int b;
   private final List<cjl> c;
   private final cjl d;

   public xr(int $$0, int $$1, hn<cjl> $$2, cjl $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = hn.a($$2.size(), cjl.b);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.c.set($$4, $$2.get($$4).p());
      }

      this.d = $$3.p();
   }

   public xr(so $$0) {
      this.a = $$0.readUnsignedByte();
      this.b = $$0.n();
      this.c = $$0.a(hn::a, so::r);
      this.d = $$0.r();
   }

   @Override
   public void a(so $$0) {
      $$0.k(this.a);
      $$0.c(this.b);
      $$0.a(this.c, so::a);
      $$0.a(this.d);
   }

   public void a(wx $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public List<cjl> d() {
      return this.c;
   }

   public cjl e() {
      return this.d;
   }

   public int f() {
      return this.b;
   }
}

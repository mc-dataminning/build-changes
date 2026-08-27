import java.util.List;

public class zv implements xg<zb> {
   private final int a;
   private final int b;
   private final List<cng> c;
   private final cng d;

   public zv(int $$0, int $$1, iq<cng> $$2, cng $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = iq.a($$2.size(), cng.f);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.c.set($$4, $$2.get($$4).p());
      }

      this.d = $$3.p();
   }

   public zv(uj $$0) {
      this.a = $$0.readUnsignedByte();
      this.b = $$0.n();
      this.c = $$0.a(iq::a, uj::r);
      this.d = $$0.r();
   }

   @Override
   public void a(uj $$0) {
      $$0.k(this.a);
      $$0.c(this.b);
      $$0.a(this.c, uj::a);
      $$0.a(this.d);
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public List<cng> d() {
      return this.c;
   }

   public cng e() {
      return this.d;
   }

   public int f() {
      return this.b;
   }
}

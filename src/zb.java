import java.util.List;

public class zb implements wo<yh> {
   private final int a;
   private final int b;
   private final List<clo> c;
   private final clo d;

   public zb(int $$0, int $$1, ip<clo> $$2, clo $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = ip.a($$2.size(), clo.b);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.c.set($$4, $$2.get($$4).p());
      }

      this.d = $$3.p();
   }

   public zb(ty $$0) {
      this.a = $$0.readUnsignedByte();
      this.b = $$0.n();
      this.c = $$0.a(ip::a, ty::r);
      this.d = $$0.r();
   }

   @Override
   public void a(ty $$0) {
      $$0.k(this.a);
      $$0.c(this.b);
      $$0.a(this.c, ty::a);
      $$0.a(this.d);
   }

   public void a(yh $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public List<clo> d() {
      return this.c;
   }

   public clo e() {
      return this.d;
   }

   public int f() {
      return this.b;
   }
}

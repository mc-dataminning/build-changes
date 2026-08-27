import java.util.List;

public class xn implements va<ws> {
   private final int a;
   private final int b;
   private final List<cja> c;
   private final cja d;

   public xn(int $$0, int $$1, hp<cja> $$2, cja $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = hp.a($$2.size(), cja.b);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.c.set($$4, $$2.get($$4).p());
      }

      this.d = $$3.p();
   }

   public xn(sl $$0) {
      this.a = $$0.readUnsignedByte();
      this.b = $$0.m();
      this.c = $$0.a(hp::a, sl::q);
      this.d = $$0.q();
   }

   @Override
   public void a(sl $$0) {
      $$0.k(this.a);
      $$0.c(this.b);
      $$0.a(this.c, sl::a);
      $$0.a(this.d);
   }

   public void a(ws $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public List<cja> d() {
      return this.c;
   }

   public cja e() {
      return this.d;
   }

   public int f() {
      return this.b;
   }
}

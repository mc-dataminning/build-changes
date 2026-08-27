import java.util.List;

public class xj implements uw<wo> {
   private final int a;
   private final int b;
   private final List<ciw> c;
   private final ciw d;

   public xj(int $$0, int $$1, ho<ciw> $$2, ciw $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = ho.a($$2.size(), ciw.b);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.c.set($$4, $$2.get($$4).p());
      }

      this.d = $$3.p();
   }

   public xj(sh $$0) {
      this.a = $$0.readUnsignedByte();
      this.b = $$0.m();
      this.c = $$0.a(ho::a, sh::q);
      this.d = $$0.q();
   }

   @Override
   public void a(sh $$0) {
      $$0.k(this.a);
      $$0.c(this.b);
      $$0.a(this.c, sh::a);
      $$0.a(this.d);
   }

   public void a(wo $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public List<ciw> d() {
      return this.c;
   }

   public ciw e() {
      return this.d;
   }

   public int f() {
      return this.b;
   }
}

import java.util.List;

public class yo implements wb<xu> {
   private final int a;
   private final int b;
   private final List<ckj> c;
   private final ckj d;

   public yo(int $$0, int $$1, il<ckj> $$2, ckj $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = il.a($$2.size(), ckj.b);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.c.set($$4, $$2.get($$4).p());
      }

      this.d = $$3.p();
   }

   public yo(tl $$0) {
      this.a = $$0.readUnsignedByte();
      this.b = $$0.n();
      this.c = $$0.a(il::a, tl::r);
      this.d = $$0.r();
   }

   @Override
   public void a(tl $$0) {
      $$0.k(this.a);
      $$0.c(this.b);
      $$0.a(this.c, tl::a);
      $$0.a(this.d);
   }

   public void a(xu $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public List<ckj> d() {
      return this.c;
   }

   public ckj e() {
      return this.d;
   }

   public int f() {
      return this.b;
   }
}

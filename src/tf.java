import java.util.function.Consumer;

public record tf(String a, String b, String c, dqe d, int e, long f, boolean g, boolean h, int i, int j, boolean k, Consumer<sk> l) {
   public tf(String $$0, String $$1, String $$2, int $$3, long $$4, boolean $$5, Consumer<sk> $$6) {
      this($$0, $$1, $$2, dqe.a, $$3, $$4, $$5, false, 1, 1, false, $$6);
   }

   public tf(String $$0, String $$1, String $$2, dqe $$3, int $$4, long $$5, boolean $$6, Consumer<sk> $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, false, 1, 1, false, $$7);
   }

   public void a(sk $$0) {
      this.l.accept($$0);
   }

   @Override
   public String toString() {
      return this.b;
   }

   public boolean a() {
      return this.i > 1;
   }

   public String b() {
      return this.a;
   }

   public String c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public dqe e() {
      return this.d;
   }

   public int f() {
      return this.e;
   }

   public long g() {
      return this.f;
   }

   public boolean h() {
      return this.g;
   }

   public boolean i() {
      return this.h;
   }

   public int j() {
      return this.i;
   }

   public int k() {
      return this.j;
   }

   public boolean l() {
      return this.k;
   }

   public Consumer<sk> m() {
      return this.l;
   }
}

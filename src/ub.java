import java.util.function.Consumer;

public record ub(String a, String b, String c, dqv d, int e, long f, boolean g, boolean h, int i, int j, boolean k, Consumer<tg> l) {
   public ub(String $$0, String $$1, String $$2, int $$3, long $$4, boolean $$5, Consumer<tg> $$6) {
      this($$0, $$1, $$2, dqv.a, $$3, $$4, $$5, false, 1, 1, false, $$6);
   }

   public ub(String $$0, String $$1, String $$2, dqv $$3, int $$4, long $$5, boolean $$6, Consumer<tg> $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, false, 1, 1, false, $$7);
   }

   public void a(tg $$0) {
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

   public dqv e() {
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

   public Consumer<tg> m() {
      return this.l;
   }
}

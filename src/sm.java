import java.util.function.Consumer;

public record sm(String a, String b, String c, dfe d, int e, long f, boolean g, int h, int i, Consumer<rr> j) {
   public sm(String $$0, String $$1, String $$2, int $$3, long $$4, boolean $$5, Consumer<rr> $$6) {
      this($$0, $$1, $$2, dfe.a, $$3, $$4, $$5, 1, 1, $$6);
   }

   public sm(String $$0, String $$1, String $$2, dfe $$3, int $$4, long $$5, boolean $$6, Consumer<rr> $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, 1, 1, $$7);
   }

   public void a(rr $$0) {
      this.j.accept($$0);
   }

   @Override
   public String toString() {
      return this.b;
   }

   public boolean a() {
      return this.h > 1;
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

   public dfe e() {
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

   public int i() {
      return this.h;
   }

   public int j() {
      return this.i;
   }

   public Consumer<rr> k() {
      return this.j;
   }
}

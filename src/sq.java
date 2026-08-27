import java.util.function.Consumer;

public record sq(String a, String b, String c, dgm d, int e, long f, boolean g, int h, int i, Consumer<rv> j) {
   public sq(String $$0, String $$1, String $$2, int $$3, long $$4, boolean $$5, Consumer<rv> $$6) {
      this($$0, $$1, $$2, dgm.a, $$3, $$4, $$5, 1, 1, $$6);
   }

   public sq(String $$0, String $$1, String $$2, dgm $$3, int $$4, long $$5, boolean $$6, Consumer<rv> $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, 1, 1, $$7);
   }

   public void a(rv $$0) {
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

   public dgm e() {
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

   public Consumer<rv> k() {
      return this.j;
   }
}

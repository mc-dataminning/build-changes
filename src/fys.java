import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Vector3f;

public record fys(fyr a, int b, int c) {
   private static final fys d = new fys(0, 0, 0, 0);

   public fys(int $$0, int $$1, int $$2, int $$3) {
      this(new fyr($$0, $$1), $$2, $$3);
   }

   public static fys a() {
      return d;
   }

   public static fys a(fyp $$0, int $$1, int $$2, int $$3, int $$4) {
      return switch ($$0) {
         case a -> new fys($$1, $$2, $$3, $$4);
         case b -> new fys($$2, $$1, $$4, $$3);
      };
   }

   public fys a(fyq $$0) {
      return new fys(this.a.a($$0), this.b, this.c);
   }

   public int a(fyp $$0) {
      return switch ($$0) {
         case a -> this.b;
         case b -> this.c;
      };
   }

   public int b(fyq $$0) {
      fyp $$1 = $$0.a();
      return $$0.c() ? this.a.a($$1) + this.a($$1) - 1 : this.a.a($$1);
   }

   public fys c(fyq $$0) {
      int $$1 = this.b($$0);
      fyp $$2 = $$0.a().a();
      int $$3 = this.b($$2.c());
      int $$4 = this.a($$2);
      return a($$0.a(), $$1, $$3, 1, $$4).a($$0);
   }

   public boolean a(fys $$0) {
      return this.a($$0, fyp.a) && this.a($$0, fyp.b);
   }

   public boolean a(fys $$0, fyp $$1) {
      int $$2 = this.b($$1.c());
      int $$3 = $$0.b($$1.c());
      int $$4 = this.b($$1.b());
      int $$5 = $$0.b($$1.b());
      return Math.max($$2, $$3) <= Math.min($$4, $$5);
   }

   public int b(fyp $$0) {
      return (this.b($$0.b()) + this.b($$0.c())) / 2;
   }

   @Nullable
   public fys b(fys $$0) {
      int $$1 = Math.max(this.d(), $$0.d());
      int $$2 = Math.max(this.b(), $$0.b());
      int $$3 = Math.min(this.e(), $$0.e());
      int $$4 = Math.min(this.c(), $$0.c());
      return $$1 < $$3 && $$2 < $$4 ? new fys($$1, $$2, $$3 - $$1, $$4 - $$2) : null;
   }

   public int b() {
      return this.a.b();
   }

   public int c() {
      return this.a.b() + this.c;
   }

   public int d() {
      return this.a.a();
   }

   public int e() {
      return this.a.a() + this.b;
   }

   public boolean a(int $$0, int $$1) {
      return $$0 >= this.d() && $$0 < this.e() && $$1 >= this.b() && $$1 < this.c();
   }

   public fys a(Matrix4f $$0) {
      if (f.a($$0)) {
         return this;
      } else {
         Vector3f $$1 = $$0.transformPosition((float)this.d(), (float)this.b(), 0.0F, new Vector3f());
         Vector3f $$2 = $$0.transformPosition((float)this.e(), (float)this.c(), 0.0F, new Vector3f());
         return new fys(azo.d($$1.x), azo.d($$1.y), azo.d($$2.x - $$1.x), azo.d($$2.y - $$1.y));
      }
   }

   public fyr f() {
      return this.a;
   }

   public int g() {
      return this.b;
   }

   public int h() {
      return this.c;
   }
}

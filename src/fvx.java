import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fvx(ebx a, kc<dza> b, ebu c, jw<alq> d, als e, dfr f) {
   public fvx(ebv $$0, jw<alq> $$1, als $$2, dfr $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3);
   }

   public fvx(ebx $$0, ebu $$1, jw<alq> $$2, als $$3, dfr $$4) {
      this($$0, $$2.a(alq.c).e(ly.bc), $$1, $$2.a(alq.c), $$3, $$4);
   }

   public fvx a(ebx $$0, ebu $$1) {
      return new fvx($$0, this.b, $$1, this.d, this.e, this.f);
   }

   public fvx a(fvx.b $$0) {
      return new fvx($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f);
   }

   public fvx a(fvx.a $$0) {
      return new fvx(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f);
   }

   public kd.b a() {
      return this.d.a();
   }

   public void b() {
      for (dza $$0 : this.d()) {
         $$0.b().a();
      }
   }

   public ebx c() {
      return this.a;
   }

   public kc<dza> d() {
      return this.b;
   }

   public ebu e() {
      return this.c;
   }

   public jw<alq> f() {
      return this.d;
   }

   public als g() {
      return this.e;
   }

   public dfr h() {
      return this.f;
   }

   @FunctionalInterface
   public interface a extends BiFunction<kd.b, ebu, ebu> {
   }

   public interface b extends UnaryOperator<ebx> {
   }
}

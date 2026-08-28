import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fxf(eco a, kd<dzr> b, ecl c, jx<als> d, alu e, dgj f, fxa g) {
   public fxf(ecm $$0, jx<als> $$1, alu $$2, dgj $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3, new fxa(fxh.a.a, Set.of(), null));
   }

   public fxf(eco $$0, ecl $$1, jx<als> $$2, alu $$3, dgj $$4, fxa $$5) {
      this($$0, $$2.a(als.c).e(ma.bc), $$1, $$2.a(als.c), $$3, $$4, $$5);
   }

   public fxf a(eco $$0, ecl $$1) {
      return new fxf($$0, this.b, $$1, this.d, this.e, this.f, this.g);
   }

   public fxf a(fxf.b $$0) {
      return new fxf($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public fxf a(fxf.a $$0) {
      return new fxf(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f, this.g);
   }

   public ke.b a() {
      return this.d.a();
   }

   public void b() {
      for (dzr $$0 : this.d()) {
         $$0.b().a();
      }
   }

   public eco c() {
      return this.a;
   }

   public kd<dzr> d() {
      return this.b;
   }

   public ecl e() {
      return this.c;
   }

   public jx<als> f() {
      return this.d;
   }

   public alu g() {
      return this.e;
   }

   public dgj h() {
      return this.f;
   }

   public fxa i() {
      return this.g;
   }

   @FunctionalInterface
   public interface a extends BiFunction<ke.b, ecl, ecl> {
   }

   public interface b extends UnaryOperator<eco> {
   }
}

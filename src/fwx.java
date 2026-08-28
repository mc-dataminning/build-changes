import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fwx(ech a, kd<dzk> b, ece c, jx<alu> d, alw e, dgc f, fws g) {
   public fwx(ecf $$0, jx<alu> $$1, alw $$2, dgc $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3, new fws(fwz.a.a, Set.of(), null));
   }

   public fwx(ech $$0, ece $$1, jx<alu> $$2, alw $$3, dgc $$4, fws $$5) {
      this($$0, $$2.a(alu.c).e(ma.bc), $$1, $$2.a(alu.c), $$3, $$4, $$5);
   }

   public fwx a(ech $$0, ece $$1) {
      return new fwx($$0, this.b, $$1, this.d, this.e, this.f, this.g);
   }

   public fwx a(fwx.b $$0) {
      return new fwx($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public fwx a(fwx.a $$0) {
      return new fwx(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f, this.g);
   }

   public ke.b a() {
      return this.d.a();
   }

   public void b() {
      for (dzk $$0 : this.d()) {
         $$0.b().a();
      }
   }

   public ech c() {
      return this.a;
   }

   public kd<dzk> d() {
      return this.b;
   }

   public ece e() {
      return this.c;
   }

   public jx<alu> f() {
      return this.d;
   }

   public alw g() {
      return this.e;
   }

   public dgc h() {
      return this.f;
   }

   public fws i() {
      return this.g;
   }

   @FunctionalInterface
   public interface a extends BiFunction<ke.b, ece, ece> {
   }

   public interface b extends UnaryOperator<ech> {
   }
}

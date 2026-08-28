import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fvm(ebm a, kb<dyp> b, ebj c, jv<aln> d, alp e, dff f) {
   public fvm(ebk $$0, jv<aln> $$1, alp $$2, dff $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3);
   }

   public fvm(ebm $$0, ebj $$1, jv<aln> $$2, alp $$3, dff $$4) {
      this($$0, $$2.a(aln.c).e(lw.bd), $$1, $$2.a(aln.c), $$3, $$4);
   }

   public fvm a(ebm $$0, ebj $$1) {
      return new fvm($$0, this.b, $$1, this.d, this.e, this.f);
   }

   public fvm a(fvm.b $$0) {
      return new fvm($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f);
   }

   public fvm a(fvm.a $$0) {
      return new fvm(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f);
   }

   public kc.b a() {
      return this.d.a();
   }

   public void b() {
      for (dyp $$0 : this.d()) {
         $$0.b().a();
      }
   }

   public ebm c() {
      return this.a;
   }

   public kb<dyp> d() {
      return this.b;
   }

   public ebj e() {
      return this.c;
   }

   public jv<aln> f() {
      return this.d;
   }

   public alp g() {
      return this.e;
   }

   public dff h() {
      return this.f;
   }

   @FunctionalInterface
   public interface a extends BiFunction<kc.b, ebj, ebj> {
   }

   public interface b extends UnaryOperator<ebm> {
   }
}

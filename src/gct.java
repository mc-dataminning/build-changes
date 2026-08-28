import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record gct(egl a, jr<edm> b, egi c, jl<aln> d, alp e, djn f, gco g) {
   public gct(egj $$0, jl<aln> $$1, alp $$2, djn $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3, new gco(gcv.a.a, Set.of(), null));
   }

   public gct(egl $$0, egi $$1, jl<aln> $$2, alp $$3, djn $$4, gco $$5) {
      this($$0, $$2.a(aln.c).f(mg.bn), $$1, $$2.a(aln.c), $$3, $$4, $$5);
   }

   public gct a(egl $$0, egi $$1) {
      return new gct($$0, this.b, $$1, this.d, this.e, this.f, this.g);
   }

   public gct a(gct.b $$0) {
      return new gct($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public gct a(gct.a $$0) {
      return new gct(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f, this.g);
   }

   public js.b a() {
      return this.d.a();
   }

   public void b() {
      for (edm $$0 : this.d()) {
         $$0.b().a();
      }
   }

   public egl c() {
      return this.a;
   }

   public jr<edm> d() {
      return this.b;
   }

   public egi e() {
      return this.c;
   }

   public jl<aln> f() {
      return this.d;
   }

   public alp g() {
      return this.e;
   }

   public djn h() {
      return this.f;
   }

   public gco i() {
      return this.g;
   }

   @FunctionalInterface
   public interface a extends BiFunction<js.b, egi, egi> {
   }

   public interface b extends UnaryOperator<egl> {
   }
}

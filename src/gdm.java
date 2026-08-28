import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record gdm(ehe a, jr<eef> b, ehb c, jl<alp> d, alr e, djy f, gdh g) {
   public gdm(ehc $$0, jl<alp> $$1, alr $$2, djy $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3, new gdh(gdo.a.a, Set.of(), null));
   }

   public gdm(ehe $$0, ehb $$1, jl<alp> $$2, alr $$3, djy $$4, gdh $$5) {
      this($$0, $$2.a(alp.c).f(mg.bp), $$1, $$2.a(alp.c), $$3, $$4, $$5);
   }

   public gdm a(ehe $$0, ehb $$1) {
      return new gdm($$0, this.b, $$1, this.d, this.e, this.f, this.g);
   }

   public gdm a(gdm.b $$0) {
      return new gdm($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public gdm a(gdm.a $$0) {
      return new gdm(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f, this.g);
   }

   public js.b a() {
      return this.d.a();
   }

   public void b() {
      for (eef $$0 : this.d()) {
         $$0.b().a();
      }
   }

   public ehe c() {
      return this.a;
   }

   public jr<eef> d() {
      return this.b;
   }

   public ehb e() {
      return this.c;
   }

   public jl<alp> f() {
      return this.d;
   }

   public alr g() {
      return this.e;
   }

   public djy h() {
      return this.f;
   }

   public gdh i() {
      return this.g;
   }

   @FunctionalInterface
   public interface a extends BiFunction<js.b, ehb, ehb> {
   }

   public interface b extends UnaryOperator<ehe> {
   }
}

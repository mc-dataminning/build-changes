import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record gdy(ehl a, js<eem> b, ehi c, jm<alp> d, alr e, dkf f, gdt g) {
   public gdy(ehj $$0, jm<alp> $$1, alr $$2, dkf $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3, new gdt(gea.a.a, Set.of(), null));
   }

   public gdy(ehl $$0, ehi $$1, jm<alp> $$2, alr $$3, dkf $$4, gdt $$5) {
      this($$0, $$2.a(alp.c).f(mh.bp), $$1, $$2.a(alp.c), $$3, $$4, $$5);
   }

   public gdy a(ehl $$0, ehi $$1) {
      return new gdy($$0, this.b, $$1, this.d, this.e, this.f, this.g);
   }

   public gdy a(gdy.b $$0) {
      return new gdy($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public gdy a(gdy.a $$0) {
      return new gdy(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f, this.g);
   }

   public jt.b a() {
      return this.d.a();
   }

   public void b() {
      for (eem $$0 : this.d()) {
         $$0.b().a();
      }
   }

   public ehl c() {
      return this.a;
   }

   public js<eem> d() {
      return this.b;
   }

   public ehi e() {
      return this.c;
   }

   public jm<alp> f() {
      return this.d;
   }

   public alr g() {
      return this.e;
   }

   public dkf h() {
      return this.f;
   }

   public gdt i() {
      return this.g;
   }

   @FunctionalInterface
   public interface a extends BiFunction<jt.b, ehi, ehi> {
   }

   public interface b extends UnaryOperator<ehl> {
   }
}

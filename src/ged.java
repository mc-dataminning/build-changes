import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record ged(ehq a, js<eer> b, ehn c, jm<alp> d, alr e, dkk f, gdy g) {
   public ged(eho $$0, jm<alp> $$1, alr $$2, dkk $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3, new gdy(gef.a.a, Set.of(), null));
   }

   public ged(ehq $$0, ehn $$1, jm<alp> $$2, alr $$3, dkk $$4, gdy $$5) {
      this($$0, $$2.a(alp.c).f(mh.bq), $$1, $$2.a(alp.c), $$3, $$4, $$5);
   }

   public ged a(ehq $$0, ehn $$1) {
      return new ged($$0, this.b, $$1, this.d, this.e, this.f, this.g);
   }

   public ged a(ged.b $$0) {
      return new ged($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public ged a(ged.a $$0) {
      return new ged(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f, this.g);
   }

   public jt.b a() {
      return this.d.a();
   }

   public void b() {
      for (eer $$0 : this.d()) {
         $$0.b().a();
      }
   }

   public ehq c() {
      return this.a;
   }

   public js<eer> d() {
      return this.b;
   }

   public ehn e() {
      return this.c;
   }

   public jm<alp> f() {
      return this.d;
   }

   public alr g() {
      return this.e;
   }

   public dkk h() {
      return this.f;
   }

   public gdy i() {
      return this.g;
   }

   @FunctionalInterface
   public interface a extends BiFunction<jt.b, ehn, ehn> {
   }

   public interface b extends UnaryOperator<ehq> {
   }
}

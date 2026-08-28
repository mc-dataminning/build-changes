import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record gfo(eib a, js<efc> b, ehy c, jm<alr> d, alt e, dkv f, gfj g) {
   public gfo(ehz $$0, jm<alr> $$1, alt $$2, dkv $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3, new gfj(gfq.a.a, Set.of(), null));
   }

   public gfo(eib $$0, ehy $$1, jm<alr> $$2, alt $$3, dkv $$4, gfj $$5) {
      this($$0, $$2.a(alr.c).f(mh.bq), $$1, $$2.a(alr.c), $$3, $$4, $$5);
   }

   public gfo a(eib $$0, ehy $$1) {
      return new gfo($$0, this.b, $$1, this.d, this.e, this.f, this.g);
   }

   public gfo a(gfo.b $$0) {
      return new gfo($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public gfo a(gfo.a $$0) {
      return new gfo(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f, this.g);
   }

   public jt.b a() {
      return this.d.a();
   }

   public void b() {
      for (efc $$0 : this.d()) {
         $$0.b().a();
      }
   }

   public eib c() {
      return this.a;
   }

   public js<efc> d() {
      return this.b;
   }

   public ehy e() {
      return this.c;
   }

   public jm<alr> f() {
      return this.d;
   }

   public alt g() {
      return this.e;
   }

   public dkv h() {
      return this.f;
   }

   public gfj i() {
      return this.g;
   }

   @FunctionalInterface
   public interface a extends BiFunction<jt.b, ehy, ehy> {
   }

   public interface b extends UnaryOperator<eib> {
   }
}

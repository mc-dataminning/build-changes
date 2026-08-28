import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record gfb(ein a, jt<efo> b, eik c, jn<ama> d, amc e, dlh f, gew g) {
   public gfb(eil $$0, jn<ama> $$1, amc $$2, dlh $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3, new gew(gfd.a.a, Set.of(), null));
   }

   public gfb(ein $$0, eik $$1, jn<ama> $$2, amc $$3, dlh $$4, gew $$5) {
      this($$0, $$2.a(ama.c).f(mi.bq), $$1, $$2.a(ama.c), $$3, $$4, $$5);
   }

   public gfb a(ein $$0, eik $$1) {
      return new gfb($$0, this.b, $$1, this.d, this.e, this.f, this.g);
   }

   public gfb a(gfb.b $$0) {
      return new gfb($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public gfb a(gfb.a $$0) {
      return new gfb(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f, this.g);
   }

   public ju.b a() {
      return this.d.a();
   }

   public void b() {
      for (efo $$0 : this.d()) {
         $$0.b().a();
      }
   }

   public ein c() {
      return this.a;
   }

   public jt<efo> d() {
      return this.b;
   }

   public eik e() {
      return this.c;
   }

   public jn<ama> f() {
      return this.d;
   }

   public amc g() {
      return this.e;
   }

   public dlh h() {
      return this.f;
   }

   public gew i() {
      return this.g;
   }

   @FunctionalInterface
   public interface a extends BiFunction<ju.b, eik, eik> {
   }

   public interface b extends UnaryOperator<ein> {
   }
}

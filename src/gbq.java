import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record gbq(efj a, kf<eck> b, efg c, jz<alm> d, alo e, din f, gbl g) {
   public gbq(efh $$0, jz<alm> $$1, alo $$2, din $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3, new gbl(gbs.a.a, Set.of(), null));
   }

   public gbq(efj $$0, efg $$1, jz<alm> $$2, alo $$3, din $$4, gbl $$5) {
      this($$0, $$2.a(alm.c).f(me.bm), $$1, $$2.a(alm.c), $$3, $$4, $$5);
   }

   public gbq a(efj $$0, efg $$1) {
      return new gbq($$0, this.b, $$1, this.d, this.e, this.f, this.g);
   }

   public gbq a(gbq.b $$0) {
      return new gbq($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public gbq a(gbq.a $$0) {
      return new gbq(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f, this.g);
   }

   public kg.b a() {
      return this.d.a();
   }

   public void b() {
      for (eck $$0 : this.d()) {
         $$0.b().a();
      }
   }

   public efj c() {
      return this.a;
   }

   public kf<eck> d() {
      return this.b;
   }

   public efg e() {
      return this.c;
   }

   public jz<alm> f() {
      return this.d;
   }

   public alo g() {
      return this.e;
   }

   public din h() {
      return this.f;
   }

   public gbl i() {
      return this.g;
   }

   @FunctionalInterface
   public interface a extends BiFunction<kg.b, efg, efg> {
   }

   public interface b extends UnaryOperator<efj> {
   }
}

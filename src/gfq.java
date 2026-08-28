import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record gfq(eid a, jt<efe> b, eia c, jn<alt> d, alv e, dkx f, gfl g) {
   public gfq(eib $$0, jn<alt> $$1, alv $$2, dkx $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3, new gfl(gfs.a.a, Set.of(), null));
   }

   public gfq(eid $$0, eia $$1, jn<alt> $$2, alv $$3, dkx $$4, gfl $$5) {
      this($$0, $$2.a(alt.c).f(mi.bq), $$1, $$2.a(alt.c), $$3, $$4, $$5);
   }

   public gfq a(eid $$0, eia $$1) {
      return new gfq($$0, this.b, $$1, this.d, this.e, this.f, this.g);
   }

   public gfq a(gfq.b $$0) {
      return new gfq($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public gfq a(gfq.a $$0) {
      return new gfq(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f, this.g);
   }

   public ju.b a() {
      return this.d.a();
   }

   public void b() {
      for (efe $$0 : this.d()) {
         $$0.b().a();
      }
   }

   public eid c() {
      return this.a;
   }

   public jt<efe> d() {
      return this.b;
   }

   public eia e() {
      return this.c;
   }

   public jn<alt> f() {
      return this.d;
   }

   public alv g() {
      return this.e;
   }

   public dkx h() {
      return this.f;
   }

   public gfl i() {
      return this.g;
   }

   @FunctionalInterface
   public interface a extends BiFunction<ju.b, eia, eia> {
   }

   public interface b extends UnaryOperator<eid> {
   }
}

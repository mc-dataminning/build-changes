import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fwh(ecd a, kd<dzg> b, eca c, jx<alr> d, alt e, dfx f, fwc g) {
   public fwh(ecb $$0, jx<alr> $$1, alt $$2, dfx $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3, new fwc(fwj.a.a, Set.of(), null));
   }

   public fwh(ecd $$0, eca $$1, jx<alr> $$2, alt $$3, dfx $$4, fwc $$5) {
      this($$0, $$2.a(alr.c).e(lz.bc), $$1, $$2.a(alr.c), $$3, $$4, $$5);
   }

   public fwh a(ecd $$0, eca $$1) {
      return new fwh($$0, this.b, $$1, this.d, this.e, this.f, this.g);
   }

   public fwh a(fwh.b $$0) {
      return new fwh($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public fwh a(fwh.a $$0) {
      return new fwh(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f, this.g);
   }

   public ke.b a() {
      return this.d.a();
   }

   public void b() {
      for (dzg $$0 : this.d()) {
         $$0.b().a();
      }
   }

   public ecd c() {
      return this.a;
   }

   public kd<dzg> d() {
      return this.b;
   }

   public eca e() {
      return this.c;
   }

   public jx<alr> f() {
      return this.d;
   }

   public alt g() {
      return this.e;
   }

   public dfx h() {
      return this.f;
   }

   public fwc i() {
      return this.g;
   }

   @FunctionalInterface
   public interface a extends BiFunction<ke.b, eca, eca> {
   }

   public interface b extends UnaryOperator<ecd> {
   }
}

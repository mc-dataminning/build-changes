import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fza(eeh a, kd<ebk> b, eee c, jx<aly> d, ama e, dhw f, fyv g) {
   public fza(eef $$0, jx<aly> $$1, ama $$2, dhw $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3, new fyv(fzc.a.a, Set.of(), null));
   }

   public fza(eeh $$0, eee $$1, jx<aly> $$2, ama $$3, dhw $$4, fyv $$5) {
      this($$0, $$2.a(aly.c).e(mb.bf), $$1, $$2.a(aly.c), $$3, $$4, $$5);
   }

   public fza a(eeh $$0, eee $$1) {
      return new fza($$0, this.b, $$1, this.d, this.e, this.f, this.g);
   }

   public fza a(fza.b $$0) {
      return new fza($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public fza a(fza.a $$0) {
      return new fza(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f, this.g);
   }

   public ke.b a() {
      return this.d.a();
   }

   public void b() {
      for (ebk $$0 : this.d()) {
         $$0.b().a();
      }
   }

   public eeh c() {
      return this.a;
   }

   public kd<ebk> d() {
      return this.b;
   }

   public eee e() {
      return this.c;
   }

   public jx<aly> f() {
      return this.d;
   }

   public ama g() {
      return this.e;
   }

   public dhw h() {
      return this.f;
   }

   public fyv i() {
      return this.g;
   }

   @FunctionalInterface
   public interface a extends BiFunction<ke.b, eee, eee> {
   }

   public interface b extends UnaryOperator<eeh> {
   }
}

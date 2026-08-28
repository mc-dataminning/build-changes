import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fza(eeg a, kd<ebj> b, eed c, jx<ami> d, amk e, dhx f, fyv g) {
   public fza(eee $$0, jx<ami> $$1, amk $$2, dhx $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3, new fyv(fzc.a.a, Set.of(), null));
   }

   public fza(eeg $$0, eed $$1, jx<ami> $$2, amk $$3, dhx $$4, fyv $$5) {
      this($$0, $$2.a(ami.c).e(mb.be), $$1, $$2.a(ami.c), $$3, $$4, $$5);
   }

   public fza a(eeg $$0, eed $$1) {
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
      for (ebj $$0 : this.d()) {
         $$0.b().a();
      }
   }

   public eeg c() {
      return this.a;
   }

   public kd<ebj> d() {
      return this.b;
   }

   public eed e() {
      return this.c;
   }

   public jx<ami> f() {
      return this.d;
   }

   public amk g() {
      return this.e;
   }

   public dhx h() {
      return this.f;
   }

   public fyv i() {
      return this.g;
   }

   @FunctionalInterface
   public interface a extends BiFunction<ke.b, eed, eed> {
   }

   public interface b extends UnaryOperator<eeg> {
   }
}

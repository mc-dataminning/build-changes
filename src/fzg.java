import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fzg(een a, kd<ebq> b, eek c, jx<ami> d, amk e, die f, fzb g) {
   public fzg(eel $$0, jx<ami> $$1, amk $$2, die $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3, new fzb(fzi.a.a, Set.of(), null));
   }

   public fzg(een $$0, eek $$1, jx<ami> $$2, amk $$3, die $$4, fzb $$5) {
      this($$0, $$2.a(ami.c).e(mb.bf), $$1, $$2.a(ami.c), $$3, $$4, $$5);
   }

   public fzg a(een $$0, eek $$1) {
      return new fzg($$0, this.b, $$1, this.d, this.e, this.f, this.g);
   }

   public fzg a(fzg.b $$0) {
      return new fzg($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public fzg a(fzg.a $$0) {
      return new fzg(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f, this.g);
   }

   public ke.b a() {
      return this.d.a();
   }

   public void b() {
      for (ebq $$0 : this.d()) {
         $$0.b().a();
      }
   }

   public een c() {
      return this.a;
   }

   public kd<ebq> d() {
      return this.b;
   }

   public eek e() {
      return this.c;
   }

   public jx<ami> f() {
      return this.d;
   }

   public amk g() {
      return this.e;
   }

   public die h() {
      return this.f;
   }

   public fzb i() {
      return this.g;
   }

   @FunctionalInterface
   public interface a extends BiFunction<ke.b, eek, eek> {
   }

   public interface b extends UnaryOperator<een> {
   }
}

import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fzf(een a, kd<ebq> b, eek c, jx<ami> d, amk e, die f, fza g) {
   public fzf(eel $$0, jx<ami> $$1, amk $$2, die $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3, new fza(fzh.a.a, Set.of(), null));
   }

   public fzf(een $$0, eek $$1, jx<ami> $$2, amk $$3, die $$4, fza $$5) {
      this($$0, $$2.a(ami.c).e(mb.bf), $$1, $$2.a(ami.c), $$3, $$4, $$5);
   }

   public fzf a(een $$0, eek $$1) {
      return new fzf($$0, this.b, $$1, this.d, this.e, this.f, this.g);
   }

   public fzf a(fzf.b $$0) {
      return new fzf($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public fzf a(fzf.a $$0) {
      return new fzf(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f, this.g);
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

   public fza i() {
      return this.g;
   }

   @FunctionalInterface
   public interface a extends BiFunction<ke.b, eek, eek> {
   }

   public interface b extends UnaryOperator<een> {
   }
}

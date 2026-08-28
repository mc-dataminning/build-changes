import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fzh(eeo a, kd<ebr> b, eel c, jx<ami> d, amk e, dif f, fzc g) {
   public fzh(eem $$0, jx<ami> $$1, amk $$2, dif $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3, new fzc(fzj.a.a, Set.of(), null));
   }

   public fzh(eeo $$0, eel $$1, jx<ami> $$2, amk $$3, dif $$4, fzc $$5) {
      this($$0, $$2.a(ami.c).e(mb.bf), $$1, $$2.a(ami.c), $$3, $$4, $$5);
   }

   public fzh a(eeo $$0, eel $$1) {
      return new fzh($$0, this.b, $$1, this.d, this.e, this.f, this.g);
   }

   public fzh a(fzh.b $$0) {
      return new fzh($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public fzh a(fzh.a $$0) {
      return new fzh(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f, this.g);
   }

   public ke.b a() {
      return this.d.a();
   }

   public void b() {
      for (ebr $$0 : this.d()) {
         $$0.b().a();
      }
   }

   public eeo c() {
      return this.a;
   }

   public kd<ebr> d() {
      return this.b;
   }

   public eel e() {
      return this.c;
   }

   public jx<ami> f() {
      return this.d;
   }

   public amk g() {
      return this.e;
   }

   public dif h() {
      return this.f;
   }

   public fzc i() {
      return this.g;
   }

   @FunctionalInterface
   public interface a extends BiFunction<ke.b, eel, eel> {
   }

   public interface b extends UnaryOperator<eeo> {
   }
}

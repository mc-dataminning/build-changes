import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fzu(edq a, ke<eat> b, edn c, jy<ale> d, alg e, dhf f, fzp g) {
   public fzu(edo $$0, jy<ale> $$1, alg $$2, dhf $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3, new fzp(fzw.a.a, Set.of(), null));
   }

   public fzu(edq $$0, edn $$1, jy<ale> $$2, alg $$3, dhf $$4, fzp $$5) {
      this($$0, $$2.a(ale.c).e(mc.bf), $$1, $$2.a(ale.c), $$3, $$4, $$5);
   }

   public fzu a(edq $$0, edn $$1) {
      return new fzu($$0, this.b, $$1, this.d, this.e, this.f, this.g);
   }

   public fzu a(fzu.b $$0) {
      return new fzu($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public fzu a(fzu.a $$0) {
      return new fzu(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f, this.g);
   }

   public kf.b a() {
      return this.d.a();
   }

   public void b() {
      for (eat $$0 : this.d()) {
         $$0.b().a();
      }
   }

   public edq c() {
      return this.a;
   }

   public ke<eat> d() {
      return this.b;
   }

   public edn e() {
      return this.c;
   }

   public jy<ale> f() {
      return this.d;
   }

   public alg g() {
      return this.e;
   }

   public dhf h() {
      return this.f;
   }

   public fzp i() {
      return this.g;
   }

   @FunctionalInterface
   public interface a extends BiFunction<kf.b, edn, edn> {
   }

   public interface b extends UnaryOperator<edq> {
   }
}

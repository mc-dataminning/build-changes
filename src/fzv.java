import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fzv(edr a, ke<eau> b, edo c, jy<ale> d, alg e, dhg f, fzq g) {
   public fzv(edp $$0, jy<ale> $$1, alg $$2, dhg $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3, new fzq(fzx.a.a, Set.of(), null));
   }

   public fzv(edr $$0, edo $$1, jy<ale> $$2, alg $$3, dhg $$4, fzq $$5) {
      this($$0, $$2.a(ale.c).e(mc.bf), $$1, $$2.a(ale.c), $$3, $$4, $$5);
   }

   public fzv a(edr $$0, edo $$1) {
      return new fzv($$0, this.b, $$1, this.d, this.e, this.f, this.g);
   }

   public fzv a(fzv.b $$0) {
      return new fzv($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public fzv a(fzv.a $$0) {
      return new fzv(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f, this.g);
   }

   public kf.b a() {
      return this.d.a();
   }

   public void b() {
      for (eau $$0 : this.d()) {
         $$0.b().a();
      }
   }

   public edr c() {
      return this.a;
   }

   public ke<eau> d() {
      return this.b;
   }

   public edo e() {
      return this.c;
   }

   public jy<ale> f() {
      return this.d;
   }

   public alg g() {
      return this.e;
   }

   public dhg h() {
      return this.f;
   }

   public fzq i() {
      return this.g;
   }

   @FunctionalInterface
   public interface a extends BiFunction<kf.b, edo, edo> {
   }

   public interface b extends UnaryOperator<edr> {
   }
}

import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fzt(edp a, ke<eas> b, edm c, jy<ale> d, alg e, dhe f, fzo g) {
   public fzt(edn $$0, jy<ale> $$1, alg $$2, dhe $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3, new fzo(fzv.a.a, Set.of(), null));
   }

   public fzt(edp $$0, edm $$1, jy<ale> $$2, alg $$3, dhe $$4, fzo $$5) {
      this($$0, $$2.a(ale.c).e(mc.bf), $$1, $$2.a(ale.c), $$3, $$4, $$5);
   }

   public fzt a(edp $$0, edm $$1) {
      return new fzt($$0, this.b, $$1, this.d, this.e, this.f, this.g);
   }

   public fzt a(fzt.b $$0) {
      return new fzt($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public fzt a(fzt.a $$0) {
      return new fzt(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f, this.g);
   }

   public kf.b a() {
      return this.d.a();
   }

   public void b() {
      for (eas $$0 : this.d()) {
         $$0.b().a();
      }
   }

   public edp c() {
      return this.a;
   }

   public ke<eas> d() {
      return this.b;
   }

   public edm e() {
      return this.c;
   }

   public jy<ale> f() {
      return this.d;
   }

   public alg g() {
      return this.e;
   }

   public dhe h() {
      return this.f;
   }

   public fzo i() {
      return this.g;
   }

   @FunctionalInterface
   public interface a extends BiFunction<kf.b, edm, edm> {
   }

   public interface b extends UnaryOperator<edp> {
   }
}

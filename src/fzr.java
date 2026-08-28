import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fzr(edo a, ke<ear> b, edl c, jy<ald> d, alf e, dhd f, fzm g) {
   public fzr(edm $$0, jy<ald> $$1, alf $$2, dhd $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3, new fzm(fzt.a.a, Set.of(), null));
   }

   public fzr(edo $$0, edl $$1, jy<ald> $$2, alf $$3, dhd $$4, fzm $$5) {
      this($$0, $$2.a(ald.c).e(mc.bf), $$1, $$2.a(ald.c), $$3, $$4, $$5);
   }

   public fzr a(edo $$0, edl $$1) {
      return new fzr($$0, this.b, $$1, this.d, this.e, this.f, this.g);
   }

   public fzr a(fzr.b $$0) {
      return new fzr($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public fzr a(fzr.a $$0) {
      return new fzr(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f, this.g);
   }

   public kf.b a() {
      return this.d.a();
   }

   public void b() {
      for (ear $$0 : this.d()) {
         $$0.b().a();
      }
   }

   public edo c() {
      return this.a;
   }

   public ke<ear> d() {
      return this.b;
   }

   public edl e() {
      return this.c;
   }

   public jy<ald> f() {
      return this.d;
   }

   public alf g() {
      return this.e;
   }

   public dhd h() {
      return this.f;
   }

   public fzm i() {
      return this.g;
   }

   @FunctionalInterface
   public interface a extends BiFunction<kf.b, edl, edl> {
   }

   public interface b extends UnaryOperator<edo> {
   }
}

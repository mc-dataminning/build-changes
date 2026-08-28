import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fzt(edq a, ke<eat> b, edn c, jy<ald> d, alf e, dhf f, fzo g) {
   public fzt(edo $$0, jy<ald> $$1, alf $$2, dhf $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3, new fzo(fzv.a.a, Set.of(), null));
   }

   public fzt(edq $$0, edn $$1, jy<ald> $$2, alf $$3, dhf $$4, fzo $$5) {
      this($$0, $$2.a(ald.c).e(mc.bf), $$1, $$2.a(ald.c), $$3, $$4, $$5);
   }

   public fzt a(edq $$0, edn $$1) {
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

   public jy<ald> f() {
      return this.d;
   }

   public alf g() {
      return this.e;
   }

   public dhf h() {
      return this.f;
   }

   public fzo i() {
      return this.g;
   }

   @FunctionalInterface
   public interface a extends BiFunction<kf.b, edn, edn> {
   }

   public interface b extends UnaryOperator<edq> {
   }
}

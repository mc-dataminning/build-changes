import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record gar(eem a, ke<ebn> b, eej c, jy<ald> d, alf e, dhx f, gam g) {
   public gar(eek $$0, jy<ald> $$1, alf $$2, dhx $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3, new gam(gat.a.a, Set.of(), null));
   }

   public gar(eem $$0, eej $$1, jy<ald> $$2, alf $$3, dhx $$4, gam $$5) {
      this($$0, $$2.a(ald.c).e(mc.bh), $$1, $$2.a(ald.c), $$3, $$4, $$5);
   }

   public gar a(eem $$0, eej $$1) {
      return new gar($$0, this.b, $$1, this.d, this.e, this.f, this.g);
   }

   public gar a(gar.b $$0) {
      return new gar($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public gar a(gar.a $$0) {
      return new gar(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f, this.g);
   }

   public kf.b a() {
      return this.d.a();
   }

   public void b() {
      for (ebn $$0 : this.d()) {
         $$0.b().a();
      }
   }

   public eem c() {
      return this.a;
   }

   public ke<ebn> d() {
      return this.b;
   }

   public eej e() {
      return this.c;
   }

   public jy<ald> f() {
      return this.d;
   }

   public alf g() {
      return this.e;
   }

   public dhx h() {
      return this.f;
   }

   public gam i() {
      return this.g;
   }

   @FunctionalInterface
   public interface a extends BiFunction<kf.b, eej, eej> {
   }

   public interface b extends UnaryOperator<eem> {
   }
}

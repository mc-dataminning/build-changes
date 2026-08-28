import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fvi(ebi a, ka<dyl> b, ebf c, ju<all> d, aln e, dfc f) {
   public fvi(ebg $$0, ju<all> $$1, aln $$2, dfc $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3);
   }

   public fvi(ebi $$0, ebf $$1, ju<all> $$2, aln $$3, dfc $$4) {
      this($$0, $$2.a(all.c).d(lv.bc), $$1, $$2.a(all.c), $$3, $$4);
   }

   public fvi a(ebi $$0, ebf $$1) {
      return new fvi($$0, this.b, $$1, this.d, this.e, this.f);
   }

   public fvi a(fvi.b $$0) {
      return new fvi($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f);
   }

   public fvi a(fvi.a $$0) {
      return new fvi(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f);
   }

   public kb.b a() {
      return this.d.a();
   }

   public void b() {
      for (dyl $$0 : this.d()) {
         $$0.b().a();
      }
   }

   public ebi c() {
      return this.a;
   }

   public ka<dyl> d() {
      return this.b;
   }

   public ebf e() {
      return this.c;
   }

   public ju<all> f() {
      return this.d;
   }

   public aln g() {
      return this.e;
   }

   public dfc h() {
      return this.f;
   }

   @FunctionalInterface
   public interface a extends BiFunction<kb.b, ebf, ebf> {
   }

   public interface b extends UnaryOperator<ebi> {
   }
}

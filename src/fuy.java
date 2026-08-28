import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fuy(eau a, ka<dxx> b, ear c, ju<alk> d, alm e, deo f) {
   public fuy(eas $$0, ju<alk> $$1, alm $$2, deo $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3);
   }

   public fuy(eau $$0, ear $$1, ju<alk> $$2, alm $$3, deo $$4) {
      this($$0, $$2.a(alk.c).d(lv.bb), $$1, $$2.a(alk.c), $$3, $$4);
   }

   public fuy a(eau $$0, ear $$1) {
      return new fuy($$0, this.b, $$1, this.d, this.e, this.f);
   }

   public fuy a(fuy.b $$0) {
      return new fuy($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f);
   }

   public fuy a(fuy.a $$0) {
      return new fuy(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f);
   }

   public kb.b a() {
      return this.d.a();
   }

   public void b() {
      for (dxx $$0 : this.d()) {
         $$0.b().a();
      }
   }

   public eau c() {
      return this.a;
   }

   public ka<dxx> d() {
      return this.b;
   }

   public ear e() {
      return this.c;
   }

   public ju<alk> f() {
      return this.d;
   }

   public alm g() {
      return this.e;
   }

   public deo h() {
      return this.f;
   }

   @FunctionalInterface
   public interface a extends BiFunction<kb.b, ear, ear> {
   }

   public interface b extends UnaryOperator<eau> {
   }
}

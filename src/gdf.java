import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record gdf(egw a, jr<edx> b, egt c, jl<alp> d, alr e, djt f, gda g) {
   public gdf(egu $$0, jl<alp> $$1, alr $$2, djt $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3, new gda(gdh.a.a, Set.of(), null));
   }

   public gdf(egw $$0, egt $$1, jl<alp> $$2, alr $$3, djt $$4, gda $$5) {
      this($$0, $$2.a(alp.c).f(mg.bo), $$1, $$2.a(alp.c), $$3, $$4, $$5);
   }

   public gdf a(egw $$0, egt $$1) {
      return new gdf($$0, this.b, $$1, this.d, this.e, this.f, this.g);
   }

   public gdf a(gdf.b $$0) {
      return new gdf($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public gdf a(gdf.a $$0) {
      return new gdf(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f, this.g);
   }

   public js.b a() {
      return this.d.a();
   }

   public void b() {
      for (edx $$0 : this.d()) {
         $$0.b().a();
      }
   }

   public egw c() {
      return this.a;
   }

   public jr<edx> d() {
      return this.b;
   }

   public egt e() {
      return this.c;
   }

   public jl<alp> f() {
      return this.d;
   }

   public alr g() {
      return this.e;
   }

   public djt h() {
      return this.f;
   }

   public gda i() {
      return this.g;
   }

   @FunctionalInterface
   public interface a extends BiFunction<js.b, egt, egt> {
   }

   public interface b extends UnaryOperator<egw> {
   }
}

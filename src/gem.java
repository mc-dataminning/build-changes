import java.util.Set;
import java.util.Map.Entry;
import java.util.function.UnaryOperator;

public record gem(boolean b, float c, float d, float e, float f, float g, Set<String> h) implements gjd {
   public gem(Set<String> $$0) {
      this(false, 5.0F, 2.0F, $$0);
   }

   public gem(boolean $$0, float $$1, float $$2, Set<String> $$3) {
      this($$0, $$1, $$2, 2.0F, 2.0F, 24.0F, $$3);
   }

   @Override
   public gjc apply(gjc $$0) {
      float $$1 = this.b ? 1.5F / this.e : 1.0F;
      float $$2 = 1.0F / this.f;
      UnaryOperator<giw> $$3 = $$1x -> $$1x.c(0.0F, this.c, this.d).b($$1);
      UnaryOperator<giw> $$4 = $$1x -> $$1x.c(0.0F, this.g, 0.0F).b($$2);
      gjc $$5 = new gjc();

      for (Entry<String, gje> $$6 : $$0.a().a()) {
         String $$7 = $$6.getKey();
         gje $$8 = $$6.getValue();
         $$5.a().a($$7, $$8.a(this.h.contains($$7) ? $$3 : $$4));
      }

      return $$5;
   }

   public boolean a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }

   public float e() {
      return this.f;
   }

   public float f() {
      return this.g;
   }

   public Set<String> g() {
      return this.h;
   }
}

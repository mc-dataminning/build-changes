import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class pe {
   private final ow a;
   private final dbr b;
   private final dbr c;
   private final dbr d;
   private final Map<String, ap<?>> e = new LinkedHashMap<>();

   public pe(ow $$0, dbr $$1, dbr $$2, dbr $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public static pe a(dbr $$0, dbr $$1, dbr $$2, ow $$3) {
      return new pe($$3, $$0, $$1, $$2);
   }

   public pe a(String $$0, ap<?> $$1) {
      this.e.put($$0, $$1);
      return this;
   }

   public void a(ox $$0, alo<dbv<?>> $$1) {
      this.a($$1);
      ag.a $$2 = $$0.a().a("has_the_recipe", dv.a($$1)).a(al.a.c($$1)).a(ak.a.b);
      this.e.forEach($$2::a);
      dct $$3 = new dct(Optional.of(this.b), Optional.of(this.c), Optional.of(this.d));
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.a.a() + "/")));
   }

   private void a(alo<dbv<?>> $$0) {
      if (this.e.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class pd {
   private final ov a;
   private final daw b;
   private final daw c;
   private final daw d;
   private final Map<String, ap<?>> e = new LinkedHashMap<>();

   public pd(ov $$0, daw $$1, daw $$2, daw $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public static pd a(daw $$0, daw $$1, daw $$2, ov $$3) {
      return new pd($$3, $$0, $$1, $$2);
   }

   public pd a(String $$0, ap<?> $$1) {
      this.e.put($$0, $$1);
      return this;
   }

   public void a(ow $$0, alj $$1) {
      this.a($$1);
      ag.a $$2 = $$0.a().a("has_the_recipe", dv.a($$1)).a(al.a.a($$1)).a(ak.a.b);
      this.e.forEach($$2::a);
      dbu $$3 = new dbu(Optional.of(this.b), Optional.of(this.c), Optional.of(this.d));
      $$0.a($$1, $$3, $$2.b($$1.f("recipes/" + this.a.a() + "/")));
   }

   private void a(alj $$0) {
      if (this.e.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}

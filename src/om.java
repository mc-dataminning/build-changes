import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class om {
   private final ddx a;
   private final ddx b;
   private final ddx c;
   private final of d;
   private final czg e;
   private final Map<String, ar<?>> f = new LinkedHashMap<>();

   public om(ddx $$0, ddx $$1, ddx $$2, of $$3, czg $$4) {
      this.d = $$3;
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.e = $$4;
   }

   public static om a(ddx $$0, ddx $$1, ddx $$2, of $$3, czg $$4) {
      return new om($$0, $$1, $$2, $$3, $$4);
   }

   public om a(String $$0, ar<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public void a(og $$0, String $$1) {
      this.a($$0, alf.a(mh.bu, alg.a($$1)));
   }

   public void a(og $$0, alf<deb<?>> $$1) {
      this.a($$1);
      ai.a $$2 = $$0.a().a("has_the_recipe", dh.a($$1)).a(an.a.c($$1)).a(am.a.b);
      this.f.forEach($$2::a);
      dey $$3 = new dey(Optional.of(this.a), this.b, Optional.of(this.c), new dfe(this.e));
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.d.a() + "/")));
   }

   private void a(alf<deb<?>> $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}

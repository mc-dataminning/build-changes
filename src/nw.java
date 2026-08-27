import java.util.LinkedHashMap;
import java.util.Map;

public class nw {
   private final cvg a;
   private final cvg b;
   private final cvg c;
   private final np d;
   private final cre e;
   private final Map<String, an<?>> f = new LinkedHashMap<>();

   public nw(cvg $$0, cvg $$1, cvg $$2, np $$3, cre $$4) {
      this.d = $$3;
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.e = $$4;
   }

   public static nw a(cvg $$0, cvg $$1, cvg $$2, np $$3, cre $$4) {
      return new nw($$0, $$1, $$2, $$3, $$4);
   }

   public nw a(String $$0, an<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public void a(nq $$0, String $$1) {
      this.a($$0, new ajt($$1));
   }

   public void a(nq $$0, ajt $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cv.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      cwa $$3 = new cwa(this.a, this.b, this.c, new crj(this.e));
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.d.a() + "/")));
   }

   private void a(ajt $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}

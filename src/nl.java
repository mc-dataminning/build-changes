import java.util.LinkedHashMap;
import java.util.Map;

public class nl {
   private final nd a;
   private final ctm b;
   private final ctm c;
   private final ctm d;
   private final Map<String, an<?>> e = new LinkedHashMap<>();

   public nl(nd $$0, ctm $$1, ctm $$2, ctm $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public static nl a(ctm $$0, ctm $$1, ctm $$2, nd $$3) {
      return new nl($$3, $$0, $$1, $$2);
   }

   public nl a(String $$0, an<?> $$1) {
      this.e.put($$0, $$1);
      return this;
   }

   public void a(ne $$0, ajh $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cv.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.e.forEach($$2::a);
      cuh $$3 = new cuh(this.b, this.c, this.d);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.a.a() + "/")));
   }

   private void a(ajh $$0) {
      if (this.e.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}

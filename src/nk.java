import java.util.LinkedHashMap;
import java.util.Map;

public class nk {
   private final ctm a;
   private final ctm b;
   private final ctm c;
   private final nd d;
   private final cqh e;
   private final Map<String, an<?>> f = new LinkedHashMap<>();

   public nk(ctm $$0, ctm $$1, ctm $$2, nd $$3, cqh $$4) {
      this.d = $$3;
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.e = $$4;
   }

   public static nk a(ctm $$0, ctm $$1, ctm $$2, nd $$3, cqh $$4) {
      return new nk($$0, $$1, $$2, $$3, $$4);
   }

   public nk a(String $$0, an<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public void a(ne $$0, String $$1) {
      this.a($$0, new ajh($$1));
   }

   public void a(ne $$0, ajh $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cv.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.f.forEach($$2::a);
      cug $$3 = new cug(this.a, this.b, this.c, new cqm(this.e));
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.d.a() + "/")));
   }

   private void a(ajh $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}

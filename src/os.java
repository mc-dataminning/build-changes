import java.util.LinkedHashMap;
import java.util.Map;

public class os {
   private final cyu a;
   private final cyu b;
   private final cyu c;
   private final ol d;
   private final cuj e;
   private final Map<String, ao<?>> f = new LinkedHashMap<>();

   public os(cyu $$0, cyu $$1, cyu $$2, ol $$3, cuj $$4) {
      this.d = $$3;
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.e = $$4;
   }

   public static os a(cyu $$0, cyu $$1, cyu $$2, ol $$3, cuj $$4) {
      return new os($$0, $$1, $$2, $$3, $$4);
   }

   public os a(String $$0, ao<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public void a(om $$0, String $$1) {
      this.a($$0, akq.a($$1));
   }

   public void a(om $$0, akq $$1) {
      this.a($$1);
      af.a $$2 = $$0.a().a("has_the_recipe", dt.a($$1)).a(ak.a.a($$1)).a(aj.a.b);
      this.f.forEach($$2::a);
      czr $$3 = new czr(this.a, this.b, this.c, new cuo(this.e));
      $$0.a($$1, $$3, $$2.b($$1.f("recipes/" + this.d.a() + "/")));
   }

   private void a(akq $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}

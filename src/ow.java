import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class ow {
   private final dad a;
   private final dad b;
   private final dad c;
   private final op d;
   private final cvk e;
   private final Map<String, ao<?>> f = new LinkedHashMap<>();

   public ow(dad $$0, dad $$1, dad $$2, op $$3, cvk $$4) {
      this.d = $$3;
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.e = $$4;
   }

   public static ow a(dad $$0, dad $$1, dad $$2, op $$3, cvk $$4) {
      return new ow($$0, $$1, $$2, $$3, $$4);
   }

   public ow a(String $$0, ao<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public void a(oq $$0, String $$1) {
      this.a($$0, alc.a($$1));
   }

   public void a(oq $$0, alc $$1) {
      this.a($$1);
      af.a $$2 = $$0.a().a("has_the_recipe", dt.a($$1)).a(ak.a.a($$1)).a(aj.a.b);
      this.f.forEach($$2::a);
      dbb $$3 = new dbb(Optional.of(this.a), Optional.of(this.b), Optional.of(this.c), new cvp(this.e));
      $$0.a($$1, $$3, $$2.b($$1.f("recipes/" + this.d.a() + "/")));
   }

   private void a(alc $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}

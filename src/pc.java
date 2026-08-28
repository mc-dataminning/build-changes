import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class pc {
   private final ou a;
   private final dal b;
   private final dal c;
   private final dal d;
   private final Map<String, ap<?>> e = new LinkedHashMap<>();

   public pc(ou $$0, dal $$1, dal $$2, dal $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public static pc a(dal $$0, dal $$1, dal $$2, ou $$3) {
      return new pc($$3, $$0, $$1, $$2);
   }

   public pc a(String $$0, ap<?> $$1) {
      this.e.put($$0, $$1);
      return this;
   }

   public void a(ov $$0, ali $$1) {
      this.a($$1);
      ag.a $$2 = $$0.a().a("has_the_recipe", dv.a($$1)).a(al.a.a($$1)).a(ak.a.b);
      this.e.forEach($$2::a);
      dbk $$3 = new dbk(Optional.of(this.b), Optional.of(this.c), Optional.of(this.d));
      $$0.a($$1, $$3, $$2.b($$1.f("recipes/" + this.a.a() + "/")));
   }

   private void a(ali $$0) {
      if (this.e.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}

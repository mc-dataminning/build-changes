import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class pb {
   private final dal a;
   private final dal b;
   private final dal c;
   private final ou d;
   private final cvx e;
   private final Map<String, ap<?>> f = new LinkedHashMap<>();

   public pb(dal $$0, dal $$1, dal $$2, ou $$3, cvx $$4) {
      this.d = $$3;
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.e = $$4;
   }

   public static pb a(dal $$0, dal $$1, dal $$2, ou $$3, cvx $$4) {
      return new pb($$0, $$1, $$2, $$3, $$4);
   }

   public pb a(String $$0, ap<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public void a(ov $$0, String $$1) {
      this.a($$0, ali.a($$1));
   }

   public void a(ov $$0, ali $$1) {
      this.a($$1);
      ag.a $$2 = $$0.a().a("has_the_recipe", dv.a($$1)).a(al.a.a($$1)).a(ak.a.b);
      this.f.forEach($$2::a);
      dbj $$3 = new dbj(Optional.of(this.a), Optional.of(this.b), Optional.of(this.c), new cwb(this.e));
      $$0.a($$1, $$3, $$2.b($$1.f("recipes/" + this.d.a() + "/")));
   }

   private void a(ali $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}

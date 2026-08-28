import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class on {
   private final dex a;
   private final dex b;
   private final dex c;
   private final og d;
   private final dag e;
   private final Map<String, ar<?>> f = new LinkedHashMap<>();

   public on(dex $$0, dex $$1, dex $$2, og $$3, dag $$4) {
      this.d = $$3;
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.e = $$4;
   }

   public static on a(dex $$0, dex $$1, dex $$2, og $$3, dag $$4) {
      return new on($$0, $$1, $$2, $$3, $$4);
   }

   public on a(String $$0, ar<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public void a(oh $$0, String $$1) {
      this.a($$0, alq.a(mi.bv, alr.a($$1)));
   }

   public void a(oh $$0, alq<dfb<?>> $$1) {
      this.a($$1);
      ai.a $$2 = $$0.a().a("has_the_recipe", di.a($$1)).a(an.a.c($$1)).a(am.a.b);
      this.f.forEach($$2::a);
      dfy $$3 = new dfy(Optional.of(this.a), this.b, Optional.of(this.c), new dge(this.e));
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.d.a() + "/")));
   }

   private void a(alq<dfb<?>> $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}

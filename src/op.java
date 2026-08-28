import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class op implements oe {
   private final of b;
   private final jf<czu> c;
   private final del d;
   private final del e;
   private final Map<String, ar<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;

   private op(of $$0, jf<czu> $$1, del $$2, del $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public static op a(of $$0, del $$1, del $$2, czu $$3) {
      return new op($$0, $$3.e(), $$1, $$2);
   }

   public op b(String $$0, ar<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public op b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public czu a() {
      return this.c.a();
   }

   @Override
   public void a(og $$0, alh<dep<?>> $$1) {
      this.a($$1);
      ai.a $$2 = $$0.a().a("has_the_recipe", dh.a($$1)).a(an.a.c($$1)).a(am.a.b);
      this.f.forEach($$2::a);
      dfr $$3 = new dfr(Objects.requireNonNullElse(this.g, ""), oe.a(this.b), this.d, this.e, new dfs(this.c.a()));
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.b.a() + "/")));
   }

   private void a(alh<dep<?>> $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}

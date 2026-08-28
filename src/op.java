import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class op implements oe {
   private final of b;
   private final jf<czg> c;
   private final ddx d;
   private final ddx e;
   private final Map<String, ar<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;

   private op(of $$0, jf<czg> $$1, ddx $$2, ddx $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public static op a(of $$0, ddx $$1, ddx $$2, czg $$3) {
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
   public czg a() {
      return this.c.a();
   }

   @Override
   public void a(og $$0, alf<deb<?>> $$1) {
      this.a($$1);
      ai.a $$2 = $$0.a().a("has_the_recipe", dh.a($$1)).a(an.a.c($$1)).a(am.a.b);
      this.f.forEach($$2::a);
      dfd $$3 = new dfd(Objects.requireNonNullElse(this.g, ""), oe.a(this.b), this.d, this.e, new dfe(this.c.a()));
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.b.a() + "/")));
   }

   private void a(alf<deb<?>> $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}

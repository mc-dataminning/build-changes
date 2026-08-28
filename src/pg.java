import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class pg implements ov {
   private final ow b;
   private final jq<cxc> c;
   private final dbr d;
   private final dbr e;
   private final Map<String, ap<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;

   private pg(ow $$0, jq<cxc> $$1, dbr $$2, dbr $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public static pg a(ow $$0, dbr $$1, dbr $$2, cxc $$3) {
      return new pg($$0, $$3.f(), $$1, $$2);
   }

   public pg b(String $$0, ap<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public pg b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cxc a() {
      return this.c.a();
   }

   @Override
   public void a(ox $$0, alo<dbv<?>> $$1) {
      this.a($$1);
      ag.a $$2 = $$0.a().a("has_the_recipe", dv.a($$1)).a(al.a.c($$1)).a(ak.a.b);
      this.f.forEach($$2::a);
      dcx $$3 = new dcx(Objects.requireNonNullElse(this.g, ""), ov.a(this.b), this.d, this.e, this.c);
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.b.a() + "/")));
   }

   private void a(alo<dbv<?>> $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}

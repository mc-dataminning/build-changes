import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class oo implements od {
   private final oe b;
   private final je<cyo> c;
   private final ddf d;
   private final ddf e;
   private final Map<String, aq<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;

   private oo(oe $$0, je<cyo> $$1, ddf $$2, ddf $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public static oo a(oe $$0, ddf $$1, ddf $$2, cyo $$3) {
      return new oo($$0, $$3.e(), $$1, $$2);
   }

   public oo b(String $$0, aq<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public oo b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cyo a() {
      return this.c.a();
   }

   @Override
   public void a(of $$0, ald<ddj<?>> $$1) {
      this.a($$1);
      ah.a $$2 = $$0.a().a("has_the_recipe", dg.a($$1)).a(am.a.c($$1)).a(al.a.b);
      this.f.forEach($$2::a);
      del $$3 = new del(Objects.requireNonNullElse(this.g, ""), od.a(this.b), this.d, this.e, new dem(this.c.a()));
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.b.a() + "/")));
   }

   private void a(ald<ddj<?>> $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class ow implements op {
   private final oq b;
   private final cvn c;
   private final dag d;
   private final int e;
   private final Map<String, ao<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;
   private final daz.a<?> h;

   public ow(oq $$0, daz.a<?> $$1, dag $$2, dei $$3, int $$4) {
      this.b = $$0;
      this.h = $$1;
      this.c = $$3.q();
      this.d = $$2;
      this.e = $$4;
   }

   public static ow a(dag $$0, oq $$1, dei $$2) {
      return new ow($$1, dbh::new, $$0, $$2, 1);
   }

   public static ow a(dag $$0, oq $$1, dei $$2, int $$3) {
      return new ow($$1, dbh::new, $$0, $$2, $$3);
   }

   public ow b(String $$0, ao<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public ow b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cvn a() {
      return this.c;
   }

   @Override
   public void a(or $$0, ale $$1) {
      this.a($$1);
      af.a $$2 = $$0.a().a("has_the_recipe", dt.a($$1)).a(ak.a.a($$1)).a(aj.a.b);
      this.f.forEach($$2::a);
      daz $$3 = this.h.create(Objects.requireNonNullElse(this.g, ""), this.d, new cvs(this.c, this.e));
      $$0.a($$1, $$3, $$2.b($$1.f("recipes/" + this.b.a() + "/")));
   }

   private void a(ale $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}

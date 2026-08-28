import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class oy implements ot {
   private final jr<cvx> b;
   private final ou c;
   private final cwb d;
   private final List<dal> e = new ArrayList<>();
   private final Map<String, ap<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;

   private oy(jr<cvx> $$0, ou $$1, cwb $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static oy a(jr<cvx> $$0, ou $$1, cwb $$2) {
      return new oy($$0, $$1, $$2);
   }

   public static oy a(jr<cvx> $$0, ou $$1, dfa $$2) {
      return a($$0, $$1, $$2, 1);
   }

   public static oy a(jr<cvx> $$0, ou $$1, dfa $$2, int $$3) {
      return new oy($$0, $$1, $$2.j().o().c($$3));
   }

   public oy a(axq<cvx> $$0) {
      return this.a(dal.a(this.b.b($$0)));
   }

   public oy b(dfa $$0) {
      return this.a($$0, 1);
   }

   public oy a(dfa $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.a(dal.a($$0));
      }

      return this;
   }

   public oy a(dal $$0) {
      return this.a($$0, 1);
   }

   public oy a(dal $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.e.add($$0);
      }

      return this;
   }

   public oy b(String $$0, ap<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public oy b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cvx a() {
      return this.d.h();
   }

   @Override
   public void a(ov $$0, ali $$1) {
      this.a($$1);
      ag.a $$2 = $$0.a().a("has_the_recipe", dv.a($$1)).a(al.a.a($$1)).a(ak.a.b);
      this.f.forEach($$2::a);
      daz $$3 = new daz(Objects.requireNonNullElse(this.g, ""), ot.a(this.c), this.d, this.e);
      $$0.a($$1, $$3, $$2.b($$1.f("recipes/" + this.c.a() + "/")));
   }

   private void a(ali $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}

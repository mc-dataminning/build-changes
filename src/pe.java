import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class pe implements oz {
   private final jr<cxl> b;
   private final pa c;
   private final cxp d;
   private final List<dca> e = new ArrayList<>();
   private final Map<String, ap<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;

   private pe(jr<cxl> $$0, pa $$1, cxp $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static pe a(jr<cxl> $$0, pa $$1, cxp $$2) {
      return new pe($$0, $$1, $$2);
   }

   public static pe a(jr<cxl> $$0, pa $$1, dhh $$2) {
      return a($$0, $$1, $$2, 1);
   }

   public static pe a(jr<cxl> $$0, pa $$1, dhh $$2, int $$3) {
      return new pe($$0, $$1, $$2.j().n().c($$3));
   }

   public pe a(ayk<cxl> $$0) {
      return this.a(dca.a(this.b.b($$0)));
   }

   public pe b(dhh $$0) {
      return this.a($$0, 1);
   }

   public pe a(dhh $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.a(dca.a($$0));
      }

      return this;
   }

   public pe a(dca $$0) {
      return this.a($$0, 1);
   }

   public pe a(dca $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.e.add($$0);
      }

      return this;
   }

   public pe b(String $$0, ap<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public pe b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cxl a() {
      return this.d.h();
   }

   @Override
   public void a(pb $$0, aly<dce<?>> $$1) {
      this.a($$1);
      ag.a $$2 = $$0.a().a("has_the_recipe", dv.a($$1)).a(al.a.c($$1)).a(ak.a.b);
      this.f.forEach($$2::a);
      dcu $$3 = new dcu(Objects.requireNonNullElse(this.g, ""), oz.a(this.c), this.d, this.e);
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.c.a() + "/")));
   }

   private void a(aly<dce<?>> $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}

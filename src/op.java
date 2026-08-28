import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class op implements ok {
   private final ol b;
   private final cuj c;
   private final int d;
   private final jv<cyu> e = jv.a();
   private final Map<String, ao<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;

   public op(ol $$0, dct $$1, int $$2) {
      this.b = $$0;
      this.c = $$1.r();
      this.d = $$2;
   }

   public static op a(ol $$0, dct $$1) {
      return new op($$0, $$1, 1);
   }

   public static op a(ol $$0, dct $$1, int $$2) {
      return new op($$0, $$1, $$2);
   }

   public op a(awt<cuj> $$0) {
      return this.a(cyu.a($$0));
   }

   public op b(dct $$0) {
      return this.a($$0, 1);
   }

   public op a(dct $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.a(cyu.a($$0));
      }

      return this;
   }

   public op a(cyu $$0) {
      return this.a($$0, 1);
   }

   public op a(cyu $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.e.add($$0);
      }

      return this;
   }

   public op b(String $$0, ao<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public op b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cuj a() {
      return this.c;
   }

   @Override
   public void a(om $$0, akq $$1) {
      this.a($$1);
      af.a $$2 = $$0.a().a("has_the_recipe", dt.a($$1)).a(ak.a.a($$1)).a(aj.a.b);
      this.f.forEach($$2::a);
      czh $$3 = new czh(Objects.requireNonNullElse(this.g, ""), ok.a(this.b), new cuo(this.c, this.d), this.e);
      $$0.a($$1, $$3, $$2.b($$1.f("recipes/" + this.b.a() + "/")));
   }

   private void a(akq $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}

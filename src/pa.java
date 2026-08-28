import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class pa implements ov {
   private final jr<cxc> b;
   private final ow c;
   private final cxg d;
   private final List<dbr> e = new ArrayList<>();
   private final Map<String, ap<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;

   private pa(jr<cxc> $$0, ow $$1, cxg $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static pa a(jr<cxc> $$0, ow $$1, cxg $$2) {
      return new pa($$0, $$1, $$2);
   }

   public static pa a(jr<cxc> $$0, ow $$1, dgy $$2) {
      return a($$0, $$1, $$2, 1);
   }

   public static pa a(jr<cxc> $$0, ow $$1, dgy $$2, int $$3) {
      return new pa($$0, $$1, $$2.j().n().c($$3));
   }

   public pa a(aya<cxc> $$0) {
      return this.a(dbr.a(this.b.b($$0)));
   }

   public pa b(dgy $$0) {
      return this.a($$0, 1);
   }

   public pa a(dgy $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.a(dbr.a($$0));
      }

      return this;
   }

   public pa a(dbr $$0) {
      return this.a($$0, 1);
   }

   public pa a(dbr $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.e.add($$0);
      }

      return this;
   }

   public pa b(String $$0, ap<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public pa b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cxc a() {
      return this.d.h();
   }

   @Override
   public void a(ox $$0, alo<dbv<?>> $$1) {
      this.a($$1);
      ag.a $$2 = $$0.a().a("has_the_recipe", dv.a($$1)).a(al.a.c($$1)).a(ak.a.b);
      this.f.forEach($$2::a);
      dcl $$3 = new dcl(Objects.requireNonNullElse(this.g, ""), ov.a(this.c), this.d, this.e);
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.c.a() + "/")));
   }

   private void a(alo<dbv<?>> $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}

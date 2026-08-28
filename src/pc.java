import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class pc implements ov {
   private final ow b;
   private final cxc c;
   private final dbr d;
   private final int e;
   private final Map<String, ap<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;
   private final dcn.a<?> h;

   public pc(ow $$0, dcn.a<?> $$1, dbr $$2, dgy $$3, int $$4) {
      this.b = $$0;
      this.h = $$1;
      this.c = $$3.j();
      this.d = $$2;
      this.e = $$4;
   }

   public static pc a(dbr $$0, ow $$1, dgy $$2) {
      return new pc($$1, dcv::new, $$0, $$2, 1);
   }

   public static pc a(dbr $$0, ow $$1, dgy $$2, int $$3) {
      return new pc($$1, dcv::new, $$0, $$2, $$3);
   }

   public pc b(String $$0, ap<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public pc b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cxc a() {
      return this.c;
   }

   @Override
   public void a(ox $$0, alo<dbv<?>> $$1) {
      this.a($$1);
      ag.a $$2 = $$0.a().a("has_the_recipe", dv.a($$1)).a(al.a.c($$1)).a(ak.a.b);
      this.f.forEach($$2::a);
      dcn $$3 = this.h.create(Objects.requireNonNullElse(this.g, ""), this.d, new cxg(this.c, this.e));
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.b.a() + "/")));
   }

   private void a(alo<dbv<?>> $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}

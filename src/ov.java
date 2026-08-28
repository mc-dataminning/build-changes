import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class ov implements oo {
   private final op b;
   private final cvg c;
   private final czp d;
   private final int e;
   private final Map<String, ao<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;
   private final dai.a<?> h;

   public ov(op $$0, dai.a<?> $$1, czp $$2, ddr $$3, int $$4) {
      this.b = $$0;
      this.h = $$1;
      this.c = $$3.r();
      this.d = $$2;
      this.e = $$4;
   }

   public static ov a(czp $$0, op $$1, ddr $$2) {
      return new ov($$1, daq::new, $$0, $$2, 1);
   }

   public static ov a(czp $$0, op $$1, ddr $$2, int $$3) {
      return new ov($$1, daq::new, $$0, $$2, $$3);
   }

   public ov b(String $$0, ao<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public ov b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cvg a() {
      return this.c;
   }

   @Override
   public void a(oq $$0, alb $$1) {
      this.a($$1);
      af.a $$2 = $$0.a().a("has_the_recipe", dt.a($$1)).a(ak.a.a($$1)).a(aj.a.b);
      this.f.forEach($$2::a);
      dai $$3 = this.h.create(Objects.requireNonNullElse(this.g, ""), this.d, new cvl(this.c, this.e));
      $$0.a($$1, $$3, $$2.b($$1.f("recipes/" + this.b.a() + "/")));
   }

   private void a(alb $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}

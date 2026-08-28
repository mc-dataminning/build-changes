import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class ov implements op {
   private final oq b;
   private final czx c;
   private final cvn d;
   private final dag e;
   private final float f;
   private final int g;
   private final Map<String, ao<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final czr.a<?> j;

   private ov(oq $$0, czx $$1, dei $$2, dag $$3, float $$4, int $$5, czr.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.q();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends czr> ov a(dag $$0, oq $$1, dei $$2, float $$3, int $$4, dap<T> $$5, czr.a<T> $$6) {
      return new ov($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static ov a(dag $$0, oq $$1, dei $$2, float $$3, int $$4) {
      return new ov($$1, czx.a, $$2, $$0, $$3, $$4, czw::new);
   }

   public static ov b(dag $$0, oq $$1, dei $$2, float $$3, int $$4) {
      return new ov($$1, c($$2), $$2, $$0, $$3, $$4, czu::new);
   }

   public static ov c(dag $$0, oq $$1, dei $$2, float $$3, int $$4) {
      return new ov($$1, b($$2), $$2, $$0, $$3, $$4, dbb::new);
   }

   public static ov d(dag $$0, oq $$1, dei $$2, float $$3, int $$4) {
      return new ov($$1, czx.a, $$2, $$0, $$3, $$4, dbg::new);
   }

   public ov b(String $$0, ao<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public ov b(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public cvn a() {
      return this.d;
   }

   @Override
   public void a(or $$0, ale $$1) {
      this.a($$1);
      af.a $$2 = $$0.a().a("has_the_recipe", dt.a($$1)).a(ak.a.a($$1)).a(aj.a.b);
      this.h.forEach($$2::a);
      czr $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new cvs(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.f("recipes/" + this.b.a() + "/")));
   }

   private static czx b(dei $$0) {
      if ($$0.q().o().b(ks.v)) {
         return czx.a;
      } else {
         return $$0.q() instanceof ctu ? czx.b : czx.c;
      }
   }

   private static czx c(dei $$0) {
      return $$0.q() instanceof ctu ? czx.b : czx.c;
   }

   private static czx a(dap<? extends czr> $$0, dei $$1) {
      if ($$0 == dap.o) {
         return b($$1);
      } else if ($$0 == dap.p) {
         return c($$1);
      } else if ($$0 != dap.q && $$0 != dap.r) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return czx.a;
      }
   }

   private void a(ale $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}

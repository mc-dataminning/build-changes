import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class nc implements mw {
   private final mx b;
   private final cpz c;
   private final cnb d;
   private final cqh e;
   private final float f;
   private final int g;
   private final Map<String, an<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final cpt.a<?> j;

   private nc(mx $$0, cpz $$1, ctw $$2, cqh $$3, float $$4, int $$5, cpt.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.j();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends cpt> nc a(cqh $$0, mx $$1, ctw $$2, float $$3, int $$4, cqo<T> $$5, cpt.a<T> $$6) {
      return new nc($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static nc a(cqh $$0, mx $$1, ctw $$2, float $$3, int $$4) {
      return new nc($$1, cpz.a, $$2, $$0, $$3, $$4, cpy::new);
   }

   public static nc b(cqh $$0, mx $$1, ctw $$2, float $$3, int $$4) {
      return new nc($$1, c($$2), $$2, $$0, $$3, $$4, cpw::new);
   }

   public static nc c(cqh $$0, mx $$1, ctw $$2, float $$3, int $$4) {
      return new nc($$1, b($$2), $$2, $$0, $$3, $$4, cqz::new);
   }

   public static nc d(cqh $$0, mx $$1, ctw $$2, float $$3, int $$4) {
      return new nc($$1, cpz.a, $$2, $$0, $$3, $$4, crd::new);
   }

   public nc b(String $$0, an<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public nc b(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public cnb a() {
      return this.d;
   }

   @Override
   public void a(my $$0, ahh $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", ct.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.h.forEach($$2::a);
      cpt $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new cng(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private static cpz b(ctw $$0) {
      if ($$0.j().t()) {
         return cpz.a;
      } else {
         return $$0.j() instanceof cla ? cpz.b : cpz.c;
      }
   }

   private static cpz c(ctw $$0) {
      return $$0.j() instanceof cla ? cpz.b : cpz.c;
   }

   private static cpz a(cqo<? extends cpt> $$0, ctw $$1) {
      if ($$0 == cqo.p) {
         return b($$1);
      } else if ($$0 == cqo.q) {
         return c($$1);
      } else if ($$0 != cqo.r && $$0 != cqo.s) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return cpz.a;
      }
   }

   private void a(ahh $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}

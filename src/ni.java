import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class ni implements nc {
   private final nd b;
   private final cte c;
   private final cqh d;
   private final ctm e;
   private final float f;
   private final int g;
   private final Map<String, an<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final csy.a<?> j;

   private ni(nd $$0, cte $$1, cxa $$2, ctm $$3, float $$4, int $$5, csy.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.l();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends csy> ni a(ctm $$0, nd $$1, cxa $$2, float $$3, int $$4, ctt<T> $$5, csy.a<T> $$6) {
      return new ni($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static ni a(ctm $$0, nd $$1, cxa $$2, float $$3, int $$4) {
      return new ni($$1, cte.a, $$2, $$0, $$3, $$4, ctd::new);
   }

   public static ni b(ctm $$0, nd $$1, cxa $$2, float $$3, int $$4) {
      return new ni($$1, c($$2), $$2, $$0, $$3, $$4, ctb::new);
   }

   public static ni c(ctm $$0, nd $$1, cxa $$2, float $$3, int $$4) {
      return new ni($$1, b($$2), $$2, $$0, $$3, $$4, cue::new);
   }

   public static ni d(ctm $$0, nd $$1, cxa $$2, float $$3, int $$4) {
      return new ni($$1, cte.a, $$2, $$0, $$3, $$4, cui::new);
   }

   public ni b(String $$0, an<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public ni b(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public cqh a() {
      return this.d;
   }

   @Override
   public void a(ne $$0, ajh $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cv.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.h.forEach($$2::a);
      csy $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new cqm(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private static cte b(cxa $$0) {
      if ($$0.l().v()) {
         return cte.a;
      } else {
         return $$0.l() instanceof coh ? cte.b : cte.c;
      }
   }

   private static cte c(cxa $$0) {
      return $$0.l() instanceof coh ? cte.b : cte.c;
   }

   private static cte a(ctt<? extends csy> $$0, cxa $$1) {
      if ($$0 == ctt.p) {
         return b($$1);
      } else if ($$0 == ctt.q) {
         return c($$1);
      } else if ($$0 != ctt.r && $$0 != ctt.s) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return cte.a;
      }
   }

   private void a(ajh $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}

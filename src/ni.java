import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class ni implements nc {
   private final nd b;
   private final ctc c;
   private final cqf d;
   private final ctk e;
   private final float f;
   private final int g;
   private final Map<String, an<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private final csw.a<?> j;

   private ni(nd $$0, ctc $$1, cwy $$2, ctk $$3, float $$4, int $$5, csw.a<?> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.l();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.j = $$6;
   }

   public static <T extends csw> ni a(ctk $$0, nd $$1, cwy $$2, float $$3, int $$4, ctr<T> $$5, csw.a<T> $$6) {
      return new ni($$1, a($$5, $$2), $$2, $$0, $$3, $$4, $$6);
   }

   public static ni a(ctk $$0, nd $$1, cwy $$2, float $$3, int $$4) {
      return new ni($$1, ctc.a, $$2, $$0, $$3, $$4, ctb::new);
   }

   public static ni b(ctk $$0, nd $$1, cwy $$2, float $$3, int $$4) {
      return new ni($$1, c($$2), $$2, $$0, $$3, $$4, csz::new);
   }

   public static ni c(ctk $$0, nd $$1, cwy $$2, float $$3, int $$4) {
      return new ni($$1, b($$2), $$2, $$0, $$3, $$4, cuc::new);
   }

   public static ni d(ctk $$0, nd $$1, cwy $$2, float $$3, int $$4) {
      return new ni($$1, ctc.a, $$2, $$0, $$3, $$4, cug::new);
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
   public cqf a() {
      return this.d;
   }

   @Override
   public void a(ne $$0, ajh $$1) {
      this.a($$1);
      ae.a $$2 = $$0.a().a("has_the_recipe", cv.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.h.forEach($$2::a);
      csw $$3 = this.j.create(Objects.requireNonNullElse(this.i, ""), this.c, this.e, new cqk(this.d), this.f, this.g);
      $$0.a($$1, $$3, $$2.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private static ctc b(cwy $$0) {
      if ($$0.l().v()) {
         return ctc.a;
      } else {
         return $$0.l() instanceof cof ? ctc.b : ctc.c;
      }
   }

   private static ctc c(cwy $$0) {
      return $$0.l() instanceof cof ? ctc.b : ctc.c;
   }

   private static ctc a(ctr<? extends csw> $$0, cwy $$1) {
      if ($$0 == ctr.p) {
         return b($$1);
      } else if ($$0 == ctr.q) {
         return c($$1);
      } else if ($$0 != ctr.r && $$0 != ctr.s) {
         throw new IllegalStateException("Unknown cooking recipe type");
      } else {
         return ctc.a;
      }
   }

   private void a(ajh $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }
}

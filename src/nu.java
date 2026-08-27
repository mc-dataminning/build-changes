import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class nu implements nq {
   private final nr b;
   private final crn c;
   private final int d;
   private final List<String> e = Lists.newArrayList();
   private final Map<Character, cvp> f = Maps.newLinkedHashMap();
   private final Map<String, an<?>> g = new LinkedHashMap<>();
   @Nullable
   private String h;
   private boolean i = true;

   public nu(nr $$0, czf $$1, int $$2) {
      this.b = $$0;
      this.c = $$1.p();
      this.d = $$2;
   }

   public static nu a(nr $$0, czf $$1) {
      return a($$0, $$1, 1);
   }

   public static nu a(nr $$0, czf $$1, int $$2) {
      return new nu($$0, $$1, $$2);
   }

   public nu a(Character $$0, avt<crn> $$1) {
      return this.a($$0, cvp.a($$1));
   }

   public nu a(Character $$0, czf $$1) {
      return this.a($$0, cvp.a($$1));
   }

   public nu a(Character $$0, cvp $$1) {
      if (this.f.containsKey($$0)) {
         throw new IllegalArgumentException("Symbol '" + $$0 + "' is already defined!");
      } else if ($$0 == ' ') {
         throw new IllegalArgumentException("Symbol ' ' (whitespace) is reserved and cannot be defined");
      } else {
         this.f.put($$0, $$1);
         return this;
      }
   }

   public nu b(String $$0) {
      if (!this.e.isEmpty() && $$0.length() != this.e.get(0).length()) {
         throw new IllegalArgumentException("Pattern must be the same width on every line!");
      } else {
         this.e.add($$0);
         return this;
      }
   }

   public nu b(String $$0, an<?> $$1) {
      this.g.put($$0, $$1);
      return this;
   }

   public nu c(@Nullable String $$0) {
      this.h = $$0;
      return this;
   }

   public nu a(boolean $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public crn a() {
      return this.c;
   }

   @Override
   public void a(ns $$0, ajv $$1) {
      cwa $$2 = this.a($$1);
      ae.a $$3 = $$0.a().a("has_the_recipe", cv.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.g.forEach($$3::a);
      cvz $$4 = new cvz(Objects.requireNonNullElse(this.h, ""), nq.a(this.b), $$2, new crs(this.c, this.d), this.i);
      $$0.a($$1, $$4, $$3.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private cwa a(ajv $$0) {
      if (this.g.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      } else {
         return cwa.a(this.f, this.e);
      }
   }
}

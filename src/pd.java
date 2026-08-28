import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class pd implements oz {
   private final jr<cxl> b;
   private final pa c;
   private final cxl d;
   private final int e;
   private final List<String> f = Lists.newArrayList();
   private final Map<Character, dca> g = Maps.newLinkedHashMap();
   private final Map<String, ap<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private boolean j = true;

   private pd(jr<cxl> $$0, pa $$1, dhh $$2, int $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.j();
      this.e = $$3;
   }

   public static pd a(jr<cxl> $$0, pa $$1, dhh $$2) {
      return a($$0, $$1, $$2, 1);
   }

   public static pd a(jr<cxl> $$0, pa $$1, dhh $$2, int $$3) {
      return new pd($$0, $$1, $$2, $$3);
   }

   public pd a(Character $$0, ayk<cxl> $$1) {
      return this.a($$0, dca.a(this.b.b($$1)));
   }

   public pd a(Character $$0, dhh $$1) {
      return this.a($$0, dca.a($$1));
   }

   public pd a(Character $$0, dca $$1) {
      if (this.g.containsKey($$0)) {
         throw new IllegalArgumentException("Symbol '" + $$0 + "' is already defined!");
      } else if ($$0 == ' ') {
         throw new IllegalArgumentException("Symbol ' ' (whitespace) is reserved and cannot be defined");
      } else {
         this.g.put($$0, $$1);
         return this;
      }
   }

   public pd b(String $$0) {
      if (!this.f.isEmpty() && $$0.length() != this.f.get(0).length()) {
         throw new IllegalArgumentException("Pattern must be the same width on every line!");
      } else {
         this.f.add($$0);
         return this;
      }
   }

   public pd b(String $$0, ap<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public pd c(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   public pd a(boolean $$0) {
      this.j = $$0;
      return this;
   }

   @Override
   public cxl a() {
      return this.d;
   }

   @Override
   public void a(pb $$0, aly<dce<?>> $$1) {
      dct $$2 = this.a($$1);
      ag.a $$3 = $$0.a().a("has_the_recipe", dv.a($$1)).a(al.a.c($$1)).a(ak.a.b);
      this.h.forEach($$3::a);
      dcs $$4 = new dcs(Objects.requireNonNullElse(this.i, ""), oz.a(this.c), $$2, new cxp(this.d, this.e), this.j);
      $$0.a($$1, $$4, $$3.b($$1.a().f("recipes/" + this.c.a() + "/")));
   }

   private dct a(aly<dce<?>> $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      } else {
         return dct.a(this.g, this.f);
      }
   }
}

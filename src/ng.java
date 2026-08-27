import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class ng implements nc {
   private final nd b;
   private final cqf c;
   private final int d;
   private final List<String> e = Lists.newArrayList();
   private final Map<Character, ctk> f = Maps.newLinkedHashMap();
   private final Map<String, an<?>> g = new LinkedHashMap<>();
   @Nullable
   private String h;
   private boolean i = true;

   public ng(nd $$0, cwy $$1, int $$2) {
      this.b = $$0;
      this.c = $$1.l();
      this.d = $$2;
   }

   public static ng a(nd $$0, cwy $$1) {
      return a($$0, $$1, 1);
   }

   public static ng a(nd $$0, cwy $$1, int $$2) {
      return new ng($$0, $$1, $$2);
   }

   public ng a(Character $$0, avd<cqf> $$1) {
      return this.a($$0, ctk.a($$1));
   }

   public ng a(Character $$0, cwy $$1) {
      return this.a($$0, ctk.a($$1));
   }

   public ng a(Character $$0, ctk $$1) {
      if (this.f.containsKey($$0)) {
         throw new IllegalArgumentException("Symbol '" + $$0 + "' is already defined!");
      } else if ($$0 == ' ') {
         throw new IllegalArgumentException("Symbol ' ' (whitespace) is reserved and cannot be defined");
      } else {
         this.f.put($$0, $$1);
         return this;
      }
   }

   public ng b(String $$0) {
      if (!this.e.isEmpty() && $$0.length() != this.e.get(0).length()) {
         throw new IllegalArgumentException("Pattern must be the same width on every line!");
      } else {
         this.e.add($$0);
         return this;
      }
   }

   public ng b(String $$0, an<?> $$1) {
      this.g.put($$0, $$1);
      return this;
   }

   public ng c(@Nullable String $$0) {
      this.h = $$0;
      return this;
   }

   public ng a(boolean $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public cqf a() {
      return this.c;
   }

   @Override
   public void a(ne $$0, ajh $$1) {
      ctv $$2 = this.a($$1);
      ae.a $$3 = $$0.a().a("has_the_recipe", cv.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.g.forEach($$3::a);
      ctu $$4 = new ctu(Objects.requireNonNullElse(this.h, ""), nc.a(this.b), $$2, new cqk(this.c, this.d), this.i);
      $$0.a($$1, $$4, $$3.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private ctv a(ajh $$0) {
      if (this.g.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      } else {
         return ctv.a(this.f, this.e);
      }
   }
}

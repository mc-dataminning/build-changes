import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class oo implements ok {
   private final ol b;
   private final cuj c;
   private final int d;
   private final List<String> e = Lists.newArrayList();
   private final Map<Character, cyu> f = Maps.newLinkedHashMap();
   private final Map<String, ao<?>> g = new LinkedHashMap<>();
   @Nullable
   private String h;
   private boolean i = true;

   public oo(ol $$0, dct $$1, int $$2) {
      this.b = $$0;
      this.c = $$1.r();
      this.d = $$2;
   }

   public static oo a(ol $$0, dct $$1) {
      return a($$0, $$1, 1);
   }

   public static oo a(ol $$0, dct $$1, int $$2) {
      return new oo($$0, $$1, $$2);
   }

   public oo a(Character $$0, awt<cuj> $$1) {
      return this.a($$0, cyu.a($$1));
   }

   public oo a(Character $$0, dct $$1) {
      return this.a($$0, cyu.a($$1));
   }

   public oo a(Character $$0, cyu $$1) {
      if (this.f.containsKey($$0)) {
         throw new IllegalArgumentException("Symbol '" + $$0 + "' is already defined!");
      } else if ($$0 == ' ') {
         throw new IllegalArgumentException("Symbol ' ' (whitespace) is reserved and cannot be defined");
      } else {
         this.f.put($$0, $$1);
         return this;
      }
   }

   public oo b(String $$0) {
      if (!this.e.isEmpty() && $$0.length() != this.e.get(0).length()) {
         throw new IllegalArgumentException("Pattern must be the same width on every line!");
      } else {
         this.e.add($$0);
         return this;
      }
   }

   public oo b(String $$0, ao<?> $$1) {
      this.g.put($$0, $$1);
      return this;
   }

   public oo c(@Nullable String $$0) {
      this.h = $$0;
      return this;
   }

   public oo a(boolean $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public cuj a() {
      return this.c;
   }

   @Override
   public void a(om $$0, akq $$1) {
      czg $$2 = this.a($$1);
      af.a $$3 = $$0.a().a("has_the_recipe", dt.a($$1)).a(ak.a.a($$1)).a(aj.a.b);
      this.g.forEach($$3::a);
      czf $$4 = new czf(Objects.requireNonNullElse(this.h, ""), ok.a(this.b), $$2, new cuo(this.c, this.d), this.i);
      $$0.a($$1, $$4, $$3.b($$1.f("recipes/" + this.b.a() + "/")));
   }

   private czg a(akq $$0) {
      if (this.g.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      } else {
         return czg.a(this.f, this.e);
      }
   }
}

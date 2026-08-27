import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class oe implements oa {
   private final ob b;
   private final csu c;
   private final int d;
   private final List<String> e = Lists.newArrayList();
   private final Map<Character, cxa> f = Maps.newLinkedHashMap();
   private final Map<String, an<?>> g = new LinkedHashMap<>();
   @Nullable
   private String h;
   private boolean i = true;

   public oe(ob $$0, dac $$1, int $$2) {
      this.b = $$0;
      this.c = $$1.q();
      this.d = $$2;
   }

   public static oe a(ob $$0, dac $$1) {
      return a($$0, $$1, 1);
   }

   public static oe a(ob $$0, dac $$1, int $$2) {
      return new oe($$0, $$1, $$2);
   }

   public oe a(Character $$0, awg<csu> $$1) {
      return this.a($$0, cxa.a($$1));
   }

   public oe a(Character $$0, dac $$1) {
      return this.a($$0, cxa.a($$1));
   }

   public oe a(Character $$0, cxa $$1) {
      if (this.f.containsKey($$0)) {
         throw new IllegalArgumentException("Symbol '" + $$0 + "' is already defined!");
      } else if ($$0 == ' ') {
         throw new IllegalArgumentException("Symbol ' ' (whitespace) is reserved and cannot be defined");
      } else {
         this.f.put($$0, $$1);
         return this;
      }
   }

   public oe b(String $$0) {
      if (!this.e.isEmpty() && $$0.length() != this.e.get(0).length()) {
         throw new IllegalArgumentException("Pattern must be the same width on every line!");
      } else {
         this.e.add($$0);
         return this;
      }
   }

   public oe b(String $$0, an<?> $$1) {
      this.g.put($$0, $$1);
      return this;
   }

   public oe c(@Nullable String $$0) {
      this.h = $$0;
      return this;
   }

   public oe a(boolean $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public csu a() {
      return this.c;
   }

   @Override
   public void a(oc $$0, akh $$1) {
      cxl $$2 = this.a($$1);
      ae.a $$3 = $$0.a().a("has_the_recipe", dc.a($$1)).a(aj.a.a($$1)).a(ai.a.b);
      this.g.forEach($$3::a);
      cxk $$4 = new cxk(Objects.requireNonNullElse(this.h, ""), oa.a(this.b), $$2, new csz(this.c, this.d), this.i);
      $$0.a($$1, $$4, $$3.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private cxl a(akh $$0) {
      if (this.g.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      } else {
         return cxl.a(this.f, this.e);
      }
   }
}

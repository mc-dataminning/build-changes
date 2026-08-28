import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class os implements oo {
   private final jo<cvg> b;
   private final op c;
   private final cvg d;
   private final int e;
   private final List<String> f = Lists.newArrayList();
   private final Map<Character, czp> g = Maps.newLinkedHashMap();
   private final Map<String, ao<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private boolean j = true;

   private os(jo<cvg> $$0, op $$1, ddr $$2, int $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.r();
      this.e = $$3;
   }

   public static os a(jo<cvg> $$0, op $$1, ddr $$2) {
      return a($$0, $$1, $$2, 1);
   }

   public static os a(jo<cvg> $$0, op $$1, ddr $$2, int $$3) {
      return new os($$0, $$1, $$2, $$3);
   }

   public os a(Character $$0, axi<cvg> $$1) {
      return this.a($$0, czp.a(this.b.b($$1)));
   }

   public os a(Character $$0, ddr $$1) {
      return this.a($$0, czp.a($$1));
   }

   public os a(Character $$0, czp $$1) {
      if (this.g.containsKey($$0)) {
         throw new IllegalArgumentException("Symbol '" + $$0 + "' is already defined!");
      } else if ($$0 == ' ') {
         throw new IllegalArgumentException("Symbol ' ' (whitespace) is reserved and cannot be defined");
      } else {
         this.g.put($$0, $$1);
         return this;
      }
   }

   public os b(String $$0) {
      if (!this.f.isEmpty() && $$0.length() != this.f.get(0).length()) {
         throw new IllegalArgumentException("Pattern must be the same width on every line!");
      } else {
         this.f.add($$0);
         return this;
      }
   }

   public os b(String $$0, ao<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public os c(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   public os a(boolean $$0) {
      this.j = $$0;
      return this;
   }

   @Override
   public cvg a() {
      return this.d;
   }

   @Override
   public void a(oq $$0, alb $$1) {
      dac $$2 = this.a($$1);
      af.a $$3 = $$0.a().a("has_the_recipe", dt.a($$1)).a(ak.a.a($$1)).a(aj.a.b);
      this.h.forEach($$3::a);
      dab $$4 = new dab(Objects.requireNonNullElse(this.i, ""), oo.a(this.c), $$2, new cvl(this.d, this.e), this.j);
      $$0.a($$1, $$4, $$3.b($$1.f("recipes/" + this.c.a() + "/")));
   }

   private dac a(alb $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      } else {
         return dac.a(this.g, this.f);
      }
   }
}

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class oj implements of {
   private final jh<czw> b;
   private final og c;
   private final czw d;
   private final int e;
   private final List<String> f = Lists.newArrayList();
   private final Map<Character, den> g = Maps.newLinkedHashMap();
   private final Map<String, ar<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private boolean j = true;

   private oj(jh<czw> $$0, og $$1, djy $$2, int $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.h();
      this.e = $$3;
   }

   public static oj a(jh<czw> $$0, og $$1, djy $$2) {
      return a($$0, $$1, $$2, 1);
   }

   public static oj a(jh<czw> $$0, og $$1, djy $$2, int $$3) {
      return new oj($$0, $$1, $$2, $$3);
   }

   public oj a(Character $$0, axv<czw> $$1) {
      return this.a($$0, den.a(this.b.b($$1)));
   }

   public oj a(Character $$0, djy $$1) {
      return this.a($$0, den.a($$1));
   }

   public oj a(Character $$0, den $$1) {
      if (this.g.containsKey($$0)) {
         throw new IllegalArgumentException("Symbol '" + $$0 + "' is already defined!");
      } else if ($$0 == ' ') {
         throw new IllegalArgumentException("Symbol ' ' (whitespace) is reserved and cannot be defined");
      } else {
         this.g.put($$0, $$1);
         return this;
      }
   }

   public oj b(String $$0) {
      if (!this.f.isEmpty() && $$0.length() != this.f.get(0).length()) {
         throw new IllegalArgumentException("Pattern must be the same width on every line!");
      } else {
         this.f.add($$0);
         return this;
      }
   }

   public oj b(String $$0, ar<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public oj c(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   public oj a(boolean $$0) {
      this.j = $$0;
      return this;
   }

   @Override
   public czw a() {
      return this.d;
   }

   @Override
   public void a(oh $$0, alj<der<?>> $$1) {
      dfg $$2 = this.a($$1);
      ai.a $$3 = $$0.a().a("has_the_recipe", di.a($$1)).a(an.a.c($$1)).a(am.a.b);
      this.h.forEach($$3::a);
      dff $$4 = new dff(Objects.requireNonNullElse(this.i, ""), of.a(this.c), $$2, new daa(this.d, this.e), this.j);
      $$0.a($$1, $$4, $$3.b($$1.a().f("recipes/" + this.c.a() + "/")));
   }

   private dfg a(alj<der<?>> $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      } else {
         return dfg.a(this.g, this.f);
      }
   }
}

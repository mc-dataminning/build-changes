import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class ol implements oh {
   private final oi b;
   private final ctv c;
   private final int d;
   private final List<String> e = Lists.newArrayList();
   private final Map<Character, cyd> f = Maps.newLinkedHashMap();
   private final Map<String, an<?>> g = new LinkedHashMap<>();
   @Nullable
   private String h;
   private boolean i = true;

   public ol(oi $$0, dcc $$1, int $$2) {
      this.b = $$0;
      this.c = $$1.r();
      this.d = $$2;
   }

   public static ol a(oi $$0, dcc $$1) {
      return a($$0, $$1, 1);
   }

   public static ol a(oi $$0, dcc $$1, int $$2) {
      return new ol($$0, $$1, $$2);
   }

   public ol a(Character $$0, awk<ctv> $$1) {
      return this.a($$0, cyd.a($$1));
   }

   public ol a(Character $$0, dcc $$1) {
      return this.a($$0, cyd.a($$1));
   }

   public ol a(Character $$0, cyd $$1) {
      if (this.f.containsKey($$0)) {
         throw new IllegalArgumentException("Symbol '" + $$0 + "' is already defined!");
      } else if ($$0 == ' ') {
         throw new IllegalArgumentException("Symbol ' ' (whitespace) is reserved and cannot be defined");
      } else {
         this.f.put($$0, $$1);
         return this;
      }
   }

   public ol b(String $$0) {
      if (!this.e.isEmpty() && $$0.length() != this.e.get(0).length()) {
         throw new IllegalArgumentException("Pattern must be the same width on every line!");
      } else {
         this.e.add($$0);
         return this;
      }
   }

   public ol b(String $$0, an<?> $$1) {
      this.g.put($$0, $$1);
      return this;
   }

   public ol c(@Nullable String $$0) {
      this.h = $$0;
      return this;
   }

   public ol a(boolean $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public ctv a() {
      return this.c;
   }

   @Override
   public void a(oj $$0, akk $$1) {
      cyp $$2 = this.a($$1);
      ae.a $$3 = $$0.a().a("has_the_recipe", dq.a($$1)).a(aj.a.a($$1)).a(ai.a.b);
      this.g.forEach($$3::a);
      cyo $$4 = new cyo(Objects.requireNonNullElse(this.h, ""), oh.a(this.b), $$2, new cua(this.c, this.d), this.i);
      $$0.a($$1, $$4, $$3.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private cyp a(akk $$0) {
      if (this.g.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      } else {
         return cyp.a(this.f, this.e);
      }
   }
}

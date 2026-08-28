import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class oj implements of {
   private final jh<dag> b;
   private final og c;
   private final dag d;
   private final int e;
   private final List<String> f = Lists.newArrayList();
   private final Map<Character, dex> g = Maps.newLinkedHashMap();
   private final Map<String, ar<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private boolean j = true;

   private oj(jh<dag> $$0, og $$1, dki $$2, int $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.h();
      this.e = $$3;
   }

   public static oj a(jh<dag> $$0, og $$1, dki $$2) {
      return a($$0, $$1, $$2, 1);
   }

   public static oj a(jh<dag> $$0, og $$1, dki $$2, int $$3) {
      return new oj($$0, $$1, $$2, $$3);
   }

   public oj a(Character $$0, ayc<dag> $$1) {
      return this.a($$0, dex.a(this.b.b($$1)));
   }

   public oj a(Character $$0, dki $$1) {
      return this.a($$0, dex.a($$1));
   }

   public oj a(Character $$0, dex $$1) {
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
   public dag a() {
      return this.d;
   }

   @Override
   public void a(oh $$0, alq<dfb<?>> $$1) {
      dfq $$2 = this.a($$1);
      ai.a $$3 = $$0.a().a("has_the_recipe", di.a($$1)).a(an.a.c($$1)).a(am.a.b);
      this.h.forEach($$3::a);
      dfp $$4 = new dfp(Objects.requireNonNullElse(this.i, ""), of.a(this.c), $$2, new dak(this.d, this.e), this.j);
      $$0.a($$1, $$4, $$3.b($$1.a().f("recipes/" + this.c.a() + "/")));
   }

   private dfq a(alq<dfb<?>> $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      } else {
         return dfq.a(this.g, this.f);
      }
   }
}

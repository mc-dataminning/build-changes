import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class my implements mu {
   private final mv b;
   private final cmm c;
   private final int d;
   private final List<String> e = Lists.newArrayList();
   private final Map<Character, cps> f = Maps.newLinkedHashMap();
   private final Map<String, an<?>> g = new LinkedHashMap<>();
   @Nullable
   private String h;
   private boolean i = true;

   public my(mv $$0, cth $$1, int $$2) {
      this.b = $$0;
      this.c = $$1.k();
      this.d = $$2;
   }

   public static my a(mv $$0, cth $$1) {
      return a($$0, $$1, 1);
   }

   public static my a(mv $$0, cth $$1, int $$2) {
      return new my($$0, $$1, $$2);
   }

   public my a(Character $$0, asq<cmm> $$1) {
      return this.a($$0, cps.a($$1));
   }

   public my a(Character $$0, cth $$1) {
      return this.a($$0, cps.a($$1));
   }

   public my a(Character $$0, cps $$1) {
      if (this.f.containsKey($$0)) {
         throw new IllegalArgumentException("Symbol '" + $$0 + "' is already defined!");
      } else if ($$0 == ' ') {
         throw new IllegalArgumentException("Symbol ' ' (whitespace) is reserved and cannot be defined");
      } else {
         this.f.put($$0, $$1);
         return this;
      }
   }

   public my b(String $$0) {
      if (!this.e.isEmpty() && $$0.length() != this.e.get(0).length()) {
         throw new IllegalArgumentException("Pattern must be the same width on every line!");
      } else {
         this.e.add($$0);
         return this;
      }
   }

   public my b(String $$0, an<?> $$1) {
      this.g.put($$0, $$1);
      return this;
   }

   public my c(@Nullable String $$0) {
      this.h = $$0;
      return this;
   }

   public my a(boolean $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public cmm a() {
      return this.c;
   }

   @Override
   public void a(mw $$0, ahd $$1) {
      cqd $$2 = this.a($$1);
      ae.a $$3 = $$0.a().a("has_the_recipe", ct.a($$1)).a(aj.a.c($$1)).a(ai.a.b);
      this.g.forEach($$3::a);
      cqc $$4 = new cqc(Objects.requireNonNullElse(this.h, ""), mu.a(this.b), $$2, new cmr(this.c, this.d), this.i);
      $$0.a($$1, $$4, $$3.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private cqd a(ahd $$0) {
      if (this.g.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      } else {
         return cqd.a(this.f, this.e);
      }
   }
}

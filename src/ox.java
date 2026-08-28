import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class ox implements ot {
   private final jr<cvx> b;
   private final ou c;
   private final cvx d;
   private final int e;
   private final List<String> f = Lists.newArrayList();
   private final Map<Character, dal> g = Maps.newLinkedHashMap();
   private final Map<String, ap<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private boolean j = true;

   private ox(jr<cvx> $$0, ou $$1, dfa $$2, int $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.j();
      this.e = $$3;
   }

   public static ox a(jr<cvx> $$0, ou $$1, dfa $$2) {
      return a($$0, $$1, $$2, 1);
   }

   public static ox a(jr<cvx> $$0, ou $$1, dfa $$2, int $$3) {
      return new ox($$0, $$1, $$2, $$3);
   }

   public ox a(Character $$0, axq<cvx> $$1) {
      return this.a($$0, dal.a(this.b.b($$1)));
   }

   public ox a(Character $$0, dfa $$1) {
      return this.a($$0, dal.a($$1));
   }

   public ox a(Character $$0, dal $$1) {
      if (this.g.containsKey($$0)) {
         throw new IllegalArgumentException("Symbol '" + $$0 + "' is already defined!");
      } else if ($$0 == ' ') {
         throw new IllegalArgumentException("Symbol ' ' (whitespace) is reserved and cannot be defined");
      } else {
         this.g.put($$0, $$1);
         return this;
      }
   }

   public ox b(String $$0) {
      if (!this.f.isEmpty() && $$0.length() != this.f.get(0).length()) {
         throw new IllegalArgumentException("Pattern must be the same width on every line!");
      } else {
         this.f.add($$0);
         return this;
      }
   }

   public ox b(String $$0, ap<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public ox c(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   public ox a(boolean $$0) {
      this.j = $$0;
      return this;
   }

   @Override
   public cvx a() {
      return this.d;
   }

   @Override
   public void a(ov $$0, ali $$1) {
      day $$2 = this.a($$1);
      ag.a $$3 = $$0.a().a("has_the_recipe", dv.a($$1)).a(al.a.a($$1)).a(ak.a.b);
      this.h.forEach($$3::a);
      dax $$4 = new dax(Objects.requireNonNullElse(this.i, ""), ot.a(this.c), $$2, new cwb(this.d, this.e), this.j);
      $$0.a($$1, $$4, $$3.b($$1.f("recipes/" + this.c.a() + "/")));
   }

   private day a(ali $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      } else {
         return day.a(this.g, this.f);
      }
   }
}

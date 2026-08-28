import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class oi implements oe {
   private final jg<czj> b;
   private final of c;
   private final czj d;
   private final int e;
   private final List<String> f = Lists.newArrayList();
   private final Map<Character, dea> g = Maps.newLinkedHashMap();
   private final Map<String, ar<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private boolean j = true;

   private oi(jg<czj> $$0, of $$1, djl $$2, int $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.h();
      this.e = $$3;
   }

   public static oi a(jg<czj> $$0, of $$1, djl $$2) {
      return a($$0, $$1, $$2, 1);
   }

   public static oi a(jg<czj> $$0, of $$1, djl $$2, int $$3) {
      return new oi($$0, $$1, $$2, $$3);
   }

   public oi a(Character $$0, axr<czj> $$1) {
      return this.a($$0, dea.a(this.b.b($$1)));
   }

   public oi a(Character $$0, djl $$1) {
      return this.a($$0, dea.a($$1));
   }

   public oi a(Character $$0, dea $$1) {
      if (this.g.containsKey($$0)) {
         throw new IllegalArgumentException("Symbol '" + $$0 + "' is already defined!");
      } else if ($$0 == ' ') {
         throw new IllegalArgumentException("Symbol ' ' (whitespace) is reserved and cannot be defined");
      } else {
         this.g.put($$0, $$1);
         return this;
      }
   }

   public oi b(String $$0) {
      if (!this.f.isEmpty() && $$0.length() != this.f.get(0).length()) {
         throw new IllegalArgumentException("Pattern must be the same width on every line!");
      } else {
         this.f.add($$0);
         return this;
      }
   }

   public oi b(String $$0, ar<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public oi c(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   public oi a(boolean $$0) {
      this.j = $$0;
      return this;
   }

   @Override
   public czj a() {
      return this.d;
   }

   @Override
   public void a(og $$0, alf<dee<?>> $$1) {
      det $$2 = this.a($$1);
      ai.a $$3 = $$0.a().a("has_the_recipe", dh.a($$1)).a(an.a.c($$1)).a(am.a.b);
      this.h.forEach($$3::a);
      des $$4 = new des(Objects.requireNonNullElse(this.i, ""), oe.a(this.c), $$2, new czn(this.d, this.e), this.j);
      $$0.a($$1, $$4, $$3.b($$1.a().f("recipes/" + this.c.a() + "/")));
   }

   private det a(alf<dee<?>> $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      } else {
         return det.a(this.g, this.f);
      }
   }
}

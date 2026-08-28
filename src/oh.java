import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class oh implements od {
   private final jf<cyu> b;
   private final oe c;
   private final cyu d;
   private final int e;
   private final List<String> f = Lists.newArrayList();
   private final Map<Character, ddl> g = Maps.newLinkedHashMap();
   private final Map<String, aq<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private boolean j = true;

   private oh(jf<cyu> $$0, oe $$1, diu $$2, int $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.h();
      this.e = $$3;
   }

   public static oh a(jf<cyu> $$0, oe $$1, diu $$2) {
      return a($$0, $$1, $$2, 1);
   }

   public static oh a(jf<cyu> $$0, oe $$1, diu $$2, int $$3) {
      return new oh($$0, $$1, $$2, $$3);
   }

   public oh a(Character $$0, axr<cyu> $$1) {
      return this.a($$0, ddl.a(this.b.b($$1)));
   }

   public oh a(Character $$0, diu $$1) {
      return this.a($$0, ddl.a($$1));
   }

   public oh a(Character $$0, ddl $$1) {
      if (this.g.containsKey($$0)) {
         throw new IllegalArgumentException("Symbol '" + $$0 + "' is already defined!");
      } else if ($$0 == ' ') {
         throw new IllegalArgumentException("Symbol ' ' (whitespace) is reserved and cannot be defined");
      } else {
         this.g.put($$0, $$1);
         return this;
      }
   }

   public oh b(String $$0) {
      if (!this.f.isEmpty() && $$0.length() != this.f.get(0).length()) {
         throw new IllegalArgumentException("Pattern must be the same width on every line!");
      } else {
         this.f.add($$0);
         return this;
      }
   }

   public oh b(String $$0, aq<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public oh c(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   public oh a(boolean $$0) {
      this.j = $$0;
      return this;
   }

   @Override
   public cyu a() {
      return this.d;
   }

   @Override
   public void a(of $$0, alf<ddp<?>> $$1) {
      dee $$2 = this.a($$1);
      ah.a $$3 = $$0.a().a("has_the_recipe", dg.a($$1)).a(am.a.c($$1)).a(al.a.b);
      this.h.forEach($$3::a);
      ded $$4 = new ded(Objects.requireNonNullElse(this.i, ""), od.a(this.c), $$2, new cyy(this.d, this.e), this.j);
      $$0.a($$1, $$4, $$3.b($$1.a().f("recipes/" + this.c.a() + "/")));
   }

   private dee a(alf<ddp<?>> $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      } else {
         return dee.a(this.g, this.f);
      }
   }
}

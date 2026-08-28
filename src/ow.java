import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class ow implements os {
   private final jq<cvt> b;
   private final ot c;
   private final cvt d;
   private final int e;
   private final List<String> f = Lists.newArrayList();
   private final Map<Character, daf> g = Maps.newLinkedHashMap();
   private final Map<String, ao<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private boolean j = true;

   private ow(jq<cvt> $$0, ot $$1, deu $$2, int $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.j();
      this.e = $$3;
   }

   public static ow a(jq<cvt> $$0, ot $$1, deu $$2) {
      return a($$0, $$1, $$2, 1);
   }

   public static ow a(jq<cvt> $$0, ot $$1, deu $$2, int $$3) {
      return new ow($$0, $$1, $$2, $$3);
   }

   public ow a(Character $$0, axp<cvt> $$1) {
      return this.a($$0, daf.a(this.b.b($$1)));
   }

   public ow a(Character $$0, deu $$1) {
      return this.a($$0, daf.a($$1));
   }

   public ow a(Character $$0, daf $$1) {
      if (this.g.containsKey($$0)) {
         throw new IllegalArgumentException("Symbol '" + $$0 + "' is already defined!");
      } else if ($$0 == ' ') {
         throw new IllegalArgumentException("Symbol ' ' (whitespace) is reserved and cannot be defined");
      } else {
         this.g.put($$0, $$1);
         return this;
      }
   }

   public ow b(String $$0) {
      if (!this.f.isEmpty() && $$0.length() != this.f.get(0).length()) {
         throw new IllegalArgumentException("Pattern must be the same width on every line!");
      } else {
         this.f.add($$0);
         return this;
      }
   }

   public ow b(String $$0, ao<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public ow c(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   public ow a(boolean $$0) {
      this.j = $$0;
      return this;
   }

   @Override
   public cvt a() {
      return this.d;
   }

   @Override
   public void a(ou $$0, alh $$1) {
      das $$2 = this.a($$1);
      af.a $$3 = $$0.a().a("has_the_recipe", du.a($$1)).a(ak.a.a($$1)).a(aj.a.b);
      this.h.forEach($$3::a);
      dar $$4 = new dar(Objects.requireNonNullElse(this.i, ""), os.a(this.c), $$2, new cvx(this.d, this.e), this.j);
      $$0.a($$1, $$4, $$3.b($$1.f("recipes/" + this.c.a() + "/")));
   }

   private das a(alh $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      } else {
         return das.a(this.g, this.f);
      }
   }
}

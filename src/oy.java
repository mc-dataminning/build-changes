import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class oy implements ou {
   private final jr<cwi> b;
   private final ov c;
   private final cwi d;
   private final int e;
   private final List<String> f = Lists.newArrayList();
   private final Map<Character, daw> g = Maps.newLinkedHashMap();
   private final Map<String, ap<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private boolean j = true;

   private oy(jr<cwi> $$0, ov $$1, dfl $$2, int $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.j();
      this.e = $$3;
   }

   public static oy a(jr<cwi> $$0, ov $$1, dfl $$2) {
      return a($$0, $$1, $$2, 1);
   }

   public static oy a(jr<cwi> $$0, ov $$1, dfl $$2, int $$3) {
      return new oy($$0, $$1, $$2, $$3);
   }

   public oy a(Character $$0, axs<cwi> $$1) {
      return this.a($$0, daw.a(this.b.b($$1)));
   }

   public oy a(Character $$0, dfl $$1) {
      return this.a($$0, daw.a($$1));
   }

   public oy a(Character $$0, daw $$1) {
      if (this.g.containsKey($$0)) {
         throw new IllegalArgumentException("Symbol '" + $$0 + "' is already defined!");
      } else if ($$0 == ' ') {
         throw new IllegalArgumentException("Symbol ' ' (whitespace) is reserved and cannot be defined");
      } else {
         this.g.put($$0, $$1);
         return this;
      }
   }

   public oy b(String $$0) {
      if (!this.f.isEmpty() && $$0.length() != this.f.get(0).length()) {
         throw new IllegalArgumentException("Pattern must be the same width on every line!");
      } else {
         this.f.add($$0);
         return this;
      }
   }

   public oy b(String $$0, ap<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public oy c(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   public oy a(boolean $$0) {
      this.j = $$0;
      return this;
   }

   @Override
   public cwi a() {
      return this.d;
   }

   @Override
   public void a(ow $$0, alj $$1) {
      dbj $$2 = this.a($$1);
      ag.a $$3 = $$0.a().a("has_the_recipe", dv.a($$1)).a(al.a.a($$1)).a(ak.a.b);
      this.h.forEach($$3::a);
      dbi $$4 = new dbi(Objects.requireNonNullElse(this.i, ""), ou.a(this.c), $$2, new cwm(this.d, this.e), this.j);
      $$0.a($$1, $$4, $$3.b($$1.f("recipes/" + this.c.a() + "/")));
   }

   private dbj a(alj $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      } else {
         return dbj.a(this.g, this.f);
      }
   }
}

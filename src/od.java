import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class od implements nz {
   private final js<cwk> b;
   private final oa c;
   private final cwk d;
   private final int e;
   private final List<String> f = Lists.newArrayList();
   private final Map<Character, daz> g = Maps.newLinkedHashMap();
   private final Map<String, aq<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private boolean j = true;

   private od(js<cwk> $$0, oa $$1, dgg $$2, int $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.j();
      this.e = $$3;
   }

   public static od a(js<cwk> $$0, oa $$1, dgg $$2) {
      return a($$0, $$1, $$2, 1);
   }

   public static od a(js<cwk> $$0, oa $$1, dgg $$2, int $$3) {
      return new od($$0, $$1, $$2, $$3);
   }

   public od a(Character $$0, axf<cwk> $$1) {
      return this.a($$0, daz.a(this.b.b($$1)));
   }

   public od a(Character $$0, dgg $$1) {
      return this.a($$0, daz.a($$1));
   }

   public od a(Character $$0, daz $$1) {
      if (this.g.containsKey($$0)) {
         throw new IllegalArgumentException("Symbol '" + $$0 + "' is already defined!");
      } else if ($$0 == ' ') {
         throw new IllegalArgumentException("Symbol ' ' (whitespace) is reserved and cannot be defined");
      } else {
         this.g.put($$0, $$1);
         return this;
      }
   }

   public od b(String $$0) {
      if (!this.f.isEmpty() && $$0.length() != this.f.get(0).length()) {
         throw new IllegalArgumentException("Pattern must be the same width on every line!");
      } else {
         this.f.add($$0);
         return this;
      }
   }

   public od b(String $$0, aq<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public od c(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   public od a(boolean $$0) {
      this.j = $$0;
      return this;
   }

   @Override
   public cwk a() {
      return this.d;
   }

   @Override
   public void a(ob $$0, aku<dbd<?>> $$1) {
      dbs $$2 = this.a($$1);
      ah.a $$3 = $$0.a().a("has_the_recipe", dw.a($$1)).a(am.a.c($$1)).a(al.a.b);
      this.h.forEach($$3::a);
      dbr $$4 = new dbr(Objects.requireNonNullElse(this.i, ""), nz.a(this.c), $$2, new cwo(this.d, this.e), this.j);
      $$0.a($$1, $$4, $$3.b($$1.a().f("recipes/" + this.c.a() + "/")));
   }

   private dbs a(aku<dbd<?>> $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      } else {
         return dbs.a(this.g, this.f);
      }
   }
}

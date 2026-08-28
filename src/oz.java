import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class oz implements ov {
   private final jr<cxc> b;
   private final ow c;
   private final cxc d;
   private final int e;
   private final List<String> f = Lists.newArrayList();
   private final Map<Character, dbr> g = Maps.newLinkedHashMap();
   private final Map<String, ap<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private boolean j = true;

   private oz(jr<cxc> $$0, ow $$1, dgy $$2, int $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.j();
      this.e = $$3;
   }

   public static oz a(jr<cxc> $$0, ow $$1, dgy $$2) {
      return a($$0, $$1, $$2, 1);
   }

   public static oz a(jr<cxc> $$0, ow $$1, dgy $$2, int $$3) {
      return new oz($$0, $$1, $$2, $$3);
   }

   public oz a(Character $$0, aya<cxc> $$1) {
      return this.a($$0, dbr.a(this.b.b($$1)));
   }

   public oz a(Character $$0, dgy $$1) {
      return this.a($$0, dbr.a($$1));
   }

   public oz a(Character $$0, dbr $$1) {
      if (this.g.containsKey($$0)) {
         throw new IllegalArgumentException("Symbol '" + $$0 + "' is already defined!");
      } else if ($$0 == ' ') {
         throw new IllegalArgumentException("Symbol ' ' (whitespace) is reserved and cannot be defined");
      } else {
         this.g.put($$0, $$1);
         return this;
      }
   }

   public oz b(String $$0) {
      if (!this.f.isEmpty() && $$0.length() != this.f.get(0).length()) {
         throw new IllegalArgumentException("Pattern must be the same width on every line!");
      } else {
         this.f.add($$0);
         return this;
      }
   }

   public oz b(String $$0, ap<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public oz c(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   public oz a(boolean $$0) {
      this.j = $$0;
      return this;
   }

   @Override
   public cxc a() {
      return this.d;
   }

   @Override
   public void a(ox $$0, alo<dbv<?>> $$1) {
      dck $$2 = this.a($$1);
      ag.a $$3 = $$0.a().a("has_the_recipe", dv.a($$1)).a(al.a.c($$1)).a(ak.a.b);
      this.h.forEach($$3::a);
      dcj $$4 = new dcj(Objects.requireNonNullElse(this.i, ""), ov.a(this.c), $$2, new cxg(this.d, this.e), this.j);
      $$0.a($$1, $$4, $$3.b($$1.a().f("recipes/" + this.c.a() + "/")));
   }

   private dck a(alo<dbv<?>> $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      } else {
         return dck.a(this.g, this.f);
      }
   }
}

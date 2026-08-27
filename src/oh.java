import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class oh implements od {
   private final oe b;
   private final ctj c;
   private final int d;
   private final List<String> e = Lists.newArrayList();
   private final Map<Character, cxr> f = Maps.newLinkedHashMap();
   private final Map<String, an<?>> g = new LinkedHashMap<>();
   @Nullable
   private String h;
   private boolean i = true;

   public oh(oe $$0, daw $$1, int $$2) {
      this.b = $$0;
      this.c = $$1.q();
      this.d = $$2;
   }

   public static oh a(oe $$0, daw $$1) {
      return a($$0, $$1, 1);
   }

   public static oh a(oe $$0, daw $$1, int $$2) {
      return new oh($$0, $$1, $$2);
   }

   public oh a(Character $$0, awl<ctj> $$1) {
      return this.a($$0, cxr.a($$1));
   }

   public oh a(Character $$0, daw $$1) {
      return this.a($$0, cxr.a($$1));
   }

   public oh a(Character $$0, cxr $$1) {
      if (this.f.containsKey($$0)) {
         throw new IllegalArgumentException("Symbol '" + $$0 + "' is already defined!");
      } else if ($$0 == ' ') {
         throw new IllegalArgumentException("Symbol ' ' (whitespace) is reserved and cannot be defined");
      } else {
         this.f.put($$0, $$1);
         return this;
      }
   }

   public oh b(String $$0) {
      if (!this.e.isEmpty() && $$0.length() != this.e.get(0).length()) {
         throw new IllegalArgumentException("Pattern must be the same width on every line!");
      } else {
         this.e.add($$0);
         return this;
      }
   }

   public oh b(String $$0, an<?> $$1) {
      this.g.put($$0, $$1);
      return this;
   }

   public oh c(@Nullable String $$0) {
      this.h = $$0;
      return this;
   }

   public oh a(boolean $$0) {
      this.i = $$0;
      return this;
   }

   @Override
   public ctj a() {
      return this.c;
   }

   @Override
   public void a(of $$0, akm $$1) {
      cyc $$2 = this.a($$1);
      ae.a $$3 = $$0.a().a("has_the_recipe", dd.a($$1)).a(aj.a.a($$1)).a(ai.a.b);
      this.g.forEach($$3::a);
      cyb $$4 = new cyb(Objects.requireNonNullElse(this.h, ""), od.a(this.b), $$2, new cto(this.c, this.d), this.i);
      $$0.a($$1, $$4, $$3.b($$1.d("recipes/" + this.b.a() + "/")));
   }

   private cyc a(akm $$0) {
      if (this.g.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      } else {
         return cyc.a(this.f, this.e);
      }
   }
}

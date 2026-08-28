import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class os implements oo {
   private final jo<cvk> b;
   private final op c;
   private final cvk d;
   private final int e;
   private final List<String> f = Lists.newArrayList();
   private final Map<Character, dad> g = Maps.newLinkedHashMap();
   private final Map<String, ao<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private boolean j = true;

   private os(jo<cvk> $$0, op $$1, def $$2, int $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.q();
      this.e = $$3;
   }

   public static os a(jo<cvk> $$0, op $$1, def $$2) {
      return a($$0, $$1, $$2, 1);
   }

   public static os a(jo<cvk> $$0, op $$1, def $$2, int $$3) {
      return new os($$0, $$1, $$2, $$3);
   }

   public os a(Character $$0, axj<cvk> $$1) {
      return this.a($$0, dad.a(this.b.b($$1)));
   }

   public os a(Character $$0, def $$1) {
      return this.a($$0, dad.a($$1));
   }

   public os a(Character $$0, dad $$1) {
      if (this.g.containsKey($$0)) {
         throw new IllegalArgumentException("Symbol '" + $$0 + "' is already defined!");
      } else if ($$0 == ' ') {
         throw new IllegalArgumentException("Symbol ' ' (whitespace) is reserved and cannot be defined");
      } else {
         this.g.put($$0, $$1);
         return this;
      }
   }

   public os b(String $$0) {
      if (!this.f.isEmpty() && $$0.length() != this.f.get(0).length()) {
         throw new IllegalArgumentException("Pattern must be the same width on every line!");
      } else {
         this.f.add($$0);
         return this;
      }
   }

   public os b(String $$0, ao<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public os c(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   public os a(boolean $$0) {
      this.j = $$0;
      return this;
   }

   @Override
   public cvk a() {
      return this.d;
   }

   @Override
   public void a(oq $$0, alc $$1) {
      daq $$2 = this.a($$1);
      af.a $$3 = $$0.a().a("has_the_recipe", dt.a($$1)).a(ak.a.a($$1)).a(aj.a.b);
      this.h.forEach($$3::a);
      dap $$4 = new dap(Objects.requireNonNullElse(this.i, ""), oo.a(this.c), $$2, new cvp(this.d, this.e), this.j);
      $$0.a($$1, $$4, $$3.b($$1.f("recipes/" + this.c.a() + "/")));
   }

   private daq a(alc $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      } else {
         return daq.a(this.g, this.f);
      }
   }
}

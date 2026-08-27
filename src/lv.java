import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.common.collect.ImmutableList.Builder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Stream;

public class lv implements ls {
   private final cua a;
   private final List<ly> b;
   private final Set<dhe<?>> c = Sets.newHashSet();
   private final List<lw> d = Lists.newArrayList();

   private lv(cua $$0, List<ly> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public lv a(lw $$0) {
      $$0.b().forEach($$0x -> {
         if (this.a.n().a($$0x.f()) != $$0x) {
            throw new IllegalStateException("Property " + $$0x + " is not defined for block " + this.a);
         } else if (!this.c.add($$0x)) {
            throw new IllegalStateException("Values of property " + $$0x + " already defined for block " + this.a);
         }
      });
      this.d.add($$0);
      return this;
   }

   public JsonElement b() {
      Stream<Pair<lx, List<ly>>> $$0 = Stream.of(Pair.of(lx.a(), this.b));

      for (lw $$1 : this.d) {
         Map<lx, List<ly>> $$2 = $$1.a();
         $$0 = $$0.flatMap($$1x -> $$2.entrySet().stream().map($$1xx -> {
               lx $$2x = ((lx)$$1.getFirst()).a((lx)$$1xx.getKey());
               List<ly> $$3 = a((List<ly>)$$1.getSecond(), (List<ly>)$$1xx.getValue());
               return Pair.of($$2x, $$3);
            }));
      }

      Map<String, JsonElement> $$3 = new TreeMap<>();
      $$0.forEach($$1 -> $$3.put(((lx)$$1.getFirst()).b(), ly.a((List<ly>)$$1.getSecond())));
      JsonObject $$4 = new JsonObject();
      $$4.add("variants", ac.a(new JsonObject(), $$1 -> $$3.forEach($$1::add)));
      return $$4;
   }

   private static List<ly> a(List<ly> $$0, List<ly> $$1) {
      Builder<ly> $$2 = ImmutableList.builder();
      $$0.forEach($$2x -> $$1.forEach($$2xx -> $$2.add(ly.a($$2x, $$2xx))));
      return $$2.build();
   }

   @Override
   public cua a() {
      return this.a;
   }

   public static lv a(cua $$0) {
      return new lv($$0, ImmutableList.of(ly.a()));
   }

   public static lv a(cua $$0, ly $$1) {
      return new lv($$0, ImmutableList.of($$1));
   }

   public static lv a(cua $$0, ly... $$1) {
      return new lv($$0, ImmutableList.copyOf($$1));
   }
}

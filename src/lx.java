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

public class lx implements lu {
   private final cut a;
   private final List<ma> b;
   private final Set<dhz<?>> c = Sets.newHashSet();
   private final List<ly> d = Lists.newArrayList();

   private lx(cut $$0, List<ma> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public lx a(ly $$0) {
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
      Stream<Pair<lz, List<ma>>> $$0 = Stream.of(Pair.of(lz.a(), this.b));

      for (ly $$1 : this.d) {
         Map<lz, List<ma>> $$2 = $$1.a();
         $$0 = $$0.flatMap($$1x -> $$2.entrySet().stream().map($$1xx -> {
               lz $$2x = ((lz)$$1.getFirst()).a((lz)$$1xx.getKey());
               List<ma> $$3 = a((List<ma>)$$1.getSecond(), (List<ma>)$$1xx.getValue());
               return Pair.of($$2x, $$3);
            }));
      }

      Map<String, JsonElement> $$3 = new TreeMap<>();
      $$0.forEach($$1 -> $$3.put(((lz)$$1.getFirst()).b(), ma.a((List<ma>)$$1.getSecond())));
      JsonObject $$4 = new JsonObject();
      $$4.add("variants", ac.a(new JsonObject(), $$1 -> $$3.forEach($$1::add)));
      return $$4;
   }

   private static List<ma> a(List<ma> $$0, List<ma> $$1) {
      Builder<ma> $$2 = ImmutableList.builder();
      $$0.forEach($$2x -> $$1.forEach($$2xx -> $$2.add(ma.a($$2x, $$2xx))));
      return $$2.build();
   }

   @Override
   public cut a() {
      return this.a;
   }

   public static lx a(cut $$0) {
      return new lx($$0, ImmutableList.of(ma.a()));
   }

   public static lx a(cut $$0, ma $$1) {
      return new lx($$0, ImmutableList.of($$1));
   }

   public static lx a(cut $$0, ma... $$1) {
      return new lx($$0, ImmutableList.copyOf($$1));
   }
}

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

public class mx implements mu {
   private final dby a;
   private final List<na> b;
   private final Set<dqc<?>> c = Sets.newHashSet();
   private final List<my> d = Lists.newArrayList();

   private mx(dby $$0, List<na> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public mx a(my $$0) {
      $$0.b().forEach($$0x -> {
         if (this.a.l().a($$0x.f()) != $$0x) {
            throw new IllegalStateException("Property " + $$0x + " is not defined for block " + this.a);
         } else if (!this.c.add($$0x)) {
            throw new IllegalStateException("Values of property " + $$0x + " already defined for block " + this.a);
         }
      });
      this.d.add($$0);
      return this;
   }

   public JsonElement b() {
      Stream<Pair<mz, List<na>>> $$0 = Stream.of(Pair.of(mz.a(), this.b));

      for (my $$1 : this.d) {
         Map<mz, List<na>> $$2 = $$1.a();
         $$0 = $$0.flatMap($$1x -> $$2.entrySet().stream().map($$1xx -> {
               mz $$2x = ((mz)$$1.getFirst()).a((mz)$$1xx.getKey());
               List<na> $$3 = a((List<na>)$$1.getSecond(), (List<na>)$$1xx.getValue());
               return Pair.of($$2x, $$3);
            }));
      }

      Map<String, JsonElement> $$3 = new TreeMap<>();
      $$0.forEach($$1 -> $$3.put(((mz)$$1.getFirst()).b(), na.a((List<na>)$$1.getSecond())));
      JsonObject $$4 = new JsonObject();
      $$4.add("variants", ac.a(new JsonObject(), $$1 -> $$3.forEach($$1::add)));
      return $$4;
   }

   private static List<na> a(List<na> $$0, List<na> $$1) {
      Builder<na> $$2 = ImmutableList.builder();
      $$0.forEach($$2x -> $$1.forEach($$2xx -> $$2.add(na.a($$2x, $$2xx))));
      return $$2.build();
   }

   @Override
   public dby a() {
      return this.a;
   }

   public static mx a(dby $$0) {
      return new mx($$0, ImmutableList.of(na.a()));
   }

   public static mx a(dby $$0, na $$1) {
      return new mx($$0, ImmutableList.of($$1));
   }

   public static mx a(dby $$0, na... $$1) {
      return new mx($$0, ImmutableList.copyOf($$1));
   }
}

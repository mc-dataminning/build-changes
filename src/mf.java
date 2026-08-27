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

public class mf implements mc {
   private final cwp a;
   private final List<mi> b;
   private final Set<dkj<?>> c = Sets.newHashSet();
   private final List<mg> d = Lists.newArrayList();

   private mf(cwp $$0, List<mi> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public mf a(mg $$0) {
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
      Stream<Pair<mh, List<mi>>> $$0 = Stream.of(Pair.of(mh.a(), this.b));

      for (mg $$1 : this.d) {
         Map<mh, List<mi>> $$2 = $$1.a();
         $$0 = $$0.flatMap($$1x -> $$2.entrySet().stream().map($$1xx -> {
               mh $$2x = ((mh)$$1.getFirst()).a((mh)$$1xx.getKey());
               List<mi> $$3 = a((List<mi>)$$1.getSecond(), (List<mi>)$$1xx.getValue());
               return Pair.of($$2x, $$3);
            }));
      }

      Map<String, JsonElement> $$3 = new TreeMap<>();
      $$0.forEach($$1 -> $$3.put(((mh)$$1.getFirst()).b(), mi.a((List<mi>)$$1.getSecond())));
      JsonObject $$4 = new JsonObject();
      $$4.add("variants", ac.a(new JsonObject(), $$1 -> $$3.forEach($$1::add)));
      return $$4;
   }

   private static List<mi> a(List<mi> $$0, List<mi> $$1) {
      Builder<mi> $$2 = ImmutableList.builder();
      $$0.forEach($$2x -> $$1.forEach($$2xx -> $$2.add(mi.a($$2x, $$2xx))));
      return $$2.build();
   }

   @Override
   public cwp a() {
      return this.a;
   }

   public static mf a(cwp $$0) {
      return new mf($$0, ImmutableList.of(mi.a()));
   }

   public static mf a(cwp $$0, mi $$1) {
      return new mf($$0, ImmutableList.of($$1));
   }

   public static mf a(cwp $$0, mi... $$1) {
      return new mf($$0, ImmutableList.copyOf($$1));
   }
}

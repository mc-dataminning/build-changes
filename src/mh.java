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

public class mh implements me {
   private final cys a;
   private final List<mk> b;
   private final Set<dmm<?>> c = Sets.newHashSet();
   private final List<mi> d = Lists.newArrayList();

   private mh(cys $$0, List<mk> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public mh a(mi $$0) {
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
      Stream<Pair<mj, List<mk>>> $$0 = Stream.of(Pair.of(mj.a(), this.b));

      for (mi $$1 : this.d) {
         Map<mj, List<mk>> $$2 = $$1.a();
         $$0 = $$0.flatMap($$1x -> $$2.entrySet().stream().map($$1xx -> {
               mj $$2x = ((mj)$$1.getFirst()).a((mj)$$1xx.getKey());
               List<mk> $$3 = a((List<mk>)$$1.getSecond(), (List<mk>)$$1xx.getValue());
               return Pair.of($$2x, $$3);
            }));
      }

      Map<String, JsonElement> $$3 = new TreeMap<>();
      $$0.forEach($$1 -> $$3.put(((mj)$$1.getFirst()).b(), mk.a((List<mk>)$$1.getSecond())));
      JsonObject $$4 = new JsonObject();
      $$4.add("variants", ac.a(new JsonObject(), $$1 -> $$3.forEach($$1::add)));
      return $$4;
   }

   private static List<mk> a(List<mk> $$0, List<mk> $$1) {
      Builder<mk> $$2 = ImmutableList.builder();
      $$0.forEach($$2x -> $$1.forEach($$2xx -> $$2.add(mk.a($$2x, $$2xx))));
      return $$2.build();
   }

   @Override
   public cys a() {
      return this.a;
   }

   public static mh a(cys $$0) {
      return new mh($$0, ImmutableList.of(mk.a()));
   }

   public static mh a(cys $$0, mk $$1) {
      return new mh($$0, ImmutableList.of($$1));
   }

   public static mh a(cys $$0, mk... $$1) {
      return new mh($$0, ImmutableList.copyOf($$1));
   }
}

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

public class nt implements nq {
   private final dfw a;
   private final List<nw> b;
   private final Set<dud<?>> c = Sets.newHashSet();
   private final List<nu> d = Lists.newArrayList();

   private nt(dfw $$0, List<nw> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public nt a(nu $$0) {
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
      Stream<Pair<nv, List<nw>>> $$0 = Stream.of(Pair.of(nv.a(), this.b));

      for (nu $$1 : this.d) {
         Map<nv, List<nw>> $$2 = $$1.a();
         $$0 = $$0.flatMap($$1x -> $$2.entrySet().stream().map($$1xx -> {
               nv $$2x = ((nv)$$1.getFirst()).a((nv)$$1xx.getKey());
               List<nw> $$3 = a((List<nw>)$$1.getSecond(), (List<nw>)$$1xx.getValue());
               return Pair.of($$2x, $$3);
            }));
      }

      Map<String, JsonElement> $$3 = new TreeMap<>();
      $$0.forEach($$1 -> $$3.put(((nv)$$1.getFirst()).b(), nw.a((List<nw>)$$1.getSecond())));
      JsonObject $$4 = new JsonObject();
      $$4.add("variants", ad.a(new JsonObject(), $$1 -> $$3.forEach($$1::add)));
      return $$4;
   }

   private static List<nw> a(List<nw> $$0, List<nw> $$1) {
      Builder<nw> $$2 = ImmutableList.builder();
      $$0.forEach($$2x -> $$1.forEach($$2xx -> $$2.add(nw.a($$2x, $$2xx))));
      return $$2.build();
   }

   @Override
   public dfw a() {
      return this.a;
   }

   public static nt a(dfw $$0) {
      return new nt($$0, ImmutableList.of(nw.a()));
   }

   public static nt a(dfw $$0, nw $$1) {
      return new nt($$0, ImmutableList.of($$1));
   }

   public static nt a(dfw $$0, nw... $$1) {
      return new nt($$0, ImmutableList.copyOf($$1));
   }
}

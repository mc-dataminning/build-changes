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

public class kx implements ku {
   private final csk a;
   private final List<la> b;
   private final Set<dgb<?>> c = Sets.newHashSet();
   private final List<ky> d = Lists.newArrayList();

   private kx(csk $$0, List<la> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public kx a(ky $$0) {
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
      Stream<Pair<kz, List<la>>> $$0 = Stream.of(Pair.of(kz.a(), this.b));

      for (ky $$1 : this.d) {
         Map<kz, List<la>> $$2 = $$1.a();
         $$0 = $$0.flatMap($$1x -> $$2.entrySet().stream().map($$1xx -> {
               kz $$2x = ((kz)$$1.getFirst()).a((kz)$$1xx.getKey());
               List<la> $$3 = a((List<la>)$$1.getSecond(), (List<la>)$$1xx.getValue());
               return Pair.of($$2x, $$3);
            }));
      }

      Map<String, JsonElement> $$3 = new TreeMap<>();
      $$0.forEach($$1 -> $$3.put(((kz)$$1.getFirst()).b(), la.a((List<la>)$$1.getSecond())));
      JsonObject $$4 = new JsonObject();
      $$4.add("variants", ac.a(new JsonObject(), $$1 -> $$3.forEach($$1::add)));
      return $$4;
   }

   private static List<la> a(List<la> $$0, List<la> $$1) {
      Builder<la> $$2 = ImmutableList.builder();
      $$0.forEach($$2x -> $$1.forEach($$2xx -> $$2.add(la.a($$2x, $$2xx))));
      return $$2.build();
   }

   @Override
   public csk a() {
      return this.a;
   }

   public static kx a(csk $$0) {
      return new kx($$0, ImmutableList.of(la.a()));
   }

   public static kx a(csk $$0, la $$1) {
      return new kx($$0, ImmutableList.of($$1));
   }

   public static kx a(csk $$0, la... $$1) {
      return new kx($$0, ImmutableList.copyOf($$1));
   }
}

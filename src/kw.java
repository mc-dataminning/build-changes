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

public class kw implements kt {
   private final csm a;
   private final List<kz> b;
   private final Set<dgd<?>> c = Sets.newHashSet();
   private final List<kx> d = Lists.newArrayList();

   private kw(csm $$0, List<kz> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public kw a(kx $$0) {
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
      Stream<Pair<ky, List<kz>>> $$0 = Stream.of(Pair.of(ky.a(), this.b));

      for (kx $$1 : this.d) {
         Map<ky, List<kz>> $$2 = $$1.a();
         $$0 = $$0.flatMap($$1x -> $$2.entrySet().stream().map($$1xx -> {
               ky $$2x = ((ky)$$1.getFirst()).a((ky)$$1xx.getKey());
               List<kz> $$3 = a((List<kz>)$$1.getSecond(), (List<kz>)$$1xx.getValue());
               return Pair.of($$2x, $$3);
            }));
      }

      Map<String, JsonElement> $$3 = new TreeMap<>();
      $$0.forEach($$1 -> $$3.put(((ky)$$1.getFirst()).b(), kz.a((List<kz>)$$1.getSecond())));
      JsonObject $$4 = new JsonObject();
      $$4.add("variants", ac.a(new JsonObject(), $$1 -> $$3.forEach($$1::add)));
      return $$4;
   }

   private static List<kz> a(List<kz> $$0, List<kz> $$1) {
      Builder<kz> $$2 = ImmutableList.builder();
      $$0.forEach($$2x -> $$1.forEach($$2xx -> $$2.add(kz.a($$2x, $$2xx))));
      return $$2.build();
   }

   @Override
   public csm a() {
      return this.a;
   }

   public static kw a(csm $$0) {
      return new kw($$0, ImmutableList.of(kz.a()));
   }

   public static kw a(csm $$0, kz $$1) {
      return new kw($$0, ImmutableList.of($$1));
   }

   public static kw a(csm $$0, kz... $$1) {
      return new kw($$0, ImmutableList.copyOf($$1));
   }
}

import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class kc implements ji {
   private static final Logger d = LogUtils.getLogger();
   private final jk.a e;
   private final Set<aer> f;
   private final List<kc.a> g;

   public kc(jk $$0, Set<aer> $$1, List<kc.a> $$2) {
      this.e = $$0.a(jk.b.a, "loot_tables");
      this.g = $$2;
      this.f = $$1;
   }

   @Override
   public CompletableFuture<?> a(jg $$0) {
      final Map<aer, eco> $$1 = Maps.newHashMap();
      Map<dkx.a, aer> $$2 = new Object2ObjectOpenHashMap();
      this.g.forEach($$2x -> $$2x.a().get().generate(($$3x, $$4) -> {
            aer $$5x = $$2.put(bgv.a($$3x), $$3x);
            if ($$5x != null) {
               ac.a("Loot table random sequence seed collision on " + $$5x + " and " + $$3x);
            }

            $$4.a($$3x);
            if ($$1.put($$3x, $$4.a($$2x.b).b()) != null) {
               throw new IllegalStateException("Duplicate loot table " + $$3x);
            }
         }));
      ecp $$3 = new ecp(eeq.n, new eck() {
         @Nullable
         @Override
         public <T> T getElement(eci<T> $$0) {
            return (T)($$0.a() == ecl.c ? $$1.get($$0.b()) : null);
         }
      });

      for (aer $$5 : Sets.difference(this.f, $$1.keySet())) {
         $$3.a("Missing built-in table: " + $$5);
      }

      $$1.forEach(($$1x, $$2x) -> $$2x.a($$3.a($$2x.a()).a("{" + $$1x + "}", new eci<>(ecl.c, $$1x))));
      Multimap<String, String> $$6 = $$3.a();
      if (!$$6.isEmpty()) {
         $$6.forEach(($$0x, $$1x) -> d.warn("Found validation problem in {}: {}", $$0x, $$1x));
         throw new IllegalStateException("Failed to validate loot tables, see logs");
      } else {
         return CompletableFuture.allOf($$1.entrySet().stream().map($$1x -> {
            aer $$2x = (aer)$$1x.getKey();
            eco $$3x = (eco)$$1x.getValue();
            Path $$4 = this.e.a($$2x);
            return ji.a($$0, eco.c, $$3x, $$4);
         }).toArray(CompletableFuture[]::new));
      }
   }

   @Override
   public final String a() {
      return "Loot Tables";
   }

   public static record a(Supplier<kd> a, eep b) {
   }
}

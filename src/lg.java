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

public class lg implements kk {
   private static final Logger d = LogUtils.getLogger();
   private final km.a e;
   private final Set<ahh> f;
   private final List<lg.a> g;

   public lg(km $$0, Set<ahh> $$1, List<lg.a> $$2) {
      this.e = $$0.a(km.b.a, "loot_tables");
      this.g = $$2;
      this.f = $$1;
   }

   @Override
   public CompletableFuture<?> a(ki $$0) {
      final Map<ahh, ehn> $$1 = Maps.newHashMap();
      Map<dpn.a, ahh> $$2 = new Object2ObjectOpenHashMap();
      this.g.forEach($$2x -> $$2x.a().get().generate(($$3x, $$4x) -> {
            ahh $$5 = $$2.put(bki.a($$3x), $$3x);
            if ($$5 != null) {
               ac.a("Loot table random sequence seed collision on " + $$5 + " and " + $$3x);
            }

            $$4x.a($$3x);
            if ($$1.put($$3x, $$4x.a($$2x.b).b()) != null) {
               throw new IllegalStateException("Duplicate loot table " + $$3x);
            }
         }));
      auu.a $$3 = new auu.a();
      eho $$4 = new eho($$3, ejp.n, new ehj() {
         @Nullable
         @Override
         public <T> T getElement(ehh<T> $$0) {
            return (T)($$0.a() == ehk.c ? $$1.get($$0.b()) : null);
         }
      });

      for (ahh $$6 : Sets.difference(this.f, $$1.keySet())) {
         $$3.b("Missing built-in table: " + $$6);
      }

      $$1.forEach(($$1x, $$2x) -> $$2x.a($$4.a($$2x.a()).a("{" + $$1x + "}", new ehh<>(ehk.c, $$1x))));
      Multimap<String, String> $$7 = $$3.a();
      if (!$$7.isEmpty()) {
         $$7.forEach(($$0x, $$1x) -> d.warn("Found validation problem in {}: {}", $$0x, $$1x));
         throw new IllegalStateException("Failed to validate loot tables, see logs");
      } else {
         return CompletableFuture.allOf($$1.entrySet().stream().map($$1x -> {
            ahh $$2x = (ahh)$$1x.getKey();
            ehn $$3x = (ehn)$$1x.getValue();
            Path $$4x = this.e.a($$2x);
            return kk.a($$0, ehn.c, $$3x, $$4x);
         }).toArray(CompletableFuture[]::new));
      }
   }

   @Override
   public final String a() {
      return "Loot Tables";
   }

   public static record a(Supplier<lh> a, ejo b) {
   }
}

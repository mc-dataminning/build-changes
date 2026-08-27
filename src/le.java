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

public class le implements kk {
   private static final Logger d = LogUtils.getLogger();
   private final km.a e;
   private final Set<ahd> f;
   private final List<le.a> g;

   public le(km $$0, Set<ahd> $$1, List<le.a> $$2) {
      this.e = $$0.a(km.b.a, "loot_tables");
      this.g = $$2;
      this.f = $$1;
   }

   @Override
   public CompletableFuture<?> a(ki $$0) {
      final Map<ahd, egx> $$1 = Maps.newHashMap();
      Map<doy.a, ahd> $$2 = new Object2ObjectOpenHashMap();
      this.g.forEach($$2x -> $$2x.a().get().generate(($$3x, $$4x) -> {
            ahd $$5 = $$2.put(bka.a($$3x), $$3x);
            if ($$5 != null) {
               ac.a("Loot table random sequence seed collision on " + $$5 + " and " + $$3x);
            }

            $$4x.a($$3x);
            if ($$1.put($$3x, $$4x.a($$2x.b).b()) != null) {
               throw new IllegalStateException("Duplicate loot table " + $$3x);
            }
         }));
      aun.a $$3 = new aun.a();
      egy $$4 = new egy($$3, eiz.n, new egt() {
         @Nullable
         @Override
         public <T> T getElement(egr<T> $$0) {
            return (T)($$0.a() == egu.c ? $$1.get($$0.b()) : null);
         }
      });

      for (ahd $$6 : Sets.difference(this.f, $$1.keySet())) {
         $$3.b("Missing built-in table: " + $$6);
      }

      $$1.forEach(($$1x, $$2x) -> $$2x.a($$4.a($$2x.a()).a("{" + $$1x + "}", new egr<>(egu.c, $$1x))));
      Multimap<String, String> $$7 = $$3.a();
      if (!$$7.isEmpty()) {
         $$7.forEach(($$0x, $$1x) -> d.warn("Found validation problem in {}: {}", $$0x, $$1x));
         throw new IllegalStateException("Failed to validate loot tables, see logs");
      } else {
         return CompletableFuture.allOf($$1.entrySet().stream().map($$1x -> {
            ahd $$2x = (ahd)$$1x.getKey();
            egx $$3x = (egx)$$1x.getValue();
            Path $$4x = this.e.a($$2x);
            return kk.a($$0, egx.c, $$3x, $$4x);
         }).toArray(CompletableFuture[]::new));
      }
   }

   @Override
   public final String a() {
      return "Loot Tables";
   }

   public static record a(Supplier<lf> a, eiy b) {
   }
}

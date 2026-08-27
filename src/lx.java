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

public class lx implements la {
   private static final Logger d = LogUtils.getLogger();
   private final lc.a e;
   private final Set<ajv> f;
   private final List<lx.a> g;
   private final CompletableFuture<ip.a> h;

   public lx(lc $$0, Set<ajv> $$1, List<lx.a> $$2, CompletableFuture<ip.a> $$3) {
      this.e = $$0.a(lc.b.a, "loot_tables");
      this.g = $$2;
      this.f = $$1;
      this.h = $$3;
   }

   @Override
   public CompletableFuture<?> a(ky $$0) {
      return this.h.thenCompose($$1 -> this.a($$0, $$1));
   }

   private CompletableFuture<?> a(ky $$0, ip.a $$1) {
      final Map<ajv, ens> $$2 = Maps.newHashMap();
      Map<dvp.a, ajv> $$3 = new Object2ObjectOpenHashMap();
      this.g.forEach($$3x -> $$3x.a().get().generate($$1, ($$3xx, $$4x) -> {
            ajv $$5x = $$3.put(bol.a($$3xx), $$3xx);
            if ($$5x != null) {
               ac.a("Loot table random sequence seed collision on " + $$5x + " and " + $$3xx);
            }

            $$4x.a($$3xx);
            if ($$2.put($$3xx, $$4x.a($$3x.b).b()) != null) {
               throw new IllegalStateException("Duplicate loot table " + $$3xx);
            }
         }));
      axr.a $$4 = new axr.a();
      ent $$5 = new ent($$4, epw.p, new eno() {
         @Nullable
         @Override
         public <T> T getElement(enm<T> $$0) {
            return (T)($$0.a() == enp.c ? $$2.get($$0.b()) : null);
         }
      });

      for (ajv $$7 : Sets.difference(this.f, $$2.keySet())) {
         $$4.b("Missing built-in table: " + $$7);
      }

      $$2.forEach(($$1x, $$2x) -> $$2x.a($$5.a($$2x.a()).a("{" + $$1x + "}", new enm<>(enp.c, $$1x))));
      Multimap<String, String> $$8 = $$4.a();
      if (!$$8.isEmpty()) {
         $$8.forEach(($$0x, $$1x) -> d.warn("Found validation problem in {}: {}", $$0x, $$1x));
         throw new IllegalStateException("Failed to validate loot tables, see logs");
      } else {
         return CompletableFuture.allOf($$2.entrySet().stream().map($$2x -> {
            ajv $$3x = (ajv)$$2x.getKey();
            ens $$4x = (ens)$$2x.getValue();
            Path $$5x = this.e.a($$3x);
            return la.a($$0, $$1, ens.d, $$4x, $$5x);
         }).toArray(CompletableFuture[]::new));
      }
   }

   @Override
   public final String a() {
      return "Loot Tables";
   }

   public static record a(Supplier<ly> a, epv b) {
   }
}

import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import org.slf4j.Logger;

public class mm implements lo {
   private static final Logger d = LogUtils.getLogger();
   private final lq.a e;
   private final Set<aks<eru>> f;
   private final List<mm.a> g;
   private final CompletableFuture<jc.a> h;

   public mm(lq $$0, Set<aks<eru>> $$1, List<mm.a> $$2, CompletableFuture<jc.a> $$3) {
      this.e = $$0.a(lq.b.a, "loot_tables");
      this.g = $$2;
      this.f = $$1;
      this.h = $$3;
   }

   @Override
   public CompletableFuture<?> a(lm $$0) {
      return this.h.thenCompose($$1 -> this.a($$0, $$1));
   }

   private CompletableFuture<?> a(lm $$0, jc.a $$1) {
      jw<eru> $$2 = new ji<>(li.aU, Lifecycle.experimental());
      Map<dzj.a, akt> $$3 = new Object2ObjectOpenHashMap();
      this.g.forEach($$3x -> $$3x.a().get().generate($$1, ($$3xx, $$4x) -> {
            akt $$5x = a($$3xx);
            akt $$6x = $$3.put(bqg.a($$5x), $$5x);
            if ($$6x != null) {
               ad.a("Loot table random sequence seed collision on " + $$6x + " and " + $$3xx.a());
            }

            $$4x.a($$5x);
            eru $$7 = $$4x.a($$3x.b).b();
            $$2.a($$3xx, $$7, jm.a);
         }));
      $$2.l();
      ayr.a $$4 = new ayr.a();
      jb.a $$5 = new jo.c(List.of($$2)).d().b();
      erv $$6 = new erv($$4, euf.p, $$5);

      for (aks<eru> $$8 : Sets.difference(this.f, $$2.f())) {
         $$4.b("Missing built-in table: " + $$8.a());
      }

      $$2.h().forEach($$1x -> ((eru)$$1x.a()).a($$6.a(((eru)$$1x.a()).a()).a("{" + $$1x.h().a() + "}", $$1x.h())));
      Multimap<String, String> $$9 = $$4.a();
      if (!$$9.isEmpty()) {
         $$9.forEach(($$0x, $$1x) -> d.warn("Found validation problem in {}: {}", $$0x, $$1x));
         throw new IllegalStateException("Failed to validate loot tables, see logs");
      } else {
         return CompletableFuture.allOf($$2.g().stream().map($$2x -> {
            aks<eru> $$3x = (aks<eru>)$$2x.getKey();
            eru $$4x = (eru)$$2x.getValue();
            Path $$5x = this.e.a($$3x.a());
            return lo.a($$0, $$1, eru.d, $$4x, $$5x);
         }).toArray(CompletableFuture[]::new));
      }
   }

   private static akt a(aks<eru> $$0) {
      return $$0.a();
   }

   @Override
   public final String a() {
      return "Loot Tables";
   }

   public static record a(Supplier<mn> a, eue b) {
   }
}

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
import java.util.function.Function;
import org.slf4j.Logger;

public class nb implements me {
   private static final Logger d = LogUtils.getLogger();
   private final mg.a e;
   private final Set<alg<eub>> f;
   private final List<nb.a> g;
   private final CompletableFuture<jr.a> h;

   public nb(mg $$0, Set<alg<eub>> $$1, List<nb.a> $$2, CompletableFuture<jr.a> $$3) {
      this.e = $$0.a(ly.bd);
      this.g = $$2;
      this.f = $$1;
      this.h = $$3;
   }

   @Override
   public CompletableFuture<?> a(mc $$0) {
      return this.h.thenCompose($$1 -> this.a($$0, $$1));
   }

   private CompletableFuture<?> a(mc $$0, jr.a $$1) {
      kl<eub> $$2 = new jx<>(ly.bd, Lifecycle.experimental());
      Map<ebo.a, alh> $$3 = new Object2ObjectOpenHashMap();
      this.g.forEach($$3x -> $$3x.a().apply($$1).generate(($$3xx, $$4x) -> {
            alh $$5x = a($$3xx);
            alh $$6x = $$3.put(bsc.a($$5x), $$5x);
            if ($$6x != null) {
               ad.b("Loot table random sequence seed collision on " + $$6x + " and " + $$3xx.a());
            }

            $$4x.a($$5x);
            eub $$7 = $$4x.a($$3x.b).b();
            $$2.a($$3xx, $$7, kb.a);
         }));
      $$2.n();
      azp.a $$4 = new azp.a();
      jq.a $$5 = new kd.c(List.of($$2)).e();
      euc $$6 = new euc($$4, ewr.q, $$5);

      for (alg<eub> $$8 : Sets.difference(this.f, $$2.j())) {
         $$4.b("Missing built-in table: " + $$8.a());
      }

      $$2.c().forEach($$1x -> ((eub)$$1x.a()).a($$6.a(((eub)$$1x.a()).a()).a("{" + $$1x.h().a() + "}", $$1x.h())));
      Multimap<String, String> $$9 = $$4.a();
      if (!$$9.isEmpty()) {
         $$9.forEach(($$0x, $$1x) -> d.warn("Found validation problem in {}: {}", $$0x, $$1x));
         throw new IllegalStateException("Failed to validate loot tables, see logs");
      } else {
         return CompletableFuture.allOf($$2.k().stream().map($$2x -> {
            alg<eub> $$3x = (alg<eub>)$$2x.getKey();
            eub $$4x = (eub)$$2x.getValue();
            Path $$5x = this.e.a($$3x.a());
            return me.a($$0, $$1, eub.d, $$4x, $$5x);
         }).toArray(CompletableFuture[]::new));
      }
   }

   private static alh a(alg<eub> $$0) {
      return $$0.a();
   }

   @Override
   public final String a() {
      return "Loot Tables";
   }

   public static record a(Function<jr.a, nc> a, ewq b) {
   }
}

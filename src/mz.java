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

public class mz implements mc {
   private static final Logger d = LogUtils.getLogger();
   private final me.a e;
   private final Set<ald<etq>> f;
   private final List<mz.a> g;
   private final CompletableFuture<jq.a> h;

   public mz(me $$0, Set<ald<etq>> $$1, List<mz.a> $$2, CompletableFuture<jq.a> $$3) {
      this.e = $$0.a(lw.be);
      this.g = $$2;
      this.f = $$1;
      this.h = $$3;
   }

   @Override
   public CompletableFuture<?> a(ma $$0) {
      return this.h.thenCompose($$1 -> this.a($$0, $$1));
   }

   private CompletableFuture<?> a(ma $$0, jq.a $$1) {
      kk<etq> $$2 = new jw<>(lw.be, Lifecycle.experimental());
      Map<ebd.a, ale> $$3 = new Object2ObjectOpenHashMap();
      this.g.forEach($$3x -> $$3x.a().apply($$1).generate(($$3xx, $$4x) -> {
            ale $$5x = a($$3xx);
            ale $$6x = $$3.put(brw.a($$5x), $$5x);
            if ($$6x != null) {
               ad.b("Loot table random sequence seed collision on " + $$6x + " and " + $$3xx.a());
            }

            $$4x.a($$5x);
            etq $$7 = $$4x.a($$3x.b).b();
            $$2.a($$3xx, $$7, ka.a);
         }));
      $$2.n();
      azl.a $$4 = new azl.a();
      jp.a $$5 = new kc.c(List.of($$2)).e();
      etr $$6 = new etr($$4, ewg.q, $$5);

      for (ald<etq> $$8 : Sets.difference(this.f, $$2.j())) {
         $$4.b("Missing built-in table: " + $$8.a());
      }

      $$2.c().forEach($$1x -> ((etq)$$1x.a()).a($$6.a(((etq)$$1x.a()).a()).a("{" + $$1x.h().a() + "}", $$1x.h())));
      Multimap<String, String> $$9 = $$4.a();
      if (!$$9.isEmpty()) {
         $$9.forEach(($$0x, $$1x) -> d.warn("Found validation problem in {}: {}", $$0x, $$1x));
         throw new IllegalStateException("Failed to validate loot tables, see logs");
      } else {
         return CompletableFuture.allOf($$2.k().stream().map($$2x -> {
            ald<etq> $$3x = (ald<etq>)$$2x.getKey();
            etq $$4x = (etq)$$2x.getValue();
            Path $$5x = this.e.a($$3x.a());
            return mc.a($$0, $$1, etq.d, $$4x, $$5x);
         }).toArray(CompletableFuture[]::new));
      }
   }

   private static ale a(ald<etq> $$0) {
      return $$0.a();
   }

   @Override
   public final String a() {
      return "Loot Tables";
   }

   public static record a(Function<jq.a, na> a, ewf b) {
   }
}

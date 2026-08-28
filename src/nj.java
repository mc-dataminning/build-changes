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

public class nj implements mm {
   private static final Logger d = LogUtils.getLogger();
   private final mo.a e;
   private final Set<ald<eys>> f;
   private final List<nj.a> g;
   private final CompletableFuture<jg.a> h;

   public nj(mo $$0, Set<ald<eys>> $$1, List<nj.a> $$2, CompletableFuture<jg.a> $$3) {
      this.e = $$0.a(mg.bo);
      this.g = $$2;
      this.f = $$1;
      this.h = $$3;
   }

   @Override
   public CompletableFuture<?> a(mk $$0) {
      return this.h.thenCompose($$1 -> this.a($$0, $$1));
   }

   private CompletableFuture<?> a(mk $$0, jg.a $$1) {
      ka<eys> $$2 = new jm<>(mg.bo, Lifecycle.experimental());
      Map<egc.a, ale> $$3 = new Object2ObjectOpenHashMap();
      this.g.forEach($$3x -> $$3x.a().apply($$1).generate(($$3xx, $$4x) -> {
            ale $$5x = a($$3xx);
            ale $$6x = $$3.put(buc.a($$5x), $$5x);
            if ($$6x != null) {
               af.b("Loot table random sequence seed collision on " + $$6x + " and " + $$3xx.a());
            }

            $$4x.a($$5x);
            eys $$7 = $$4x.a($$3x.b).b();
            $$2.a($$3xx, $$7, jq.a);
         }));
      $$2.n();
      azr.a $$4 = new azr.a();
      jf.a $$5 = new js.c(List.of($$2)).e();
      eyt $$6 = new eyt($$4, fbg.q, $$5);

      for (ald<eys> $$8 : Sets.difference(this.f, $$2.j())) {
         $$4.b("Missing built-in table: " + $$8.a());
      }

      $$2.c().forEach($$1x -> ((eys)$$1x.a()).a($$6.a(((eys)$$1x.a()).a()).a("{" + $$1x.h().a() + "}", $$1x.h())));
      Multimap<String, String> $$9 = $$4.a();
      if (!$$9.isEmpty()) {
         $$9.forEach(($$0x, $$1x) -> d.warn("Found validation problem in {}: {}", $$0x, $$1x));
         throw new IllegalStateException("Failed to validate loot tables, see logs");
      } else {
         return CompletableFuture.allOf($$2.k().stream().map($$2x -> {
            ald<eys> $$3x = (ald<eys>)$$2x.getKey();
            eys $$4x = (eys)$$2x.getValue();
            Path $$5x = this.e.a($$3x.a());
            return mm.a($$0, $$1, eys.d, $$4x, $$5x);
         }).toArray(CompletableFuture[]::new));
      }
   }

   private static ale a(ald<eys> $$0) {
      return $$0.a();
   }

   @Override
   public final String a() {
      return "Loot Tables";
   }

   public static record a(Function<jg.a, nk> a, baw b) {
   }
}

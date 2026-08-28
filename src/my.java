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

public class my implements mb {
   private static final Logger d = LogUtils.getLogger();
   private final md.a e;
   private final Set<alb<etm>> f;
   private final List<my.a> g;
   private final CompletableFuture<jp.a> h;

   public my(md $$0, Set<alb<etm>> $$1, List<my.a> $$2, CompletableFuture<jp.a> $$3) {
      this.e = $$0.a(lv.bd);
      this.g = $$2;
      this.f = $$1;
      this.h = $$3;
   }

   @Override
   public CompletableFuture<?> a(lz $$0) {
      return this.h.thenCompose($$1 -> this.a($$0, $$1));
   }

   private CompletableFuture<?> a(lz $$0, jp.a $$1) {
      kj<etm> $$2 = new jv<>(lv.bd, Lifecycle.experimental());
      Map<eaz.a, alc> $$3 = new Object2ObjectOpenHashMap();
      this.g.forEach($$3x -> $$3x.a().apply($$1).generate(($$3xx, $$4x) -> {
            alc $$5x = a($$3xx);
            alc $$6x = $$3.put(brt.a($$5x), $$5x);
            if ($$6x != null) {
               ad.b("Loot table random sequence seed collision on " + $$6x + " and " + $$3xx.a());
            }

            $$4x.a($$5x);
            etm $$7 = $$4x.a($$3x.b).b();
            $$2.a($$3xx, $$7, jz.a);
         }));
      $$2.l();
      azj.a $$4 = new azj.a();
      jo.a $$5 = new kb.c(List.of($$2)).f().c();
      etn $$6 = new etn($$4, ewc.q, $$5);

      for (alb<etm> $$8 : Sets.difference(this.f, $$2.g())) {
         $$4.b("Missing built-in table: " + $$8.a());
      }

      $$2.i().forEach($$1x -> ((etm)$$1x.a()).a($$6.a(((etm)$$1x.a()).a()).a("{" + $$1x.h().a() + "}", $$1x.h())));
      Multimap<String, String> $$9 = $$4.a();
      if (!$$9.isEmpty()) {
         $$9.forEach(($$0x, $$1x) -> d.warn("Found validation problem in {}: {}", $$0x, $$1x));
         throw new IllegalStateException("Failed to validate loot tables, see logs");
      } else {
         return CompletableFuture.allOf($$2.h().stream().map($$2x -> {
            alb<etm> $$3x = (alb<etm>)$$2x.getKey();
            etm $$4x = (etm)$$2x.getValue();
            Path $$5x = this.e.a($$3x.a());
            return mb.a($$0, $$1, etm.d, $$4x, $$5x);
         }).toArray(CompletableFuture[]::new));
      }
   }

   private static alc a(alb<etm> $$0) {
      return $$0.a();
   }

   @Override
   public final String a() {
      return "Loot Tables";
   }

   public static record a(Function<jp.a, mz> a, ewb b) {
   }
}

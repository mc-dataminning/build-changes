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

public class nd implements mg {
   private static final Logger d = LogUtils.getLogger();
   private final mi.a e;
   private final Set<ali<eus>> f;
   private final List<nd.a> g;
   private final CompletableFuture<js.a> h;

   public nd(mi $$0, Set<ali<eus>> $$1, List<nd.a> $$2, CompletableFuture<js.a> $$3) {
      this.e = $$0.a(ma.bd);
      this.g = $$2;
      this.f = $$1;
      this.h = $$3;
   }

   @Override
   public CompletableFuture<?> a(me $$0) {
      return this.h.thenCompose($$1 -> this.a($$0, $$1));
   }

   private CompletableFuture<?> a(me $$0, js.a $$1) {
      km<eus> $$2 = new jy<>(ma.bd, Lifecycle.experimental());
      Map<ecf.a, alj> $$3 = new Object2ObjectOpenHashMap();
      this.g.forEach($$3x -> $$3x.a().apply($$1).generate(($$3xx, $$4x) -> {
            alj $$5x = a($$3xx);
            alj $$6x = $$3.put(bso.a($$5x), $$5x);
            if ($$6x != null) {
               ae.b("Loot table random sequence seed collision on " + $$6x + " and " + $$3xx.a());
            }

            $$4x.a($$5x);
            eus $$7 = $$4x.a($$3x.b).b();
            $$2.a($$3xx, $$7, kc.a);
         }));
      $$2.n();
      azs.a $$4 = new azs.a();
      jr.a $$5 = new ke.c(List.of($$2)).e();
      eut $$6 = new eut($$4, exi.q, $$5);

      for (ali<eus> $$8 : Sets.difference(this.f, $$2.j())) {
         $$4.b("Missing built-in table: " + $$8.a());
      }

      $$2.c().forEach($$1x -> ((eus)$$1x.a()).a($$6.a(((eus)$$1x.a()).a()).a("{" + $$1x.h().a() + "}", $$1x.h())));
      Multimap<String, String> $$9 = $$4.a();
      if (!$$9.isEmpty()) {
         $$9.forEach(($$0x, $$1x) -> d.warn("Found validation problem in {}: {}", $$0x, $$1x));
         throw new IllegalStateException("Failed to validate loot tables, see logs");
      } else {
         return CompletableFuture.allOf($$2.k().stream().map($$2x -> {
            ali<eus> $$3x = (ali<eus>)$$2x.getKey();
            eus $$4x = (eus)$$2x.getValue();
            Path $$5x = this.e.a($$3x.a());
            return mg.a($$0, $$1, eus.d, $$4x, $$5x);
         }).toArray(CompletableFuture[]::new));
      }
   }

   private static alj a(ali<eus> $$0) {
      return $$0.a();
   }

   @Override
   public final String a() {
      return "Loot Tables";
   }

   public static record a(Function<js.a, ne> a, exh b) {
   }
}

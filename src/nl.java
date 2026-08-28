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

public class nl implements mo {
   private static final Logger d = LogUtils.getLogger();
   private final mq.a e;
   private final Set<alj<fao>> f;
   private final List<nl.a> g;
   private final CompletableFuture<ji.a> h;

   public nl(mq $$0, Set<alj<fao>> $$1, List<nl.a> $$2, CompletableFuture<ji.a> $$3) {
      this.e = $$0.a(mi.br);
      this.g = $$2;
      this.f = $$1;
      this.h = $$3;
   }

   @Override
   public CompletableFuture<?> a(mm $$0) {
      return this.h.thenCompose($$1 -> this.a($$0, $$1));
   }

   private CompletableFuture<?> a(mm $$0, ji.a $$1) {
      kc<fao> $$2 = new jo<>(mi.br, Lifecycle.experimental());
      Map<ehu.a, alk> $$3 = new Object2ObjectOpenHashMap();
      this.g.forEach($$3x -> $$3x.a().apply($$1).generate(($$3xx, $$4x) -> {
            alk $$5x = a($$3xx);
            alk $$6x = $$3.put(bux.a($$5x), $$5x);
            if ($$6x != null) {
               ag.b("Loot table random sequence seed collision on " + $$6x + " and " + $$3xx.a());
            }

            $$4x.a($$5x);
            fao $$7 = $$4x.a($$3x.b).b();
            $$2.a($$3xx, $$7, js.a);
         }));
      $$2.n();
      azx.a $$4 = new azx.a();
      jh.a $$5 = new ju.c(List.of($$2)).e();
      fap $$6 = new fap($$4, fdc.q, $$5);

      for (alj<fao> $$8 : Sets.difference(this.f, $$2.j())) {
         $$4.b("Missing built-in table: " + $$8.a());
      }

      $$2.c().forEach($$1x -> ((fao)$$1x.a()).a($$6.a(((fao)$$1x.a()).a()).a("{" + $$1x.h().a() + "}", $$1x.h())));
      Multimap<String, String> $$9 = $$4.a();
      if (!$$9.isEmpty()) {
         $$9.forEach(($$0x, $$1x) -> d.warn("Found validation problem in {}: {}", $$0x, $$1x));
         throw new IllegalStateException("Failed to validate loot tables, see logs");
      } else {
         return CompletableFuture.allOf($$2.k().stream().map($$2x -> {
            alj<fao> $$3x = (alj<fao>)$$2x.getKey();
            fao $$4x = (fao)$$2x.getValue();
            Path $$5x = this.e.a($$3x.a());
            return mo.a($$0, $$1, fao.d, $$4x, $$5x);
         }).toArray(CompletableFuture[]::new));
      }
   }

   private static alk a(alj<fao> $$0) {
      return $$0.a();
   }

   @Override
   public final String a() {
      return "Loot Tables";
   }

   public static record a(Function<ji.a, nm> a, bbc b) {
   }
}

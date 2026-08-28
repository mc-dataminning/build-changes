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

public class ms implements lx {
   private static final Logger d = LogUtils.getLogger();
   private final lz.a e;
   private final Set<akj<erb>> f;
   private final List<ms.a> g;
   private final CompletableFuture<jl.a> h;

   public ms(lz $$0, Set<akj<erb>> $$1, List<ms.a> $$2, CompletableFuture<jl.a> $$3) {
      this.e = $$0.a(lz.b.a, "loot_tables");
      this.g = $$2;
      this.f = $$1;
      this.h = $$3;
   }

   @Override
   public CompletableFuture<?> a(lv $$0) {
      return this.h.thenCompose($$1 -> this.a($$0, $$1));
   }

   private CompletableFuture<?> a(lv $$0, jl.a $$1) {
      kf<erb> $$2 = new jr<>(lr.bb, Lifecycle.experimental());
      Map<dyv.a, akk> $$3 = new Object2ObjectOpenHashMap();
      this.g.forEach($$3x -> $$3x.a().apply($$1).generate(($$3xx, $$4x) -> {
            akk $$5x = a($$3xx);
            akk $$6x = $$3.put(bqn.a($$5x), $$5x);
            if ($$6x != null) {
               ac.a("Loot table random sequence seed collision on " + $$6x + " and " + $$3xx.a());
            }

            $$4x.a($$5x);
            erb $$7 = $$4x.a($$3x.b).b();
            $$2.a($$3xx, $$7, jv.a);
         }));
      $$2.m();
      aym.a $$4 = new aym.a();
      jk.a $$5 = new jx.c(List.of($$2)).d().b();
      erc $$6 = new erc($$4, etr.q, $$5);

      for (akj<erb> $$8 : Sets.difference(this.f, $$2.g())) {
         $$4.b("Missing built-in table: " + $$8.a());
      }

      $$2.i().forEach($$1x -> ((erb)$$1x.a()).a($$6.a(((erb)$$1x.a()).a()).a("{" + $$1x.h().a() + "}", $$1x.h())));
      Multimap<String, String> $$9 = $$4.a();
      if (!$$9.isEmpty()) {
         $$9.forEach(($$0x, $$1x) -> d.warn("Found validation problem in {}: {}", $$0x, $$1x));
         throw new IllegalStateException("Failed to validate loot tables, see logs");
      } else {
         return CompletableFuture.allOf($$2.h().stream().map($$2x -> {
            akj<erb> $$3x = (akj<erb>)$$2x.getKey();
            erb $$4x = (erb)$$2x.getValue();
            Path $$5x = this.e.a($$3x.a());
            return lx.a($$0, $$1, erb.d, $$4x, $$5x);
         }).toArray(CompletableFuture[]::new));
      }
   }

   private static akk a(akj<erb> $$0) {
      return $$0.a();
   }

   @Override
   public final String a() {
      return "Loot Tables";
   }

   public static record a(Function<jl.a, mt> a, etq b) {
   }
}

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

public class mt implements lw {
   private static final Logger d = LogUtils.getLogger();
   private final ly.a e;
   private final Set<ala<eqi>> f;
   private final List<mt.a> g;
   private final CompletableFuture<jk.a> h;

   public mt(ly $$0, Set<ala<eqi>> $$1, List<mt.a> $$2, CompletableFuture<jk.a> $$3) {
      this.e = $$0.a(ly.b.a, "loot_tables");
      this.g = $$2;
      this.f = $$1;
      this.h = $$3;
   }

   @Override
   public CompletableFuture<?> a(lu $$0) {
      return this.h.thenCompose($$1 -> this.a($$0, $$1));
   }

   private CompletableFuture<?> a(lu $$0, jk.a $$1) {
      ke<eqi> $$2 = new jq<>(lq.aU, Lifecycle.experimental());
      Map<dye.a, alb> $$3 = new Object2ObjectOpenHashMap();
      this.g.forEach($$3x -> $$3x.a().get().generate($$1, ($$3xx, $$4x) -> {
            alb $$5x = a($$3xx);
            alb $$6x = $$3.put(bqv.a($$5x), $$5x);
            if ($$6x != null) {
               ac.a("Loot table random sequence seed collision on " + $$6x + " and " + $$3xx.a());
            }

            $$4x.a($$5x);
            eqi $$7 = $$4x.a($$3x.b).b();
            $$2.a($$3xx, $$7, ju.a);
         }));
      $$2.l();
      aza.a $$4 = new aza.a();
      jj.a $$5 = new jw.c(List.of($$2)).d().b();
      eqj $$6 = new eqj($$4, esy.q, $$5);

      for (ala<eqi> $$8 : Sets.difference(this.f, $$2.f())) {
         $$4.b("Missing built-in table: " + $$8.a());
      }

      $$2.h().forEach($$1x -> ((eqi)$$1x.a()).a($$6.a(((eqi)$$1x.a()).a()).a("{" + $$1x.h().a() + "}", $$1x.h())));
      Multimap<String, String> $$9 = $$4.a();
      if (!$$9.isEmpty()) {
         $$9.forEach(($$0x, $$1x) -> d.warn("Found validation problem in {}: {}", $$0x, $$1x));
         throw new IllegalStateException("Failed to validate loot tables, see logs");
      } else {
         return CompletableFuture.allOf($$2.g().stream().map($$2x -> {
            ala<eqi> $$3x = (ala<eqi>)$$2x.getKey();
            eqi $$4x = (eqi)$$2x.getValue();
            Path $$5x = this.e.a($$3x.a());
            return lw.a($$0, $$1, eqi.d, $$4x, $$5x);
         }).toArray(CompletableFuture[]::new));
      }
   }

   private static alb a(ala<eqi> $$0) {
      return $$0.a();
   }

   @Override
   public final String a() {
      return "Loot Tables";
   }

   public static record a(Supplier<mu> a, esx b) {
   }
}

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

public class mi implements ll {
   private static final Logger d = LogUtils.getLogger();
   private final ln.a e;
   private final Set<akm<epm>> f;
   private final List<mi.a> g;
   private final CompletableFuture<iz.a> h;

   public mi(ln $$0, Set<akm<epm>> $$1, List<mi.a> $$2, CompletableFuture<iz.a> $$3) {
      this.e = $$0.a(ln.b.a, "loot_tables");
      this.g = $$2;
      this.f = $$1;
      this.h = $$3;
   }

   @Override
   public CompletableFuture<?> a(lj $$0) {
      return this.h.thenCompose($$1 -> this.a($$0, $$1));
   }

   private CompletableFuture<?> a(lj $$0, iz.a $$1) {
      jt<epm> $$2 = new jf<>(lf.aU, Lifecycle.experimental());
      Map<dxk.a, akn> $$3 = new Object2ObjectOpenHashMap();
      this.g.forEach($$3x -> $$3x.a().get().generate($$1, ($$3xx, $$4x) -> {
            akn $$5x = a($$3xx);
            akn $$6x = $$3.put(bqc.a($$5x), $$5x);
            if ($$6x != null) {
               ac.a("Loot table random sequence seed collision on " + $$6x + " and " + $$3xx.a());
            }

            $$4x.a($$5x);
            epm $$7 = $$4x.a($$3x.b).b();
            $$2.a($$3xx, $$7, jj.a);
         }));
      $$2.l();
      ayk.a $$4 = new ayk.a();
      iy.a $$5 = new jl.c(List.of($$2)).d().b();
      epn $$6 = new epn($$4, ery.q, $$5);

      for (akm<epm> $$8 : Sets.difference(this.f, $$2.f())) {
         $$4.b("Missing built-in table: " + $$8.a());
      }

      $$2.h().forEach($$1x -> ((epm)$$1x.a()).a($$6.a(((epm)$$1x.a()).a()).a("{" + $$1x.h().a() + "}", $$1x.h())));
      Multimap<String, String> $$9 = $$4.a();
      if (!$$9.isEmpty()) {
         $$9.forEach(($$0x, $$1x) -> d.warn("Found validation problem in {}: {}", $$0x, $$1x));
         throw new IllegalStateException("Failed to validate loot tables, see logs");
      } else {
         return CompletableFuture.allOf($$2.g().stream().map($$2x -> {
            akm<epm> $$3x = (akm<epm>)$$2x.getKey();
            epm $$4x = (epm)$$2x.getValue();
            Path $$5x = this.e.a($$3x.a());
            return ll.a($$0, $$1, epm.d, $$4x, $$5x);
         }).toArray(CompletableFuture[]::new));
      }
   }

   private static akn a(akm<epm> $$0) {
      return $$0.a();
   }

   @Override
   public final String a() {
      return "Loot Tables";
   }

   public static record a(Supplier<mj> a, erx b) {
   }
}

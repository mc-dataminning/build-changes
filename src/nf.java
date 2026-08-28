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

public class nf implements mi {
   private static final Logger d = LogUtils.getLogger();
   private final mk.a e;
   private final Set<akt<evu>> f;
   private final List<nf.a> g;
   private final CompletableFuture<jt.a> h;

   public nf(mk $$0, Set<akt<evu>> $$1, List<nf.a> $$2, CompletableFuture<jt.a> $$3) {
      this.e = $$0.a(mc.bg);
      this.g = $$2;
      this.f = $$1;
      this.h = $$3;
   }

   @Override
   public CompletableFuture<?> a(mg $$0) {
      return this.h.thenCompose($$1 -> this.a($$0, $$1));
   }

   private CompletableFuture<?> a(mg $$0, jt.a $$1) {
      kn<evu> $$2 = new jz<>(mc.bg, Lifecycle.experimental());
      Map<edf.a, aku> $$3 = new Object2ObjectOpenHashMap();
      this.g.forEach($$3x -> $$3x.a().apply($$1).generate(($$3xx, $$4x) -> {
            aku $$5x = a($$3xx);
            aku $$6x = $$3.put(bsm.a($$5x), $$5x);
            if ($$6x != null) {
               af.b("Loot table random sequence seed collision on " + $$6x + " and " + $$3xx.a());
            }

            $$4x.a($$5x);
            evu $$7 = $$4x.a($$3x.b).b();
            $$2.a($$3xx, $$7, kd.a);
         }));
      $$2.n();
      aze.a $$4 = new aze.a();
      js.a $$5 = new kf.c(List.of($$2)).e();
      evv $$6 = new evv($$4, eyi.q, $$5);

      for (akt<evu> $$8 : Sets.difference(this.f, $$2.j())) {
         $$4.b("Missing built-in table: " + $$8.a());
      }

      $$2.c().forEach($$1x -> ((evu)$$1x.a()).a($$6.a(((evu)$$1x.a()).a()).a("{" + $$1x.h().a() + "}", $$1x.h())));
      Multimap<String, String> $$9 = $$4.a();
      if (!$$9.isEmpty()) {
         $$9.forEach(($$0x, $$1x) -> d.warn("Found validation problem in {}: {}", $$0x, $$1x));
         throw new IllegalStateException("Failed to validate loot tables, see logs");
      } else {
         return CompletableFuture.allOf($$2.k().stream().map($$2x -> {
            akt<evu> $$3x = (akt<evu>)$$2x.getKey();
            evu $$4x = (evu)$$2x.getValue();
            Path $$5x = this.e.a($$3x.a());
            return mi.a($$0, $$1, evu.d, $$4x, $$5x);
         }).toArray(CompletableFuture[]::new));
      }
   }

   private static aku a(akt<evu> $$0) {
      return $$0.a();
   }

   @Override
   public final String a() {
      return "Loot Tables";
   }

   public static record a(Function<jt.a, ng> a, bai b) {
   }
}

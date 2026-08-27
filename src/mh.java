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

public class mh implements lk {
   private static final Logger d = LogUtils.getLogger();
   private final lm.a e;
   private final Set<akg<eoq>> f;
   private final List<mh.a> g;
   private final CompletableFuture<iy.a> h;

   public mh(lm $$0, Set<akg<eoq>> $$1, List<mh.a> $$2, CompletableFuture<iy.a> $$3) {
      this.e = $$0.a(lm.b.a, "loot_tables");
      this.g = $$2;
      this.f = $$1;
      this.h = $$3;
   }

   @Override
   public CompletableFuture<?> a(li $$0) {
      return this.h.thenCompose($$1 -> this.a($$0, $$1));
   }

   private CompletableFuture<?> a(li $$0, iy.a $$1) {
      js<eoq> $$2 = new je<>(le.aU, Lifecycle.experimental());
      Map<dwo.a, akh> $$3 = new Object2ObjectOpenHashMap();
      this.g.forEach($$3x -> $$3x.a().get().generate($$1, ($$3xx, $$4x) -> {
            akh $$5x = a($$3xx);
            akh $$6x = $$3.put(bps.a($$5x), $$5x);
            if ($$6x != null) {
               ac.a("Loot table random sequence seed collision on " + $$6x + " and " + $$3xx.a());
            }

            $$4x.a($$5x);
            eoq $$7 = $$4x.a($$3x.b).b();
            $$2.a($$3xx, $$7, ji.a);
         }));
      $$2.l();
      aye.a $$4 = new aye.a();
      ix.a $$5 = new jk.c(List.of($$2)).d().b();
      eor $$6 = new eor($$4, erb.p, $$5);

      for (akg<eoq> $$8 : Sets.difference(this.f, $$2.f())) {
         $$4.b("Missing built-in table: " + $$8.a());
      }

      $$2.h().forEach($$1x -> ((eoq)$$1x.a()).a($$6.a(((eoq)$$1x.a()).a()).a("{" + $$1x.h().a() + "}", $$1x.h())));
      Multimap<String, String> $$9 = $$4.a();
      if (!$$9.isEmpty()) {
         $$9.forEach(($$0x, $$1x) -> d.warn("Found validation problem in {}: {}", $$0x, $$1x));
         throw new IllegalStateException("Failed to validate loot tables, see logs");
      } else {
         return CompletableFuture.allOf($$2.g().stream().map($$2x -> {
            akg<eoq> $$3x = (akg<eoq>)$$2x.getKey();
            eoq $$4x = (eoq)$$2x.getValue();
            Path $$5x = this.e.a($$3x.a());
            return lk.a($$0, $$1, eoq.d, $$4x, $$5x);
         }).toArray(CompletableFuture[]::new));
      }
   }

   private static akh a(akg<eoq> $$0) {
      return $$0.a();
   }

   @Override
   public final String a() {
      return "Loot Tables";
   }

   public static record a(Supplier<mi> a, era b) {
   }
}

import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class mg implements lj {
   private static final Logger d = LogUtils.getLogger();
   private final ll.a e;
   private final Set<akf> f;
   private final List<mg.a> g;
   private final CompletableFuture<ix.a> h;

   public mg(ll $$0, Set<akf> $$1, List<mg.a> $$2, CompletableFuture<ix.a> $$3) {
      this.e = $$0.a(ll.b.a, "loot_tables");
      this.g = $$2;
      this.f = $$1;
      this.h = $$3;
   }

   @Override
   public CompletableFuture<?> a(lh $$0) {
      return this.h.thenCompose($$1 -> this.a($$0, $$1));
   }

   private CompletableFuture<?> a(lh $$0, ix.a $$1) {
      final Map<akf, eoi> $$2 = Maps.newHashMap();
      Map<dwf.a, akf> $$3 = new Object2ObjectOpenHashMap();
      this.g.forEach($$3x -> $$3x.a().get().generate($$1, ($$3xx, $$4x) -> {
            akf $$5x = $$3.put(bow.a($$3xx), $$3xx);
            if ($$5x != null) {
               ac.a("Loot table random sequence seed collision on " + $$5x + " and " + $$3xx);
            }

            $$4x.a($$3xx);
            if ($$2.put($$3xx, $$4x.a($$3x.b).b()) != null) {
               throw new IllegalStateException("Duplicate loot table " + $$3xx);
            }
         }));
      ayb.a $$4 = new ayb.a();
      eoj $$5 = new eoj($$4, eqs.p, new eoe() {
         @Nullable
         @Override
         public <T> T getElement(eoc<T> $$0) {
            return (T)($$0.a() == eof.c ? $$2.get($$0.b()) : null);
         }
      });

      for (akf $$7 : Sets.difference(this.f, $$2.keySet())) {
         $$4.b("Missing built-in table: " + $$7);
      }

      $$2.forEach(($$1x, $$2x) -> $$2x.a($$5.a($$2x.a()).a("{" + $$1x + "}", new eoc<>(eof.c, $$1x))));
      Multimap<String, String> $$8 = $$4.a();
      if (!$$8.isEmpty()) {
         $$8.forEach(($$0x, $$1x) -> d.warn("Found validation problem in {}: {}", $$0x, $$1x));
         throw new IllegalStateException("Failed to validate loot tables, see logs");
      } else {
         return CompletableFuture.allOf($$2.entrySet().stream().map($$2x -> {
            akf $$3x = (akf)$$2x.getKey();
            eoi $$4x = (eoi)$$2x.getValue();
            Path $$5x = this.e.a($$3x);
            return lj.a($$0, $$1, eoi.d, $$4x, $$5x);
         }).toArray(CompletableFuture[]::new));
      }
   }

   @Override
   public final String a() {
      return "Loot Tables";
   }

   public static record a(Supplier<mh> a, eqr b) {
   }
}

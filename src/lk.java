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

public class lk implements ko {
   private static final Logger d = LogUtils.getLogger();
   private final kq.a e;
   private final Set<ajc> f;
   private final List<lk.a> g;
   private final CompletableFuture<in.a> h;

   public lk(kq $$0, Set<ajc> $$1, List<lk.a> $$2, CompletableFuture<in.a> $$3) {
      this.e = $$0.a(kq.b.a, "loot_tables");
      this.g = $$2;
      this.f = $$1;
      this.h = $$3;
   }

   @Override
   public CompletableFuture<?> a(km $$0) {
      return this.h.thenCompose($$1 -> this.a($$0, $$1));
   }

   private CompletableFuture<?> a(km $$0, in.a $$1) {
      final Map<ajc, ekg> $$2 = Maps.newHashMap();
      Map<dsf.a, ajc> $$3 = new Object2ObjectOpenHashMap();
      this.g.forEach($$2x -> $$2x.a().get().generate(($$3x, $$4x) -> {
            ajc $$5x = $$3.put(bmr.a($$3x), $$3x);
            if ($$5x != null) {
               ac.a("Loot table random sequence seed collision on " + $$5x + " and " + $$3x);
            }

            $$4x.a($$3x);
            if ($$2.put($$3x, $$4x.a($$2x.b).b()) != null) {
               throw new IllegalStateException("Duplicate loot table " + $$3x);
            }
         }));
      awr.a $$4 = new awr.a();
      ekh $$5 = new ekh($$4, emi.p, new ekc() {
         @Nullable
         @Override
         public <T> T getElement(eka<T> $$0) {
            return (T)($$0.a() == ekd.c ? $$2.get($$0.b()) : null);
         }
      });

      for (ajc $$7 : Sets.difference(this.f, $$2.keySet())) {
         $$4.b("Missing built-in table: " + $$7);
      }

      $$2.forEach(($$1x, $$2x) -> $$2x.a($$5.a($$2x.a()).a("{" + $$1x + "}", new eka<>(ekd.c, $$1x))));
      Multimap<String, String> $$8 = $$4.a();
      if (!$$8.isEmpty()) {
         $$8.forEach(($$0x, $$1x) -> d.warn("Found validation problem in {}: {}", $$0x, $$1x));
         throw new IllegalStateException("Failed to validate loot tables, see logs");
      } else {
         return CompletableFuture.allOf($$2.entrySet().stream().map($$2x -> {
            ajc $$3x = (ajc)$$2x.getKey();
            ekg $$4x = (ekg)$$2x.getValue();
            Path $$5x = this.e.a($$3x);
            return ko.a($$0, $$1, ekg.c, $$4x, $$5x);
         }).toArray(CompletableFuture[]::new));
      }
   }

   @Override
   public final String a() {
      return "Loot Tables";
   }

   public static record a(Supplier<ll> a, emh b) {
   }
}

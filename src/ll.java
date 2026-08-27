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

public class ll implements kp {
   private static final Logger d = LogUtils.getLogger();
   private final kr.a e;
   private final Set<ajh> f;
   private final List<ll.a> g;
   private final CompletableFuture<in.a> h;

   public ll(kr $$0, Set<ajh> $$1, List<ll.a> $$2, CompletableFuture<in.a> $$3) {
      this.e = $$0.a(kr.b.a, "loot_tables");
      this.g = $$2;
      this.f = $$1;
      this.h = $$3;
   }

   @Override
   public CompletableFuture<?> a(kn $$0) {
      return this.h.thenCompose($$1 -> this.a($$0, $$1));
   }

   private CompletableFuture<?> a(kn $$0, in.a $$1) {
      final Map<ajh, elc> $$2 = Maps.newHashMap();
      Map<dtb.a, ajh> $$3 = new Object2ObjectOpenHashMap();
      this.g.forEach($$2x -> $$2x.a().get().generate(($$3x, $$4x) -> {
            ajh $$5x = $$3.put(bni.a($$3x), $$3x);
            if ($$5x != null) {
               ac.a("Loot table random sequence seed collision on " + $$5x + " and " + $$3x);
            }

            $$4x.a($$3x);
            if ($$2.put($$3x, $$4x.a($$2x.b).b()) != null) {
               throw new IllegalStateException("Duplicate loot table " + $$3x);
            }
         }));
      axb.a $$4 = new axb.a();
      eld $$5 = new eld($$4, ene.p, new eky() {
         @Nullable
         @Override
         public <T> T getElement(ekw<T> $$0) {
            return (T)($$0.a() == ekz.c ? $$2.get($$0.b()) : null);
         }
      });

      for (ajh $$7 : Sets.difference(this.f, $$2.keySet())) {
         $$4.b("Missing built-in table: " + $$7);
      }

      $$2.forEach(($$1x, $$2x) -> $$2x.a($$5.a($$2x.a()).a("{" + $$1x + "}", new ekw<>(ekz.c, $$1x))));
      Multimap<String, String> $$8 = $$4.a();
      if (!$$8.isEmpty()) {
         $$8.forEach(($$0x, $$1x) -> d.warn("Found validation problem in {}: {}", $$0x, $$1x));
         throw new IllegalStateException("Failed to validate loot tables, see logs");
      } else {
         return CompletableFuture.allOf($$2.entrySet().stream().map($$2x -> {
            ajh $$3x = (ajh)$$2x.getKey();
            elc $$4x = (elc)$$2x.getValue();
            Path $$5x = this.e.a($$3x);
            return kp.a($$0, $$1, elc.c, $$4x, $$5x);
         }).toArray(CompletableFuture[]::new));
      }
   }

   @Override
   public final String a() {
      return "Loot Tables";
   }

   public static record a(Supplier<lm> a, end b) {
   }
}

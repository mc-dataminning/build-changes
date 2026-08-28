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

public class nh implements mk {
   private static final Logger d = LogUtils.getLogger();
   private final mm.a e;
   private final Set<alc<exq>> f;
   private final List<nh.a> g;
   private final CompletableFuture<ju.a> h;

   public nh(mm $$0, Set<alc<exq>> $$1, List<nh.a> $$2, CompletableFuture<ju.a> $$3) {
      this.e = $$0.a(me.bn);
      this.g = $$2;
      this.f = $$1;
      this.h = $$3;
   }

   @Override
   public CompletableFuture<?> a(mi $$0) {
      return this.h.thenCompose($$1 -> this.a($$0, $$1));
   }

   private CompletableFuture<?> a(mi $$0, ju.a $$1) {
      ko<exq> $$2 = new ka<>(me.bn, Lifecycle.experimental());
      Map<efa.a, ald> $$3 = new Object2ObjectOpenHashMap();
      this.g.forEach($$3x -> $$3x.a().apply($$1).generate(($$3xx, $$4x) -> {
            ald $$5x = a($$3xx);
            ald $$6x = $$3.put(btu.a($$5x), $$5x);
            if ($$6x != null) {
               af.b("Loot table random sequence seed collision on " + $$6x + " and " + $$3xx.a());
            }

            $$4x.a($$5x);
            exq $$7 = $$4x.a($$3x.b).b();
            $$2.a($$3xx, $$7, ke.a);
         }));
      $$2.n();
      azq.a $$4 = new azq.a();
      jt.a $$5 = new kg.c(List.of($$2)).e();
      exr $$6 = new exr($$4, fae.q, $$5);

      for (alc<exq> $$8 : Sets.difference(this.f, $$2.j())) {
         $$4.b("Missing built-in table: " + $$8.a());
      }

      $$2.c().forEach($$1x -> ((exq)$$1x.a()).a($$6.a(((exq)$$1x.a()).a()).a("{" + $$1x.h().a() + "}", $$1x.h())));
      Multimap<String, String> $$9 = $$4.a();
      if (!$$9.isEmpty()) {
         $$9.forEach(($$0x, $$1x) -> d.warn("Found validation problem in {}: {}", $$0x, $$1x));
         throw new IllegalStateException("Failed to validate loot tables, see logs");
      } else {
         return CompletableFuture.allOf($$2.k().stream().map($$2x -> {
            alc<exq> $$3x = (alc<exq>)$$2x.getKey();
            exq $$4x = (exq)$$2x.getValue();
            Path $$5x = this.e.a($$3x.a());
            return mk.a($$0, $$1, exq.d, $$4x, $$5x);
         }).toArray(CompletableFuture[]::new));
      }
   }

   private static ald a(alc<exq> $$0) {
      return $$0.a();
   }

   @Override
   public final String a() {
      return "Loot Tables";
   }

   public static record a(Function<ju.a, ni> a, bau b) {
   }
}

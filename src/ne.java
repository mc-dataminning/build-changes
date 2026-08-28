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

public class ne implements mh {
   private static final Logger d = LogUtils.getLogger();
   private final mj.a e;
   private final Set<alo<ewn>> f;
   private final List<ne.a> g;
   private final CompletableFuture<js.a> h;

   public ne(mj $$0, Set<alo<ewn>> $$1, List<ne.a> $$2, CompletableFuture<js.a> $$3) {
      this.e = $$0.a(mb.bg);
      this.g = $$2;
      this.f = $$1;
      this.h = $$3;
   }

   @Override
   public CompletableFuture<?> a(mf $$0) {
      return this.h.thenCompose($$1 -> this.a($$0, $$1));
   }

   private CompletableFuture<?> a(mf $$0, js.a $$1) {
      km<ewn> $$2 = new jy<>(mb.bg, Lifecycle.experimental());
      Map<edy.a, alp> $$3 = new Object2ObjectOpenHashMap();
      this.g.forEach($$3x -> $$3x.a().apply($$1).generate(($$3xx, $$4x) -> {
            alp $$5x = a($$3xx);
            alp $$6x = $$3.put(bte.a($$5x), $$5x);
            if ($$6x != null) {
               ae.b("Loot table random sequence seed collision on " + $$6x + " and " + $$3xx.a());
            }

            $$4x.a($$5x);
            ewn $$7 = $$4x.a($$3x.b).b();
            $$2.a($$3xx, $$7, kc.a);
         }));
      $$2.n();
      baa.a $$4 = new baa.a();
      jr.a $$5 = new ke.c(List.of($$2)).e();
      ewo $$6 = new ewo($$4, ezb.q, $$5);

      for (alo<ewn> $$8 : Sets.difference(this.f, $$2.j())) {
         $$4.b("Missing built-in table: " + $$8.a());
      }

      $$2.c().forEach($$1x -> ((ewn)$$1x.a()).a($$6.a(((ewn)$$1x.a()).a()).a("{" + $$1x.h().a() + "}", $$1x.h())));
      Multimap<String, String> $$9 = $$4.a();
      if (!$$9.isEmpty()) {
         $$9.forEach(($$0x, $$1x) -> d.warn("Found validation problem in {}: {}", $$0x, $$1x));
         throw new IllegalStateException("Failed to validate loot tables, see logs");
      } else {
         return CompletableFuture.allOf($$2.k().stream().map($$2x -> {
            alo<ewn> $$3x = (alo<ewn>)$$2x.getKey();
            ewn $$4x = (ewn)$$2x.getValue();
            Path $$5x = this.e.a($$3x.a());
            return mh.a($$0, $$1, ewn.d, $$4x, $$5x);
         }).toArray(CompletableFuture[]::new));
      }
   }

   private static alp a(alo<ewn> $$0) {
      return $$0.a();
   }

   @Override
   public final String a() {
      return "Loot Tables";
   }

   public static record a(Function<js.a, nf> a, bbe b) {
   }
}

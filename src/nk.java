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

public class nk implements mn {
   private static final Logger d = LogUtils.getLogger();
   private final mp.a e;
   private final Set<alf<ezy>> f;
   private final List<nk.a> g;
   private final CompletableFuture<jh.a> h;

   public nk(mp $$0, Set<alf<ezy>> $$1, List<nk.a> $$2, CompletableFuture<jh.a> $$3) {
      this.e = $$0.a(mh.br);
      this.g = $$2;
      this.f = $$1;
      this.h = $$3;
   }

   @Override
   public CompletableFuture<?> a(ml $$0) {
      return this.h.thenCompose($$1 -> this.a($$0, $$1));
   }

   private CompletableFuture<?> a(ml $$0, jh.a $$1) {
      kb<ezy> $$2 = new jn<>(mh.br, Lifecycle.experimental());
      Map<ehh.a, alg> $$3 = new Object2ObjectOpenHashMap();
      this.g.forEach($$3x -> $$3x.a().apply($$1).generate(($$3xx, $$4x) -> {
            alg $$5x = a($$3xx);
            alg $$6x = $$3.put(buk.a($$5x), $$5x);
            if ($$6x != null) {
               ag.b("Loot table random sequence seed collision on " + $$6x + " and " + $$3xx.a());
            }

            $$4x.a($$5x);
            ezy $$7 = $$4x.a($$3x.b).b();
            $$2.a($$3xx, $$7, jr.a);
         }));
      $$2.n();
      azt.a $$4 = new azt.a();
      jg.a $$5 = new jt.c(List.of($$2)).e();
      ezz $$6 = new ezz($$4, fcm.q, $$5);

      for (alf<ezy> $$8 : Sets.difference(this.f, $$2.j())) {
         $$4.b("Missing built-in table: " + $$8.a());
      }

      $$2.c().forEach($$1x -> ((ezy)$$1x.a()).a($$6.a(((ezy)$$1x.a()).a()).a("{" + $$1x.h().a() + "}", $$1x.h())));
      Multimap<String, String> $$9 = $$4.a();
      if (!$$9.isEmpty()) {
         $$9.forEach(($$0x, $$1x) -> d.warn("Found validation problem in {}: {}", $$0x, $$1x));
         throw new IllegalStateException("Failed to validate loot tables, see logs");
      } else {
         return CompletableFuture.allOf($$2.k().stream().map($$2x -> {
            alf<ezy> $$3x = (alf<ezy>)$$2x.getKey();
            ezy $$4x = (ezy)$$2x.getValue();
            Path $$5x = this.e.a($$3x.a());
            return mn.a($$0, $$1, ezy.d, $$4x, $$5x);
         }).toArray(CompletableFuture[]::new));
      }
   }

   private static alg a(alf<ezy> $$0) {
      return $$0.a();
   }

   @Override
   public final String a() {
      return "Loot Tables";
   }

   public static record a(Function<jh.a, nl> a, bay b) {
   }
}

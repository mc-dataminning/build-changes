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

public class nc implements mf {
   private static final Logger d = LogUtils.getLogger();
   private final mh.a e;
   private final Set<alh<euh>> f;
   private final List<nc.a> g;
   private final CompletableFuture<js.a> h;

   public nc(mh $$0, Set<alh<euh>> $$1, List<nc.a> $$2, CompletableFuture<js.a> $$3) {
      this.e = $$0.a(lz.bd);
      this.g = $$2;
      this.f = $$1;
      this.h = $$3;
   }

   @Override
   public CompletableFuture<?> a(md $$0) {
      return this.h.thenCompose($$1 -> this.a($$0, $$1));
   }

   private CompletableFuture<?> a(md $$0, js.a $$1) {
      km<euh> $$2 = new jy<>(lz.bd, Lifecycle.experimental());
      Map<ebu.a, ali> $$3 = new Object2ObjectOpenHashMap();
      this.g.forEach($$3x -> $$3x.a().apply($$1).generate(($$3xx, $$4x) -> {
            ali $$5x = a($$3xx);
            ali $$6x = $$3.put(bsh.a($$5x), $$5x);
            if ($$6x != null) {
               ae.b("Loot table random sequence seed collision on " + $$6x + " and " + $$3xx.a());
            }

            $$4x.a($$5x);
            euh $$7 = $$4x.a($$3x.b).b();
            $$2.a($$3xx, $$7, kc.a);
         }));
      $$2.n();
      azq.a $$4 = new azq.a();
      jr.a $$5 = new ke.c(List.of($$2)).e();
      eui $$6 = new eui($$4, ewx.q, $$5);

      for (alh<euh> $$8 : Sets.difference(this.f, $$2.j())) {
         $$4.b("Missing built-in table: " + $$8.a());
      }

      $$2.c().forEach($$1x -> ((euh)$$1x.a()).a($$6.a(((euh)$$1x.a()).a()).a("{" + $$1x.h().a() + "}", $$1x.h())));
      Multimap<String, String> $$9 = $$4.a();
      if (!$$9.isEmpty()) {
         $$9.forEach(($$0x, $$1x) -> d.warn("Found validation problem in {}: {}", $$0x, $$1x));
         throw new IllegalStateException("Failed to validate loot tables, see logs");
      } else {
         return CompletableFuture.allOf($$2.k().stream().map($$2x -> {
            alh<euh> $$3x = (alh<euh>)$$2x.getKey();
            euh $$4x = (euh)$$2x.getValue();
            Path $$5x = this.e.a($$3x.a());
            return mf.a($$0, $$1, euh.d, $$4x, $$5x);
         }).toArray(CompletableFuture[]::new));
      }
   }

   private static ali a(alh<euh> $$0) {
      return $$0.a();
   }

   @Override
   public final String a() {
      return "Loot Tables";
   }

   public static record a(Function<js.a, nd> a, eww b) {
   }
}

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

public class mv implements ma {
   private static final Logger d = LogUtils.getLogger();
   private final mc.a e;
   private final Set<akp<erq>> f;
   private final List<mv.a> g;
   private final CompletableFuture<jo.a> h;

   public mv(mc $$0, Set<akp<erq>> $$1, List<mv.a> $$2, CompletableFuture<jo.a> $$3) {
      this.e = $$0.a(lu.bc);
      this.g = $$2;
      this.f = $$1;
      this.h = $$3;
   }

   @Override
   public CompletableFuture<?> a(ly $$0) {
      return this.h.thenCompose($$1 -> this.a($$0, $$1));
   }

   private CompletableFuture<?> a(ly $$0, jo.a $$1) {
      ki<erq> $$2 = new ju<>(lu.bc, Lifecycle.experimental());
      Map<dzk.a, akq> $$3 = new Object2ObjectOpenHashMap();
      this.g.forEach($$3x -> $$3x.a().apply($$1).generate(($$3xx, $$4x) -> {
            akq $$5x = a($$3xx);
            akq $$6x = $$3.put(bqw.a($$5x), $$5x);
            if ($$6x != null) {
               ad.a("Loot table random sequence seed collision on " + $$6x + " and " + $$3xx.a());
            }

            $$4x.a($$5x);
            erq $$7 = $$4x.a($$3x.b).b();
            $$2.a($$3xx, $$7, jy.a);
         }));
      $$2.m();
      ayt.a $$4 = new ayt.a();
      jn.a $$5 = new ka.c(List.of($$2)).d().b();
      err $$6 = new err($$4, eug.q, $$5);

      for (akp<erq> $$8 : Sets.difference(this.f, $$2.g())) {
         $$4.b("Missing built-in table: " + $$8.a());
      }

      $$2.i().forEach($$1x -> ((erq)$$1x.a()).a($$6.a(((erq)$$1x.a()).a()).a("{" + $$1x.h().a() + "}", $$1x.h())));
      Multimap<String, String> $$9 = $$4.a();
      if (!$$9.isEmpty()) {
         $$9.forEach(($$0x, $$1x) -> d.warn("Found validation problem in {}: {}", $$0x, $$1x));
         throw new IllegalStateException("Failed to validate loot tables, see logs");
      } else {
         return CompletableFuture.allOf($$2.h().stream().map($$2x -> {
            akp<erq> $$3x = (akp<erq>)$$2x.getKey();
            erq $$4x = (erq)$$2x.getValue();
            Path $$5x = this.e.a($$3x.a());
            return ma.a($$0, $$1, erq.d, $$4x, $$5x);
         }).toArray(CompletableFuture[]::new));
      }
   }

   private static akq a(akp<erq> $$0) {
      return $$0.a();
   }

   @Override
   public final String a() {
      return "Loot Tables";
   }

   public static record a(Function<jo.a, mw> a, euf b) {
   }
}

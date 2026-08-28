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

public class mw implements ma {
   private static final Logger d = LogUtils.getLogger();
   private final mc.a e;
   private final Set<akq<erw>> f;
   private final List<mw.a> g;
   private final CompletableFuture<jo.a> h;

   public mw(mc $$0, Set<akq<erw>> $$1, List<mw.a> $$2, CompletableFuture<jo.a> $$3) {
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
      ki<erw> $$2 = new ju<>(lu.bc, Lifecycle.experimental());
      Map<dzn.a, akr> $$3 = new Object2ObjectOpenHashMap();
      this.g.forEach($$3x -> $$3x.a().apply($$1).generate(($$3xx, $$4x) -> {
            akr $$5x = a($$3xx);
            akr $$6x = $$3.put(bqx.a($$5x), $$5x);
            if ($$6x != null) {
               ad.b("Loot table random sequence seed collision on " + $$6x + " and " + $$3xx.a());
            }

            $$4x.a($$5x);
            erw $$7 = $$4x.a($$3x.b).b();
            $$2.a($$3xx, $$7, jy.a);
         }));
      $$2.m();
      ayu.a $$4 = new ayu.a();
      jn.a $$5 = new ka.c(List.of($$2)).d().b();
      erx $$6 = new erx($$4, eum.q, $$5);

      for (akq<erw> $$8 : Sets.difference(this.f, $$2.g())) {
         $$4.b("Missing built-in table: " + $$8.a());
      }

      $$2.i().forEach($$1x -> ((erw)$$1x.a()).a($$6.a(((erw)$$1x.a()).a()).a("{" + $$1x.h().a() + "}", $$1x.h())));
      Multimap<String, String> $$9 = $$4.a();
      if (!$$9.isEmpty()) {
         $$9.forEach(($$0x, $$1x) -> d.warn("Found validation problem in {}: {}", $$0x, $$1x));
         throw new IllegalStateException("Failed to validate loot tables, see logs");
      } else {
         return CompletableFuture.allOf($$2.h().stream().map($$2x -> {
            akq<erw> $$3x = (akq<erw>)$$2x.getKey();
            erw $$4x = (erw)$$2x.getValue();
            Path $$5x = this.e.a($$3x.a());
            return ma.a($$0, $$1, erw.d, $$4x, $$5x);
         }).toArray(CompletableFuture[]::new));
      }
   }

   private static akr a(akq<erw> $$0) {
      return $$0.a();
   }

   @Override
   public final String a() {
      return "Loot Tables";
   }

   public static record a(Function<jo.a, mx> a, eul b) {
   }
}

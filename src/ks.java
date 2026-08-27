import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonElement;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class ks implements ji {
   private final jk.a d;
   private final jk.a e;

   public ks(jk $$0) {
      this.d = $$0.a(jk.b.b, "blockstates");
      this.e = $$0.a(jk.b.b, "models");
   }

   @Override
   public CompletableFuture<?> a(jg $$0) {
      Map<csl, kt> $$1 = Maps.newHashMap();
      Consumer<kt> $$2 = $$1x -> {
         csl $$2x = $$1x.a();
         kt $$3x = $$1.put($$2x, $$1x);
         if ($$3x != null) {
            throw new IllegalStateException("Duplicate blockstate definition for " + $$2x);
         }
      };
      Map<aer, Supplier<JsonElement>> $$3 = Maps.newHashMap();
      Set<cis> $$4 = Sets.newHashSet();
      BiConsumer<aer, Supplier<JsonElement>> $$5 = ($$1x, $$2x) -> {
         Supplier<JsonElement> $$3x = $$3.put($$1x, $$2x);
         if ($$3x != null) {
            throw new IllegalStateException("Duplicate model definition for " + $$1x);
         }
      };
      Consumer<cis> $$6 = $$4::add;
      new kq($$2, $$5, $$6).a();
      new kr($$5).a();
      List<csl> $$7 = jb.f.s().filter($$1x -> !$$1.containsKey($$1x)).toList();
      if (!$$7.isEmpty()) {
         throw new IllegalStateException("Missing blockstate definitions for: " + $$7);
      } else {
         jb.f.forEach($$2x -> {
            cis $$3x = cis.l.get($$2x);
            if ($$3x != null) {
               if ($$4.contains($$3x)) {
                  return;
               }

               aer $$4x = le.a($$3x);
               if (!$$3.containsKey($$4x)) {
                  $$3.put($$4x, new ld(le.a($$2x)));
               }
            }
         });
         return CompletableFuture.allOf(this.a($$0, $$1, $$0x -> this.d.a($$0x.q().g().a())), this.a($$0, $$3, this.e::a));
      }
   }

   private <T> CompletableFuture<?> a(jg $$0, Map<T, ? extends Supplier<JsonElement>> $$1, Function<T, Path> $$2) {
      return CompletableFuture.allOf($$1.entrySet().stream().map($$2x -> {
         Path $$3 = $$2.apply((T)$$2x.getKey());
         JsonElement $$4 = (JsonElement)((Supplier)$$2x.getValue()).get();
         return ji.a($$0, $$4, $$3);
      }).toArray(CompletableFuture[]::new));
   }

   @Override
   public final String a() {
      return "Model Definitions";
   }
}

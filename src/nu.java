import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonElement;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class nu implements mc {
   private final me.a d;
   private final me.a e;

   public nu(me $$0) {
      this.d = $$0.a(me.b.b, "blockstates");
      this.e = $$0.a(me.b.b, "models");
   }

   @Override
   public CompletableFuture<?> a(ma $$0) {
      Map<dhm, nv> $$1 = Maps.newHashMap();
      Consumer<nv> $$2 = $$1x -> {
         dhm $$2x = $$1x.a();
         nv $$3x = $$1.put($$2x, $$1x);
         if ($$3x != null) {
            throw new IllegalStateException("Duplicate blockstate definition for " + $$2x);
         }
      };
      Map<ale, Supplier<JsonElement>> $$3 = Maps.newHashMap();
      Set<cvn> $$4 = Sets.newHashSet();
      BiConsumer<ale, Supplier<JsonElement>> $$5 = ($$1x, $$2x) -> {
         Supplier<JsonElement> $$3x = $$3.put($$1x, $$2x);
         if ($$3x != null) {
            throw new IllegalStateException("Duplicate model definition for " + $$1x);
         }
      };
      Consumer<cvn> $$6 = $$4::add;
      new ns($$2, $$5, $$6).a();
      new nt($$5).a();
      List<dhm> $$7 = lv.e.k().stream().filter($$0x -> true).map(Entry::getValue).filter($$1x -> !$$1.containsKey($$1x)).toList();
      if (!$$7.isEmpty()) {
         throw new IllegalStateException("Missing blockstate definitions for: " + $$7);
      } else {
         lv.e.forEach($$2x -> {
            cvn $$3x = cvn.e.get($$2x);
            if ($$3x != null) {
               if ($$4.contains($$3x)) {
                  return;
               }

               ale $$4x = og.a($$3x);
               if (!$$3.containsKey($$4x)) {
                  $$3.put($$4x, new of(og.a($$2x)));
               }
            }
         });
         return CompletableFuture.allOf(this.a($$0, $$1, $$0x -> this.d.a($$0x.r().h().a())), this.a($$0, $$3, this.e::a));
      }
   }

   private <T> CompletableFuture<?> a(ma $$0, Map<T, ? extends Supplier<JsonElement>> $$1, Function<T, Path> $$2) {
      return CompletableFuture.allOf($$1.entrySet().stream().map($$2x -> {
         Path $$3 = $$2.apply((T)$$2x.getKey());
         JsonElement $$4 = (JsonElement)((Supplier)$$2x.getValue()).get();
         return mc.a($$0, $$4, $$3);
      }).toArray(CompletableFuture[]::new));
   }

   @Override
   public final String a() {
      return "Model Definitions";
   }
}

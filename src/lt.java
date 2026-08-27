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

public class lt implements kf {
   private final kh.a d;
   private final kh.a e;

   public lt(kh $$0) {
      this.d = $$0.a(kh.b.b, "blockstates");
      this.e = $$0.a(kh.b.b, "models");
   }

   @Override
   public CompletableFuture<?> a(kd $$0) {
      Map<cva, lu> $$1 = Maps.newHashMap();
      Consumer<lu> $$2 = $$1x -> {
         cva $$2x = $$1x.a();
         lu $$3x = $$1.put($$2x, $$1x);
         if ($$3x != null) {
            throw new IllegalStateException("Duplicate blockstate definition for " + $$2x);
         }
      };
      Map<agi, Supplier<JsonElement>> $$3 = Maps.newHashMap();
      Set<cle> $$4 = Sets.newHashSet();
      BiConsumer<agi, Supplier<JsonElement>> $$5 = ($$1x, $$2x) -> {
         Supplier<JsonElement> $$3x = $$3.put($$1x, $$2x);
         if ($$3x != null) {
            throw new IllegalStateException("Duplicate model definition for " + $$1x);
         }
      };
      Consumer<cle> $$6 = $$4::add;
      new lr($$2, $$5, $$6).a();
      new ls($$5).a();
      List<cva> $$7 = jy.f.g().stream().filter($$0x -> true).map(Entry::getValue).filter($$1x -> !$$1.containsKey($$1x)).toList();
      if (!$$7.isEmpty()) {
         throw new IllegalStateException("Missing blockstate definitions for: " + $$7);
      } else {
         jy.f.forEach($$2x -> {
            cle $$3x = cle.l.get($$2x);
            if ($$3x != null) {
               if ($$4.contains($$3x)) {
                  return;
               }

               agi $$4x = mf.a($$3x);
               if (!$$3.containsKey($$4x)) {
                  $$3.put($$4x, new me(mf.a($$2x)));
               }
            }
         });
         return CompletableFuture.allOf(this.a($$0, $$1, $$0x -> this.d.a($$0x.r().g().a())), this.a($$0, $$3, this.e::a));
      }
   }

   private <T> CompletableFuture<?> a(kd $$0, Map<T, ? extends Supplier<JsonElement>> $$1, Function<T, Path> $$2) {
      return CompletableFuture.allOf($$1.entrySet().stream().map($$2x -> {
         Path $$3 = $$2.apply((T)$$2x.getKey());
         JsonElement $$4 = (JsonElement)((Supplier)$$2x.getValue()).get();
         return kf.a($$0, $$4, $$3);
      }).toArray(CompletableFuture[]::new));
   }

   @Override
   public final String a() {
      return "Model Definitions";
   }
}

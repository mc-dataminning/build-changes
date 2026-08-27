import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.gson.JsonObject;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.io.Reader;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class gli implements asi, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<ajh, ajh> b = Map.of(
      fyh.c,
      new ajh("banner_patterns"),
      fyh.b,
      new ajh("beds"),
      fyh.f,
      new ajh("chests"),
      fyh.d,
      new ajh("shield_patterns"),
      fyh.e,
      new ajh("signs"),
      fyh.a,
      new ajh("shulker_boxes"),
      fyh.g,
      new ajh("armor_trims"),
      fyh.h,
      new ajh("decorated_pot"),
      gjb.e,
      new ajh("blocks")
   );
   private Map<ajh, glc> c;
   private final glb d;
   private final fyl e;
   private final fam f;
   private int g;
   private glc h;
   private Object2IntMap<dnb> i;

   public gli(gjd $$0, fam $$1, int $$2) {
      this.f = $$1;
      this.g = $$2;
      this.e = new fyl(this);
      this.d = new glb(b, $$0);
   }

   public glc a(glj $$0) {
      return this.c.getOrDefault($$0, this.h);
   }

   public glc a() {
      return this.h;
   }

   public fyl b() {
      return this.e;
   }

   @Override
   public final CompletableFuture<Void> a(asi.a $$0, aso $$1, bjr $$2, bjr $$3, Executor $$4, Executor $$5) {
      $$2.a();
      CompletableFuture<Map<ajh, fyu>> $$6 = a($$1, $$4);
      CompletableFuture<Map<ajh, List<glh.c>>> $$7 = b($$1, $$4);
      CompletableFuture<glh> $$8 = $$6.thenCombineAsync($$7, ($$1x, $$2x) -> new glh(this.f, $$2, $$1x, $$2x), $$4);
      Map<ajh, CompletableFuture<glb.b>> $$9 = this.d.a($$1, this.g, $$4);
      return CompletableFuture.allOf(Stream.concat($$9.values().stream(), Stream.of($$8)).toArray(CompletableFuture[]::new))
         .thenApplyAsync(
            $$3x -> this.a(
                  $$2,
                  $$9.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (glb.b)((CompletableFuture)$$0xx.getValue()).join())),
                  $$8.join()
               ),
            $$4
         )
         .thenCompose($$0x -> $$0x.e.thenApply($$1x -> $$0x))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private static CompletableFuture<Map<ajh, fyu>> a(aso $$0, Executor $$1) {
      return CompletableFuture.<Map<ajh, asm>>supplyAsync(() -> glh.p.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<ajh, fyu>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<ajh, asm> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               try {
                  Pair var2x;
                  try (Reader $$1xx = $$3.getValue().e()) {
                     var2x = Pair.of($$3.getKey(), fyu.a($$1xx));
                  }

                  return var2x;
               } catch (Exception var6) {
                  a.error("Failed to load model {}", $$3.getKey(), var6);
                  return null;
               }
            }, $$1));
         }

         return ac.d($$2).thenApply($$0xx -> $$0xx.stream().filter(Objects::nonNull).collect(Collectors.toUnmodifiableMap(Pair::getFirst, Pair::getSecond)));
      });
   }

   private static CompletableFuture<Map<ajh, List<glh.c>>> b(aso $$0, Executor $$1) {
      return CompletableFuture.<Map<ajh, List<asm>>>supplyAsync(() -> glh.o.b($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<ajh, List<glh.c>>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<ajh, List<asm>> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               List<asm> $$1xx = $$3.getValue();
               List<glh.c> $$2x = new ArrayList<>($$1xx.size());

               for (asm $$3x : $$1xx) {
                  try (Reader $$4 = $$3x.e()) {
                     JsonObject $$5 = awm.a($$4);
                     $$2x.add(new glh.c($$3x.b(), $$5));
                  } catch (Exception var10) {
                     a.error("Failed to load blockstate {} from pack {}", new Object[]{$$3.getKey(), $$3x.b(), var10});
                  }
               }

               return Pair.of($$3.getKey(), $$2x);
            }, $$1));
         }

         return ac.d($$2).thenApply($$0xx -> $$0xx.stream().filter(Objects::nonNull).collect(Collectors.toUnmodifiableMap(Pair::getFirst, Pair::getSecond)));
      });
   }

   private gli.a a(bjr $$0, Map<ajh, glb.b> $$1, glh $$2) {
      $$0.a("load");
      $$0.b("baking");
      Multimap<ajh, glf> $$3 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         glb.b $$4x = $$1.get($$3x.a());
         gjc $$5x = $$4x.a($$3x.b());
         if ($$5x != null) {
            return $$5x;
         } else {
            $$3.put($$2x, $$3x);
            return $$4x.a();
         }
      });
      $$3.asMap()
         .forEach(
            ($$0x, $$1x) -> a.warn(
                  "Missing textures in model {}:\n{}",
                  $$0x,
                  $$1x.stream().sorted(glf.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<ajh, glc> $$4 = $$2.a();
      glc $$5 = $$4.get(glh.n);
      Map<dnb, glc> $$6 = new IdentityHashMap<>();

      for (dac $$7 : ki.e) {
         $$7.n().a().forEach($$3x -> {
            ajh $$4x = $$3x.b().r().h().a();
            glc $$5x = $$4.getOrDefault(fyl.a($$4x, $$3x), $$5);
            $$6.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$8 = CompletableFuture.allOf($$1.values().stream().map(glb.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      $$0.b();
      return new gli.a($$2, $$5, $$6, $$1, $$8);
   }

   private void a(gli.a $$0, bjr $$1) {
      $$1.a();
      $$1.a("upload");
      $$0.d.values().forEach(glb.b::c);
      glh $$2 = $$0.a;
      this.c = $$2.a();
      this.i = $$2.b();
      this.h = $$0.b;
      $$1.b("cache");
      this.e.a($$0.c);
      $$1.c();
      $$1.b();
   }

   public boolean a(dnb $$0, dnb $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.i.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.i.getInt($$1);
            if ($$2 == $$3) {
               eip $$4 = $$0.u();
               eip $$5 = $$1.u();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public gjb a(ajh $$0) {
      return this.d.a($$0);
   }

   @Override
   public void close() {
      this.d.close();
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   static record a(glh a, glc b, Map<dnb, glc> c, Map<ajh, glb.b> d, CompletableFuture<Void> e) {
   }
}

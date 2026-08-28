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

public class grv implements atq, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<akk, akk> b = Map.of(
      ges.c,
      new akk("banner_patterns"),
      ges.b,
      new akk("beds"),
      ges.f,
      new akk("chests"),
      ges.d,
      new akk("shield_patterns"),
      ges.e,
      new akk("signs"),
      ges.a,
      new akk("shulker_boxes"),
      ges.g,
      new akk("armor_trims"),
      ges.h,
      new akk("decorated_pot"),
      gpn.e,
      new akk("blocks")
   );
   private Map<akk, grp> c;
   private final gro d;
   private final gew e;
   private final fgw f;
   private int g;
   private grp h;
   private Object2IntMap<dsk> i;

   public grv(gpp $$0, fgw $$1, int $$2) {
      this.f = $$1;
      this.g = $$2;
      this.e = new gew(this);
      this.d = new gro(b, $$0);
   }

   public grp a(grw $$0) {
      return this.c.getOrDefault($$0, this.h);
   }

   public grp a() {
      return this.h;
   }

   public gew b() {
      return this.e;
   }

   @Override
   public final CompletableFuture<Void> a(atq.a $$0, atw $$1, bmu $$2, bmu $$3, Executor $$4, Executor $$5) {
      $$2.a();
      CompletableFuture<Map<akk, gff>> $$6 = a($$1, $$4);
      CompletableFuture<Map<akk, List<gru.c>>> $$7 = b($$1, $$4);
      CompletableFuture<gru> $$8 = $$6.thenCombineAsync($$7, ($$1x, $$2x) -> new gru(this.f, $$2, $$1x, $$2x), $$4);
      Map<akk, CompletableFuture<gro.b>> $$9 = this.d.a($$1, this.g, $$4);
      return CompletableFuture.allOf(Stream.concat($$9.values().stream(), Stream.of($$8)).toArray(CompletableFuture[]::new))
         .thenApplyAsync(
            $$3x -> this.a(
                  $$2,
                  $$9.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (gro.b)((CompletableFuture)$$0xx.getValue()).join())),
                  $$8.join()
               ),
            $$4
         )
         .thenCompose($$0x -> $$0x.e.thenApply($$1x -> $$0x))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private static CompletableFuture<Map<akk, gff>> a(atw $$0, Executor $$1) {
      return CompletableFuture.<Map<akk, atu>>supplyAsync(() -> gru.p.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<akk, gff>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<akk, atu> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               try {
                  Pair var2x;
                  try (Reader $$1xx = $$3.getValue().e()) {
                     var2x = Pair.of($$3.getKey(), gff.a($$1xx));
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

   private static CompletableFuture<Map<akk, List<gru.c>>> b(atw $$0, Executor $$1) {
      return CompletableFuture.<Map<akk, List<atu>>>supplyAsync(() -> gru.o.b($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<akk, List<gru.c>>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<akk, List<atu>> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               List<atu> $$1xx = $$3.getValue();
               List<gru.c> $$2x = new ArrayList<>($$1xx.size());

               for (atu $$3x : $$1xx) {
                  try (Reader $$4 = $$3x.e()) {
                     JsonObject $$5 = axw.a($$4);
                     $$2x.add(new gru.c($$3x.b(), $$5));
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

   private grv.a a(bmu $$0, Map<akk, gro.b> $$1, gru $$2) {
      $$0.a("load");
      $$0.b("baking");
      Multimap<akk, grs> $$3 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         gro.b $$4x = $$1.get($$3x.a());
         gpo $$5x = $$4x.a($$3x.b());
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
                  $$1x.stream().sorted(grs.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<akk, grp> $$4 = $$2.a();
      grp $$5 = $$4.get(gru.n);
      Map<dsk, grp> $$6 = new IdentityHashMap<>();

      for (dfh $$7 : lq.e) {
         $$7.l().a().forEach($$3x -> {
            akk $$4x = $$3x.b().s().h().a();
            grp $$5x = $$4.getOrDefault(gew.a($$4x, $$3x), $$5);
            $$6.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$8 = CompletableFuture.allOf($$1.values().stream().map(gro.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      $$0.b();
      return new grv.a($$2, $$5, $$6, $$1, $$8);
   }

   private void a(grv.a $$0, bmu $$1) {
      $$1.a();
      $$1.a("upload");
      $$0.d.values().forEach(gro.b::c);
      gru $$2 = $$0.a;
      this.c = $$2.a();
      this.i = $$2.b();
      this.h = $$0.b;
      $$1.b("cache");
      this.e.a($$0.c);
      $$1.c();
      $$1.b();
   }

   public boolean a(dsk $$0, dsk $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.i.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.i.getInt($$1);
            if ($$2 == $$3) {
               eoh $$4 = $$0.u();
               eoh $$5 = $$1.u();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public gpn a(akk $$0) {
      return this.d.a($$0);
   }

   @Override
   public void close() {
      this.d.close();
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   static record a(gru a, grp b, Map<dsk, grp> c, Map<akk, gro.b> d, CompletableFuture<Void> e) {
   }
}

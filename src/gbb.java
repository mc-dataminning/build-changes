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

public class gbb implements ang, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<aer, aer> b = Map.of(
      foi.c,
      new aer("banner_patterns"),
      foi.b,
      new aer("beds"),
      foi.f,
      new aer("chests"),
      foi.d,
      new aer("shield_patterns"),
      foi.e,
      new aer("signs"),
      foi.a,
      new aer("shulker_boxes"),
      foi.g,
      new aer("armor_trims"),
      foi.h,
      new aer("decorated_pot"),
      fyt.e,
      new aer("blocks")
   );
   private Map<aer, gav> c;
   private final gau d;
   private final fom e;
   private final erm f;
   private int g;
   private gav h;
   private Object2IntMap<dez> i;

   public gbb(fyv $$0, erm $$1, int $$2) {
      this.f = $$1;
      this.g = $$2;
      this.e = new fom(this);
      this.d = new gau(b, $$0);
   }

   public gav a(gbc $$0) {
      return this.c.getOrDefault($$0, this.h);
   }

   public gav a() {
      return this.h;
   }

   public fom b() {
      return this.e;
   }

   @Override
   public final CompletableFuture<Void> a(ang.a $$0, anm $$1, bdh $$2, bdh $$3, Executor $$4, Executor $$5) {
      $$2.a();
      CompletableFuture<Map<aer, fow>> $$6 = a($$1, $$4);
      CompletableFuture<Map<aer, List<gba.c>>> $$7 = b($$1, $$4);
      CompletableFuture<gba> $$8 = $$6.thenCombineAsync($$7, ($$1x, $$2x) -> new gba(this.f, $$2, $$1x, $$2x), $$4);
      Map<aer, CompletableFuture<gau.b>> $$9 = this.d.a($$1, this.g, $$4);
      return CompletableFuture.allOf(Stream.concat($$9.values().stream(), Stream.of($$8)).toArray(CompletableFuture[]::new))
         .thenApplyAsync(
            $$3x -> this.a(
                  $$2,
                  $$9.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (gau.b)((CompletableFuture)$$0xx.getValue()).join())),
                  $$8.join()
               ),
            $$4
         )
         .thenCompose($$0x -> $$0x.e.thenApply($$1x -> $$0x))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private static CompletableFuture<Map<aer, fow>> a(anm $$0, Executor $$1) {
      return CompletableFuture.<Map<aer, ank>>supplyAsync(() -> gba.p.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<aer, fow>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<aer, ank> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               try {
                  Pair var2x;
                  try (Reader $$1xx = $$3.getValue().e()) {
                     var2x = Pair.of($$3.getKey(), fow.a($$1xx));
                  }

                  return var2x;
               } catch (Exception var6) {
                  a.error("Failed to load model {}", $$3.getKey(), var6);
                  return null;
               }
            }, $$1));
         }

         return ac.b($$2).thenApply($$0xx -> $$0xx.stream().filter(Objects::nonNull).collect(Collectors.toUnmodifiableMap(Pair::getFirst, Pair::getSecond)));
      });
   }

   private static CompletableFuture<Map<aer, List<gba.c>>> b(anm $$0, Executor $$1) {
      return CompletableFuture.<Map<aer, List<ank>>>supplyAsync(() -> gba.o.b($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<aer, List<gba.c>>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<aer, List<ank>> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               List<ank> $$1xx = $$3.getValue();
               List<gba.c> $$2x = new ArrayList<>($$1xx.size());

               for (ank $$3x : $$1xx) {
                  try (Reader $$4 = $$3x.e()) {
                     JsonObject $$5 = arg.a($$4);
                     $$2x.add(new gba.c($$3x.b(), $$5));
                  } catch (Exception var10) {
                     a.error("Failed to load blockstate {} from pack {}", new Object[]{$$3.getKey(), $$3x.b(), var10});
                  }
               }

               return Pair.of($$3.getKey(), $$2x);
            }, $$1));
         }

         return ac.b($$2).thenApply($$0xx -> $$0xx.stream().filter(Objects::nonNull).collect(Collectors.toUnmodifiableMap(Pair::getFirst, Pair::getSecond)));
      });
   }

   private gbb.a a(bdh $$0, Map<aer, gau.b> $$1, gba $$2) {
      $$0.a("load");
      $$0.b("baking");
      Multimap<aer, gay> $$3 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         gau.b $$4x = $$1.get($$3x.a());
         fyu $$5x = $$4x.a($$3x.b());
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
                  $$1x.stream().sorted(gay.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<aer, gav> $$4 = $$2.a();
      gav $$5 = $$4.get(gba.n);
      Map<dez, gav> $$6 = new IdentityHashMap<>();

      for (csl $$7 : jb.f) {
         $$7.l().a().forEach($$3x -> {
            aer $$4x = $$3x.b().q().g().a();
            gav $$5x = $$4.getOrDefault(fom.a($$4x, $$3x), $$5);
            $$6.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$8 = CompletableFuture.allOf($$1.values().stream().map(gau.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      $$0.b();
      return new gbb.a($$2, $$5, $$6, $$1, $$8);
   }

   private void a(gbb.a $$0, bdh $$1) {
      $$1.a();
      $$1.a("upload");
      $$0.d.values().forEach(gau.b::c);
      gba $$2 = $$0.a;
      this.c = $$2.a();
      this.i = $$2.b();
      this.h = $$0.b;
      $$1.b("cache");
      this.e.a($$0.c);
      $$1.c();
      $$1.b();
   }

   public boolean a(dez $$0, dez $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.i.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.i.getInt($$1);
            if ($$2 == $$3) {
               eac $$4 = $$0.u();
               eac $$5 = $$1.u();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public fyt a(aer $$0) {
      return this.d.a($$0);
   }

   @Override
   public void close() {
      this.d.close();
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   static record a(gba a, gav b, Map<dez, gav> c, Map<aer, gau.b> d, CompletableFuture<Void> e) {
   }
}

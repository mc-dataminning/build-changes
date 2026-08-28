import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import java.io.Reader;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class hha implements aui, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final akn b = akn.a("models");
   private static final Map<aku, aku> c = Map.of(
      gmq.c,
      aku.b("banner_patterns"),
      gmq.b,
      aku.b("beds"),
      gmq.f,
      aku.b("chests"),
      gmq.d,
      aku.b("shield_patterns"),
      gmq.e,
      aku.b("signs"),
      gmq.a,
      aku.b("shulker_boxes"),
      gmq.g,
      aku.b("armor_trims"),
      gmq.h,
      aku.b("decorated_pot"),
      hel.d,
      aku.b("blocks")
   );
   private Map<hhb, hgm> d = Map.of();
   private Map<aku, hbh> e = Map.of();
   private final hgl f;
   private final gmy g;
   private final fmj h;
   private gew i = gew.a;
   private gms j = gms.a;
   private int k;
   private hgm l;
   private hbh m;
   private Object2IntMap<dwv> n = Object2IntMaps.emptyMap();

   public hha(heo $$0, fmj $$1, int $$2) {
      this.h = $$1;
      this.k = $$2;
      this.g = new gmy(this);
      this.f = new hgl(c, $$0);
   }

   public hgm a(hhb $$0) {
      return this.d.getOrDefault($$0, this.l);
   }

   public hgm a() {
      return this.l;
   }

   public hbh a(aku $$0) {
      return this.e.getOrDefault($$0, this.m);
   }

   public gmy b() {
      return this.g;
   }

   @Override
   public final CompletableFuture<Void> a(aui.a $$0, auo $$1, Executor $$2, Executor $$3) {
      hhh $$4 = hgu.a();
      CompletableFuture<gew> $$5 = CompletableFuture.supplyAsync(gew::a, $$2);
      CompletableFuture<gms> $$6 = $$5.thenApplyAsync(gms::a, $$2);
      CompletableFuture<Map<aku, hhh>> $$7 = a($$1, $$2);
      CompletableFuture<hgo.c> $$8 = hgo.a($$4, $$1, $$2);
      CompletableFuture<hgs.a> $$9 = hgs.a($$1, $$2);
      CompletableFuture<hgy> $$10 = CompletableFuture.allOf($$7, $$8, $$9).thenApplyAsync($$4x -> a($$4, $$7.join(), $$8.join(), $$9.join()), $$2);
      CompletableFuture<Object2IntMap<dwv>> $$11 = $$8.thenApplyAsync($$0x -> a(this.h, $$0x), $$2);
      Map<aku, CompletableFuture<hgl.b>> $$12 = this.f.a($$1, this.k, $$2);
      return CompletableFuture.allOf(Stream.concat($$12.values().stream(), Stream.of($$10, $$11, $$8, $$9, $$5, $$6)).toArray(CompletableFuture[]::new))
         .thenApplyAsync(
            $$8x -> {
               Map<aku, hgl.b> $$9x = $$12.entrySet()
                  .stream()
                  .collect(Collectors.toMap(Entry::getKey, $$0xx -> (hgl.b)((CompletableFuture)$$0xx.getValue()).join()));
               hgy $$10x = $$10.join();
               Object2IntMap<dwv> $$11x = $$11.join();
               Set<aku> $$12x = $$10x.d();
               if (!$$12x.isEmpty()) {
                  a.debug("Unreferenced models: \n{}", $$12x.stream().sorted().map($$0xx -> "\t" + $$0xx + "\n").collect(Collectors.joining()));
               }

               hgw $$13 = new hgw($$5.join(), $$8.join().b(), $$9.join().a(), $$10x.c(), $$4);
               return a(boq.a(), $$9x, $$13, $$11x, $$5.join(), $$6.join());
            },
            $$2
         )
         .thenCompose($$0x -> $$0x.g.thenApply($$1x -> $$0x))
         .thenCompose($$0::a)
         .thenAcceptAsync($$0x -> this.a($$0x, boq.a()), $$3);
   }

   private static CompletableFuture<Map<aku, hhh>> a(auo $$0, Executor $$1) {
      return CompletableFuture.<Map<aku, aum>>supplyAsync(() -> b.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<aku, gnh>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<aku, aum> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               aku $$1xx = b.b($$3.getKey());

               try {
                  Pair var3;
                  try (Reader $$2x = $$3.getValue().e()) {
                     var3 = Pair.of($$1xx, gnh.a($$2x));
                  }

                  return var3;
               } catch (Exception var7) {
                  a.error("Failed to load model {}", $$3.getKey(), var7);
                  return null;
               }
            }, $$1));
         }

         return af.d($$2).thenApply($$0xx -> $$0xx.stream().filter(Objects::nonNull).collect(Collectors.toUnmodifiableMap(Pair::getFirst, Pair::getSecond)));
      });
   }

   private static hgy a(hhh $$0, Map<aku, hhh> $$1, hgo.c $$2, hgs.a $$3) {
      hgy $$4 = new hgy($$1, $$0);
      $$2.a().forEach($$4::a);
      $$3.a().values().forEach($$4::a);
      $$4.a();
      $$4.b();
      return $$4;
   }

   private static hha.a a(bor $$0, final Map<aku, hgl.b> $$1, hgw $$2, Object2IntMap<dwv> $$3, gew $$4, gms $$5) {
      $$0.a("baking");
      final Multimap<String, hgt> $$6 = HashMultimap.create();
      final Multimap<String, String> $$7 = HashMultimap.create();
      final hem $$8 = $$1.get(hel.d).a();
      hgw.b $$9 = $$2.a(new hgw.d() {
         @Override
         public hem a(hgx $$0, hgt $$1x) {
            hgl.b $$2 = $$1.get($$1.a());
            hem $$3 = $$2.a($$1.b());
            if ($$3 != null) {
               return $$3;
            } else {
               $$6.put($$0.get(), $$1);
               return $$2.a();
            }
         }

         @Override
         public hem a(hgx $$0, String $$1x) {
            $$7.put($$0.get(), $$1);
            return $$8;
         }
      });
      $$6.asMap()
         .forEach(
            ($$0x, $$1x) -> a.warn(
                  "Missing textures in model {}:\n{}",
                  $$0x,
                  $$1x.stream().sorted(hgt.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$7.asMap()
         .forEach(
            ($$0x, $$1x) -> a.warn(
                  "Missing texture references in model {}:\n{}", $$0x, $$1x.stream().sorted().map($$0xx -> "    " + $$0xx).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<dwv, hgm> $$10 = a($$9.b(), $$9.a());
      CompletableFuture<Void> $$11 = CompletableFuture.allOf($$1.values().stream().map(hgl.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      return new hha.a($$9, $$3, $$10, $$1, $$4, $$5, $$11);
   }

   private static Map<dwv, hgm> a(Map<hhb, hgm> $$0, hgm $$1) {
      Map<dwv, hgm> $$2 = new IdentityHashMap<>();

      for (djk $$3 : mb.e) {
         $$3.l().a().forEach($$3x -> {
            aku $$4 = $$3x.b().p().h().a();
            hhb $$5 = gmy.a($$4, $$3x);
            hgm $$6 = $$0.get($$5);
            if ($$6 == null) {
               a.warn("Missing model for variant: '{}'", $$5);
               $$2.putIfAbsent($$3x, $$1);
            } else {
               $$2.put($$3x, $$6);
            }
         });
      }

      return $$2;
   }

   private static Object2IntMap<dwv> a(fmj $$0, hgo.c $$1) {
      return hgz.a($$0, $$1);
   }

   private void a(hha.a $$0, bor $$1) {
      $$1.a("upload");
      $$0.d.values().forEach(hgl.b::c);
      hgw.b $$2 = $$0.a;
      this.d = $$2.b();
      this.e = $$2.d();
      this.n = $$0.b;
      this.l = $$2.a();
      this.m = $$2.c();
      $$1.b("cache");
      this.g.a($$0.c);
      this.j = $$0.f;
      this.i = $$0.e;
      $$1.c();
   }

   public boolean a(dwv $$0, dwv $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.n.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.n.getInt($$1);
            if ($$2 == $$3) {
               esx $$4 = $$0.y();
               esx $$5 = $$1.y();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public hel b(aku $$0) {
      return this.f.a($$0);
   }

   @Override
   public void close() {
      this.f.close();
   }

   public void a(int $$0) {
      this.k = $$0;
   }

   public Supplier<gms> d() {
      return () -> this.j;
   }

   public Supplier<gew> e() {
      return () -> this.i;
   }

   static record a(hgw.b a, Object2IntMap<dwv> b, Map<dwv, hgm> c, Map<aku, hgl.b> d, gew e, gms f, CompletableFuture<Void> g) {
   }
}

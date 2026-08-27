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

public class fwx implements akr, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<acq, acq> b = Map.of(
      fkj.c,
      new acq("banner_patterns"),
      fkj.b,
      new acq("beds"),
      fkj.f,
      new acq("chests"),
      fkj.d,
      new acq("shield_patterns"),
      fkj.e,
      new acq("signs"),
      fkj.a,
      new acq("shulker_boxes"),
      fkj.g,
      new acq("armor_trims"),
      fkj.h,
      new acq("decorated_pot"),
      fuu.e,
      new acq("blocks")
   );
   private Map<acq, fwr> c;
   private final fwq d;
   private final fkn e;
   private final eoo f;
   private int g;
   private fwr h;
   private Object2IntMap<dcb> i;

   public fwx(fuw $$0, eoo $$1, int $$2) {
      this.f = $$1;
      this.g = $$2;
      this.e = new fkn(this);
      this.d = new fwq(b, $$0);
   }

   public fwr a(fwy $$0) {
      return this.c.getOrDefault($$0, this.h);
   }

   public fwr a() {
      return this.h;
   }

   public fkn b() {
      return this.e;
   }

   @Override
   public final CompletableFuture<Void> a(akr.a $$0, akx $$1, ban $$2, ban $$3, Executor $$4, Executor $$5) {
      $$2.a();
      CompletableFuture<Map<acq, fkw>> $$6 = a($$1, $$4);
      CompletableFuture<Map<acq, List<fww.c>>> $$7 = b($$1, $$4);
      CompletableFuture<fww> $$8 = $$6.thenCombineAsync($$7, ($$1x, $$2x) -> new fww(this.f, $$2, $$1x, $$2x), $$4);
      Map<acq, CompletableFuture<fwq.b>> $$9 = this.d.a($$1, this.g, $$4);
      return CompletableFuture.allOf(Stream.concat($$9.values().stream(), Stream.of($$8)).toArray(CompletableFuture[]::new))
         .thenApplyAsync(
            $$3x -> this.a(
                  $$2,
                  $$9.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (fwq.b)((CompletableFuture)$$0xx.getValue()).join())),
                  $$8.join()
               ),
            $$4
         )
         .thenCompose($$0x -> $$0x.e.thenApply($$1x -> $$0x))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private static CompletableFuture<Map<acq, fkw>> a(akx $$0, Executor $$1) {
      return CompletableFuture.<Map<acq, akv>>supplyAsync(() -> fww.p.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<acq, fkw>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<acq, akv> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               try {
                  Pair var2x;
                  try (Reader $$1xx = $$3.getValue().e()) {
                     var2x = Pair.of($$3.getKey(), fkw.a($$1xx));
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

   private static CompletableFuture<Map<acq, List<fww.c>>> b(akx $$0, Executor $$1) {
      return CompletableFuture.<Map<acq, List<akv>>>supplyAsync(() -> fww.o.b($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<acq, List<fww.c>>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<acq, List<akv>> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               List<akv> $$1xx = $$3.getValue();
               List<fww.c> $$2x = new ArrayList<>($$1xx.size());

               for (akv $$3x : $$1xx) {
                  try (Reader $$4 = $$3x.e()) {
                     JsonObject $$5 = aor.a($$4);
                     $$2x.add(new fww.c($$3x.b(), $$5));
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

   private fwx.a a(ban $$0, Map<acq, fwq.b> $$1, fww $$2) {
      $$0.a("load");
      $$0.b("baking");
      Multimap<acq, fwu> $$3 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         fwq.b $$4x = $$1.get($$3x.a());
         fuv $$5x = $$4x.a($$3x.b());
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
                  $$1x.stream().sorted(fwu.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<acq, fwr> $$4 = $$2.a();
      fwr $$5 = $$4.get(fww.n);
      Map<dcb, fwr> $$6 = new IdentityHashMap<>();

      for (cpn $$7 : jb.f) {
         $$7.l().a().forEach($$3x -> {
            acq $$4x = $$3x.b().q().g().a();
            fwr $$5x = $$4.getOrDefault(fkn.a($$4x, $$3x), $$5);
            $$6.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$8 = CompletableFuture.allOf($$1.values().stream().map(fwq.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      $$0.b();
      return new fwx.a($$2, $$5, $$6, $$1, $$8);
   }

   private void a(fwx.a $$0, ban $$1) {
      $$1.a();
      $$1.a("upload");
      $$0.d.values().forEach(fwq.b::c);
      fww $$2 = $$0.a;
      this.c = $$2.a();
      this.i = $$2.b();
      this.h = $$0.b;
      $$1.b("cache");
      this.e.a($$0.c);
      $$1.c();
      $$1.b();
   }

   public boolean a(dcb $$0, dcb $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.i.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.i.getInt($$1);
            if ($$2 == $$3) {
               dxe $$4 = $$0.u();
               dxe $$5 = $$1.u();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public fuu a(acq $$0) {
      return this.d.a($$0);
   }

   @Override
   public void close() {
      this.d.close();
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   static record a(fww a, fwr b, Map<dcb, fwr> c, Map<acq, fwq.b> d, CompletableFuture<Void> e) {
   }
}

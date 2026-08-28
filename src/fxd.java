import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.io.Reader;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fxd implements avb, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final alk a = alk.b("missing");
   private static final ald d = ald.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final fxf f;
   private final List<fim> g = new ArrayList<>();
   private final Map<alk, fxf> h = new HashMap<>();
   private final hle i;
   @Nullable
   private volatile fxf j;

   public fxd(hle $$0) {
      this.i = $$0;
      this.f = ag.a(new fxf($$0, a), $$0x -> $$0x.a(List.of(c()), Set.of()));
   }

   private static fim.a c() {
      return new fim.a(new fxb(), fxe.a.b);
   }

   @Override
   public CompletableFuture<Void> reload(avb.a $$0, avh $$1, Executor $$2, Executor $$3) {
      return this.a($$1, $$2).thenCompose($$0::wait).thenAcceptAsync($$0x -> this.a($$0x, brc.a()), $$3);
   }

   private CompletableFuture<fxd.d> a(avh $$0, Executor $$1) {
      List<CompletableFuture<fxd.e>> $$2 = new ArrayList<>();

      for (Entry<alk, List<avf>> $$3 : d.b($$0).entrySet()) {
         alk $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<fxd.a, fxq.a>> $$4x = a($$3.getValue(), $$4);
            fxd.e $$5 = new fxd.e($$4);

            for (Pair<fxd.a, fxq.a> $$6 : $$4x) {
               fxd.a $$7 = (fxd.a)$$6.getFirst();
               fxe.a $$8 = ((fxq.a)$$6.getSecond()).b();
               ((fxq.a)$$6.getSecond()).a().b().ifLeft($$5x -> {
                  CompletableFuture<Optional<fim>> $$6x = this.a($$7, $$5x, $$0, $$1);
                  $$5.a($$7, $$8, $$6x);
               }).ifRight($$3xx -> $$5.a($$7, $$8, $$3xx));
            }

            return $$5;
         }, $$1));
      }

      return ag.d($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<fim>>> $$2x = $$1x.stream().flatMap(fxd.e::d).collect(ag.b());
               fim.a $$3x = c();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x.a())));
               return ag.d($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<alk, List<fim.a>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<fim> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new fxd.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<fim>> a(fxd.a $$0, fxq.b $$1, avh $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<alk, List<fim.a>> a(List<fxd.e> $$0) {
      Map<alk, List<fim.a>> $$1 = new HashMap<>();
      ayu<alk, fxd.e> $$2 = new ayu<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<fim.a> $$0, fim.a $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (fim.a $$3 : $$0) {
         $$2.addAll($$3.a().a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (fim.a $$2x : Lists.reverse($$0)) {
               if ($$2x.a().a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private static Set<fxe> b(frj $$0) {
      Set<fxe> $$1 = EnumSet.noneOf(fxe.class);
      if ($$0.S().c()) {
         $$1.add(fxe.a);
      }

      if ($$0.T().c()) {
         $$1.add(fxe.b);
      }

      return $$1;
   }

   private void a(fxd.d $$0, brd $$1) {
      $$1.a("closing");
      this.j = null;
      this.h.values().forEach(fxf::close);
      this.h.clear();
      this.g.forEach(fim::close);
      this.g.clear();
      Set<fxe> $$2 = b(frf.Q().n);
      $$1.b("reloading");
      $$0.a().forEach(($$1x, $$2x) -> {
         fxf $$3 = new fxf(this.i, $$1x);
         $$3.a(Lists.reverse($$2x), $$2);
         this.h.put($$1x, $$3);
      });
      this.g.addAll($$0.b);
      $$1.c();
      if (!this.h.containsKey(frf.b)) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   public void a(frj $$0) {
      Set<fxe> $$1 = b($$0);

      for (fxf $$2 : this.h.values()) {
         $$2.a($$1);
      }
   }

   private static List<Pair<fxd.a, fxq.a>> a(List<avf> $$0, alk $$1) {
      List<Pair<fxd.a, fxq.a>> $$2 = new ArrayList<>();

      for (avf $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            fxd.c $$6 = (fxd.c)fxd.c.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonParseException::new);
            List<fxq.a> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               fxd.a $$9 = new fxd.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public ftx a() {
      return new ftx(this::b, false);
   }

   public ftx b() {
      return new ftx(this::b, true);
   }

   private fxf a(alk $$0) {
      return this.h.getOrDefault($$0, this.f);
   }

   private fxf b(alk $$0) {
      fxf $$1 = this.j;
      if ($$1 != null && $$0.equals($$1.a())) {
         return $$1;
      } else {
         fxf $$2 = this.a($$0);
         this.j = $$2;
         return $$2;
      }
   }

   @Override
   public void close() {
      this.h.values().forEach(fxf::close);
      this.g.forEach(fim::close);
      this.f.close();
   }

   static record a(alk a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(fxd.a a, fxe.a b, Either<CompletableFuture<Optional<fim>>, alk> c) {

      public Optional<List<fim.a>> a(Function<alk, List<fim.a>> $$0) {
         return (Optional<List<fim.a>>)this.c.map($$0x -> ((Optional)$$0x.join()).map($$0xx -> List.of(new fim.a($$0xx, this.b))), $$1 -> {
            List<fim.a> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               fxd.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2.stream().map(this::a).toList());
            }
         });
      }

      private fim.a a(fim.a $$0) {
         return new fim.a($$0.a(), this.b.a($$0.b()));
      }
   }

   static record c(List<fxq.a> b) {
      public static final Codec<fxd.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fxq.a.a.listOf().fieldOf("providers").forGetter(fxd.c::a)).apply($$0, fxd.c::new)
      );

      public List<fxq.a> a() {
         return this.b;
      }
   }

   static record d(Map<alk, List<fim.a>> a, List<fim> b) {
   }

   static record e(alk a, List<fxd.b> b, Set<alk> c) implements ayu.a<alk> {

      public e(alk $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(fxd.a $$0, fxe.a $$1, fxq.c $$2) {
         this.b.add(new fxd.b($$0, $$1, Either.right($$2.a())));
         this.c.add($$2.a());
      }

      public void a(fxd.a $$0, fxe.a $$1, CompletableFuture<Optional<fim>> $$2) {
         this.b.add(new fxd.b($$0, $$1, Either.left($$2)));
      }

      private Stream<CompletableFuture<Optional<fim>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.c.left().stream());
      }

      public Optional<List<fim.a>> a(Function<alk, List<fim.a>> $$0) {
         List<fim.a> $$1 = new ArrayList<>();

         for (fxd.b $$2 : this.b) {
            Optional<List<fim.a>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<alk> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<alk> $$0) {
      }
   }
}

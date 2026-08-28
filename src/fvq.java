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

public class fvq implements auw, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final alg a = alg.b("missing");
   private static final akz d = akz.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final fvs f;
   private final List<fhw> g = new ArrayList<>();
   private final Map<alg, fvs> h = new HashMap<>();
   private final hjs i;
   @Nullable
   private volatile fvs j;

   public fvq(hjs $$0) {
      this.i = $$0;
      this.f = ag.a(new fvs($$0, a), $$0x -> $$0x.a(List.of(c()), Set.of()));
   }

   private static fhw.a c() {
      return new fhw.a(new fvo(), fvr.a.b);
   }

   @Override
   public CompletableFuture<Void> reload(auw.a $$0, avd $$1, Executor $$2, Executor $$3) {
      return this.a($$1, $$2).thenCompose($$0::wait).thenAcceptAsync($$0x -> this.a($$0x, bqp.a()), $$3);
   }

   private CompletableFuture<fvq.d> a(avd $$0, Executor $$1) {
      List<CompletableFuture<fvq.e>> $$2 = new ArrayList<>();

      for (Entry<alg, List<avb>> $$3 : d.b($$0).entrySet()) {
         alg $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<fvq.a, fwd.a>> $$4x = a($$3.getValue(), $$4);
            fvq.e $$5 = new fvq.e($$4);

            for (Pair<fvq.a, fwd.a> $$6 : $$4x) {
               fvq.a $$7 = (fvq.a)$$6.getFirst();
               fvr.a $$8 = ((fwd.a)$$6.getSecond()).b();
               ((fwd.a)$$6.getSecond()).a().b().ifLeft($$5x -> {
                  CompletableFuture<Optional<fhw>> $$6x = this.a($$7, $$5x, $$0, $$1);
                  $$5.a($$7, $$8, $$6x);
               }).ifRight($$3xx -> $$5.a($$7, $$8, $$3xx));
            }

            return $$5;
         }, $$1));
      }

      return ag.d($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<fhw>>> $$2x = $$1x.stream().flatMap(fvq.e::d).collect(ag.b());
               fhw.a $$3x = c();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x.a())));
               return ag.d($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<alg, List<fhw.a>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<fhw> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new fvq.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<fhw>> a(fvq.a $$0, fwd.b $$1, avd $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<alg, List<fhw.a>> a(List<fvq.e> $$0) {
      Map<alg, List<fhw.a>> $$1 = new HashMap<>();
      ayq<alg, fvq.e> $$2 = new ayq<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<fhw.a> $$0, fhw.a $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (fhw.a $$3 : $$0) {
         $$2.addAll($$3.a().a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (fhw.a $$2x : Lists.reverse($$0)) {
               if ($$2x.a().a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private static Set<fvr> b(fpx $$0) {
      Set<fvr> $$1 = EnumSet.noneOf(fvr.class);
      if ($$0.S().c()) {
         $$1.add(fvr.a);
      }

      if ($$0.T().c()) {
         $$1.add(fvr.b);
      }

      return $$1;
   }

   private void a(fvq.d $$0, bqq $$1) {
      $$1.a("closing");
      this.j = null;
      this.h.values().forEach(fvs::close);
      this.h.clear();
      this.g.forEach(fhw::close);
      this.g.clear();
      Set<fvr> $$2 = b(fpt.Q().n);
      $$1.b("reloading");
      $$0.a().forEach(($$1x, $$2x) -> {
         fvs $$3 = new fvs(this.i, $$1x);
         $$3.a(Lists.reverse($$2x), $$2);
         this.h.put($$1x, $$3);
      });
      this.g.addAll($$0.b);
      $$1.c();
      if (!this.h.containsKey(fpt.b)) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   public void a(fpx $$0) {
      Set<fvr> $$1 = b($$0);

      for (fvs $$2 : this.h.values()) {
         $$2.a($$1);
      }
   }

   private static List<Pair<fvq.a, fwd.a>> a(List<avb> $$0, alg $$1) {
      List<Pair<fvq.a, fwd.a>> $$2 = new ArrayList<>();

      for (avb $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            fvq.c $$6 = (fvq.c)fvq.c.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonParseException::new);
            List<fwd.a> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               fvq.a $$9 = new fvq.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public fsk a() {
      return new fsk(this::b, false);
   }

   public fsk b() {
      return new fsk(this::b, true);
   }

   private fvs a(alg $$0) {
      return this.h.getOrDefault($$0, this.f);
   }

   private fvs b(alg $$0) {
      fvs $$1 = this.j;
      if ($$1 != null && $$0.equals($$1.a())) {
         return $$1;
      } else {
         fvs $$2 = this.a($$0);
         this.j = $$2;
         return $$2;
      }
   }

   @Override
   public void close() {
      this.h.values().forEach(fvs::close);
      this.g.forEach(fhw::close);
      this.f.close();
   }

   static record a(alg a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(fvq.a a, fvr.a b, Either<CompletableFuture<Optional<fhw>>, alg> c) {

      public Optional<List<fhw.a>> a(Function<alg, List<fhw.a>> $$0) {
         return (Optional<List<fhw.a>>)this.c.map($$0x -> ((Optional)$$0x.join()).map($$0xx -> List.of(new fhw.a($$0xx, this.b))), $$1 -> {
            List<fhw.a> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               fvq.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2.stream().map(this::a).toList());
            }
         });
      }

      private fhw.a a(fhw.a $$0) {
         return new fhw.a($$0.a(), this.b.a($$0.b()));
      }
   }

   static record c(List<fwd.a> b) {
      public static final Codec<fvq.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fwd.a.a.listOf().fieldOf("providers").forGetter(fvq.c::a)).apply($$0, fvq.c::new)
      );

      public List<fwd.a> a() {
         return this.b;
      }
   }

   static record d(Map<alg, List<fhw.a>> a, List<fhw> b) {
   }

   static record e(alg a, List<fvq.b> b, Set<alg> c) implements ayq.a<alg> {

      public e(alg $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(fvq.a $$0, fvr.a $$1, fwd.c $$2) {
         this.b.add(new fvq.b($$0, $$1, Either.right($$2.a())));
         this.c.add($$2.a());
      }

      public void a(fvq.a $$0, fvr.a $$1, CompletableFuture<Optional<fhw>> $$2) {
         this.b.add(new fvq.b($$0, $$1, Either.left($$2)));
      }

      private Stream<CompletableFuture<Optional<fhw>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.c.left().stream());
      }

      public Optional<List<fhw.a>> a(Function<alg, List<fhw.a>> $$0) {
         List<fhw.a> $$1 = new ArrayList<>();

         for (fvq.b $$2 : this.b) {
            Optional<List<fhw.a>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<alg> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<alg> $$0) {
      }
   }
}

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

public class fvl implements auw, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final alg a = alg.b("missing");
   private static final akz d = akz.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final fvn f;
   private final List<fhr> g = new ArrayList<>();
   private final Map<alg, fvn> h = new HashMap<>();
   private final hjm i;
   @Nullable
   private volatile fvn j;

   public fvl(hjm $$0) {
      this.i = $$0;
      this.f = ag.a(new fvn($$0, a), $$0x -> $$0x.a(List.of(c()), Set.of()));
   }

   private static fhr.a c() {
      return new fhr.a(new fvj(), fvm.a.b);
   }

   @Override
   public CompletableFuture<Void> reload(auw.a $$0, avd $$1, Executor $$2, Executor $$3) {
      return this.a($$1, $$2).thenCompose($$0::wait).thenAcceptAsync($$0x -> this.a($$0x, bqp.a()), $$3);
   }

   private CompletableFuture<fvl.d> a(avd $$0, Executor $$1) {
      List<CompletableFuture<fvl.e>> $$2 = new ArrayList<>();

      for (Entry<alg, List<avb>> $$3 : d.b($$0).entrySet()) {
         alg $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<fvl.a, fvy.a>> $$4x = a($$3.getValue(), $$4);
            fvl.e $$5 = new fvl.e($$4);

            for (Pair<fvl.a, fvy.a> $$6 : $$4x) {
               fvl.a $$7 = (fvl.a)$$6.getFirst();
               fvm.a $$8 = ((fvy.a)$$6.getSecond()).b();
               ((fvy.a)$$6.getSecond()).a().b().ifLeft($$5x -> {
                  CompletableFuture<Optional<fhr>> $$6x = this.a($$7, $$5x, $$0, $$1);
                  $$5.a($$7, $$8, $$6x);
               }).ifRight($$3xx -> $$5.a($$7, $$8, $$3xx));
            }

            return $$5;
         }, $$1));
      }

      return ag.d($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<fhr>>> $$2x = $$1x.stream().flatMap(fvl.e::d).collect(ag.b());
               fhr.a $$3x = c();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x.a())));
               return ag.d($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<alg, List<fhr.a>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<fhr> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new fvl.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<fhr>> a(fvl.a $$0, fvy.b $$1, avd $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<alg, List<fhr.a>> a(List<fvl.e> $$0) {
      Map<alg, List<fhr.a>> $$1 = new HashMap<>();
      ayq<alg, fvl.e> $$2 = new ayq<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<fhr.a> $$0, fhr.a $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (fhr.a $$3 : $$0) {
         $$2.addAll($$3.a().a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (fhr.a $$2x : Lists.reverse($$0)) {
               if ($$2x.a().a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private static Set<fvm> b(fps $$0) {
      Set<fvm> $$1 = EnumSet.noneOf(fvm.class);
      if ($$0.S().c()) {
         $$1.add(fvm.a);
      }

      if ($$0.T().c()) {
         $$1.add(fvm.b);
      }

      return $$1;
   }

   private void a(fvl.d $$0, bqq $$1) {
      $$1.a("closing");
      this.j = null;
      this.h.values().forEach(fvn::close);
      this.h.clear();
      this.g.forEach(fhr::close);
      this.g.clear();
      Set<fvm> $$2 = b(fpo.Q().n);
      $$1.b("reloading");
      $$0.a().forEach(($$1x, $$2x) -> {
         fvn $$3 = new fvn(this.i, $$1x);
         $$3.a(Lists.reverse($$2x), $$2);
         this.h.put($$1x, $$3);
      });
      this.g.addAll($$0.b);
      $$1.c();
      if (!this.h.containsKey(fpo.b)) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   public void a(fps $$0) {
      Set<fvm> $$1 = b($$0);

      for (fvn $$2 : this.h.values()) {
         $$2.a($$1);
      }
   }

   private static List<Pair<fvl.a, fvy.a>> a(List<avb> $$0, alg $$1) {
      List<Pair<fvl.a, fvy.a>> $$2 = new ArrayList<>();

      for (avb $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            fvl.c $$6 = (fvl.c)fvl.c.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonParseException::new);
            List<fvy.a> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               fvl.a $$9 = new fvl.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public fsf a() {
      return new fsf(this::b, false);
   }

   public fsf b() {
      return new fsf(this::b, true);
   }

   private fvn a(alg $$0) {
      return this.h.getOrDefault($$0, this.f);
   }

   private fvn b(alg $$0) {
      fvn $$1 = this.j;
      if ($$1 != null && $$0.equals($$1.a())) {
         return $$1;
      } else {
         fvn $$2 = this.a($$0);
         this.j = $$2;
         return $$2;
      }
   }

   @Override
   public void close() {
      this.h.values().forEach(fvn::close);
      this.g.forEach(fhr::close);
      this.f.close();
   }

   static record a(alg a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(fvl.a a, fvm.a b, Either<CompletableFuture<Optional<fhr>>, alg> c) {

      public Optional<List<fhr.a>> a(Function<alg, List<fhr.a>> $$0) {
         return (Optional<List<fhr.a>>)this.c.map($$0x -> ((Optional)$$0x.join()).map($$0xx -> List.of(new fhr.a($$0xx, this.b))), $$1 -> {
            List<fhr.a> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               fvl.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2.stream().map(this::a).toList());
            }
         });
      }

      private fhr.a a(fhr.a $$0) {
         return new fhr.a($$0.a(), this.b.a($$0.b()));
      }
   }

   static record c(List<fvy.a> b) {
      public static final Codec<fvl.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fvy.a.a.listOf().fieldOf("providers").forGetter(fvl.c::a)).apply($$0, fvl.c::new)
      );

      public List<fvy.a> a() {
         return this.b;
      }
   }

   static record d(Map<alg, List<fhr.a>> a, List<fhr> b) {
   }

   static record e(alg a, List<fvl.b> b, Set<alg> c) implements ayq.a<alg> {

      public e(alg $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(fvl.a $$0, fvm.a $$1, fvy.c $$2) {
         this.b.add(new fvl.b($$0, $$1, Either.right($$2.a())));
         this.c.add($$2.a());
      }

      public void a(fvl.a $$0, fvm.a $$1, CompletableFuture<Optional<fhr>> $$2) {
         this.b.add(new fvl.b($$0, $$1, Either.left($$2)));
      }

      private Stream<CompletableFuture<Optional<fhr>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.c.left().stream());
      }

      public Optional<List<fhr.a>> a(Function<alg, List<fhr.a>> $$0) {
         List<fhr.a> $$1 = new ArrayList<>();

         for (fvl.b $$2 : this.b) {
            Optional<List<fhr.a>> $$3 = $$2.a($$0);
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

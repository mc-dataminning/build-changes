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

public class fwo implements avi, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final alr a = alr.b("missing");
   private static final alk d = alk.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final fwq f;
   private final List<fis> g = new ArrayList<>();
   private final Map<alr, fwq> h = new HashMap<>();
   private final hks i;
   @Nullable
   private volatile fwq j;

   public fwo(hks $$0) {
      this.i = $$0;
      this.f = ag.a(new fwq($$0, a), $$0x -> $$0x.a(List.of(c()), Set.of()));
   }

   private static fis.a c() {
      return new fis.a(new fwm(), fwp.a.b);
   }

   @Override
   public CompletableFuture<Void> reload(avi.a $$0, avo $$1, Executor $$2, Executor $$3) {
      return this.a($$1, $$2).thenCompose($$0::wait).thenAcceptAsync($$0x -> this.a($$0x, brl.a()), $$3);
   }

   private CompletableFuture<fwo.d> a(avo $$0, Executor $$1) {
      List<CompletableFuture<fwo.e>> $$2 = new ArrayList<>();

      for (Entry<alr, List<avm>> $$3 : d.b($$0).entrySet()) {
         alr $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<fwo.a, fxb.a>> $$4x = a($$3.getValue(), $$4);
            fwo.e $$5 = new fwo.e($$4);

            for (Pair<fwo.a, fxb.a> $$6 : $$4x) {
               fwo.a $$7 = (fwo.a)$$6.getFirst();
               fwp.a $$8 = ((fxb.a)$$6.getSecond()).b();
               ((fxb.a)$$6.getSecond()).a().b().ifLeft($$5x -> {
                  CompletableFuture<Optional<fis>> $$6x = this.a($$7, $$5x, $$0, $$1);
                  $$5.a($$7, $$8, $$6x);
               }).ifRight($$3xx -> $$5.a($$7, $$8, $$3xx));
            }

            return $$5;
         }, $$1));
      }

      return ag.d($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<fis>>> $$2x = $$1x.stream().flatMap(fwo.e::d).collect(ag.b());
               fis.a $$3x = c();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x.a())));
               return ag.d($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<alr, List<fis.a>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<fis> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new fwo.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<fis>> a(fwo.a $$0, fxb.b $$1, avo $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<alr, List<fis.a>> a(List<fwo.e> $$0) {
      Map<alr, List<fis.a>> $$1 = new HashMap<>();
      azc<alr, fwo.e> $$2 = new azc<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<fis.a> $$0, fis.a $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (fis.a $$3 : $$0) {
         $$2.addAll($$3.a().a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (fis.a $$2x : Lists.reverse($$0)) {
               if ($$2x.a().a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private static Set<fwp> b(fqu $$0) {
      Set<fwp> $$1 = EnumSet.noneOf(fwp.class);
      if ($$0.S().c()) {
         $$1.add(fwp.a);
      }

      if ($$0.T().c()) {
         $$1.add(fwp.b);
      }

      return $$1;
   }

   private void a(fwo.d $$0, brm $$1) {
      $$1.a("closing");
      this.j = null;
      this.h.values().forEach(fwq::close);
      this.h.clear();
      this.g.forEach(fis::close);
      this.g.clear();
      Set<fwp> $$2 = b(fqq.Q().n);
      $$1.b("reloading");
      $$0.a().forEach(($$1x, $$2x) -> {
         fwq $$3 = new fwq(this.i, $$1x);
         $$3.a(Lists.reverse($$2x), $$2);
         this.h.put($$1x, $$3);
      });
      this.g.addAll($$0.b);
      $$1.c();
      if (!this.h.containsKey(fqq.b)) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   public void a(fqu $$0) {
      Set<fwp> $$1 = b($$0);

      for (fwq $$2 : this.h.values()) {
         $$2.a($$1);
      }
   }

   private static List<Pair<fwo.a, fxb.a>> a(List<avm> $$0, alr $$1) {
      List<Pair<fwo.a, fxb.a>> $$2 = new ArrayList<>();

      for (avm $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            fwo.c $$6 = (fwo.c)fwo.c.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonParseException::new);
            List<fxb.a> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               fwo.a $$9 = new fwo.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public fti a() {
      return new fti(this::b, false);
   }

   public fti b() {
      return new fti(this::b, true);
   }

   private fwq a(alr $$0) {
      return this.h.getOrDefault($$0, this.f);
   }

   private fwq b(alr $$0) {
      fwq $$1 = this.j;
      if ($$1 != null && $$0.equals($$1.a())) {
         return $$1;
      } else {
         fwq $$2 = this.a($$0);
         this.j = $$2;
         return $$2;
      }
   }

   @Override
   public void close() {
      this.h.values().forEach(fwq::close);
      this.g.forEach(fis::close);
      this.f.close();
   }

   static record a(alr a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(fwo.a a, fwp.a b, Either<CompletableFuture<Optional<fis>>, alr> c) {

      public Optional<List<fis.a>> a(Function<alr, List<fis.a>> $$0) {
         return (Optional<List<fis.a>>)this.c.map($$0x -> ((Optional)$$0x.join()).map($$0xx -> List.of(new fis.a($$0xx, this.b))), $$1 -> {
            List<fis.a> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               fwo.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2.stream().map(this::a).toList());
            }
         });
      }

      private fis.a a(fis.a $$0) {
         return new fis.a($$0.a(), this.b.a($$0.b()));
      }
   }

   static record c(List<fxb.a> b) {
      public static final Codec<fwo.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fxb.a.a.listOf().fieldOf("providers").forGetter(fwo.c::a)).apply($$0, fwo.c::new)
      );

      public List<fxb.a> a() {
         return this.b;
      }
   }

   static record d(Map<alr, List<fis.a>> a, List<fis> b) {
   }

   static record e(alr a, List<fwo.b> b, Set<alr> c) implements azc.a<alr> {

      public e(alr $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(fwo.a $$0, fwp.a $$1, fxb.c $$2) {
         this.b.add(new fwo.b($$0, $$1, Either.right($$2.a())));
         this.c.add($$2.a());
      }

      public void a(fwo.a $$0, fwp.a $$1, CompletableFuture<Optional<fis>> $$2) {
         this.b.add(new fwo.b($$0, $$1, Either.left($$2)));
      }

      private Stream<CompletableFuture<Optional<fis>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.c.left().stream());
      }

      public Optional<List<fis.a>> a(Function<alr, List<fis.a>> $$0) {
         List<fis.a> $$1 = new ArrayList<>();

         for (fwo.b $$2 : this.b) {
            Optional<List<fis.a>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<alr> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<alr> $$0) {
      }
   }
}

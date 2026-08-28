import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class hkl {
   public static final Set<aun<?>> a = Set.of(hmd.b);
   private static final Logger b = LogUtils.getLogger();
   private final alr c;
   private final int d;
   private final int e;
   private final int f;

   public hkl(alr $$0, int $$1, int $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static hkl a(hkp $$0) {
      return new hkl($$0.e(), $$0.f(), $$0.g(), $$0.h());
   }

   public hkl.a a(List<hkk> $$0, int $$1, Executor $$2) {
      hkl.a var17;
      try (brr $$3 = brl.a().c(() -> "stitch " + this.c)) {
         int $$4 = this.d;
         hkn<hkk> $$5 = new hkn<>($$4, $$4, $$1);
         int $$6 = Integer.MAX_VALUE;
         int $$7 = 1 << $$1;

         for (hkk $$8 : $$0) {
            $$6 = Math.min($$6, Math.min($$8.a(), $$8.b()));
            int $$9 = Math.min(Integer.lowestOneBit($$8.a()), Integer.lowestOneBit($$8.b()));
            if ($$9 < $$7) {
               b.warn("Texture {} with size {}x{} limits mip level from {} to {}", new Object[]{$$8.c(), $$8.a(), $$8.b(), azz.f($$7), azz.f($$9)});
               $$7 = $$9;
            }

            $$5.a($$8);
         }

         int $$10 = Math.min($$6, $$7);
         int $$11 = azz.f($$10);
         int $$12;
         if ($$11 < $$1) {
            b.warn("{}: dropping miplevel from {} to {}, because of minimum power of two: {}", new Object[]{this.c, $$1, $$11, $$10});
            $$12 = $$11;
         } else {
            $$12 = $$1;
         }

         try {
            $$5.c();
         } catch (hko var19) {
            p $$15 = p.a(var19, "Stitching");
            q $$16 = $$15.a("Stitcher");
            $$16.a(
               "Sprites",
               var19.a().stream().map($$0x -> String.format(Locale.ROOT, "%s[%dx%d]", $$0x.c(), $$0x.a(), $$0x.b())).collect(Collectors.joining(","))
            );
            $$16.a("Max Texture Size", $$4);
            throw new aa($$15);
         }

         int $$17 = Math.max($$5.a(), this.e);
         int $$18 = Math.max($$5.b(), this.f);
         Map<alr, hkq> $$19 = this.a($$5, $$17, $$18);
         hkq $$20 = $$19.get(hkf.c());
         CompletableFuture<Void> $$21;
         if ($$12 > 0) {
            $$21 = CompletableFuture.runAsync(() -> $$19.values().forEach($$1xx -> $$1xx.e().a($$12)), $$2);
         } else {
            $$21 = CompletableFuture.completedFuture(null);
         }

         var17 = new hkl.a($$17, $$18, $$12, $$20, $$19, $$21);
      }

      return var17;
   }

   public static CompletableFuture<List<hkk>> a(hku $$0, List<Function<hku, hkk>> $$1, Executor $$2) {
      List<CompletableFuture<hkk>> $$3 = $$1.stream().map($$2x -> CompletableFuture.supplyAsync(() -> (hkk)$$2x.apply($$0), $$2)).toList();
      return ag.d($$3).thenApply($$0x -> $$0x.stream().filter(Objects::nonNull).toList());
   }

   public CompletableFuture<hkl.a> a(avo $$0, alr $$1, int $$2, Executor $$3) {
      return this.a($$0, $$1, $$2, $$3, a);
   }

   public CompletableFuture<hkl.a> a(avo $$0, alr $$1, int $$2, Executor $$3, Collection<aun<?>> $$4) {
      hku $$5 = hku.create($$4);
      return CompletableFuture.<List<Function<hku, hkk>>>supplyAsync(() -> hkw.a($$0, $$1).a($$0), $$3)
         .thenCompose($$2x -> a($$5, $$2x, $$3))
         .thenApply($$2x -> this.a($$2x, $$2, $$3));
   }

   private Map<alr, hkq> a(hkn<hkk> $$0, int $$1, int $$2) {
      Map<alr, hkq> $$3 = new HashMap<>();
      $$0.a(($$3x, $$4, $$5) -> $$3.put($$3x.c(), new hkq(this.c, $$3x, $$1, $$2, $$4, $$5)));
      return $$3;
   }

   public static record a(int a, int b, int c, hkq d, Map<alr, hkq> e, CompletableFuture<Void> f) {
      public CompletableFuture<hkl.a> a() {
         return this.f.thenApply($$0 -> this);
      }

      public int b() {
         return this.a;
      }

      public int c() {
         return this.b;
      }

      public int d() {
         return this.c;
      }

      public hkq e() {
         return this.d;
      }

      public Map<alr, hkq> f() {
         return this.e;
      }

      public CompletableFuture<Void> g() {
         return this.f;
      }
   }
}

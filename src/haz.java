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

public class haz {
   public static final Set<aut<?>> a = Set.of(hcq.a);
   private static final Logger b = LogUtils.getLogger();
   private final alz c;
   private final int d;
   private final int e;
   private final int f;

   public haz(alz $$0, int $$1, int $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static haz a(hbd $$0) {
      return new haz($$0.h(), $$0.i(), $$0.j(), $$0.k());
   }

   public haz.a a(List<hay> $$0, int $$1, Executor $$2) {
      int $$3 = this.d;
      hbb<hay> $$4 = new hbb<>($$3, $$3, $$1);
      int $$5 = Integer.MAX_VALUE;
      int $$6 = 1 << $$1;

      for (hay $$7 : $$0) {
         $$5 = Math.min($$5, Math.min($$7.a(), $$7.b()));
         int $$8 = Math.min(Integer.lowestOneBit($$7.a()), Integer.lowestOneBit($$7.b()));
         if ($$8 < $$6) {
            b.warn("Texture {} with size {}x{} limits mip level from {} to {}", new Object[]{$$7.c(), $$7.a(), $$7.b(), bae.f($$6), bae.f($$8)});
            $$6 = $$8;
         }

         $$4.a($$7);
      }

      int $$9 = Math.min($$5, $$6);
      int $$10 = bae.f($$9);
      int $$11;
      if ($$10 < $$1) {
         b.warn("{}: dropping miplevel from {} to {}, because of minimum power of two: {}", new Object[]{this.c, $$1, $$10, $$9});
         $$11 = $$10;
      } else {
         $$11 = $$1;
      }

      try {
         $$4.c();
      } catch (hbc var16) {
         o $$14 = o.a(var16, "Stitching");
         p $$15 = $$14.a("Stitcher");
         $$15.a(
            "Sprites", var16.a().stream().map($$0x -> String.format(Locale.ROOT, "%s[%dx%d]", $$0x.c(), $$0x.a(), $$0x.b())).collect(Collectors.joining(","))
         );
         $$15.a("Max Texture Size", $$3);
         throw new z($$14);
      }

      int $$16 = Math.max($$4.a(), this.e);
      int $$17 = Math.max($$4.b(), this.f);
      Map<alz, hbe> $$18 = this.a($$4, $$16, $$17);
      hbe $$19 = $$18.get(hau.b());
      CompletableFuture<Void> $$20;
      if ($$11 > 0) {
         $$20 = CompletableFuture.runAsync(() -> $$18.values().forEach($$1xx -> $$1xx.e().a($$11)), $$2);
      } else {
         $$20 = CompletableFuture.completedFuture(null);
      }

      return new haz.a($$16, $$17, $$11, $$19, $$18, $$20);
   }

   public static CompletableFuture<List<hay>> a(hbh $$0, List<Function<hbh, hay>> $$1, Executor $$2) {
      List<CompletableFuture<hay>> $$3 = $$1.stream().map($$2x -> CompletableFuture.supplyAsync(() -> (hay)$$2x.apply($$0), $$2)).toList();
      return ae.d($$3).thenApply($$0x -> $$0x.stream().filter(Objects::nonNull).toList());
   }

   public CompletableFuture<haz.a> a(avv $$0, alz $$1, int $$2, Executor $$3) {
      return this.a($$0, $$1, $$2, $$3, a);
   }

   public CompletableFuture<haz.a> a(avv $$0, alz $$1, int $$2, Executor $$3, Collection<aut<?>> $$4) {
      hbh $$5 = hbh.create($$4);
      return CompletableFuture.<List<Function<hbh, hay>>>supplyAsync(() -> hbj.a($$0, $$1).a($$0), $$3)
         .thenCompose($$2x -> a($$5, $$2x, $$3))
         .thenApply($$2x -> this.a($$2x, $$2, $$3));
   }

   private Map<alz, hbe> a(hbb<hay> $$0, int $$1, int $$2) {
      Map<alz, hbe> $$3 = new HashMap<>();
      $$0.a(($$3x, $$4, $$5) -> $$3.put($$3x.c(), new hbe(this.c, $$3x, $$1, $$2, $$4, $$5)));
      return $$3;
   }

   public static record a(int a, int b, int c, hbe d, Map<alz, hbe> e, CompletableFuture<Void> f) {
      public CompletableFuture<haz.a> a() {
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

      public hbe e() {
         return this.d;
      }

      public Map<alz, hbe> f() {
         return this.e;
      }

      public CompletableFuture<Void> g() {
         return this.f;
      }
   }
}

import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fuq {
   private static final Logger a = LogUtils.getLogger();
   private final acq b;
   private final int c;
   private final int d;
   private final int e;

   public fuq(acq $$0, int $$1, int $$2, int $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public static fuq a(fuu $$0) {
      return new fuq($$0.g(), $$0.h(), $$0.i(), $$0.j());
   }

   public fuq.a a(List<fup> $$0, int $$1, Executor $$2) {
      int $$3 = this.c;
      fus<fup> $$4 = new fus<>($$3, $$3, $$1);
      int $$5 = Integer.MAX_VALUE;
      int $$6 = 1 << $$1;

      for (fup $$7 : $$0) {
         $$5 = Math.min($$5, Math.min($$7.a(), $$7.b()));
         int $$8 = Math.min(Integer.lowestOneBit($$7.a()), Integer.lowestOneBit($$7.b()));
         if ($$8 < $$6) {
            a.warn("Texture {} with size {}x{} limits mip level from {} to {}", new Object[]{$$7.c(), $$7.a(), $$7.b(), apa.f($$6), apa.f($$8)});
            $$6 = $$8;
         }

         $$4.a($$7);
      }

      int $$9 = Math.min($$5, $$6);
      int $$10 = apa.f($$9);
      int $$11;
      if ($$10 < $$1) {
         a.warn("{}: dropping miplevel from {} to {}, because of minimum power of two: {}", new Object[]{this.b, $$1, $$10, $$9});
         $$11 = $$10;
      } else {
         $$11 = $$1;
      }

      try {
         $$4.c();
      } catch (fut var16) {
         o $$14 = o.a(var16, "Stitching");
         p $$15 = $$14.a("Stitcher");
         $$15.a(
            "Sprites", var16.a().stream().map($$0x -> String.format(Locale.ROOT, "%s[%dx%d]", $$0x.c(), $$0x.a(), $$0x.b())).collect(Collectors.joining(","))
         );
         $$15.a("Max Texture Size", $$3);
         throw new y($$14);
      }

      int $$16 = Math.max($$4.a(), this.d);
      int $$17 = Math.max($$4.b(), this.e);
      Map<acq, fuv> $$18 = this.a($$4, $$16, $$17);
      fuv $$19 = $$18.get(ful.b());
      CompletableFuture<Void> $$20;
      if ($$11 > 0) {
         $$20 = CompletableFuture.runAsync(() -> $$18.values().forEach($$1xx -> $$1xx.e().a($$11)), $$2);
      } else {
         $$20 = CompletableFuture.completedFuture(null);
      }

      return new fuq.a($$16, $$17, $$11, $$19, $$18, $$20);
   }

   public static CompletableFuture<List<fup>> a(List<Supplier<fup>> $$0, Executor $$1) {
      List<CompletableFuture<fup>> $$2 = $$0.stream().map($$1x -> CompletableFuture.supplyAsync($$1x, $$1)).toList();
      return ac.b($$2).thenApply($$0x -> $$0x.stream().filter(Objects::nonNull).toList());
   }

   public CompletableFuture<fuq.a> a(akx $$0, acq $$1, int $$2, Executor $$3) {
      return CompletableFuture.<List<Supplier<fup>>>supplyAsync(() -> fuy.a($$0, $$1).a($$0), $$3)
         .thenCompose($$1x -> a($$1x, $$3))
         .thenApply($$2x -> this.a($$2x, $$2, $$3));
   }

   @Nullable
   public static fup a(acq $$0, akv $$1) {
      fwe $$2;
      try {
         $$2 = $$1.f().a(fwe.a).orElse(fwe.e);
      } catch (Exception var8) {
         a.error("Unable to parse metadata from {}", $$0, var8);
         return null;
      }

      ehk $$6;
      try (InputStream $$5 = $$1.d()) {
         $$6 = ehk.a($$5);
      } catch (IOException var10) {
         a.error("Using missing texture, unable to load {}", $$0, var10);
         return null;
      }

      fwg $$10 = $$2.a($$6.a(), $$6.b());
      if (apa.c($$6.a(), $$10.a()) && apa.c($$6.b(), $$10.b())) {
         return new fup($$0, $$10, $$6, $$2);
      } else {
         a.error("Image {} size {},{} is not multiple of frame size {},{}", new Object[]{$$0, $$6.a(), $$6.b(), $$10.a(), $$10.b()});
         $$6.close();
         return null;
      }
   }

   private Map<acq, fuv> a(fus<fup> $$0, int $$1, int $$2) {
      Map<acq, fuv> $$3 = new HashMap<>();
      $$0.a(($$3x, $$4, $$5) -> $$3.put($$3x.c(), new fuv(this.b, $$3x, $$1, $$2, $$4, $$5)));
      return $$3;
   }

   public static record a(int a, int b, int c, fuv d, Map<acq, fuv> e, CompletableFuture<Void> f) {
      public CompletableFuture<fuq.a> a() {
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

      public fuv e() {
         return this.d;
      }

      public Map<acq, fuv> f() {
         return this.e;
      }

      public CompletableFuture<Void> g() {
         return this.f;
      }
   }
}

import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.Lifecycle;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fvo {
   private static final Logger a = LogUtils.getLogger();
   private static final UUID b = UUID.fromString("640a6a92-b6cb-48a0-b391-831586500359");
   private final fip c;
   private final esz d;

   public fvo(fip $$0, esz $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(String $$0, den $$1, ebm $$2, Function<jq.a, ebj> $$3, fqh $$4) {
      this.c.d(new fps(xe.c("selectWorld.data_read")));
      esz.c $$5 = this.a($$0);
      if ($$5 != null) {
         aug $$6 = auj.a($$5);
         dff $$7 = $$1.g();

         try {
            amc.d $$8 = new amc.d($$6, $$7, false, false);
            amd $$9 = this.a($$8, $$3x -> {
               ebj.b $$4x = $$3.apply($$3x.c()).a($$3x.d().e(lw.bd));
               return new amc.b<>(new etd($$1, $$2, $$4x.d(), $$4x.a()), $$4x.b());
            }, amd::new);
            this.c.a($$5, $$6, $$9, true);
         } catch (Exception var11) {
            a.warn("Failed to load datapacks, can't proceed with server load", var11);
            $$5.c();
            this.c.a($$4);
         }
      }
   }

   @Nullable
   private esz.c a(String $$0) {
      try {
         return this.d.d($$0);
      } catch (IOException var3) {
         a.warn("Failed to read level {} data", $$0, var3);
         fmx.a(this.c, $$0);
         this.c.a(null);
         return null;
      } catch (eyl var4) {
         a.warn("{}", var4.getMessage());
         this.c.a(fpz.a(() -> this.c.a(null)));
         return null;
      }
   }

   public void a(esz.c $$0, alp $$1, jv<aln> $$2, etf $$3) {
      aug $$4 = auj.a($$0);
      aul $$5 = (aul)new amc.d($$4, $$3.D(), false, false).a().getSecond();
      this.c.a($$0, $$4, new amd($$5, $$1, $$2, $$3), true);
   }

   public amd a(Dynamic<?> $$0, boolean $$1, aug $$2) throws Exception {
      amc.d $$3 = esz.a($$0, $$2, $$1);
      return this.a($$3, $$1x -> {
         kb<dyp> $$2x = $$1x.d().e(lw.bd);
         esw $$3x = esz.a($$0, $$1x.b(), $$2x, $$1x.c());
         return new amc.b<>($$3x.a(), $$3x.b().b());
      }, amd::new);
   }

   public Pair<den, fvm> a(esz.c $$0) throws Exception {
      aug $$1 = auj.a($$0);
      Dynamic<?> $$2 = $$0.h();
      amc.d $$3 = esz.a($$2, $$1, false);

      record a(den a, ebm b, kb<dyp> c) {
      }

      return this.a($$3, $$1x -> {
         kb<dyp> $$2x = new jw<>(lw.bd, Lifecycle.stable()).n();
         esw $$3x = esz.a($$2, $$1x.b(), $$2x, $$1x.c());
         return new amc.b<>(new a($$3x.a().J(), $$3x.a().y(), $$3x.b().c()), $$1x.d());
      }, ($$0x, $$1x, $$2x, $$3x) -> {
         $$0x.close();
         return Pair.of($$3x.a, new fvm($$3x.b, new ebj($$3x.c), $$2x, $$1x, $$3x.a.g()));
      });
   }

   private <D, R> R a(amc.d $$0, amc.f<D> $$1, amc.e<D, R> $$2) throws Exception {
      amc.c $$3 = new amc.c($$0, ev.a.c, 2);
      CompletableFuture<R> $$4 = amc.a($$3, $$1, $$2, ad.g(), this.c);
      this.c.b($$4::isDone);
      return $$4.get();
   }

   private void a(esz.c $$0, boolean $$1, Runnable $$2, Runnable $$3) {
      xe $$4;
      xe $$5;
      if ($$1) {
         $$4 = xe.c("selectWorld.backupQuestion.customized");
         $$5 = xe.c("selectWorld.backupWarning.customized");
      } else {
         $$4 = xe.c("selectWorld.backupQuestion.experimental");
         $$5 = xe.c("selectWorld.backupWarning.experimental");
      }

      this.c.a(new fpb($$3, ($$2x, $$3x) -> {
         if ($$2x) {
            fvg.a($$0);
         }

         $$2.run();
      }, $$4, $$5, false));
   }

   public static void a(fip $$0, fve $$1, Lifecycle $$2, Runnable $$3, boolean $$4) {
      BooleanConsumer $$5 = $$3x -> {
         if ($$3x) {
            $$3.run();
         } else {
            $$0.a($$1);
         }
      };
      if ($$4 || $$2 == Lifecycle.stable()) {
         $$3.run();
      } else if ($$2 == Lifecycle.experimental()) {
         $$0.a(new fpf($$5, xe.c("selectWorld.warning.experimental.title"), xe.c("selectWorld.warning.experimental.question")));
      } else {
         $$0.a(new fpf($$5, xe.c("selectWorld.warning.deprecated.title"), xe.c("selectWorld.warning.deprecated.question")));
      }
   }

   public void a(String $$0, Runnable $$1) {
      this.c.d(new fps(xe.c("selectWorld.data_read")));
      esz.c $$2 = this.a($$0);
      if ($$2 != null) {
         this.a($$2, $$1);
      }
   }

   private void a(esz.c $$0, Runnable $$1) {
      this.c.d(new fps(xe.c("selectWorld.data_read")));

      Dynamic<?> $$2;
      eta $$3;
      try {
         $$2 = $$0.h();
         $$3 = $$0.a($$2);
      } catch (ur | ux | IOException var10) {
         this.c.a(new fqg(this.c, $$2x -> {
            if ($$2x) {
               this.a($$0, $$1);
            } else {
               $$0.c();
               $$1.run();
            }
         }, $$0));
         return;
      } catch (OutOfMemoryError var11) {
         azd.b();
         System.gc();
         String $$6 = "Ran out of memory trying to read level data of world folder \"" + $$0.f() + "\"";
         a.error(LogUtils.FATAL_MARKER, $$6);
         OutOfMemoryError $$7 = new OutOfMemoryError("Ran out of memory reading level data");
         $$7.initCause(var11);
         o $$8 = o.a($$7, $$6);
         p $$9 = $$8.a("World details");
         $$9.a("World folder", $$0.f());
         throw new z($$8);
      }

      this.a($$0, $$3, $$2, $$1);
   }

   private void a(esz.c $$0, eta $$1, Dynamic<?> $$2, Runnable $$3) {
      if (!$$1.r()) {
         $$0.c();
         this.c.a(new fpa($$3, xe.c("selectWorld.incompatible.title").b(-65536), xe.a("selectWorld.incompatible.description", $$1.k())));
      } else {
         eta.a $$4 = $$1.o();
         if ($$4.a()) {
            String $$5 = "selectWorld.backupQuestion." + $$4.c();
            String $$6 = "selectWorld.backupWarning." + $$4.c();
            xs $$7 = xe.c($$5);
            if ($$4.b()) {
               $$7.b(-2142128);
            }

            xe $$8 = xe.a($$6, $$1.k(), ab.b().c());
            this.c.a(new fpb(() -> {
               $$0.c();
               $$3.run();
            }, ($$3x, $$4x) -> {
               if ($$3x) {
                  fvg.a($$0);
               }

               this.a($$0, $$2, false, $$3);
            }, $$7, $$8, false));
         } else {
            this.a($$0, $$2, false, $$3);
         }
      }
   }

   private void a(esz.c $$0, Dynamic<?> $$1, boolean $$2, Runnable $$3) {
      this.c.d(new fps(xe.c("selectWorld.resource_load")));
      aug $$4 = auj.a($$0);

      amd $$5;
      try {
         $$5 = this.a($$1, $$2, $$4);

         for (dyp $$6 : $$5.c().a().e(lw.bd)) {
            $$6.b().a();
         }
      } catch (Exception var9) {
         a.warn("Failed to load level data or datapacks, can't proceed with server load", var9);
         if (!$$2) {
            this.c.a(new fpk(() -> {
               $$0.c();
               $$3.run();
            }, () -> this.a($$0, $$1, true, $$3)));
         } else {
            $$0.c();
            this.c.a(new fpa($$3, xe.c("datapackFailure.safeMode.failed.title"), xe.c("datapackFailure.safeMode.failed.description"), xd.k, true));
         }

         return;
      }

      this.a($$0, $$5, $$4, $$3);
   }

   private void a(esz.c $$0, amd $$1, aug $$2, Runnable $$3) {
      etf $$4 = $$1.d();
      boolean $$5 = $$4.y().e();
      boolean $$6 = $$4.B() != Lifecycle.stable();
      if (!$$5 && !$$6) {
         this.b($$0, $$1, $$2, $$3);
      } else {
         this.a($$0, $$5, () -> this.b($$0, $$1, $$2, $$3), () -> {
            $$1.close();
            $$0.c();
            $$3.run();
         });
      }
   }

   private void b(esz.c $$0, amd $$1, aug $$2, Runnable $$3) {
      hac $$4 = this.c.af();
      this.a($$4, $$0).thenApply($$0x -> true).exceptionallyComposeAsync($$0x -> {
         a.warn("Failed to load pack: ", $$0x);
         return this.a();
      }, this.c).thenAcceptAsync($$5 -> {
         if ($$5) {
            this.a($$0, $$1, $$4, $$2, $$3);
         } else {
            $$4.e();
            $$1.close();
            $$0.c();
            $$3.run();
         }
      }, this.c).exceptionally($$0x -> {
         this.c.a(o.a($$0x, "Load world"));
         return null;
      });
   }

   private void a(esz.c $$0, amd $$1, hac $$2, aug $$3, Runnable $$4) {
      if ($$0.b()) {
         this.c.a(new fpf($$5 -> {
            if ($$5) {
               this.a($$0, $$1, $$3);
            } else {
               $$2.e();
               $$1.close();
               $$0.c();
               $$4.run();
            }
         }, xe.c("selectWorld.warning.lowDiskSpace.title").a(n.m), xe.c("selectWorld.warning.lowDiskSpace.description"), xd.j, xd.k));
      } else {
         this.a($$0, $$1, $$3);
      }
   }

   private void a(esz.c $$0, amd $$1, aug $$2) {
      this.c.a($$0, $$2, $$1, false);
   }

   private CompletableFuture<Void> a(hac $$0, esz.c $$1) {
      Path $$2 = $$1.a(esx.k);
      if (Files.exists($$2) && !Files.isDirectory($$2)) {
         $$0.f();
         CompletableFuture<Void> $$3 = $$0.b(b);
         $$0.a(b, $$2);
         return $$3;
      } else {
         return CompletableFuture.completedFuture(null);
      }
   }

   private CompletableFuture<Boolean> a() {
      CompletableFuture<Boolean> $$0 = new CompletableFuture<>();
      this.c.a(new fpf($$0::complete, xe.c("multiplayer.texturePrompt.failure.line1"), xe.c("multiplayer.texturePrompt.failure.line2"), xd.i, xd.e));
      return $$0;
   }
}

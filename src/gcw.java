import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.Lifecycle;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gcw {
   private static final Logger a = LogUtils.getLogger();
   private static final UUID b = UUID.fromString("640a6a92-b6cb-48a0-b391-831586500359");
   private final fof c;
   private final eyb d;

   public gcw(fof $$0, eyb $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(String $$0, dit $$1, egl $$2, Function<jg.a, egi> $$3, fxi $$4) {
      this.c.d(new fwt(ww.c("selectWorld.data_read")));
      eyb.c $$5 = this.a($$0);
      if ($$5 != null) {
         aul $$6 = auo.a($$5);
         djn $$7 = $$1.g();

         try {
            amc.d $$8 = new amc.d($$6, $$7, false, false);
            amd $$9 = this.a($$8, $$3x -> {
               egi.b $$4x = $$3.apply($$3x.c()).a($$3x.d().f(mg.bn));
               return new amc.b<>(new eyf($$1, $$2, $$4x.d(), $$4x.a()), $$4x.b());
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
   private eyb.c a(String $$0) {
      try {
         return this.d.d($$0);
      } catch (IOException var3) {
         a.warn("Failed to read level {} data", $$0, var3);
         ftz.a(this.c, $$0);
         this.c.a(null);
         return null;
      } catch (fdl var4) {
         a.warn("{}", var4.getMessage());
         this.c.a(fxa.a(() -> this.c.a(null)));
         return null;
      }
   }

   public void a(eyb.c $$0, alp $$1, jl<aln> $$2, eyh $$3) {
      aul $$4 = auo.a($$0);
      auq $$5 = (auq)new amc.d($$4, $$3.D(), false, false).a().getSecond();
      this.c.a($$0, $$4, new amd($$5, $$1, $$2, $$3), true);
   }

   public amd a(Dynamic<?> $$0, boolean $$1, aul $$2) throws Exception {
      amc.d $$3 = eyb.a($$0, $$2, $$1);
      return this.a($$3, $$1x -> {
         jr<edm> $$2x = $$1x.d().f(mg.bn);
         exy $$3x = eyb.a($$0, $$1x.b(), $$2x, $$1x.c());
         return new amc.b<>($$3x.a(), $$3x.b().b());
      }, amd::new);
   }

   public Pair<dit, gct> a(eyb.c $$0) throws Exception {
      aul $$1 = auo.a($$0);
      Dynamic<?> $$2 = $$0.h();
      amc.d $$3 = eyb.a($$2, $$1, false);

      record a(dit a, egl b, jr<edm> c) {
      }

      return this.a($$3, $$1x -> {
         jr<edm> $$2x = new jm<>(mg.bn, Lifecycle.stable()).n();
         exy $$3x = eyb.a($$2, $$1x.b(), $$2x, $$1x.c());
         return new amc.b<>(new a($$3x.a().J(), $$3x.a().y(), $$3x.b().c()), $$1x.d());
      }, ($$0x, $$1x, $$2x, $$3x) -> {
         $$0x.close();
         gco $$4 = new gco(gcv.a.a, Set.of(), null);
         return Pair.of($$3x.a, new gct($$3x.b, new egi($$3x.c), $$2x, $$1x, $$3x.a.g(), $$4));
      });
   }

   private <D, R> R a(amc.d $$0, amc.f<D> $$1, amc.e<D, R> $$2) throws Exception {
      amc.c $$3 = new amc.c($$0, ej.a.c, 2);
      CompletableFuture<R> $$4 = amc.a($$3, $$1, $$2, af.h(), this.c);
      this.c.b($$4::isDone);
      return $$4.get();
   }

   private void a(eyb.c $$0, boolean $$1, Runnable $$2, Runnable $$3) {
      ww $$4;
      ww $$5;
      if ($$1) {
         $$4 = ww.c("selectWorld.backupQuestion.customized");
         $$5 = ww.c("selectWorld.backupWarning.customized");
      } else {
         $$4 = ww.c("selectWorld.backupQuestion.experimental");
         $$5 = ww.c("selectWorld.backupWarning.experimental");
      }

      this.c.a(new fwc($$3, ($$2x, $$3x) -> {
         if ($$2x) {
            gcm.a($$0);
         }

         $$2.run();
      }, $$4, $$5, false));
   }

   public static void a(fof $$0, gcj $$1, Lifecycle $$2, Runnable $$3, boolean $$4) {
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
         $$0.a(new fwg($$5, ww.c("selectWorld.warning.experimental.title"), ww.c("selectWorld.warning.experimental.question")));
      } else {
         $$0.a(new fwg($$5, ww.c("selectWorld.warning.deprecated.title"), ww.c("selectWorld.warning.deprecated.question")));
      }
   }

   public void a(String $$0, Runnable $$1) {
      this.c.d(new fwt(ww.c("selectWorld.data_read")));
      eyb.c $$2 = this.a($$0);
      if ($$2 != null) {
         this.a($$2, $$1);
      }
   }

   private void a(eyb.c $$0, Runnable $$1) {
      this.c.d(new fwt(ww.c("selectWorld.data_read")));

      Dynamic<?> $$2;
      eyc $$3;
      try {
         $$2 = $$0.h();
         $$3 = $$0.a($$2);
      } catch (ui | uo | IOException var10) {
         this.c.a(new fxh(this.c, $$2x -> {
            if ($$2x) {
               this.a($$0, $$1);
            } else {
               $$0.c();
               $$1.run();
            }
         }, $$0));
         return;
      } catch (OutOfMemoryError var11) {
         azi.b();
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

   private void a(eyb.c $$0, eyc $$1, Dynamic<?> $$2, Runnable $$3) {
      if (!$$1.r()) {
         $$0.c();
         this.c.a(new fwb($$3, ww.c("selectWorld.incompatible.title").b(-65536), ww.a("selectWorld.incompatible.description", $$1.k())));
      } else {
         eyc.a $$4 = $$1.o();
         if ($$4.a()) {
            String $$5 = "selectWorld.backupQuestion." + $$4.c();
            String $$6 = "selectWorld.backupWarning." + $$4.c();
            xk $$7 = ww.c($$5);
            if ($$4.b()) {
               $$7.b(-2142128);
            }

            ww $$8 = ww.a($$6, $$1.k(), ab.b().c());
            this.c.a(new fwc(() -> {
               $$0.c();
               $$3.run();
            }, ($$3x, $$4x) -> {
               if ($$3x) {
                  gcm.a($$0);
               }

               this.a($$0, $$2, false, $$3);
            }, $$7, $$8, false));
         } else {
            this.a($$0, $$2, false, $$3);
         }
      }
   }

   private void a(eyb.c $$0, Dynamic<?> $$1, boolean $$2, Runnable $$3) {
      this.c.d(new fwt(ww.c("selectWorld.resource_load")));
      aul $$4 = auo.a($$0);

      amd $$5;
      try {
         $$5 = this.a($$1, $$2, $$4);

         for (edm $$6 : $$5.c().a().f(mg.bn)) {
            $$6.b().a();
         }
      } catch (Exception var9) {
         a.warn("Failed to load level data or datapacks, can't proceed with server load", var9);
         if (!$$2) {
            this.c.a(new fwl(() -> {
               $$0.c();
               $$3.run();
            }, () -> this.a($$0, $$1, true, $$3)));
         } else {
            $$0.c();
            this.c.a(new fwb($$3, ww.c("datapackFailure.safeMode.failed.title"), ww.c("datapackFailure.safeMode.failed.description"), wv.k, true));
         }

         return;
      }

      this.a($$0, $$5, $$4, $$3);
   }

   private void a(eyb.c $$0, amd $$1, aul $$2, Runnable $$3) {
      eyh $$4 = $$1.d();
      boolean $$5 = $$4.y().f();
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

   private void b(eyb.c $$0, amd $$1, aul $$2, Runnable $$3) {
      hky $$4 = this.c.af();
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

   private void a(eyb.c $$0, amd $$1, hky $$2, aul $$3, Runnable $$4) {
      if ($$0.b()) {
         this.c.a(new fwg($$5 -> {
            if ($$5) {
               this.a($$0, $$1, $$3);
            } else {
               $$2.e();
               $$1.close();
               $$0.c();
               $$4.run();
            }
         }, ww.c("selectWorld.warning.lowDiskSpace.title").a(n.m), ww.c("selectWorld.warning.lowDiskSpace.description"), wv.j, wv.k));
      } else {
         this.a($$0, $$1, $$3);
      }
   }

   private void a(eyb.c $$0, amd $$1, aul $$2) {
      this.c.a($$0, $$2, $$1, false);
   }

   private CompletableFuture<Void> a(hky $$0, eyb.c $$1) {
      Path $$2 = $$1.a(exz.k);
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
      this.c.a(new fwg($$0::complete, ww.c("multiplayer.texturePrompt.failure.line1"), ww.c("multiplayer.texturePrompt.failure.line2"), wv.i, wv.e));
      return $$0;
   }
}

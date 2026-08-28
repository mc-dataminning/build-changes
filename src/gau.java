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

public class gau {
   private static final Logger a = LogUtils.getLogger();
   private static final UUID b = UUID.fromString("640a6a92-b6cb-48a0-b391-831586500359");
   private final fmg c;
   private final ewc d;

   public gau(fmg $$0, ewc $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(String $$0, dhd $$1, eem $$2, Function<jt.a, eej> $$3, fvi $$4) {
      this.c.d(new fut(wp.c("selectWorld.data_read")));
      ewc.c $$5 = this.a($$0);
      if ($$5 != null) {
         aua $$6 = aud.a($$5);
         dhx $$7 = $$1.g();

         try {
            als.d $$8 = new als.d($$6, $$7, false, false);
            alt $$9 = this.a($$8, $$3x -> {
               eej.b $$4x = $$3.apply($$3x.c()).a($$3x.d().e(mc.bh));
               return new als.b<>(new ewg($$1, $$2, $$4x.d(), $$4x.a()), $$4x.b());
            }, alt::new);
            this.c.a($$5, $$6, $$9, true);
         } catch (Exception var11) {
            a.warn("Failed to load datapacks, can't proceed with server load", var11);
            $$5.c();
            this.c.a($$4);
         }
      }
   }

   @Nullable
   private ewc.c a(String $$0) {
      try {
         return this.d.d($$0);
      } catch (IOException var3) {
         a.warn("Failed to read level {} data", $$0, var3);
         frz.a(this.c, $$0);
         this.c.a(null);
         return null;
      } catch (fbm var4) {
         a.warn("{}", var4.getMessage());
         this.c.a(fva.a(() -> this.c.a(null)));
         return null;
      }
   }

   public void a(ewc.c $$0, alf $$1, jy<ald> $$2, ewi $$3) {
      aua $$4 = aud.a($$0);
      auf $$5 = (auf)new als.d($$4, $$3.D(), false, false).a().getSecond();
      this.c.a($$0, $$4, new alt($$5, $$1, $$2, $$3), true);
   }

   public alt a(Dynamic<?> $$0, boolean $$1, aua $$2) throws Exception {
      als.d $$3 = ewc.a($$0, $$2, $$1);
      return this.a($$3, $$1x -> {
         ke<ebn> $$2x = $$1x.d().e(mc.bh);
         evz $$3x = ewc.a($$0, $$1x.b(), $$2x, $$1x.c());
         return new als.b<>($$3x.a(), $$3x.b().b());
      }, alt::new);
   }

   public Pair<dhd, gar> a(ewc.c $$0) throws Exception {
      aua $$1 = aud.a($$0);
      Dynamic<?> $$2 = $$0.h();
      als.d $$3 = ewc.a($$2, $$1, false);

      record a(dhd a, eem b, ke<ebn> c) {
      }

      return this.a($$3, $$1x -> {
         ke<ebn> $$2x = new jz<>(mc.bh, Lifecycle.stable()).n();
         evz $$3x = ewc.a($$2, $$1x.b(), $$2x, $$1x.c());
         return new als.b<>(new a($$3x.a().J(), $$3x.a().y(), $$3x.b().c()), $$1x.d());
      }, ($$0x, $$1x, $$2x, $$3x) -> {
         $$0x.close();
         gam $$4 = new gam(gat.a.a, Set.of(), null);
         return Pair.of($$3x.a, new gar($$3x.b, new eej($$3x.c), $$2x, $$1x, $$3x.a.g(), $$4));
      });
   }

   private <D, R> R a(als.d $$0, als.f<D> $$1, als.e<D, R> $$2) throws Exception {
      als.c $$3 = new als.c($$0, ey.a.c, 2);
      CompletableFuture<R> $$4 = als.a($$3, $$1, $$2, af.h(), this.c);
      this.c.b($$4::isDone);
      return $$4.get();
   }

   private void a(ewc.c $$0, boolean $$1, Runnable $$2, Runnable $$3) {
      wp $$4;
      wp $$5;
      if ($$1) {
         $$4 = wp.c("selectWorld.backupQuestion.customized");
         $$5 = wp.c("selectWorld.backupWarning.customized");
      } else {
         $$4 = wp.c("selectWorld.backupQuestion.experimental");
         $$5 = wp.c("selectWorld.backupWarning.experimental");
      }

      this.c.a(new fuc($$3, ($$2x, $$3x) -> {
         if ($$2x) {
            gak.a($$0);
         }

         $$2.run();
      }, $$4, $$5, false));
   }

   public static void a(fmg $$0, gah $$1, Lifecycle $$2, Runnable $$3, boolean $$4) {
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
         $$0.a(new fug($$5, wp.c("selectWorld.warning.experimental.title"), wp.c("selectWorld.warning.experimental.question")));
      } else {
         $$0.a(new fug($$5, wp.c("selectWorld.warning.deprecated.title"), wp.c("selectWorld.warning.deprecated.question")));
      }
   }

   public void a(String $$0, Runnable $$1) {
      this.c.d(new fut(wp.c("selectWorld.data_read")));
      ewc.c $$2 = this.a($$0);
      if ($$2 != null) {
         this.a($$2, $$1);
      }
   }

   private void a(ewc.c $$0, Runnable $$1) {
      this.c.d(new fut(wp.c("selectWorld.data_read")));

      Dynamic<?> $$2;
      ewd $$3;
      try {
         $$2 = $$0.h();
         $$3 = $$0.a($$2);
      } catch (ub | uh | IOException var10) {
         this.c.a(new fvh(this.c, $$2x -> {
            if ($$2x) {
               this.a($$0, $$1);
            } else {
               $$0.c();
               $$1.run();
            }
         }, $$0));
         return;
      } catch (OutOfMemoryError var11) {
         ayx.b();
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

   private void a(ewc.c $$0, ewd $$1, Dynamic<?> $$2, Runnable $$3) {
      if (!$$1.r()) {
         $$0.c();
         this.c.a(new fub($$3, wp.c("selectWorld.incompatible.title").b(-65536), wp.a("selectWorld.incompatible.description", $$1.k())));
      } else {
         ewd.a $$4 = $$1.o();
         if ($$4.a()) {
            String $$5 = "selectWorld.backupQuestion." + $$4.c();
            String $$6 = "selectWorld.backupWarning." + $$4.c();
            xd $$7 = wp.c($$5);
            if ($$4.b()) {
               $$7.b(-2142128);
            }

            wp $$8 = wp.a($$6, $$1.k(), ab.b().c());
            this.c.a(new fuc(() -> {
               $$0.c();
               $$3.run();
            }, ($$3x, $$4x) -> {
               if ($$3x) {
                  gak.a($$0);
               }

               this.a($$0, $$2, false, $$3);
            }, $$7, $$8, false));
         } else {
            this.a($$0, $$2, false, $$3);
         }
      }
   }

   private void a(ewc.c $$0, Dynamic<?> $$1, boolean $$2, Runnable $$3) {
      this.c.d(new fut(wp.c("selectWorld.resource_load")));
      aua $$4 = aud.a($$0);

      alt $$5;
      try {
         $$5 = this.a($$1, $$2, $$4);

         for (ebn $$6 : $$5.c().a().e(mc.bh)) {
            $$6.b().a();
         }
      } catch (Exception var9) {
         a.warn("Failed to load level data or datapacks, can't proceed with server load", var9);
         if (!$$2) {
            this.c.a(new ful(() -> {
               $$0.c();
               $$3.run();
            }, () -> this.a($$0, $$1, true, $$3)));
         } else {
            $$0.c();
            this.c.a(new fub($$3, wp.c("datapackFailure.safeMode.failed.title"), wp.c("datapackFailure.safeMode.failed.description"), wo.k, true));
         }

         return;
      }

      this.a($$0, $$5, $$4, $$3);
   }

   private void a(ewc.c $$0, alt $$1, aua $$2, Runnable $$3) {
      ewi $$4 = $$1.d();
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

   private void b(ewc.c $$0, alt $$1, aua $$2, Runnable $$3) {
      hiq $$4 = this.c.af();
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

   private void a(ewc.c $$0, alt $$1, hiq $$2, aua $$3, Runnable $$4) {
      if ($$0.b()) {
         this.c.a(new fug($$5 -> {
            if ($$5) {
               this.a($$0, $$1, $$3);
            } else {
               $$2.e();
               $$1.close();
               $$0.c();
               $$4.run();
            }
         }, wp.c("selectWorld.warning.lowDiskSpace.title").a(n.m), wp.c("selectWorld.warning.lowDiskSpace.description"), wo.j, wo.k));
      } else {
         this.a($$0, $$1, $$3);
      }
   }

   private void a(ewc.c $$0, alt $$1, aua $$2) {
      this.c.a($$0, $$2, $$1, false);
   }

   private CompletableFuture<Void> a(hiq $$0, ewc.c $$1) {
      Path $$2 = $$1.a(ewa.k);
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
      this.c.a(new fug($$0::complete, wp.c("multiplayer.texturePrompt.failure.line1"), wp.c("multiplayer.texturePrompt.failure.line2"), wo.i, wo.e));
      return $$0;
   }
}

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

public class fzd {
   private static final Logger a = LogUtils.getLogger();
   private static final UUID b = UUID.fromString("640a6a92-b6cb-48a0-b391-831586500359");
   private final flz c;
   private final evw d;

   public fzd(flz $$0, evw $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(String $$0, dhd $$1, eeh $$2, Function<js.a, eee> $$3, ftr $$4) {
      this.c.d(new ftc(xk.c("selectWorld.data_read")));
      evw.c $$5 = this.a($$0);
      if ($$5 != null) {
         auv $$6 = auz.a($$5);
         dhw $$7 = $$1.g();

         try {
            amn.d $$8 = new amn.d($$6, $$7, false, false);
            amo $$9 = this.a($$8, $$3x -> {
               eee.b $$4x = $$3.apply($$3x.c()).a($$3x.d().e(mb.bf));
               return new amn.b<>(new ewa($$1, $$2, $$4x.d(), $$4x.a()), $$4x.b());
            }, amo::new);
            this.c.a($$5, $$6, $$9, true);
         } catch (Exception var11) {
            a.warn("Failed to load datapacks, can't proceed with server load", var11);
            $$5.c();
            this.c.a($$4);
         }
      }
   }

   @Nullable
   private evw.c a(String $$0) {
      try {
         return this.d.d($$0);
      } catch (IOException var3) {
         a.warn("Failed to read level {} data", $$0, var3);
         fqi.a(this.c, $$0);
         this.c.a(null);
         return null;
      } catch (fbg var4) {
         a.warn("{}", var4.getMessage());
         this.c.a(ftj.a(() -> this.c.a(null)));
         return null;
      }
   }

   public void a(evw.c $$0, ama $$1, jx<aly> $$2, ewc $$3) {
      auv $$4 = auz.a($$0);
      avb $$5 = (avb)new amn.d($$4, $$3.D(), false, false).a().getSecond();
      this.c.a($$0, $$4, new amo($$5, $$1, $$2, $$3), true);
   }

   public amo a(Dynamic<?> $$0, boolean $$1, auv $$2) throws Exception {
      amn.d $$3 = evw.a($$0, $$2, $$1);
      return this.a($$3, $$1x -> {
         kd<ebk> $$2x = $$1x.d().e(mb.bf);
         evt $$3x = evw.a($$0, $$1x.b(), $$2x, $$1x.c());
         return new amn.b<>($$3x.a(), $$3x.b().b());
      }, amo::new);
   }

   public Pair<dhd, fza> a(evw.c $$0) throws Exception {
      auv $$1 = auz.a($$0);
      Dynamic<?> $$2 = $$0.h();
      amn.d $$3 = evw.a($$2, $$1, false);

      record a(dhd a, eeh b, kd<ebk> c) {
      }

      return this.a($$3, $$1x -> {
         kd<ebk> $$2x = new jy<>(mb.bf, Lifecycle.stable()).n();
         evt $$3x = evw.a($$2, $$1x.b(), $$2x, $$1x.c());
         return new amn.b<>(new a($$3x.a().J(), $$3x.a().y(), $$3x.b().c()), $$1x.d());
      }, ($$0x, $$1x, $$2x, $$3x) -> {
         $$0x.close();
         fyv $$4 = new fyv(fzc.a.a, Set.of(), null);
         return Pair.of($$3x.a, new fza($$3x.b, new eee($$3x.c), $$2x, $$1x, $$3x.a.g(), $$4));
      });
   }

   private <D, R> R a(amn.d $$0, amn.f<D> $$1, amn.e<D, R> $$2) throws Exception {
      amn.c $$3 = new amn.c($$0, ex.a.c, 2);
      CompletableFuture<R> $$4 = amn.a($$3, $$1, $$2, ae.g(), this.c);
      this.c.b($$4::isDone);
      return $$4.get();
   }

   private void a(evw.c $$0, boolean $$1, Runnable $$2, Runnable $$3) {
      xk $$4;
      xk $$5;
      if ($$1) {
         $$4 = xk.c("selectWorld.backupQuestion.customized");
         $$5 = xk.c("selectWorld.backupWarning.customized");
      } else {
         $$4 = xk.c("selectWorld.backupQuestion.experimental");
         $$5 = xk.c("selectWorld.backupWarning.experimental");
      }

      this.c.a(new fsl($$3, ($$2x, $$3x) -> {
         if ($$2x) {
            fyt.a($$0);
         }

         $$2.run();
      }, $$4, $$5, false));
   }

   public static void a(flz $$0, fyq $$1, Lifecycle $$2, Runnable $$3, boolean $$4) {
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
         $$0.a(new fsp($$5, xk.c("selectWorld.warning.experimental.title"), xk.c("selectWorld.warning.experimental.question")));
      } else {
         $$0.a(new fsp($$5, xk.c("selectWorld.warning.deprecated.title"), xk.c("selectWorld.warning.deprecated.question")));
      }
   }

   public void a(String $$0, Runnable $$1) {
      this.c.d(new ftc(xk.c("selectWorld.data_read")));
      evw.c $$2 = this.a($$0);
      if ($$2 != null) {
         this.a($$2, $$1);
      }
   }

   private void a(evw.c $$0, Runnable $$1) {
      this.c.d(new ftc(xk.c("selectWorld.data_read")));

      Dynamic<?> $$2;
      evx $$3;
      try {
         $$2 = $$0.h();
         $$3 = $$0.a($$2);
      } catch (ux | vd | IOException var10) {
         this.c.a(new ftq(this.c, $$2x -> {
            if ($$2x) {
               this.a($$0, $$1);
            } else {
               $$0.c();
               $$1.run();
            }
         }, $$0));
         return;
      } catch (OutOfMemoryError var11) {
         azs.b();
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

   private void a(evw.c $$0, evx $$1, Dynamic<?> $$2, Runnable $$3) {
      if (!$$1.r()) {
         $$0.c();
         this.c.a(new fsk($$3, xk.c("selectWorld.incompatible.title").b(-65536), xk.a("selectWorld.incompatible.description", $$1.k())));
      } else {
         evx.a $$4 = $$1.o();
         if ($$4.a()) {
            String $$5 = "selectWorld.backupQuestion." + $$4.c();
            String $$6 = "selectWorld.backupWarning." + $$4.c();
            xy $$7 = xk.c($$5);
            if ($$4.b()) {
               $$7.b(-2142128);
            }

            xk $$8 = xk.a($$6, $$1.k(), ab.b().c());
            this.c.a(new fsl(() -> {
               $$0.c();
               $$3.run();
            }, ($$3x, $$4x) -> {
               if ($$3x) {
                  fyt.a($$0);
               }

               this.a($$0, $$2, false, $$3);
            }, $$7, $$8, false));
         } else {
            this.a($$0, $$2, false, $$3);
         }
      }
   }

   private void a(evw.c $$0, Dynamic<?> $$1, boolean $$2, Runnable $$3) {
      this.c.d(new ftc(xk.c("selectWorld.resource_load")));
      auv $$4 = auz.a($$0);

      amo $$5;
      try {
         $$5 = this.a($$1, $$2, $$4);

         for (ebk $$6 : $$5.c().a().e(mb.bf)) {
            $$6.b().a();
         }
      } catch (Exception var9) {
         a.warn("Failed to load level data or datapacks, can't proceed with server load", var9);
         if (!$$2) {
            this.c.a(new fsu(() -> {
               $$0.c();
               $$3.run();
            }, () -> this.a($$0, $$1, true, $$3)));
         } else {
            $$0.c();
            this.c.a(new fsk($$3, xk.c("datapackFailure.safeMode.failed.title"), xk.c("datapackFailure.safeMode.failed.description"), xj.k, true));
         }

         return;
      }

      this.a($$0, $$5, $$4, $$3);
   }

   private void a(evw.c $$0, amo $$1, auv $$2, Runnable $$3) {
      ewc $$4 = $$1.d();
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

   private void b(evw.c $$0, amo $$1, auv $$2, Runnable $$3) {
      hef $$4 = this.c.af();
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

   private void a(evw.c $$0, amo $$1, hef $$2, auv $$3, Runnable $$4) {
      if ($$0.b()) {
         this.c.a(new fsp($$5 -> {
            if ($$5) {
               this.a($$0, $$1, $$3);
            } else {
               $$2.e();
               $$1.close();
               $$0.c();
               $$4.run();
            }
         }, xk.c("selectWorld.warning.lowDiskSpace.title").a(n.m), xk.c("selectWorld.warning.lowDiskSpace.description"), xj.j, xj.k));
      } else {
         this.a($$0, $$1, $$3);
      }
   }

   private void a(evw.c $$0, amo $$1, auv $$2) {
      this.c.a($$0, $$2, $$1, false);
   }

   private CompletableFuture<Void> a(hef $$0, evw.c $$1) {
      Path $$2 = $$1.a(evu.k);
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
      this.c.a(new fsp($$0::complete, xk.c("multiplayer.texturePrompt.failure.line1"), xk.c("multiplayer.texturePrompt.failure.line2"), xj.i, xj.e));
      return $$0;
   }
}

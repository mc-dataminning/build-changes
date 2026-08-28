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

public class fwk {
   private static final Logger a = LogUtils.getLogger();
   private static final UUID b = UUID.fromString("640a6a92-b6cb-48a0-b391-831586500359");
   private final fji c;
   private final etq d;

   public fwk(fji $$0, etq $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(String $$0, dff $$1, ecd $$2, Function<js.a, eca> $$3, fra $$4) {
      this.c.d(new fql(xi.c("selectWorld.data_read")));
      etq.c $$5 = this.a($$0);
      if ($$5 != null) {
         aul $$6 = auo.a($$5);
         dfx $$7 = $$1.g();

         try {
            amg.d $$8 = new amg.d($$6, $$7, false, false);
            amh $$9 = this.a($$8, $$3x -> {
               eca.b $$4x = $$3.apply($$3x.c()).a($$3x.d().e(lz.bc));
               return new amg.b<>(new etu($$1, $$2, $$4x.d(), $$4x.a()), $$4x.b());
            }, amh::new);
            this.c.a($$5, $$6, $$9, true);
         } catch (Exception var11) {
            a.warn("Failed to load datapacks, can't proceed with server load", var11);
            $$5.c();
            this.c.a($$4);
         }
      }
   }

   @Nullable
   private etq.c a(String $$0) {
      try {
         return this.d.d($$0);
      } catch (IOException var3) {
         a.warn("Failed to read level {} data", $$0, var3);
         fnq.a(this.c, $$0);
         this.c.a(null);
         return null;
      } catch (ezc var4) {
         a.warn("{}", var4.getMessage());
         this.c.a(fqs.a(() -> this.c.a(null)));
         return null;
      }
   }

   public void a(etq.c $$0, alt $$1, jx<alr> $$2, etw $$3) {
      aul $$4 = auo.a($$0);
      auq $$5 = (auq)new amg.d($$4, $$3.D(), false, false).a().getSecond();
      this.c.a($$0, $$4, new amh($$5, $$1, $$2, $$3), true);
   }

   public amh a(Dynamic<?> $$0, boolean $$1, aul $$2) throws Exception {
      amg.d $$3 = etq.a($$0, $$2, $$1);
      return this.a($$3, $$1x -> {
         kd<dzg> $$2x = $$1x.d().e(lz.bc);
         etn $$3x = etq.a($$0, $$1x.b(), $$2x, $$1x.c());
         return new amg.b<>($$3x.a(), $$3x.b().b());
      }, amh::new);
   }

   public Pair<dff, fwh> a(etq.c $$0) throws Exception {
      aul $$1 = auo.a($$0);
      Dynamic<?> $$2 = $$0.h();
      amg.d $$3 = etq.a($$2, $$1, false);

      record a(dff a, ecd b, kd<dzg> c) {
      }

      return this.a($$3, $$1x -> {
         kd<dzg> $$2x = new jy<>(lz.bc, Lifecycle.stable()).n();
         etn $$3x = etq.a($$2, $$1x.b(), $$2x, $$1x.c());
         return new amg.b<>(new a($$3x.a().J(), $$3x.a().y(), $$3x.b().c()), $$1x.d());
      }, ($$0x, $$1x, $$2x, $$3x) -> {
         $$0x.close();
         fwc $$4 = new fwc(fwj.a.a, Set.of(), null);
         return Pair.of($$3x.a, new fwh($$3x.b, new eca($$3x.c), $$2x, $$1x, $$3x.a.g(), $$4));
      });
   }

   private <D, R> R a(amg.d $$0, amg.f<D> $$1, amg.e<D, R> $$2) throws Exception {
      amg.c $$3 = new amg.c($$0, ex.a.c, 2);
      CompletableFuture<R> $$4 = amg.a($$3, $$1, $$2, ae.g(), this.c);
      this.c.b($$4::isDone);
      return $$4.get();
   }

   private void a(etq.c $$0, boolean $$1, Runnable $$2, Runnable $$3) {
      xi $$4;
      xi $$5;
      if ($$1) {
         $$4 = xi.c("selectWorld.backupQuestion.customized");
         $$5 = xi.c("selectWorld.backupWarning.customized");
      } else {
         $$4 = xi.c("selectWorld.backupQuestion.experimental");
         $$5 = xi.c("selectWorld.backupWarning.experimental");
      }

      this.c.a(new fpu($$3, ($$2x, $$3x) -> {
         if ($$2x) {
            fwa.a($$0);
         }

         $$2.run();
      }, $$4, $$5, false));
   }

   public static void a(fji $$0, fvx $$1, Lifecycle $$2, Runnable $$3, boolean $$4) {
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
         $$0.a(new fpy($$5, xi.c("selectWorld.warning.experimental.title"), xi.c("selectWorld.warning.experimental.question")));
      } else {
         $$0.a(new fpy($$5, xi.c("selectWorld.warning.deprecated.title"), xi.c("selectWorld.warning.deprecated.question")));
      }
   }

   public void a(String $$0, Runnable $$1) {
      this.c.d(new fql(xi.c("selectWorld.data_read")));
      etq.c $$2 = this.a($$0);
      if ($$2 != null) {
         this.a($$2, $$1);
      }
   }

   private void a(etq.c $$0, Runnable $$1) {
      this.c.d(new fql(xi.c("selectWorld.data_read")));

      Dynamic<?> $$2;
      etr $$3;
      try {
         $$2 = $$0.h();
         $$3 = $$0.a($$2);
      } catch (uv | vb | IOException var10) {
         this.c.a(new fqz(this.c, $$2x -> {
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

   private void a(etq.c $$0, etr $$1, Dynamic<?> $$2, Runnable $$3) {
      if (!$$1.r()) {
         $$0.c();
         this.c.a(new fpt($$3, xi.c("selectWorld.incompatible.title").b(-65536), xi.a("selectWorld.incompatible.description", $$1.k())));
      } else {
         etr.a $$4 = $$1.o();
         if ($$4.a()) {
            String $$5 = "selectWorld.backupQuestion." + $$4.c();
            String $$6 = "selectWorld.backupWarning." + $$4.c();
            xw $$7 = xi.c($$5);
            if ($$4.b()) {
               $$7.b(-2142128);
            }

            xi $$8 = xi.a($$6, $$1.k(), ab.b().c());
            this.c.a(new fpu(() -> {
               $$0.c();
               $$3.run();
            }, ($$3x, $$4x) -> {
               if ($$3x) {
                  fwa.a($$0);
               }

               this.a($$0, $$2, false, $$3);
            }, $$7, $$8, false));
         } else {
            this.a($$0, $$2, false, $$3);
         }
      }
   }

   private void a(etq.c $$0, Dynamic<?> $$1, boolean $$2, Runnable $$3) {
      this.c.d(new fql(xi.c("selectWorld.resource_load")));
      aul $$4 = auo.a($$0);

      amh $$5;
      try {
         $$5 = this.a($$1, $$2, $$4);

         for (dzg $$6 : $$5.c().a().e(lz.bc)) {
            $$6.b().a();
         }
      } catch (Exception var9) {
         a.warn("Failed to load level data or datapacks, can't proceed with server load", var9);
         if (!$$2) {
            this.c.a(new fqd(() -> {
               $$0.c();
               $$3.run();
            }, () -> this.a($$0, $$1, true, $$3)));
         } else {
            $$0.c();
            this.c.a(new fpt($$3, xi.c("datapackFailure.safeMode.failed.title"), xi.c("datapackFailure.safeMode.failed.description"), xh.k, true));
         }

         return;
      }

      this.a($$0, $$5, $$4, $$3);
   }

   private void a(etq.c $$0, amh $$1, aul $$2, Runnable $$3) {
      etw $$4 = $$1.d();
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

   private void b(etq.c $$0, amh $$1, aul $$2, Runnable $$3) {
      hbc $$4 = this.c.af();
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

   private void a(etq.c $$0, amh $$1, hbc $$2, aul $$3, Runnable $$4) {
      if ($$0.b()) {
         this.c.a(new fpy($$5 -> {
            if ($$5) {
               this.a($$0, $$1, $$3);
            } else {
               $$2.e();
               $$1.close();
               $$0.c();
               $$4.run();
            }
         }, xi.c("selectWorld.warning.lowDiskSpace.title").a(n.m), xi.c("selectWorld.warning.lowDiskSpace.description"), xh.j, xh.k));
      } else {
         this.a($$0, $$1, $$3);
      }
   }

   private void a(etq.c $$0, amh $$1, aul $$2) {
      this.c.a($$0, $$2, $$1, false);
   }

   private CompletableFuture<Void> a(hbc $$0, etq.c $$1) {
      Path $$2 = $$1.a(eto.k);
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
      this.c.a(new fpy($$0::complete, xi.c("multiplayer.texturePrompt.failure.line1"), xi.c("multiplayer.texturePrompt.failure.line2"), xh.i, xh.e));
      return $$0;
   }
}

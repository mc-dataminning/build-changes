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

public class fxi {
   private static final Logger a = LogUtils.getLogger();
   private static final UUID b = UUID.fromString("640a6a92-b6cb-48a0-b391-831586500359");
   private final fke c;
   private final eub d;

   public fxi(fke $$0, eub $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(String $$0, dfq $$1, eco $$2, Function<js.a, ecl> $$3, frw $$4) {
      this.c.d(new frh(xj.c("selectWorld.data_read")));
      eub.c $$5 = this.a($$0);
      if ($$5 != null) {
         aun $$6 = auq.a($$5);
         dgj $$7 = $$1.g();

         try {
            amh.d $$8 = new amh.d($$6, $$7, false, false);
            ami $$9 = this.a($$8, $$3x -> {
               ecl.b $$4x = $$3.apply($$3x.c()).a($$3x.d().e(ma.bc));
               return new amh.b<>(new euf($$1, $$2, $$4x.d(), $$4x.a()), $$4x.b());
            }, ami::new);
            this.c.a($$5, $$6, $$9, true);
         } catch (Exception var11) {
            a.warn("Failed to load datapacks, can't proceed with server load", var11);
            $$5.c();
            this.c.a($$4);
         }
      }
   }

   @Nullable
   private eub.c a(String $$0) {
      try {
         return this.d.d($$0);
      } catch (IOException var3) {
         a.warn("Failed to read level {} data", $$0, var3);
         fom.a(this.c, $$0);
         this.c.a(null);
         return null;
      } catch (ezn var4) {
         a.warn("{}", var4.getMessage());
         this.c.a(fro.a(() -> this.c.a(null)));
         return null;
      }
   }

   public void a(eub.c $$0, alu $$1, jx<als> $$2, euh $$3) {
      aun $$4 = auq.a($$0);
      aus $$5 = (aus)new amh.d($$4, $$3.D(), false, false).a().getSecond();
      this.c.a($$0, $$4, new ami($$5, $$1, $$2, $$3), true);
   }

   public ami a(Dynamic<?> $$0, boolean $$1, aun $$2) throws Exception {
      amh.d $$3 = eub.a($$0, $$2, $$1);
      return this.a($$3, $$1x -> {
         kd<dzr> $$2x = $$1x.d().e(ma.bc);
         ety $$3x = eub.a($$0, $$1x.b(), $$2x, $$1x.c());
         return new amh.b<>($$3x.a(), $$3x.b().b());
      }, ami::new);
   }

   public Pair<dfq, fxf> a(eub.c $$0) throws Exception {
      aun $$1 = auq.a($$0);
      Dynamic<?> $$2 = $$0.h();
      amh.d $$3 = eub.a($$2, $$1, false);

      record a(dfq a, eco b, kd<dzr> c) {
      }

      return this.a($$3, $$1x -> {
         kd<dzr> $$2x = new jy<>(ma.bc, Lifecycle.stable()).n();
         ety $$3x = eub.a($$2, $$1x.b(), $$2x, $$1x.c());
         return new amh.b<>(new a($$3x.a().J(), $$3x.a().y(), $$3x.b().c()), $$1x.d());
      }, ($$0x, $$1x, $$2x, $$3x) -> {
         $$0x.close();
         fxa $$4 = new fxa(fxh.a.a, Set.of(), null);
         return Pair.of($$3x.a, new fxf($$3x.b, new ecl($$3x.c), $$2x, $$1x, $$3x.a.g(), $$4));
      });
   }

   private <D, R> R a(amh.d $$0, amh.f<D> $$1, amh.e<D, R> $$2) throws Exception {
      amh.c $$3 = new amh.c($$0, ex.a.c, 2);
      CompletableFuture<R> $$4 = amh.a($$3, $$1, $$2, ae.g(), this.c);
      this.c.b($$4::isDone);
      return $$4.get();
   }

   private void a(eub.c $$0, boolean $$1, Runnable $$2, Runnable $$3) {
      xj $$4;
      xj $$5;
      if ($$1) {
         $$4 = xj.c("selectWorld.backupQuestion.customized");
         $$5 = xj.c("selectWorld.backupWarning.customized");
      } else {
         $$4 = xj.c("selectWorld.backupQuestion.experimental");
         $$5 = xj.c("selectWorld.backupWarning.experimental");
      }

      this.c.a(new fqq($$3, ($$2x, $$3x) -> {
         if ($$2x) {
            fwy.a($$0);
         }

         $$2.run();
      }, $$4, $$5, false));
   }

   public static void a(fke $$0, fwv $$1, Lifecycle $$2, Runnable $$3, boolean $$4) {
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
         $$0.a(new fqu($$5, xj.c("selectWorld.warning.experimental.title"), xj.c("selectWorld.warning.experimental.question")));
      } else {
         $$0.a(new fqu($$5, xj.c("selectWorld.warning.deprecated.title"), xj.c("selectWorld.warning.deprecated.question")));
      }
   }

   public void a(String $$0, Runnable $$1) {
      this.c.d(new frh(xj.c("selectWorld.data_read")));
      eub.c $$2 = this.a($$0);
      if ($$2 != null) {
         this.a($$2, $$1);
      }
   }

   private void a(eub.c $$0, Runnable $$1) {
      this.c.d(new frh(xj.c("selectWorld.data_read")));

      Dynamic<?> $$2;
      euc $$3;
      try {
         $$2 = $$0.h();
         $$3 = $$0.a($$2);
      } catch (uw | vc | IOException var10) {
         this.c.a(new frv(this.c, $$2x -> {
            if ($$2x) {
               this.a($$0, $$1);
            } else {
               $$0.c();
               $$1.run();
            }
         }, $$0));
         return;
      } catch (OutOfMemoryError var11) {
         azk.b();
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

   private void a(eub.c $$0, euc $$1, Dynamic<?> $$2, Runnable $$3) {
      if (!$$1.r()) {
         $$0.c();
         this.c.a(new fqp($$3, xj.c("selectWorld.incompatible.title").b(-65536), xj.a("selectWorld.incompatible.description", $$1.k())));
      } else {
         euc.a $$4 = $$1.o();
         if ($$4.a()) {
            String $$5 = "selectWorld.backupQuestion." + $$4.c();
            String $$6 = "selectWorld.backupWarning." + $$4.c();
            xx $$7 = xj.c($$5);
            if ($$4.b()) {
               $$7.b(-2142128);
            }

            xj $$8 = xj.a($$6, $$1.k(), ab.b().c());
            this.c.a(new fqq(() -> {
               $$0.c();
               $$3.run();
            }, ($$3x, $$4x) -> {
               if ($$3x) {
                  fwy.a($$0);
               }

               this.a($$0, $$2, false, $$3);
            }, $$7, $$8, false));
         } else {
            this.a($$0, $$2, false, $$3);
         }
      }
   }

   private void a(eub.c $$0, Dynamic<?> $$1, boolean $$2, Runnable $$3) {
      this.c.d(new frh(xj.c("selectWorld.resource_load")));
      aun $$4 = auq.a($$0);

      ami $$5;
      try {
         $$5 = this.a($$1, $$2, $$4);

         for (dzr $$6 : $$5.c().a().e(ma.bc)) {
            $$6.b().a();
         }
      } catch (Exception var9) {
         a.warn("Failed to load level data or datapacks, can't proceed with server load", var9);
         if (!$$2) {
            this.c.a(new fqz(() -> {
               $$0.c();
               $$3.run();
            }, () -> this.a($$0, $$1, true, $$3)));
         } else {
            $$0.c();
            this.c.a(new fqp($$3, xj.c("datapackFailure.safeMode.failed.title"), xj.c("datapackFailure.safeMode.failed.description"), xi.k, true));
         }

         return;
      }

      this.a($$0, $$5, $$4, $$3);
   }

   private void a(eub.c $$0, ami $$1, aun $$2, Runnable $$3) {
      euh $$4 = $$1.d();
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

   private void b(eub.c $$0, ami $$1, aun $$2, Runnable $$3) {
      hcd $$4 = this.c.af();
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

   private void a(eub.c $$0, ami $$1, hcd $$2, aun $$3, Runnable $$4) {
      if ($$0.b()) {
         this.c.a(new fqu($$5 -> {
            if ($$5) {
               this.a($$0, $$1, $$3);
            } else {
               $$2.e();
               $$1.close();
               $$0.c();
               $$4.run();
            }
         }, xj.c("selectWorld.warning.lowDiskSpace.title").a(n.m), xj.c("selectWorld.warning.lowDiskSpace.description"), xi.j, xi.k));
      } else {
         this.a($$0, $$1, $$3);
      }
   }

   private void a(eub.c $$0, ami $$1, aun $$2) {
      this.c.a($$0, $$2, $$1, false);
   }

   private CompletableFuture<Void> a(hcd $$0, eub.c $$1) {
      Path $$2 = $$1.a(etz.k);
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
      this.c.a(new fqu($$0::complete, xj.c("multiplayer.texturePrompt.failure.line1"), xj.c("multiplayer.texturePrompt.failure.line2"), xi.i, xi.e));
      return $$0;
   }
}

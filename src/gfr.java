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

public class gfr {
   private static final Logger a = LogUtils.getLogger();
   private static final UUID b = UUID.fromString("640a6a92-b6cb-48a0-b391-831586500359");
   private final frd c;
   private final ezv d;

   public gfr(frd $$0, ezv $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(String $$0, dkb $$1, eib $$2, Function<jh.a, ehy> $$3, gad $$4) {
      this.c.d(new fzo(xa.c("selectWorld.data_read")));
      ezv.c $$5 = this.a($$0);
      if ($$5 != null) {
         aup $$6 = aus.a($$5);
         dkv $$7 = $$1.g();

         try {
            amg.d $$8 = new amg.d($$6, $$7, false, false);
            amh $$9 = this.a($$8, $$3x -> {
               ehy.b $$4x = $$3.apply($$3x.c()).a($$3x.d().f(mh.bq));
               return new amg.b<>(new ezz($$1, $$2, $$4x.d(), $$4x.a()), $$4x.b());
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
   private ezv.c a(String $$0) {
      try {
         return this.d.d($$0);
      } catch (IOException var3) {
         a.warn("Failed to read level {} data", $$0, var3);
         fwu.a(this.c, $$0);
         this.c.a(null);
         return null;
      } catch (fff var4) {
         a.warn("{}", var4.getMessage());
         this.c.a(fzv.a(() -> this.c.a(null)));
         return null;
      }
   }

   public void a(ezv.c $$0, alt $$1, jm<alr> $$2, fab $$3) {
      aup $$4 = aus.a($$0);
      auu $$5 = (auu)new amg.d($$4, $$3.D(), false, false).a().getSecond();
      this.c.a($$0, $$4, new amh($$5, $$1, $$2, $$3), true);
   }

   public amh a(Dynamic<?> $$0, boolean $$1, aup $$2) throws Exception {
      amg.d $$3 = ezv.a($$0, $$2, $$1);
      return this.a($$3, $$1x -> {
         js<efc> $$2x = $$1x.d().f(mh.bq);
         ezs $$3x = ezv.a($$0, $$1x.b(), $$2x, $$1x.c());
         return new amg.b<>($$3x.a(), $$3x.b().b());
      }, amh::new);
   }

   public Pair<dkb, gfo> a(ezv.c $$0) throws Exception {
      aup $$1 = aus.a($$0);
      Dynamic<?> $$2 = $$0.h();
      amg.d $$3 = ezv.a($$2, $$1, false);

      record a(dkb a, eib b, js<efc> c) {
      }

      return this.a($$3, $$1x -> {
         js<efc> $$2x = new jn<>(mh.bq, Lifecycle.stable()).n();
         ezs $$3x = ezv.a($$2, $$1x.b(), $$2x, $$1x.c());
         return new amg.b<>(new a($$3x.a().J(), $$3x.a().y(), $$3x.b().c()), $$1x.d());
      }, ($$0x, $$1x, $$2x, $$3x) -> {
         $$0x.close();
         gfj $$4 = new gfj(gfq.a.a, Set.of(), null);
         return Pair.of($$3x.a, new gfo($$3x.b, new ehy($$3x.c), $$2x, $$1x, $$3x.a.g(), $$4));
      });
   }

   private <D, R> R a(amg.d $$0, amg.f<D> $$1, amg.e<D, R> $$2) throws Exception {
      amg.c $$3 = new amg.c($$0, ek.a.c, 2);
      CompletableFuture<R> $$4 = amg.a($$3, $$1, $$2, ag.h(), this.c);
      this.c.b($$4::isDone);
      return $$4.get();
   }

   private void a(ezv.c $$0, boolean $$1, Runnable $$2, Runnable $$3) {
      xa $$4;
      xa $$5;
      if ($$1) {
         $$4 = xa.c("selectWorld.backupQuestion.customized");
         $$5 = xa.c("selectWorld.backupWarning.customized");
      } else {
         $$4 = xa.c("selectWorld.backupQuestion.experimental");
         $$5 = xa.c("selectWorld.backupWarning.experimental");
      }

      this.c.a(new fyx($$3, ($$2x, $$3x) -> {
         if ($$2x) {
            gfh.a($$0);
         }

         $$2.run();
      }, $$4, $$5, false));
   }

   public static void a(frd $$0, gfe $$1, Lifecycle $$2, Runnable $$3, boolean $$4) {
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
         $$0.a(new fzb($$5, xa.c("selectWorld.warning.experimental.title"), xa.c("selectWorld.warning.experimental.question")));
      } else {
         $$0.a(new fzb($$5, xa.c("selectWorld.warning.deprecated.title"), xa.c("selectWorld.warning.deprecated.question")));
      }
   }

   public void a(String $$0, Runnable $$1) {
      this.c.d(new fzo(xa.c("selectWorld.data_read")));
      ezv.c $$2 = this.a($$0);
      if ($$2 != null) {
         this.a($$2, $$1);
      }
   }

   private void a(ezv.c $$0, Runnable $$1) {
      this.c.d(new fzo(xa.c("selectWorld.data_read")));

      Dynamic<?> $$2;
      ezw $$3;
      try {
         $$2 = $$0.h();
         $$3 = $$0.a($$2);
      } catch (uk | ur | IOException var10) {
         this.c.a(new gac(this.c, $$2x -> {
            if ($$2x) {
               this.a($$0, $$1);
            } else {
               $$0.c();
               $$1.run();
            }
         }, $$0));
         return;
      } catch (OutOfMemoryError var11) {
         azm.b();
         String $$6 = "Ran out of memory trying to read level data of world folder \"" + $$0.f() + "\"";
         a.error(LogUtils.FATAL_MARKER, $$6);
         OutOfMemoryError $$7 = new OutOfMemoryError("Ran out of memory reading level data");
         $$7.initCause(var11);
         p $$8 = p.a($$7, $$6);
         q $$9 = $$8.a("World details");
         $$9.a("World folder", $$0.f());
         throw new aa($$8);
      }

      this.a($$0, $$3, $$2, $$1);
   }

   private void a(ezv.c $$0, ezw $$1, Dynamic<?> $$2, Runnable $$3) {
      if (!$$1.r()) {
         $$0.c();
         this.c.a(new fyw($$3, xa.c("selectWorld.incompatible.title").b(-65536), xa.a("selectWorld.incompatible.description", $$1.k())));
      } else {
         ezw.a $$4 = $$1.o();
         if ($$4.a()) {
            String $$5 = "selectWorld.backupQuestion." + $$4.c();
            String $$6 = "selectWorld.backupWarning." + $$4.c();
            xo $$7 = xa.c($$5);
            if ($$4.b()) {
               $$7.b(-2142128);
            }

            xa $$8 = xa.a($$6, $$1.k(), ac.b().c());
            this.c.a(new fyx(() -> {
               $$0.c();
               $$3.run();
            }, ($$3x, $$4x) -> {
               if ($$3x) {
                  gfh.a($$0);
               }

               this.a($$0, $$2, false, $$3);
            }, $$7, $$8, false));
         } else {
            this.a($$0, $$2, false, $$3);
         }
      }
   }

   private void a(ezv.c $$0, Dynamic<?> $$1, boolean $$2, Runnable $$3) {
      this.c.d(new fzo(xa.c("selectWorld.resource_load")));
      aup $$4 = aus.a($$0);

      amh $$5;
      try {
         $$5 = this.a($$1, $$2, $$4);

         for (efc $$6 : $$5.c().a().f(mh.bq)) {
            $$6.b().a();
         }
      } catch (Exception var9) {
         a.warn("Failed to load level data or datapacks, can't proceed with server load", var9);
         if (!$$2) {
            this.c.a(new fzg(() -> {
               $$0.c();
               $$3.run();
            }, () -> this.a($$0, $$1, true, $$3)));
         } else {
            $$0.c();
            this.c.a(new fyw($$3, xa.c("datapackFailure.safeMode.failed.title"), xa.c("datapackFailure.safeMode.failed.description"), wz.k, true));
         }

         return;
      }

      this.a($$0, $$5, $$4, $$3);
   }

   private void a(ezv.c $$0, amh $$1, aup $$2, Runnable $$3) {
      fab $$4 = $$1.d();
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

   private void b(ezv.c $$0, amh $$1, aup $$2, Runnable $$3) {
      hnz $$4 = this.c.af();
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
         this.c.a(p.a($$0x, "Load world"));
         return null;
      });
   }

   private void a(ezv.c $$0, amh $$1, hnz $$2, aup $$3, Runnable $$4) {
      if ($$0.b()) {
         this.c.a(new fzb($$5 -> {
            if ($$5) {
               this.a($$0, $$1, $$3);
            } else {
               $$2.e();
               $$1.close();
               $$0.c();
               $$4.run();
            }
         }, xa.c("selectWorld.warning.lowDiskSpace.title").a(o.m), xa.c("selectWorld.warning.lowDiskSpace.description"), wz.j, wz.k));
      } else {
         this.a($$0, $$1, $$3);
      }
   }

   private void a(ezv.c $$0, amh $$1, aup $$2) {
      this.c.a($$0, $$2, $$1, false);
   }

   private CompletableFuture<Void> a(hnz $$0, ezv.c $$1) {
      Path $$2 = $$1.a(ezt.k);
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
      this.c.a(new fzb($$0::complete, xa.c("multiplayer.texturePrompt.failure.line1"), xa.c("multiplayer.texturePrompt.failure.line2"), wz.i, wz.e));
      return $$0;
   }
}

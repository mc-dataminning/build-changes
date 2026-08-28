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

public class gft {
   private static final Logger a = LogUtils.getLogger();
   private static final UUID b = UUID.fromString("640a6a92-b6cb-48a0-b391-831586500359");
   private final frf c;
   private final ezx d;

   public gft(frf $$0, ezx $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(String $$0, dkd $$1, eid $$2, Function<ji.a, eia> $$3, gaf $$4) {
      this.c.d(new fzq(xc.c("selectWorld.data_read")));
      ezx.c $$5 = this.a($$0);
      if ($$5 != null) {
         aur $$6 = auu.a($$5);
         dkx $$7 = $$1.g();

         try {
            ami.d $$8 = new ami.d($$6, $$7, false, false);
            amj $$9 = this.a($$8, $$3x -> {
               eia.b $$4x = $$3.apply($$3x.c()).a($$3x.d().f(mi.bq));
               return new ami.b<>(new fab($$1, $$2, $$4x.d(), $$4x.a()), $$4x.b());
            }, amj::new);
            this.c.a($$5, $$6, $$9, true);
         } catch (Exception var11) {
            a.warn("Failed to load datapacks, can't proceed with server load", var11);
            $$5.c();
            this.c.a($$4);
         }
      }
   }

   @Nullable
   private ezx.c a(String $$0) {
      try {
         return this.d.d($$0);
      } catch (IOException var3) {
         a.warn("Failed to read level {} data", $$0, var3);
         fww.a(this.c, $$0);
         this.c.a(null);
         return null;
      } catch (ffh var4) {
         a.warn("{}", var4.getMessage());
         this.c.a(fzx.a(() -> this.c.a(null)));
         return null;
      }
   }

   public void a(ezx.c $$0, alv $$1, jn<alt> $$2, fad $$3) {
      aur $$4 = auu.a($$0);
      auw $$5 = (auw)new ami.d($$4, $$3.D(), false, false).a().getSecond();
      this.c.a($$0, $$4, new amj($$5, $$1, $$2, $$3), true);
   }

   public amj a(Dynamic<?> $$0, boolean $$1, aur $$2) throws Exception {
      ami.d $$3 = ezx.a($$0, $$2, $$1);
      return this.a($$3, $$1x -> {
         jt<efe> $$2x = $$1x.d().f(mi.bq);
         ezu $$3x = ezx.a($$0, $$1x.b(), $$2x, $$1x.c());
         return new ami.b<>($$3x.a(), $$3x.b().b());
      }, amj::new);
   }

   public Pair<dkd, gfq> a(ezx.c $$0) throws Exception {
      aur $$1 = auu.a($$0);
      Dynamic<?> $$2 = $$0.h();
      ami.d $$3 = ezx.a($$2, $$1, false);

      record a(dkd a, eid b, jt<efe> c) {
      }

      return this.a($$3, $$1x -> {
         jt<efe> $$2x = new jo<>(mi.bq, Lifecycle.stable()).n();
         ezu $$3x = ezx.a($$2, $$1x.b(), $$2x, $$1x.c());
         return new ami.b<>(new a($$3x.a().J(), $$3x.a().y(), $$3x.b().c()), $$1x.d());
      }, ($$0x, $$1x, $$2x, $$3x) -> {
         $$0x.close();
         gfl $$4 = new gfl(gfs.a.a, Set.of(), null);
         return Pair.of($$3x.a, new gfq($$3x.b, new eia($$3x.c), $$2x, $$1x, $$3x.a.g(), $$4));
      });
   }

   private <D, R> R a(ami.d $$0, ami.f<D> $$1, ami.e<D, R> $$2) throws Exception {
      ami.c $$3 = new ami.c($$0, el.a.c, 2);
      CompletableFuture<R> $$4 = ami.a($$3, $$1, $$2, ag.h(), this.c);
      this.c.b($$4::isDone);
      return $$4.get();
   }

   private void a(ezx.c $$0, boolean $$1, Runnable $$2, Runnable $$3) {
      xc $$4;
      xc $$5;
      if ($$1) {
         $$4 = xc.c("selectWorld.backupQuestion.customized");
         $$5 = xc.c("selectWorld.backupWarning.customized");
      } else {
         $$4 = xc.c("selectWorld.backupQuestion.experimental");
         $$5 = xc.c("selectWorld.backupWarning.experimental");
      }

      this.c.a(new fyz($$3, ($$2x, $$3x) -> {
         if ($$2x) {
            gfj.a($$0);
         }

         $$2.run();
      }, $$4, $$5, false));
   }

   public static void a(frf $$0, gfg $$1, Lifecycle $$2, Runnable $$3, boolean $$4) {
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
         $$0.a(new fzd($$5, xc.c("selectWorld.warning.experimental.title"), xc.c("selectWorld.warning.experimental.question")));
      } else {
         $$0.a(new fzd($$5, xc.c("selectWorld.warning.deprecated.title"), xc.c("selectWorld.warning.deprecated.question")));
      }
   }

   public void a(String $$0, Runnable $$1) {
      this.c.d(new fzq(xc.c("selectWorld.data_read")));
      ezx.c $$2 = this.a($$0);
      if ($$2 != null) {
         this.a($$2, $$1);
      }
   }

   private void a(ezx.c $$0, Runnable $$1) {
      this.c.d(new fzq(xc.c("selectWorld.data_read")));

      Dynamic<?> $$2;
      ezy $$3;
      try {
         $$2 = $$0.h();
         $$3 = $$0.a($$2);
      } catch (ul | us | IOException var10) {
         this.c.a(new gae(this.c, $$2x -> {
            if ($$2x) {
               this.a($$0, $$1);
            } else {
               $$0.c();
               $$1.run();
            }
         }, $$0));
         return;
      } catch (OutOfMemoryError var11) {
         azo.b();
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

   private void a(ezx.c $$0, ezy $$1, Dynamic<?> $$2, Runnable $$3) {
      if (!$$1.r()) {
         $$0.c();
         this.c.a(new fyy($$3, xc.c("selectWorld.incompatible.title").b(-65536), xc.a("selectWorld.incompatible.description", $$1.k())));
      } else {
         ezy.a $$4 = $$1.o();
         if ($$4.a()) {
            String $$5 = "selectWorld.backupQuestion." + $$4.c();
            String $$6 = "selectWorld.backupWarning." + $$4.c();
            xq $$7 = xc.c($$5);
            if ($$4.b()) {
               $$7.b(-2142128);
            }

            xc $$8 = xc.a($$6, $$1.k(), ac.b().c());
            this.c.a(new fyz(() -> {
               $$0.c();
               $$3.run();
            }, ($$3x, $$4x) -> {
               if ($$3x) {
                  gfj.a($$0);
               }

               this.a($$0, $$2, false, $$3);
            }, $$7, $$8, false));
         } else {
            this.a($$0, $$2, false, $$3);
         }
      }
   }

   private void a(ezx.c $$0, Dynamic<?> $$1, boolean $$2, Runnable $$3) {
      this.c.d(new fzq(xc.c("selectWorld.resource_load")));
      aur $$4 = auu.a($$0);

      amj $$5;
      try {
         $$5 = this.a($$1, $$2, $$4);

         for (efe $$6 : $$5.c().a().f(mi.bq)) {
            $$6.b().a();
         }
      } catch (Exception var9) {
         a.warn("Failed to load level data or datapacks, can't proceed with server load", var9);
         if (!$$2) {
            this.c.a(new fzi(() -> {
               $$0.c();
               $$3.run();
            }, () -> this.a($$0, $$1, true, $$3)));
         } else {
            $$0.c();
            this.c.a(new fyy($$3, xc.c("datapackFailure.safeMode.failed.title"), xc.c("datapackFailure.safeMode.failed.description"), xb.k, true));
         }

         return;
      }

      this.a($$0, $$5, $$4, $$3);
   }

   private void a(ezx.c $$0, amj $$1, aur $$2, Runnable $$3) {
      fad $$4 = $$1.d();
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

   private void b(ezx.c $$0, amj $$1, aur $$2, Runnable $$3) {
      hob $$4 = this.c.af();
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

   private void a(ezx.c $$0, amj $$1, hob $$2, aur $$3, Runnable $$4) {
      if ($$0.b()) {
         this.c.a(new fzd($$5 -> {
            if ($$5) {
               this.a($$0, $$1, $$3);
            } else {
               $$2.e();
               $$1.close();
               $$0.c();
               $$4.run();
            }
         }, xc.c("selectWorld.warning.lowDiskSpace.title").a(o.m), xc.c("selectWorld.warning.lowDiskSpace.description"), xb.j, xb.k));
      } else {
         this.a($$0, $$1, $$3);
      }
   }

   private void a(ezx.c $$0, amj $$1, aur $$2) {
      this.c.a($$0, $$2, $$1, false);
   }

   private CompletableFuture<Void> a(hob $$0, ezx.c $$1) {
      Path $$2 = $$1.a(ezv.k);
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
      this.c.a(new fzd($$0::complete, xc.c("multiplayer.texturePrompt.failure.line1"), xc.c("multiplayer.texturePrompt.failure.line2"), xb.i, xb.e));
      return $$0;
   }
}

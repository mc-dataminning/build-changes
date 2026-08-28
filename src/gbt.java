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

public class gbt {
   private static final Logger a = LogUtils.getLogger();
   private static final UUID b = UUID.fromString("640a6a92-b6cb-48a0-b391-831586500359");
   private final fnd c;
   private final ewz d;

   public gbt(fnd $$0, ewz $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(String $$0, dht $$1, efj $$2, Function<ju.a, efg> $$3, fwf $$4) {
      this.c.d(new fvq(wv.c("selectWorld.data_read")));
      ewz.c $$5 = this.a($$0);
      if ($$5 != null) {
         auk $$6 = aun.a($$5);
         din $$7 = $$1.g();

         try {
            amb.d $$8 = new amb.d($$6, $$7, false, false);
            amc $$9 = this.a($$8, $$3x -> {
               efg.b $$4x = $$3.apply($$3x.c()).a($$3x.d().f(me.bm));
               return new amb.b<>(new exd($$1, $$2, $$4x.d(), $$4x.a()), $$4x.b());
            }, amc::new);
            this.c.a($$5, $$6, $$9, true);
         } catch (Exception var11) {
            a.warn("Failed to load datapacks, can't proceed with server load", var11);
            $$5.c();
            this.c.a($$4);
         }
      }
   }

   @Nullable
   private ewz.c a(String $$0) {
      try {
         return this.d.d($$0);
      } catch (IOException var3) {
         a.warn("Failed to read level {} data", $$0, var3);
         fsw.a(this.c, $$0);
         this.c.a(null);
         return null;
      } catch (fcj var4) {
         a.warn("{}", var4.getMessage());
         this.c.a(fvx.a(() -> this.c.a(null)));
         return null;
      }
   }

   public void a(ewz.c $$0, alo $$1, jz<alm> $$2, exf $$3) {
      auk $$4 = aun.a($$0);
      aup $$5 = (aup)new amb.d($$4, $$3.D(), false, false).a().getSecond();
      this.c.a($$0, $$4, new amc($$5, $$1, $$2, $$3), true);
   }

   public amc a(Dynamic<?> $$0, boolean $$1, auk $$2) throws Exception {
      amb.d $$3 = ewz.a($$0, $$2, $$1);
      return this.a($$3, $$1x -> {
         kf<eck> $$2x = $$1x.d().f(me.bm);
         eww $$3x = ewz.a($$0, $$1x.b(), $$2x, $$1x.c());
         return new amb.b<>($$3x.a(), $$3x.b().b());
      }, amc::new);
   }

   public Pair<dht, gbq> a(ewz.c $$0) throws Exception {
      auk $$1 = aun.a($$0);
      Dynamic<?> $$2 = $$0.h();
      amb.d $$3 = ewz.a($$2, $$1, false);

      record a(dht a, efj b, kf<eck> c) {
      }

      return this.a($$3, $$1x -> {
         kf<eck> $$2x = new ka<>(me.bm, Lifecycle.stable()).n();
         eww $$3x = ewz.a($$2, $$1x.b(), $$2x, $$1x.c());
         return new amb.b<>(new a($$3x.a().J(), $$3x.a().y(), $$3x.b().c()), $$1x.d());
      }, ($$0x, $$1x, $$2x, $$3x) -> {
         $$0x.close();
         gbl $$4 = new gbl(gbs.a.a, Set.of(), null);
         return Pair.of($$3x.a, new gbq($$3x.b, new efg($$3x.c), $$2x, $$1x, $$3x.a.g(), $$4));
      });
   }

   private <D, R> R a(amb.d $$0, amb.f<D> $$1, amb.e<D, R> $$2) throws Exception {
      amb.c $$3 = new amb.c($$0, ey.a.c, 2);
      CompletableFuture<R> $$4 = amb.a($$3, $$1, $$2, af.h(), this.c);
      this.c.b($$4::isDone);
      return $$4.get();
   }

   private void a(ewz.c $$0, boolean $$1, Runnable $$2, Runnable $$3) {
      wv $$4;
      wv $$5;
      if ($$1) {
         $$4 = wv.c("selectWorld.backupQuestion.customized");
         $$5 = wv.c("selectWorld.backupWarning.customized");
      } else {
         $$4 = wv.c("selectWorld.backupQuestion.experimental");
         $$5 = wv.c("selectWorld.backupWarning.experimental");
      }

      this.c.a(new fuz($$3, ($$2x, $$3x) -> {
         if ($$2x) {
            gbj.a($$0);
         }

         $$2.run();
      }, $$4, $$5, false));
   }

   public static void a(fnd $$0, gbg $$1, Lifecycle $$2, Runnable $$3, boolean $$4) {
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
         $$0.a(new fvd($$5, wv.c("selectWorld.warning.experimental.title"), wv.c("selectWorld.warning.experimental.question")));
      } else {
         $$0.a(new fvd($$5, wv.c("selectWorld.warning.deprecated.title"), wv.c("selectWorld.warning.deprecated.question")));
      }
   }

   public void a(String $$0, Runnable $$1) {
      this.c.d(new fvq(wv.c("selectWorld.data_read")));
      ewz.c $$2 = this.a($$0);
      if ($$2 != null) {
         this.a($$2, $$1);
      }
   }

   private void a(ewz.c $$0, Runnable $$1) {
      this.c.d(new fvq(wv.c("selectWorld.data_read")));

      Dynamic<?> $$2;
      exa $$3;
      try {
         $$2 = $$0.h();
         $$3 = $$0.a($$2);
      } catch (uh | un | IOException var10) {
         this.c.a(new fwe(this.c, $$2x -> {
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

   private void a(ewz.c $$0, exa $$1, Dynamic<?> $$2, Runnable $$3) {
      if (!$$1.r()) {
         $$0.c();
         this.c.a(new fuy($$3, wv.c("selectWorld.incompatible.title").b(-65536), wv.a("selectWorld.incompatible.description", $$1.k())));
      } else {
         exa.a $$4 = $$1.o();
         if ($$4.a()) {
            String $$5 = "selectWorld.backupQuestion." + $$4.c();
            String $$6 = "selectWorld.backupWarning." + $$4.c();
            xj $$7 = wv.c($$5);
            if ($$4.b()) {
               $$7.b(-2142128);
            }

            wv $$8 = wv.a($$6, $$1.k(), ab.b().c());
            this.c.a(new fuz(() -> {
               $$0.c();
               $$3.run();
            }, ($$3x, $$4x) -> {
               if ($$3x) {
                  gbj.a($$0);
               }

               this.a($$0, $$2, false, $$3);
            }, $$7, $$8, false));
         } else {
            this.a($$0, $$2, false, $$3);
         }
      }
   }

   private void a(ewz.c $$0, Dynamic<?> $$1, boolean $$2, Runnable $$3) {
      this.c.d(new fvq(wv.c("selectWorld.resource_load")));
      auk $$4 = aun.a($$0);

      amc $$5;
      try {
         $$5 = this.a($$1, $$2, $$4);

         for (eck $$6 : $$5.c().a().f(me.bm)) {
            $$6.b().a();
         }
      } catch (Exception var9) {
         a.warn("Failed to load level data or datapacks, can't proceed with server load", var9);
         if (!$$2) {
            this.c.a(new fvi(() -> {
               $$0.c();
               $$3.run();
            }, () -> this.a($$0, $$1, true, $$3)));
         } else {
            $$0.c();
            this.c.a(new fuy($$3, wv.c("datapackFailure.safeMode.failed.title"), wv.c("datapackFailure.safeMode.failed.description"), wu.k, true));
         }

         return;
      }

      this.a($$0, $$5, $$4, $$3);
   }

   private void a(ewz.c $$0, amc $$1, auk $$2, Runnable $$3) {
      exf $$4 = $$1.d();
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

   private void b(ewz.c $$0, amc $$1, auk $$2, Runnable $$3) {
      hjr $$4 = this.c.af();
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

   private void a(ewz.c $$0, amc $$1, hjr $$2, auk $$3, Runnable $$4) {
      if ($$0.b()) {
         this.c.a(new fvd($$5 -> {
            if ($$5) {
               this.a($$0, $$1, $$3);
            } else {
               $$2.e();
               $$1.close();
               $$0.c();
               $$4.run();
            }
         }, wv.c("selectWorld.warning.lowDiskSpace.title").a(n.m), wv.c("selectWorld.warning.lowDiskSpace.description"), wu.j, wu.k));
      } else {
         this.a($$0, $$1, $$3);
      }
   }

   private void a(ewz.c $$0, amc $$1, auk $$2) {
      this.c.a($$0, $$2, $$1, false);
   }

   private CompletableFuture<Void> a(hjr $$0, ewz.c $$1) {
      Path $$2 = $$1.a(ewx.k);
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
      this.c.a(new fvd($$0::complete, wv.c("multiplayer.texturePrompt.failure.line1"), wv.c("multiplayer.texturePrompt.failure.line2"), wu.i, wu.e));
      return $$0;
   }
}

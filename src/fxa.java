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

public class fxa {
   private static final Logger a = LogUtils.getLogger();
   private static final UUID b = UUID.fromString("640a6a92-b6cb-48a0-b391-831586500359");
   private final fjx c;
   private final etu d;

   public fxa(fjx $$0, etu $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(String $$0, dfj $$1, ech $$2, Function<js.a, ece> $$3, frp $$4) {
      this.c.d(new fra(xl.c("selectWorld.data_read")));
      etu.c $$5 = this.a($$0);
      if ($$5 != null) {
         auo $$6 = aur.a($$5);
         dgc $$7 = $$1.g();

         try {
            amj.d $$8 = new amj.d($$6, $$7, false, false);
            amk $$9 = this.a($$8, $$3x -> {
               ece.b $$4x = $$3.apply($$3x.c()).a($$3x.d().e(ma.bc));
               return new amj.b<>(new ety($$1, $$2, $$4x.d(), $$4x.a()), $$4x.b());
            }, amk::new);
            this.c.a($$5, $$6, $$9, true);
         } catch (Exception var11) {
            a.warn("Failed to load datapacks, can't proceed with server load", var11);
            $$5.c();
            this.c.a($$4);
         }
      }
   }

   @Nullable
   private etu.c a(String $$0) {
      try {
         return this.d.d($$0);
      } catch (IOException var3) {
         a.warn("Failed to read level {} data", $$0, var3);
         fof.a(this.c, $$0);
         this.c.a(null);
         return null;
      } catch (ezg var4) {
         a.warn("{}", var4.getMessage());
         this.c.a(frh.a(() -> this.c.a(null)));
         return null;
      }
   }

   public void a(etu.c $$0, alw $$1, jx<alu> $$2, eua $$3) {
      auo $$4 = aur.a($$0);
      aut $$5 = (aut)new amj.d($$4, $$3.D(), false, false).a().getSecond();
      this.c.a($$0, $$4, new amk($$5, $$1, $$2, $$3), true);
   }

   public amk a(Dynamic<?> $$0, boolean $$1, auo $$2) throws Exception {
      amj.d $$3 = etu.a($$0, $$2, $$1);
      return this.a($$3, $$1x -> {
         kd<dzk> $$2x = $$1x.d().e(ma.bc);
         etr $$3x = etu.a($$0, $$1x.b(), $$2x, $$1x.c());
         return new amj.b<>($$3x.a(), $$3x.b().b());
      }, amk::new);
   }

   public Pair<dfj, fwx> a(etu.c $$0) throws Exception {
      auo $$1 = aur.a($$0);
      Dynamic<?> $$2 = $$0.h();
      amj.d $$3 = etu.a($$2, $$1, false);

      record a(dfj a, ech b, kd<dzk> c) {
      }

      return this.a($$3, $$1x -> {
         kd<dzk> $$2x = new jy<>(ma.bc, Lifecycle.stable()).n();
         etr $$3x = etu.a($$2, $$1x.b(), $$2x, $$1x.c());
         return new amj.b<>(new a($$3x.a().J(), $$3x.a().y(), $$3x.b().c()), $$1x.d());
      }, ($$0x, $$1x, $$2x, $$3x) -> {
         $$0x.close();
         fws $$4 = new fws(fwz.a.a, Set.of(), null);
         return Pair.of($$3x.a, new fwx($$3x.b, new ece($$3x.c), $$2x, $$1x, $$3x.a.g(), $$4));
      });
   }

   private <D, R> R a(amj.d $$0, amj.f<D> $$1, amj.e<D, R> $$2) throws Exception {
      amj.c $$3 = new amj.c($$0, ex.a.c, 2);
      CompletableFuture<R> $$4 = amj.a($$3, $$1, $$2, ae.g(), this.c);
      this.c.b($$4::isDone);
      return $$4.get();
   }

   private void a(etu.c $$0, boolean $$1, Runnable $$2, Runnable $$3) {
      xl $$4;
      xl $$5;
      if ($$1) {
         $$4 = xl.c("selectWorld.backupQuestion.customized");
         $$5 = xl.c("selectWorld.backupWarning.customized");
      } else {
         $$4 = xl.c("selectWorld.backupQuestion.experimental");
         $$5 = xl.c("selectWorld.backupWarning.experimental");
      }

      this.c.a(new fqj($$3, ($$2x, $$3x) -> {
         if ($$2x) {
            fwq.a($$0);
         }

         $$2.run();
      }, $$4, $$5, false));
   }

   public static void a(fjx $$0, fwn $$1, Lifecycle $$2, Runnable $$3, boolean $$4) {
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
         $$0.a(new fqn($$5, xl.c("selectWorld.warning.experimental.title"), xl.c("selectWorld.warning.experimental.question")));
      } else {
         $$0.a(new fqn($$5, xl.c("selectWorld.warning.deprecated.title"), xl.c("selectWorld.warning.deprecated.question")));
      }
   }

   public void a(String $$0, Runnable $$1) {
      this.c.d(new fra(xl.c("selectWorld.data_read")));
      etu.c $$2 = this.a($$0);
      if ($$2 != null) {
         this.a($$2, $$1);
      }
   }

   private void a(etu.c $$0, Runnable $$1) {
      this.c.d(new fra(xl.c("selectWorld.data_read")));

      Dynamic<?> $$2;
      etv $$3;
      try {
         $$2 = $$0.h();
         $$3 = $$0.a($$2);
      } catch (uy | ve | IOException var10) {
         this.c.a(new fro(this.c, $$2x -> {
            if ($$2x) {
               this.a($$0, $$1);
            } else {
               $$0.c();
               $$1.run();
            }
         }, $$0));
         return;
      } catch (OutOfMemoryError var11) {
         azl.b();
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

   private void a(etu.c $$0, etv $$1, Dynamic<?> $$2, Runnable $$3) {
      if (!$$1.r()) {
         $$0.c();
         this.c.a(new fqi($$3, xl.c("selectWorld.incompatible.title").b(-65536), xl.a("selectWorld.incompatible.description", $$1.k())));
      } else {
         etv.a $$4 = $$1.o();
         if ($$4.a()) {
            String $$5 = "selectWorld.backupQuestion." + $$4.c();
            String $$6 = "selectWorld.backupWarning." + $$4.c();
            xz $$7 = xl.c($$5);
            if ($$4.b()) {
               $$7.b(-2142128);
            }

            xl $$8 = xl.a($$6, $$1.k(), ab.b().c());
            this.c.a(new fqj(() -> {
               $$0.c();
               $$3.run();
            }, ($$3x, $$4x) -> {
               if ($$3x) {
                  fwq.a($$0);
               }

               this.a($$0, $$2, false, $$3);
            }, $$7, $$8, false));
         } else {
            this.a($$0, $$2, false, $$3);
         }
      }
   }

   private void a(etu.c $$0, Dynamic<?> $$1, boolean $$2, Runnable $$3) {
      this.c.d(new fra(xl.c("selectWorld.resource_load")));
      auo $$4 = aur.a($$0);

      amk $$5;
      try {
         $$5 = this.a($$1, $$2, $$4);

         for (dzk $$6 : $$5.c().a().e(ma.bc)) {
            $$6.b().a();
         }
      } catch (Exception var9) {
         a.warn("Failed to load level data or datapacks, can't proceed with server load", var9);
         if (!$$2) {
            this.c.a(new fqs(() -> {
               $$0.c();
               $$3.run();
            }, () -> this.a($$0, $$1, true, $$3)));
         } else {
            $$0.c();
            this.c.a(new fqi($$3, xl.c("datapackFailure.safeMode.failed.title"), xl.c("datapackFailure.safeMode.failed.description"), xk.k, true));
         }

         return;
      }

      this.a($$0, $$5, $$4, $$3);
   }

   private void a(etu.c $$0, amk $$1, auo $$2, Runnable $$3) {
      eua $$4 = $$1.d();
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

   private void b(etu.c $$0, amk $$1, auo $$2, Runnable $$3) {
      hbs $$4 = this.c.af();
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

   private void a(etu.c $$0, amk $$1, hbs $$2, auo $$3, Runnable $$4) {
      if ($$0.b()) {
         this.c.a(new fqn($$5 -> {
            if ($$5) {
               this.a($$0, $$1, $$3);
            } else {
               $$2.e();
               $$1.close();
               $$0.c();
               $$4.run();
            }
         }, xl.c("selectWorld.warning.lowDiskSpace.title").a(n.m), xl.c("selectWorld.warning.lowDiskSpace.description"), xk.j, xk.k));
      } else {
         this.a($$0, $$1, $$3);
      }
   }

   private void a(etu.c $$0, amk $$1, auo $$2) {
      this.c.a($$0, $$2, $$1, false);
   }

   private CompletableFuture<Void> a(hbs $$0, etu.c $$1) {
      Path $$2 = $$1.a(ets.k);
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
      this.c.a(new fqn($$0::complete, xl.c("multiplayer.texturePrompt.failure.line1"), xl.c("multiplayer.texturePrompt.failure.line2"), xk.i, xk.e));
      return $$0;
   }
}

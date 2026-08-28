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

public class fvz {
   private static final Logger a = LogUtils.getLogger();
   private static final UUID b = UUID.fromString("640a6a92-b6cb-48a0-b391-831586500359");
   private final fja c;
   private final etk d;

   public fvz(fja $$0, etk $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(String $$0, dez $$1, ebx $$2, Function<jr.a, ebu> $$3, fqs $$4) {
      this.c.d(new fqd(xh.c("selectWorld.data_read")));
      etk.c $$5 = this.a($$0);
      if ($$5 != null) {
         auk $$6 = aun.a($$5);
         dfr $$7 = $$1.g();

         try {
            amf.d $$8 = new amf.d($$6, $$7, false, false);
            amg $$9 = this.a($$8, $$3x -> {
               ebu.b $$4x = $$3.apply($$3x.c()).a($$3x.d().e(ly.bc));
               return new amf.b<>(new eto($$1, $$2, $$4x.d(), $$4x.a()), $$4x.b());
            }, amg::new);
            this.c.a($$5, $$6, $$9, true);
         } catch (Exception var11) {
            a.warn("Failed to load datapacks, can't proceed with server load", var11);
            $$5.c();
            this.c.a($$4);
         }
      }
   }

   @Nullable
   private etk.c a(String $$0) {
      try {
         return this.d.d($$0);
      } catch (IOException var3) {
         a.warn("Failed to read level {} data", $$0, var3);
         fni.a(this.c, $$0);
         this.c.a(null);
         return null;
      } catch (eyw var4) {
         a.warn("{}", var4.getMessage());
         this.c.a(fqk.a(() -> this.c.a(null)));
         return null;
      }
   }

   public void a(etk.c $$0, als $$1, jw<alq> $$2, etq $$3) {
      auk $$4 = aun.a($$0);
      aup $$5 = (aup)new amf.d($$4, $$3.D(), false, false).a().getSecond();
      this.c.a($$0, $$4, new amg($$5, $$1, $$2, $$3), true);
   }

   public amg a(Dynamic<?> $$0, boolean $$1, auk $$2) throws Exception {
      amf.d $$3 = etk.a($$0, $$2, $$1);
      return this.a($$3, $$1x -> {
         kc<dza> $$2x = $$1x.d().e(ly.bc);
         eth $$3x = etk.a($$0, $$1x.b(), $$2x, $$1x.c());
         return new amf.b<>($$3x.a(), $$3x.b().b());
      }, amg::new);
   }

   public Pair<dez, fvx> a(etk.c $$0) throws Exception {
      auk $$1 = aun.a($$0);
      Dynamic<?> $$2 = $$0.h();
      amf.d $$3 = etk.a($$2, $$1, false);

      record a(dez a, ebx b, kc<dza> c) {
      }

      return this.a($$3, $$1x -> {
         kc<dza> $$2x = new jx<>(ly.bc, Lifecycle.stable()).n();
         eth $$3x = etk.a($$2, $$1x.b(), $$2x, $$1x.c());
         return new amf.b<>(new a($$3x.a().J(), $$3x.a().y(), $$3x.b().c()), $$1x.d());
      }, ($$0x, $$1x, $$2x, $$3x) -> {
         $$0x.close();
         return Pair.of($$3x.a, new fvx($$3x.b, new ebu($$3x.c), $$2x, $$1x, $$3x.a.g()));
      });
   }

   private <D, R> R a(amf.d $$0, amf.f<D> $$1, amf.e<D, R> $$2) throws Exception {
      amf.c $$3 = new amf.c($$0, ew.a.c, 2);
      CompletableFuture<R> $$4 = amf.a($$3, $$1, $$2, ad.g(), this.c);
      this.c.b($$4::isDone);
      return $$4.get();
   }

   private void a(etk.c $$0, boolean $$1, Runnable $$2, Runnable $$3) {
      xh $$4;
      xh $$5;
      if ($$1) {
         $$4 = xh.c("selectWorld.backupQuestion.customized");
         $$5 = xh.c("selectWorld.backupWarning.customized");
      } else {
         $$4 = xh.c("selectWorld.backupQuestion.experimental");
         $$5 = xh.c("selectWorld.backupWarning.experimental");
      }

      this.c.a(new fpm($$3, ($$2x, $$3x) -> {
         if ($$2x) {
            fvr.a($$0);
         }

         $$2.run();
      }, $$4, $$5, false));
   }

   public static void a(fja $$0, fvp $$1, Lifecycle $$2, Runnable $$3, boolean $$4) {
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
         $$0.a(new fpq($$5, xh.c("selectWorld.warning.experimental.title"), xh.c("selectWorld.warning.experimental.question")));
      } else {
         $$0.a(new fpq($$5, xh.c("selectWorld.warning.deprecated.title"), xh.c("selectWorld.warning.deprecated.question")));
      }
   }

   public void a(String $$0, Runnable $$1) {
      this.c.d(new fqd(xh.c("selectWorld.data_read")));
      etk.c $$2 = this.a($$0);
      if ($$2 != null) {
         this.a($$2, $$1);
      }
   }

   private void a(etk.c $$0, Runnable $$1) {
      this.c.d(new fqd(xh.c("selectWorld.data_read")));

      Dynamic<?> $$2;
      etl $$3;
      try {
         $$2 = $$0.h();
         $$3 = $$0.a($$2);
      } catch (uu | va | IOException var10) {
         this.c.a(new fqr(this.c, $$2x -> {
            if ($$2x) {
               this.a($$0, $$1);
            } else {
               $$0.c();
               $$1.run();
            }
         }, $$0));
         return;
      } catch (OutOfMemoryError var11) {
         azh.b();
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

   private void a(etk.c $$0, etl $$1, Dynamic<?> $$2, Runnable $$3) {
      if (!$$1.r()) {
         $$0.c();
         this.c.a(new fpl($$3, xh.c("selectWorld.incompatible.title").b(-65536), xh.a("selectWorld.incompatible.description", $$1.k())));
      } else {
         etl.a $$4 = $$1.o();
         if ($$4.a()) {
            String $$5 = "selectWorld.backupQuestion." + $$4.c();
            String $$6 = "selectWorld.backupWarning." + $$4.c();
            xv $$7 = xh.c($$5);
            if ($$4.b()) {
               $$7.b(-2142128);
            }

            xh $$8 = xh.a($$6, $$1.k(), ab.b().c());
            this.c.a(new fpm(() -> {
               $$0.c();
               $$3.run();
            }, ($$3x, $$4x) -> {
               if ($$3x) {
                  fvr.a($$0);
               }

               this.a($$0, $$2, false, $$3);
            }, $$7, $$8, false));
         } else {
            this.a($$0, $$2, false, $$3);
         }
      }
   }

   private void a(etk.c $$0, Dynamic<?> $$1, boolean $$2, Runnable $$3) {
      this.c.d(new fqd(xh.c("selectWorld.resource_load")));
      auk $$4 = aun.a($$0);

      amg $$5;
      try {
         $$5 = this.a($$1, $$2, $$4);

         for (dza $$6 : $$5.c().a().e(ly.bc)) {
            $$6.b().a();
         }
      } catch (Exception var9) {
         a.warn("Failed to load level data or datapacks, can't proceed with server load", var9);
         if (!$$2) {
            this.c.a(new fpv(() -> {
               $$0.c();
               $$3.run();
            }, () -> this.a($$0, $$1, true, $$3)));
         } else {
            $$0.c();
            this.c.a(new fpl($$3, xh.c("datapackFailure.safeMode.failed.title"), xh.c("datapackFailure.safeMode.failed.description"), xg.k, true));
         }

         return;
      }

      this.a($$0, $$5, $$4, $$3);
   }

   private void a(etk.c $$0, amg $$1, auk $$2, Runnable $$3) {
      etq $$4 = $$1.d();
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

   private void b(etk.c $$0, amg $$1, auk $$2, Runnable $$3) {
      har $$4 = this.c.af();
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

   private void a(etk.c $$0, amg $$1, har $$2, auk $$3, Runnable $$4) {
      if ($$0.b()) {
         this.c.a(new fpq($$5 -> {
            if ($$5) {
               this.a($$0, $$1, $$3);
            } else {
               $$2.e();
               $$1.close();
               $$0.c();
               $$4.run();
            }
         }, xh.c("selectWorld.warning.lowDiskSpace.title").a(n.m), xh.c("selectWorld.warning.lowDiskSpace.description"), xg.j, xg.k));
      } else {
         this.a($$0, $$1, $$3);
      }
   }

   private void a(etk.c $$0, amg $$1, auk $$2) {
      this.c.a($$0, $$2, $$1, false);
   }

   private CompletableFuture<Void> a(har $$0, etk.c $$1) {
      Path $$2 = $$1.a(eti.k);
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
      this.c.a(new fpq($$0::complete, xh.c("multiplayer.texturePrompt.failure.line1"), xh.c("multiplayer.texturePrompt.failure.line2"), xg.i, xg.e));
      return $$0;
   }
}

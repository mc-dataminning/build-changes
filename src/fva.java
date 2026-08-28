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

public class fva {
   private static final Logger a = LogUtils.getLogger();
   private static final UUID b = UUID.fromString("640a6a92-b6cb-48a0-b391-831586500359");
   private final fib c;
   private final esh d;

   public fva(fib $$0, esh $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(String $$0, ddw $$1, eau $$2, Function<jp.a, ear> $$3, fpt $$4) {
      this.c.d(new fpe(xd.c("selectWorld.data_read")));
      esh.c $$5 = this.a($$0);
      if ($$5 != null) {
         aud $$6 = aug.a($$5);
         deo $$7 = $$1.g();

         try {
            alz.d $$8 = new alz.d($$6, $$7, false, false);
            ama $$9 = this.a($$8, $$3x -> {
               ear.b $$4x = $$3.apply($$3x.c()).a($$3x.d().d(lv.bb));
               return new alz.b<>(new esl($$1, $$2, $$4x.d(), $$4x.a()), $$4x.b());
            }, ama::new);
            this.c.a($$5, $$6, $$9, true);
         } catch (Exception var11) {
            a.warn("Failed to load datapacks, can't proceed with server load", var11);
            $$5.c();
            this.c.a($$4);
         }
      }
   }

   @Nullable
   private esh.c a(String $$0) {
      try {
         return this.d.d($$0);
      } catch (IOException var3) {
         a.warn("Failed to read level {} data", $$0, var3);
         fmj.a(this.c, $$0);
         this.c.a(null);
         return null;
      } catch (ext var4) {
         a.warn("{}", var4.getMessage());
         this.c.a(fpl.a(() -> this.c.a(null)));
         return null;
      }
   }

   public void a(esh.c $$0, alm $$1, ju<alk> $$2, esn $$3) {
      aud $$4 = aug.a($$0);
      aui $$5 = (aui)new alz.d($$4, $$3.D(), false, false).a().getSecond();
      this.c.a($$0, $$4, new ama($$5, $$1, $$2, $$3), true);
   }

   public ama a(Dynamic<?> $$0, boolean $$1, aud $$2) throws Exception {
      alz.d $$3 = esh.a($$0, $$2, $$1);
      return this.a($$3, $$1x -> {
         ka<dxx> $$2x = $$1x.d().d(lv.bb);
         ese $$3x = esh.a($$0, $$1x.b(), $$2x, $$1x.c());
         return new alz.b<>($$3x.a(), $$3x.b().b());
      }, ama::new);
   }

   public Pair<ddw, fuy> a(esh.c $$0) throws Exception {
      aud $$1 = aug.a($$0);
      Dynamic<?> $$2 = $$0.h();
      alz.d $$3 = esh.a($$2, $$1, false);

      record a(ddw a, eau b, ka<dxx> c) {
      }

      return this.a($$3, $$1x -> {
         ka<dxx> $$2x = new jv<>(lv.bb, Lifecycle.stable()).l();
         ese $$3x = esh.a($$2, $$1x.b(), $$2x, $$1x.c());
         return new alz.b<>(new a($$3x.a().J(), $$3x.a().y(), $$3x.b().c()), $$1x.d());
      }, ($$0x, $$1x, $$2x, $$3x) -> {
         $$0x.close();
         return Pair.of($$3x.a, new fuy($$3x.b, new ear($$3x.c), $$2x, $$1x, $$3x.a.g()));
      });
   }

   private <D, R> R a(alz.d $$0, alz.f<D> $$1, alz.e<D, R> $$2) throws Exception {
      alz.c $$3 = new alz.c($$0, eu.a.c, 2);
      CompletableFuture<R> $$4 = alz.a($$3, $$1, $$2, ad.g(), this.c);
      this.c.b($$4::isDone);
      return $$4.get();
   }

   private void a(esh.c $$0, boolean $$1, Runnable $$2, Runnable $$3) {
      xd $$4;
      xd $$5;
      if ($$1) {
         $$4 = xd.c("selectWorld.backupQuestion.customized");
         $$5 = xd.c("selectWorld.backupWarning.customized");
      } else {
         $$4 = xd.c("selectWorld.backupQuestion.experimental");
         $$5 = xd.c("selectWorld.backupWarning.experimental");
      }

      this.c.a(new fom($$3, ($$2x, $$3x) -> {
         if ($$2x) {
            fus.a($$0);
         }

         $$2.run();
      }, $$4, $$5, false));
   }

   public static void a(fib $$0, fuq $$1, Lifecycle $$2, Runnable $$3, boolean $$4) {
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
         $$0.a(new foq($$5, xd.c("selectWorld.warning.experimental.title"), xd.c("selectWorld.warning.experimental.question")));
      } else {
         $$0.a(new foq($$5, xd.c("selectWorld.warning.deprecated.title"), xd.c("selectWorld.warning.deprecated.question")));
      }
   }

   public void a(String $$0, Runnable $$1) {
      this.c.d(new fpe(xd.c("selectWorld.data_read")));
      esh.c $$2 = this.a($$0);
      if ($$2 != null) {
         this.a($$2, $$1);
      }
   }

   private void a(esh.c $$0, Runnable $$1) {
      this.c.d(new fpe(xd.c("selectWorld.data_read")));

      Dynamic<?> $$2;
      esi $$3;
      try {
         $$2 = $$0.h();
         $$3 = $$0.a($$2);
      } catch (uq | uw | IOException var10) {
         this.c.a(new fps(this.c, $$2x -> {
            if ($$2x) {
               this.a($$0, $$1);
            } else {
               $$0.c();
               $$1.run();
            }
         }, $$0));
         return;
      } catch (OutOfMemoryError var11) {
         aza.b();
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

   private void a(esh.c $$0, esi $$1, Dynamic<?> $$2, Runnable $$3) {
      if (!$$1.r()) {
         $$0.c();
         this.c.a(new fol($$3, xd.c("selectWorld.incompatible.title").b(-65536), xd.a("selectWorld.incompatible.description", $$1.k())));
      } else {
         esi.a $$4 = $$1.o();
         if ($$4.a()) {
            String $$5 = "selectWorld.backupQuestion." + $$4.c();
            String $$6 = "selectWorld.backupWarning." + $$4.c();
            xr $$7 = xd.c($$5);
            if ($$4.b()) {
               $$7.b(-2142128);
            }

            xd $$8 = xd.a($$6, $$1.k(), ab.b().c());
            this.c.a(new fom(() -> {
               $$0.c();
               $$3.run();
            }, ($$3x, $$4x) -> {
               if ($$3x) {
                  fus.a($$0);
               }

               this.a($$0, $$2, false, $$3);
            }, $$7, $$8, false));
         } else {
            this.a($$0, $$2, false, $$3);
         }
      }
   }

   private void a(esh.c $$0, Dynamic<?> $$1, boolean $$2, Runnable $$3) {
      this.c.d(new fpe(xd.c("selectWorld.resource_load")));
      aud $$4 = aug.a($$0);

      ama $$5;
      try {
         $$5 = this.a($$1, $$2, $$4);

         for (dxx $$6 : $$5.c().a().d(lv.bb)) {
            $$6.b().a();
         }
      } catch (Exception var9) {
         a.warn("Failed to load level data or datapacks, can't proceed with server load", var9);
         if (!$$2) {
            this.c.a(new fow(() -> {
               $$0.c();
               $$3.run();
            }, () -> this.a($$0, $$1, true, $$3)));
         } else {
            $$0.c();
            this.c.a(new fol($$3, xd.c("datapackFailure.safeMode.failed.title"), xd.c("datapackFailure.safeMode.failed.description"), xc.k, true));
         }

         return;
      }

      this.a($$0, $$5, $$4, $$3);
   }

   private void a(esh.c $$0, ama $$1, aud $$2, Runnable $$3) {
      esn $$4 = $$1.d();
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

   private void b(esh.c $$0, ama $$1, aud $$2, Runnable $$3) {
      gzg $$4 = this.c.ae();
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

   private void a(esh.c $$0, ama $$1, gzg $$2, aud $$3, Runnable $$4) {
      if ($$0.b()) {
         this.c.a(new foq($$5 -> {
            if ($$5) {
               this.a($$0, $$1, $$3);
            } else {
               $$2.e();
               $$1.close();
               $$0.c();
               $$4.run();
            }
         }, xd.c("selectWorld.warning.lowDiskSpace.title").a(n.m), xd.c("selectWorld.warning.lowDiskSpace.description"), xc.j, xc.k));
      } else {
         this.a($$0, $$1, $$3);
      }
   }

   private void a(esh.c $$0, ama $$1, aud $$2) {
      this.c.a($$0, $$2, $$1, false);
   }

   private CompletableFuture<Void> a(gzg $$0, esh.c $$1) {
      Path $$2 = $$1.a(esf.k);
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
      this.c.a(new foq($$0::complete, xd.c("multiplayer.texturePrompt.failure.line1"), xd.c("multiplayer.texturePrompt.failure.line2"), xc.i, xc.e));
      return $$0;
   }
}

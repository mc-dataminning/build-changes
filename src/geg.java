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

public class geg {
   private static final Logger a = LogUtils.getLogger();
   private static final UUID b = UUID.fromString("640a6a92-b6cb-48a0-b391-831586500359");
   private final fpt c;
   private final ezh d;

   public geg(fpt $$0, ezh $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(String $$0, djq $$1, ehq $$2, Function<jh.a, ehn> $$3, fys $$4) {
      this.c.d(new fyd(wy.c("selectWorld.data_read")));
      ezh.c $$5 = this.a($$0);
      if ($$5 != null) {
         aun $$6 = auq.a($$5);
         dkk $$7 = $$1.g();

         try {
            ame.d $$8 = new ame.d($$6, $$7, false, false);
            amf $$9 = this.a($$8, $$3x -> {
               ehn.b $$4x = $$3.apply($$3x.c()).a($$3x.d().f(mh.bq));
               return new ame.b<>(new ezl($$1, $$2, $$4x.d(), $$4x.a()), $$4x.b());
            }, amf::new);
            this.c.a($$5, $$6, $$9, true);
         } catch (Exception var11) {
            a.warn("Failed to load datapacks, can't proceed with server load", var11);
            $$5.c();
            this.c.a($$4);
         }
      }
   }

   @Nullable
   private ezh.c a(String $$0) {
      try {
         return this.d.d($$0);
      } catch (IOException var3) {
         a.warn("Failed to read level {} data", $$0, var3);
         fvj.a(this.c, $$0);
         this.c.a(null);
         return null;
      } catch (fer var4) {
         a.warn("{}", var4.getMessage());
         this.c.a(fyk.a(() -> this.c.a(null)));
         return null;
      }
   }

   public void a(ezh.c $$0, alr $$1, jm<alp> $$2, ezn $$3) {
      aun $$4 = auq.a($$0);
      aus $$5 = (aus)new ame.d($$4, $$3.D(), false, false).a().getSecond();
      this.c.a($$0, $$4, new amf($$5, $$1, $$2, $$3), true);
   }

   public amf a(Dynamic<?> $$0, boolean $$1, aun $$2) throws Exception {
      ame.d $$3 = ezh.a($$0, $$2, $$1);
      return this.a($$3, $$1x -> {
         js<eer> $$2x = $$1x.d().f(mh.bq);
         eze $$3x = ezh.a($$0, $$1x.b(), $$2x, $$1x.c());
         return new ame.b<>($$3x.a(), $$3x.b().b());
      }, amf::new);
   }

   public Pair<djq, ged> a(ezh.c $$0) throws Exception {
      aun $$1 = auq.a($$0);
      Dynamic<?> $$2 = $$0.h();
      ame.d $$3 = ezh.a($$2, $$1, false);

      record a(djq a, ehq b, js<eer> c) {
      }

      return this.a($$3, $$1x -> {
         js<eer> $$2x = new jn<>(mh.bq, Lifecycle.stable()).n();
         eze $$3x = ezh.a($$2, $$1x.b(), $$2x, $$1x.c());
         return new ame.b<>(new a($$3x.a().J(), $$3x.a().y(), $$3x.b().c()), $$1x.d());
      }, ($$0x, $$1x, $$2x, $$3x) -> {
         $$0x.close();
         gdy $$4 = new gdy(gef.a.a, Set.of(), null);
         return Pair.of($$3x.a, new ged($$3x.b, new ehn($$3x.c), $$2x, $$1x, $$3x.a.g(), $$4));
      });
   }

   private <D, R> R a(ame.d $$0, ame.f<D> $$1, ame.e<D, R> $$2) throws Exception {
      ame.c $$3 = new ame.c($$0, ek.a.c, 2);
      CompletableFuture<R> $$4 = ame.a($$3, $$1, $$2, ag.h(), this.c);
      this.c.b($$4::isDone);
      return $$4.get();
   }

   private void a(ezh.c $$0, boolean $$1, Runnable $$2, Runnable $$3) {
      wy $$4;
      wy $$5;
      if ($$1) {
         $$4 = wy.c("selectWorld.backupQuestion.customized");
         $$5 = wy.c("selectWorld.backupWarning.customized");
      } else {
         $$4 = wy.c("selectWorld.backupQuestion.experimental");
         $$5 = wy.c("selectWorld.backupWarning.experimental");
      }

      this.c.a(new fxm($$3, ($$2x, $$3x) -> {
         if ($$2x) {
            gdw.a($$0);
         }

         $$2.run();
      }, $$4, $$5, false));
   }

   public static void a(fpt $$0, gdt $$1, Lifecycle $$2, Runnable $$3, boolean $$4) {
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
         $$0.a(new fxq($$5, wy.c("selectWorld.warning.experimental.title"), wy.c("selectWorld.warning.experimental.question")));
      } else {
         $$0.a(new fxq($$5, wy.c("selectWorld.warning.deprecated.title"), wy.c("selectWorld.warning.deprecated.question")));
      }
   }

   public void a(String $$0, Runnable $$1) {
      this.c.d(new fyd(wy.c("selectWorld.data_read")));
      ezh.c $$2 = this.a($$0);
      if ($$2 != null) {
         this.a($$2, $$1);
      }
   }

   private void a(ezh.c $$0, Runnable $$1) {
      this.c.d(new fyd(wy.c("selectWorld.data_read")));

      Dynamic<?> $$2;
      ezi $$3;
      try {
         $$2 = $$0.h();
         $$3 = $$0.a($$2);
      } catch (uk | uq | IOException var10) {
         this.c.a(new fyr(this.c, $$2x -> {
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

   private void a(ezh.c $$0, ezi $$1, Dynamic<?> $$2, Runnable $$3) {
      if (!$$1.r()) {
         $$0.c();
         this.c.a(new fxl($$3, wy.c("selectWorld.incompatible.title").b(-65536), wy.a("selectWorld.incompatible.description", $$1.k())));
      } else {
         ezi.a $$4 = $$1.o();
         if ($$4.a()) {
            String $$5 = "selectWorld.backupQuestion." + $$4.c();
            String $$6 = "selectWorld.backupWarning." + $$4.c();
            xm $$7 = wy.c($$5);
            if ($$4.b()) {
               $$7.b(-2142128);
            }

            wy $$8 = wy.a($$6, $$1.k(), ac.b().c());
            this.c.a(new fxm(() -> {
               $$0.c();
               $$3.run();
            }, ($$3x, $$4x) -> {
               if ($$3x) {
                  gdw.a($$0);
               }

               this.a($$0, $$2, false, $$3);
            }, $$7, $$8, false));
         } else {
            this.a($$0, $$2, false, $$3);
         }
      }
   }

   private void a(ezh.c $$0, Dynamic<?> $$1, boolean $$2, Runnable $$3) {
      this.c.d(new fyd(wy.c("selectWorld.resource_load")));
      aun $$4 = auq.a($$0);

      amf $$5;
      try {
         $$5 = this.a($$1, $$2, $$4);

         for (eer $$6 : $$5.c().a().f(mh.bq)) {
            $$6.b().a();
         }
      } catch (Exception var9) {
         a.warn("Failed to load level data or datapacks, can't proceed with server load", var9);
         if (!$$2) {
            this.c.a(new fxv(() -> {
               $$0.c();
               $$3.run();
            }, () -> this.a($$0, $$1, true, $$3)));
         } else {
            $$0.c();
            this.c.a(new fxl($$3, wy.c("datapackFailure.safeMode.failed.title"), wy.c("datapackFailure.safeMode.failed.description"), wx.k, true));
         }

         return;
      }

      this.a($$0, $$5, $$4, $$3);
   }

   private void a(ezh.c $$0, amf $$1, aun $$2, Runnable $$3) {
      ezn $$4 = $$1.d();
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

   private void b(ezh.c $$0, amf $$1, aun $$2, Runnable $$3) {
      hmq $$4 = this.c.af();
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

   private void a(ezh.c $$0, amf $$1, hmq $$2, aun $$3, Runnable $$4) {
      if ($$0.b()) {
         this.c.a(new fxq($$5 -> {
            if ($$5) {
               this.a($$0, $$1, $$3);
            } else {
               $$2.e();
               $$1.close();
               $$0.c();
               $$4.run();
            }
         }, wy.c("selectWorld.warning.lowDiskSpace.title").a(o.m), wy.c("selectWorld.warning.lowDiskSpace.description"), wx.j, wx.k));
      } else {
         this.a($$0, $$1, $$3);
      }
   }

   private void a(ezh.c $$0, amf $$1, aun $$2) {
      this.c.a($$0, $$2, $$1, false);
   }

   private CompletableFuture<Void> a(hmq $$0, ezh.c $$1) {
      Path $$2 = $$1.a(ezf.k);
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
      this.c.a(new fxq($$0::complete, wy.c("multiplayer.texturePrompt.failure.line1"), wy.c("multiplayer.texturePrompt.failure.line2"), wx.i, wx.e));
      return $$0;
   }
}

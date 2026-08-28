import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class gfj extends gaf {
   private static final Logger a = LogUtils.getLogger();
   private static final xc b = xc.c("selectWorld.enterName").a(o.h);
   private static final xc c = xc.c("selectWorld.edit.resetIcon");
   private static final xc d = xc.c("selectWorld.edit.openFolder");
   private static final xc s = xc.c("selectWorld.edit.backup");
   private static final xc u = xc.c("selectWorld.edit.backupFolder");
   private static final xc v = xc.c("selectWorld.edit.optimize");
   private static final xc w = xc.c("optimizeWorld.confirm.title");
   private static final xc x = xc.c("optimizeWorld.confirm.description");
   private static final xc y = xc.c("optimizeWorld.confirm.proceed");
   private static final xc z = xc.c("selectWorld.edit.save");
   private static final int A = 200;
   private static final int B = 4;
   private static final int C = 98;
   private final fyf D = fyf.d().a(5);
   private final BooleanConsumer E;
   private final ezx.c F;
   private final fuw G;

   public static gfj a(frf $$0, ezx.c $$1, BooleanConsumer $$2) throws IOException {
      ezy $$3 = $$1.a($$1.h());
      return new gfj($$0, $$1, $$3.b(), $$2);
   }

   private gfj(frf $$0, ezx.c $$1, String $$2, BooleanConsumer $$3) {
      super(xc.c("selectWorld.edit.title"));
      this.E = $$3;
      this.F = $$1;
      ftx $$4 = $$0.h;
      this.D.a(new fyg(200, 20));
      this.D.a(new fvu(b, $$4));
      this.G = this.D.a(new fuw($$4, 200, 20, b));
      this.G.a($$2);
      fyf $$5 = fyf.e().a(4);
      fun $$6 = $$5.a(fun.a(z, $$0x -> this.a(this.G.a())).a(98).a());
      $$5.a(fun.a(xb.e, $$0x -> this.aP_()).a(98).a());
      this.G.b($$1x -> $$6.j = !bap.h($$1x));
      this.D.a(fun.a(c, $$1x -> {
         $$1.j().ifPresent($$0xx -> FileUtils.deleteQuietly($$0xx.toFile()));
         $$1x.j = false;
      }).a(200).a()).j = $$1.j().filter($$0x -> Files.isRegularFile($$0x)).isPresent();
      this.D.a(fun.a(d, $$1x -> ag.n().a($$1.a(ezv.l))).a(200).a());
      this.D.a(fun.a(s, $$1x -> {
         boolean $$2x = a($$1);
         this.E.accept(!$$2x);
      }).a(200).a());
      this.D.a(fun.a(u, $$1x -> {
         ezx $$2x = $$0.m();
         Path $$3x = $$2x.d();

         try {
            w.c($$3x);
         } catch (IOException var5x) {
            throw new RuntimeException(var5x);
         }

         ag.n().a($$3x);
      }).a(200).a());
      this.D.a(fun.a(v, $$2x -> $$0.a(new fyz(() -> $$0.a(this), ($$2xx, $$3x) -> {
            if ($$2xx) {
               a($$1);
            }

            $$0.a(gfm.a($$0, this.E, $$0.au(), $$1, $$3x));
         }, w, x, y, true))).a(200).a());
      this.D.a(new fyg(200, 20));
      this.D.a($$5);
      this.D.a($$1x -> {
         ful var10000 = this.c($$1x);
      });
   }

   @Override
   protected void aG_() {
      this.b(this.G);
   }

   @Override
   protected void aS_() {
      this.c();
   }

   @Override
   protected void c() {
      this.D.a();
      fxz.a(this.D, this.J());
   }

   @Override
   public void aP_() {
      this.E.accept(false);
   }

   private void a(String $$0) {
      try {
         this.F.a($$0);
      } catch (ul | us | IOException var3) {
         a.error("Failed to access world '{}'", this.F.f(), var3);
         fww.a(this.m, this.F.f());
      }

      this.E.accept(true);
   }

   public static boolean a(ezx.c $$0) {
      long $$1 = 0L;
      IOException $$2 = null;

      try {
         $$1 = $$0.l();
      } catch (IOException var6) {
         $$2 = var6;
      }

      if ($$2 != null) {
         xc $$4 = xc.c("selectWorld.edit.backupFailed");
         xc $$5 = xc.b($$2.getMessage());
         frf.Q().aA().a(new fww(fww.a.b, $$4, $$5));
         return false;
      } else {
         xc $$6 = xc.a("selectWorld.edit.backupCreated", $$0.f());
         xc $$7 = xc.a("selectWorld.edit.backupSize", azq.c((double)$$1 / 1048576.0));
         frf.Q().aA().a(new fww(fww.a.b, $$6, $$7));
         return true;
      }
   }

   @Override
   public void a(ftz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 15, 16777215);
   }
}

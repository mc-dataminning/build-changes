import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class geu extends fzq {
   private static final Logger a = LogUtils.getLogger();
   private static final xg b = xg.c("selectWorld.enterName").a(o.h);
   private static final xg c = xg.c("selectWorld.edit.resetIcon");
   private static final xg d = xg.c("selectWorld.edit.openFolder");
   private static final xg s = xg.c("selectWorld.edit.backup");
   private static final xg u = xg.c("selectWorld.edit.backupFolder");
   private static final xg v = xg.c("selectWorld.edit.optimize");
   private static final xg w = xg.c("optimizeWorld.confirm.title");
   private static final xg x = xg.c("optimizeWorld.confirm.description");
   private static final xg y = xg.c("optimizeWorld.confirm.proceed");
   private static final xg z = xg.c("selectWorld.edit.save");
   private static final int A = 200;
   private static final int B = 4;
   private static final int C = 98;
   private final fxq D = fxq.d().a(5);
   private final BooleanConsumer E;
   private final fah.c F;
   private final fuh G;

   public static geu a(fqq $$0, fah.c $$1, BooleanConsumer $$2) throws IOException {
      fai $$3 = $$1.a($$1.h());
      return new geu($$0, $$1, $$3.b(), $$2);
   }

   private geu(fqq $$0, fah.c $$1, String $$2, BooleanConsumer $$3) {
      super(xg.c("selectWorld.edit.title"));
      this.E = $$3;
      this.F = $$1;
      fti $$4 = $$0.h;
      this.D.a(new fxr(200, 20));
      this.D.a(new fvf(b, $$4));
      this.G = this.D.a(new fuh($$4, 200, 20, b));
      this.G.a($$2);
      fxq $$5 = fxq.e().a(4);
      fty $$6 = $$5.a(fty.a(z, $$0x -> this.a(this.G.a())).a(98).a());
      $$5.a(fty.a(xf.e, $$0x -> this.aL_()).a(98).a());
      this.G.b($$1x -> $$6.j = !bay.h($$1x));
      this.D.a(fty.a(c, $$1x -> {
         $$1.j().ifPresent($$0xx -> FileUtils.deleteQuietly($$0xx.toFile()));
         $$1x.j = false;
      }).a(200).a()).j = $$1.j().filter($$0x -> Files.isRegularFile($$0x)).isPresent();
      this.D.a(fty.a(d, $$1x -> ag.n().a($$1.a(faf.l))).a(200).a());
      this.D.a(fty.a(s, $$1x -> {
         boolean $$2x = a($$1);
         this.E.accept(!$$2x);
      }).a(200).a());
      this.D.a(fty.a(u, $$1x -> {
         fah $$2x = $$0.m();
         Path $$3x = $$2x.d();

         try {
            w.c($$3x);
         } catch (IOException var5x) {
            throw new RuntimeException(var5x);
         }

         ag.n().a($$3x);
      }).a(200).a());
      this.D.a(fty.a(v, $$2x -> $$0.a(new fyk(() -> $$0.a(this), ($$2xx, $$3x) -> {
            if ($$2xx) {
               a($$1);
            }

            $$0.a(gex.a($$0, this.E, $$0.au(), $$1, $$3x));
         }, w, x, y, true))).a(200).a());
      this.D.a(new fxr(200, 20));
      this.D.a($$5);
      this.D.a($$1x -> {
         ftw var10000 = this.c($$1x);
      });
   }

   @Override
   protected void aC_() {
      this.b(this.G);
   }

   @Override
   protected void aO_() {
      this.c();
   }

   @Override
   protected void c() {
      this.D.a();
      fxk.a(this.D, this.J());
   }

   @Override
   public void aL_() {
      this.E.accept(false);
   }

   private void a(String $$0) {
      try {
         this.F.a($$0);
      } catch (ul | us | IOException var3) {
         a.error("Failed to access world '{}'", this.F.f(), var3);
         fwh.a(this.m, this.F.f());
      }

      this.E.accept(true);
   }

   public static boolean a(fah.c $$0) {
      long $$1 = 0L;
      IOException $$2 = null;

      try {
         $$1 = $$0.l();
      } catch (IOException var6) {
         $$2 = var6;
      }

      if ($$2 != null) {
         xg $$4 = xg.c("selectWorld.edit.backupFailed");
         xg $$5 = xg.b($$2.getMessage());
         fqq.Q().aA().a(new fwh(fwh.a.b, $$4, $$5));
         return false;
      } else {
         xg $$6 = xg.a("selectWorld.edit.backupCreated", $$0.f());
         xg $$7 = xg.a("selectWorld.edit.backupSize", azz.c((double)$$1 / 1048576.0));
         fqq.Q().aA().a(new fwh(fwh.a.b, $$6, $$7));
         return true;
      }
   }

   @Override
   public void a(ftk $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 15, 16777215);
   }
}

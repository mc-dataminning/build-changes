import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class gfh extends gad {
   private static final Logger a = LogUtils.getLogger();
   private static final xa b = xa.c("selectWorld.enterName").a(o.h);
   private static final xa c = xa.c("selectWorld.edit.resetIcon");
   private static final xa d = xa.c("selectWorld.edit.openFolder");
   private static final xa s = xa.c("selectWorld.edit.backup");
   private static final xa u = xa.c("selectWorld.edit.backupFolder");
   private static final xa v = xa.c("selectWorld.edit.optimize");
   private static final xa w = xa.c("optimizeWorld.confirm.title");
   private static final xa x = xa.c("optimizeWorld.confirm.description");
   private static final xa y = xa.c("optimizeWorld.confirm.proceed");
   private static final xa z = xa.c("selectWorld.edit.save");
   private static final int A = 200;
   private static final int B = 4;
   private static final int C = 98;
   private final fyd D = fyd.d().a(5);
   private final BooleanConsumer E;
   private final ezv.c F;
   private final fuu G;

   public static gfh a(frd $$0, ezv.c $$1, BooleanConsumer $$2) throws IOException {
      ezw $$3 = $$1.a($$1.h());
      return new gfh($$0, $$1, $$3.b(), $$2);
   }

   private gfh(frd $$0, ezv.c $$1, String $$2, BooleanConsumer $$3) {
      super(xa.c("selectWorld.edit.title"));
      this.E = $$3;
      this.F = $$1;
      ftv $$4 = $$0.h;
      this.D.a(new fye(200, 20));
      this.D.a(new fvs(b, $$4));
      this.G = this.D.a(new fuu($$4, 200, 20, b));
      this.G.a($$2);
      fyd $$5 = fyd.e().a(4);
      ful $$6 = $$5.a(ful.a(z, $$0x -> this.a(this.G.a())).a(98).a());
      $$5.a(ful.a(wz.e, $$0x -> this.aP_()).a(98).a());
      this.G.b($$1x -> $$6.j = !ban.h($$1x));
      this.D.a(ful.a(c, $$1x -> {
         $$1.j().ifPresent($$0xx -> FileUtils.deleteQuietly($$0xx.toFile()));
         $$1x.j = false;
      }).a(200).a()).j = $$1.j().filter($$0x -> Files.isRegularFile($$0x)).isPresent();
      this.D.a(ful.a(d, $$1x -> ag.n().a($$1.a(ezt.l))).a(200).a());
      this.D.a(ful.a(s, $$1x -> {
         boolean $$2x = a($$1);
         this.E.accept(!$$2x);
      }).a(200).a());
      this.D.a(ful.a(u, $$1x -> {
         ezv $$2x = $$0.m();
         Path $$3x = $$2x.d();

         try {
            w.c($$3x);
         } catch (IOException var5x) {
            throw new RuntimeException(var5x);
         }

         ag.n().a($$3x);
      }).a(200).a());
      this.D.a(ful.a(v, $$2x -> $$0.a(new fyx(() -> $$0.a(this), ($$2xx, $$3x) -> {
            if ($$2xx) {
               a($$1);
            }

            $$0.a(gfk.a($$0, this.E, $$0.au(), $$1, $$3x));
         }, w, x, y, true))).a(200).a());
      this.D.a(new fye(200, 20));
      this.D.a($$5);
      this.D.a($$1x -> {
         fuj var10000 = this.c($$1x);
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
      fxx.a(this.D, this.J());
   }

   @Override
   public void aP_() {
      this.E.accept(false);
   }

   private void a(String $$0) {
      try {
         this.F.a($$0);
      } catch (uk | ur | IOException var3) {
         a.error("Failed to access world '{}'", this.F.f(), var3);
         fwu.a(this.m, this.F.f());
      }

      this.E.accept(true);
   }

   public static boolean a(ezv.c $$0) {
      long $$1 = 0L;
      IOException $$2 = null;

      try {
         $$1 = $$0.l();
      } catch (IOException var6) {
         $$2 = var6;
      }

      if ($$2 != null) {
         xa $$4 = xa.c("selectWorld.edit.backupFailed");
         xa $$5 = xa.b($$2.getMessage());
         frd.Q().aA().a(new fwu(fwu.a.b, $$4, $$5));
         return false;
      } else {
         xa $$6 = xa.a("selectWorld.edit.backupCreated", $$0.f());
         xa $$7 = xa.a("selectWorld.edit.backupSize", azo.c((double)$$1 / 1048576.0));
         frd.Q().aA().a(new fwu(fwu.a.b, $$6, $$7));
         return true;
      }
   }

   @Override
   public void a(ftx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 15, 16777215);
   }
}

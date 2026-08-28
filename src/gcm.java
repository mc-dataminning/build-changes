import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class gcm extends fxi {
   private static final Logger a = LogUtils.getLogger();
   private static final ww b = ww.c("selectWorld.enterName").a(n.h);
   private static final ww c = ww.c("selectWorld.edit.resetIcon");
   private static final ww d = ww.c("selectWorld.edit.openFolder");
   private static final ww s = ww.c("selectWorld.edit.backup");
   private static final ww u = ww.c("selectWorld.edit.backupFolder");
   private static final ww v = ww.c("selectWorld.edit.optimize");
   private static final ww w = ww.c("optimizeWorld.confirm.title");
   private static final ww x = ww.c("optimizeWorld.confirm.description");
   private static final ww y = ww.c("optimizeWorld.confirm.proceed");
   private static final ww z = ww.c("selectWorld.edit.save");
   private static final int A = 200;
   private static final int B = 4;
   private static final int C = 98;
   private final fvi D = fvi.d().a(5);
   private final BooleanConsumer E;
   private final eyb.c F;
   private final frz G;

   public static gcm a(fof $$0, eyb.c $$1, BooleanConsumer $$2) throws IOException {
      eyc $$3 = $$1.a($$1.h());
      return new gcm($$0, $$1, $$3.b(), $$2);
   }

   private gcm(fof $$0, eyb.c $$1, String $$2, BooleanConsumer $$3) {
      super(ww.c("selectWorld.edit.title"));
      this.E = $$3;
      this.F = $$1;
      fra $$4 = $$0.h;
      this.D.a(new fvj(200, 20));
      this.D.a(new fsx(b, $$4));
      this.G = this.D.a(new frz($$4, 200, 20, b));
      this.G.a($$2);
      fvi $$5 = fvi.e().a(4);
      frq $$6 = $$5.a(frq.a(z, $$0x -> this.a(this.G.a())).a(98).a());
      $$5.a(frq.a(wv.e, $$0x -> this.aK_()).a(98).a());
      this.G.b($$1x -> $$6.j = !baj.h($$1x));
      this.D.a(frq.a(c, $$1x -> {
         $$1.j().ifPresent($$0xx -> FileUtils.deleteQuietly($$0xx.toFile()));
         $$1x.j = false;
      }).a(200).a()).j = $$1.j().filter($$0x -> Files.isRegularFile($$0x)).isPresent();
      this.D.a(frq.a(d, $$1x -> af.n().a($$1.a(exz.l))).a(200).a());
      this.D.a(frq.a(s, $$1x -> {
         boolean $$2x = a($$1);
         this.E.accept(!$$2x);
      }).a(200).a());
      this.D.a(frq.a(u, $$1x -> {
         eyb $$2x = $$0.m();
         Path $$3x = $$2x.d();

         try {
            v.c($$3x);
         } catch (IOException var5x) {
            throw new RuntimeException(var5x);
         }

         af.n().a($$3x);
      }).a(200).a());
      this.D.a(frq.a(v, $$2x -> $$0.a(new fwc(() -> $$0.a(this), ($$2xx, $$3x) -> {
            if ($$2xx) {
               a($$1);
            }

            $$0.a(gcp.a($$0, this.E, $$0.au(), $$1, $$3x));
         }, w, x, y, true))).a(200).a());
      this.D.a(new fvj(200, 20));
      this.D.a($$5);
      this.D.a($$1x -> {
         fro var10000 = this.c($$1x);
      });
   }

   @Override
   protected void aB_() {
      this.b(this.G);
   }

   @Override
   protected void aN_() {
      this.c();
   }

   @Override
   protected void c() {
      this.D.a();
      fvc.a(this.D, this.J());
   }

   @Override
   public void aK_() {
      this.E.accept(false);
   }

   private void a(String $$0) {
      try {
         this.F.a($$0);
      } catch (ui | uo | IOException var3) {
         a.error("Failed to access world '{}'", this.F.f(), var3);
         ftz.a(this.m, this.F.f());
      }

      this.E.accept(true);
   }

   public static boolean a(eyb.c $$0) {
      long $$1 = 0L;
      IOException $$2 = null;

      try {
         $$1 = $$0.l();
      } catch (IOException var6) {
         $$2 = var6;
      }

      if ($$2 != null) {
         ww $$4 = ww.c("selectWorld.edit.backupFailed");
         ww $$5 = ww.b($$2.getMessage());
         fof.Q().aA().a(new ftz(ftz.a.b, $$4, $$5));
         return false;
      } else {
         ww $$6 = ww.a("selectWorld.edit.backupCreated", $$0.f());
         ww $$7 = ww.a("selectWorld.edit.backupSize", azk.c((double)$$1 / 1048576.0));
         fof.Q().aA().a(new ftz(ftz.a.b, $$6, $$7));
         return true;
      }
   }

   @Override
   public void a(frc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 15, 16777215);
   }
}

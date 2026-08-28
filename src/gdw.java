import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class gdw extends fys {
   private static final Logger a = LogUtils.getLogger();
   private static final wy b = wy.c("selectWorld.enterName").a(o.h);
   private static final wy c = wy.c("selectWorld.edit.resetIcon");
   private static final wy d = wy.c("selectWorld.edit.openFolder");
   private static final wy s = wy.c("selectWorld.edit.backup");
   private static final wy u = wy.c("selectWorld.edit.backupFolder");
   private static final wy v = wy.c("selectWorld.edit.optimize");
   private static final wy w = wy.c("optimizeWorld.confirm.title");
   private static final wy x = wy.c("optimizeWorld.confirm.description");
   private static final wy y = wy.c("optimizeWorld.confirm.proceed");
   private static final wy z = wy.c("selectWorld.edit.save");
   private static final int A = 200;
   private static final int B = 4;
   private static final int C = 98;
   private final fws D = fws.d().a(5);
   private final BooleanConsumer E;
   private final ezh.c F;
   private final ftj G;

   public static gdw a(fpt $$0, ezh.c $$1, BooleanConsumer $$2) throws IOException {
      ezi $$3 = $$1.a($$1.h());
      return new gdw($$0, $$1, $$3.b(), $$2);
   }

   private gdw(fpt $$0, ezh.c $$1, String $$2, BooleanConsumer $$3) {
      super(wy.c("selectWorld.edit.title"));
      this.E = $$3;
      this.F = $$1;
      fsk $$4 = $$0.h;
      this.D.a(new fwt(200, 20));
      this.D.a(new fuh(b, $$4));
      this.G = this.D.a(new ftj($$4, 200, 20, b));
      this.G.a($$2);
      fws $$5 = fws.e().a(4);
      fta $$6 = $$5.a(fta.a(z, $$0x -> this.a(this.G.a())).a(98).a());
      $$5.a(fta.a(wx.e, $$0x -> this.aL_()).a(98).a());
      this.G.b($$1x -> $$6.j = !bal.h($$1x));
      this.D.a(fta.a(c, $$1x -> {
         $$1.j().ifPresent($$0xx -> FileUtils.deleteQuietly($$0xx.toFile()));
         $$1x.j = false;
      }).a(200).a()).j = $$1.j().filter($$0x -> Files.isRegularFile($$0x)).isPresent();
      this.D.a(fta.a(d, $$1x -> ag.n().a($$1.a(ezf.l))).a(200).a());
      this.D.a(fta.a(s, $$1x -> {
         boolean $$2x = a($$1);
         this.E.accept(!$$2x);
      }).a(200).a());
      this.D.a(fta.a(u, $$1x -> {
         ezh $$2x = $$0.m();
         Path $$3x = $$2x.d();

         try {
            w.c($$3x);
         } catch (IOException var5x) {
            throw new RuntimeException(var5x);
         }

         ag.n().a($$3x);
      }).a(200).a());
      this.D.a(fta.a(v, $$2x -> $$0.a(new fxm(() -> $$0.a(this), ($$2xx, $$3x) -> {
            if ($$2xx) {
               a($$1);
            }

            $$0.a(gdz.a($$0, this.E, $$0.au(), $$1, $$3x));
         }, w, x, y, true))).a(200).a());
      this.D.a(new fwt(200, 20));
      this.D.a($$5);
      this.D.a($$1x -> {
         fsy var10000 = this.c($$1x);
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
      fwm.a(this.D, this.J());
   }

   @Override
   public void aL_() {
      this.E.accept(false);
   }

   private void a(String $$0) {
      try {
         this.F.a($$0);
      } catch (uk | uq | IOException var3) {
         a.error("Failed to access world '{}'", this.F.f(), var3);
         fvj.a(this.m, this.F.f());
      }

      this.E.accept(true);
   }

   public static boolean a(ezh.c $$0) {
      long $$1 = 0L;
      IOException $$2 = null;

      try {
         $$1 = $$0.l();
      } catch (IOException var6) {
         $$2 = var6;
      }

      if ($$2 != null) {
         wy $$4 = wy.c("selectWorld.edit.backupFailed");
         wy $$5 = wy.b($$2.getMessage());
         fpt.Q().aA().a(new fvj(fvj.a.b, $$4, $$5));
         return false;
      } else {
         wy $$6 = wy.a("selectWorld.edit.backupCreated", $$0.f());
         wy $$7 = wy.a("selectWorld.edit.backupSize", azm.c((double)$$1 / 1048576.0));
         fpt.Q().aA().a(new fvj(fvj.a.b, $$6, $$7));
         return true;
      }
   }

   @Override
   public void a(fsm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 15, 16777215);
   }
}

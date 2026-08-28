import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class fvr extends fqs {
   private static final Logger a = LogUtils.getLogger();
   private static final xh b = xh.c("selectWorld.enterName").a(n.h);
   private static final xh c = xh.c("selectWorld.edit.resetIcon");
   private static final xh d = xh.c("selectWorld.edit.openFolder");
   private static final xh s = xh.c("selectWorld.edit.backup");
   private static final xh u = xh.c("selectWorld.edit.backupFolder");
   private static final xh v = xh.c("selectWorld.edit.optimize");
   private static final xh w = xh.c("optimizeWorld.confirm.title");
   private static final xh x = xh.c("optimizeWorld.confirm.description");
   private static final xh y = xh.c("optimizeWorld.confirm.proceed");
   private static final xh z = xh.c("selectWorld.edit.save");
   private static final int A = 200;
   private static final int B = 4;
   private static final int C = 98;
   private final fos D = fos.d().a(5);
   private final BooleanConsumer E;
   private final etk.c F;
   private final fli G;

   public static fvr a(fja $$0, etk.c $$1, BooleanConsumer $$2) throws IOException {
      etl $$3 = $$1.a($$1.h());
      return new fvr($$0, $$1, $$3.b(), $$2);
   }

   private fvr(fja $$0, etk.c $$1, String $$2, BooleanConsumer $$3) {
      super(xh.c("selectWorld.edit.title"));
      this.E = $$3;
      this.F = $$1;
      fkk $$4 = $$0.h;
      this.D.a(new fot(200, 20));
      this.D.a(new fmg(b, $$4));
      this.G = this.D.a(new fli($$4, 200, 20, b));
      this.G.a($$2);
      fos $$5 = fos.e().a(4);
      fkz $$6 = $$5.a(fkz.a(z, $$0x -> this.a(this.G.a())).a(98).a());
      $$5.a(fkz.a(xg.e, $$0x -> this.d()).a(98).a());
      this.G.b($$1x -> $$6.j = !bag.h($$1x));
      this.D.a(fkz.a(c, $$1x -> {
         $$1.j().ifPresent($$0xx -> FileUtils.deleteQuietly($$0xx.toFile()));
         $$1x.j = false;
      }).a(200).a()).j = $$1.j().filter($$0x -> Files.isRegularFile($$0x)).isPresent();
      this.D.a(fkz.a(d, $$1x -> ad.m().a($$1.a(eti.l))).a(200).a());
      this.D.a(fkz.a(s, $$1x -> {
         boolean $$2x = a($$1);
         this.E.accept(!$$2x);
      }).a(200).a());
      this.D.a(fkz.a(u, $$1x -> {
         etk $$2x = $$0.m();
         Path $$3x = $$2x.d();

         try {
            v.c($$3x);
         } catch (IOException var5x) {
            throw new RuntimeException(var5x);
         }

         ad.m().a($$3x);
      }).a(200).a());
      this.D.a(fkz.a(v, $$2x -> $$0.a(new fpm(() -> $$0.a(this), ($$2xx, $$3x) -> {
            if ($$2xx) {
               a($$1);
            }

            $$0.a(fvt.a($$0, this.E, $$0.au(), $$1, $$3x));
         }, w, x, y, true))).a(200).a());
      this.D.a(new fot(200, 20));
      this.D.a($$5);
      this.D.a($$1x -> {
         fkx var10000 = this.c($$1x);
      });
   }

   @Override
   protected void aH_() {
      this.b(this.G);
   }

   @Override
   protected void aS_() {
      this.c();
   }

   @Override
   protected void c() {
      this.D.a();
      fol.a(this.D, this.H());
   }

   @Override
   public void d() {
      this.E.accept(false);
   }

   private void a(String $$0) {
      try {
         this.F.a($$0);
      } catch (uu | va | IOException var3) {
         a.error("Failed to access world '{}'", this.F.f(), var3);
         fni.a(this.m, this.F.f());
      }

      this.E.accept(true);
   }

   public static boolean a(etk.c $$0) {
      long $$1 = 0L;
      IOException $$2 = null;

      try {
         $$1 = $$0.l();
      } catch (IOException var6) {
         $$2 = var6;
      }

      if ($$2 != null) {
         xh $$4 = xh.c("selectWorld.edit.backupFailed");
         xh $$5 = xh.b($$2.getMessage());
         fja.Q().aA().a(new fni(fni.a.b, $$4, $$5));
         return false;
      } else {
         xh $$6 = xh.a("selectWorld.edit.backupCreated", $$0.f());
         xh $$7 = xh.a("selectWorld.edit.backupSize", azj.c((double)$$1 / 1048576.0));
         fja.Q().aA().a(new fni(fni.a.b, $$6, $$7));
         return true;
      }
   }

   @Override
   public void a(fkm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 15, 16777215);
   }
}

import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class fwy extends frw {
   private static final Logger a = LogUtils.getLogger();
   private static final xj b = xj.c("selectWorld.enterName").a(n.h);
   private static final xj c = xj.c("selectWorld.edit.resetIcon");
   private static final xj d = xj.c("selectWorld.edit.openFolder");
   private static final xj s = xj.c("selectWorld.edit.backup");
   private static final xj u = xj.c("selectWorld.edit.backupFolder");
   private static final xj v = xj.c("selectWorld.edit.optimize");
   private static final xj w = xj.c("optimizeWorld.confirm.title");
   private static final xj x = xj.c("optimizeWorld.confirm.description");
   private static final xj y = xj.c("optimizeWorld.confirm.proceed");
   private static final xj z = xj.c("selectWorld.edit.save");
   private static final int A = 200;
   private static final int B = 4;
   private static final int C = 98;
   private final fpw D = fpw.d().a(5);
   private final BooleanConsumer E;
   private final eub.c F;
   private final fmm G;

   public static fwy a(fke $$0, eub.c $$1, BooleanConsumer $$2) throws IOException {
      euc $$3 = $$1.a($$1.h());
      return new fwy($$0, $$1, $$3.b(), $$2);
   }

   private fwy(fke $$0, eub.c $$1, String $$2, BooleanConsumer $$3) {
      super(xj.c("selectWorld.edit.title"));
      this.E = $$3;
      this.F = $$1;
      flo $$4 = $$0.h;
      this.D.a(new fpx(200, 20));
      this.D.a(new fnk(b, $$4));
      this.G = this.D.a(new fmm($$4, 200, 20, b));
      this.G.a($$2);
      fpw $$5 = fpw.e().a(4);
      fmd $$6 = $$5.a(fmd.a(z, $$0x -> this.a(this.G.a())).a(98).a());
      $$5.a(fmd.a(xi.e, $$0x -> this.aO_()).a(98).a());
      this.G.b($$1x -> $$6.j = !baj.h($$1x));
      this.D.a(fmd.a(c, $$1x -> {
         $$1.j().ifPresent($$0xx -> FileUtils.deleteQuietly($$0xx.toFile()));
         $$1x.j = false;
      }).a(200).a()).j = $$1.j().filter($$0x -> Files.isRegularFile($$0x)).isPresent();
      this.D.a(fmd.a(d, $$1x -> ae.m().a($$1.a(etz.l))).a(200).a());
      this.D.a(fmd.a(s, $$1x -> {
         boolean $$2x = a($$1);
         this.E.accept(!$$2x);
      }).a(200).a());
      this.D.a(fmd.a(u, $$1x -> {
         eub $$2x = $$0.m();
         Path $$3x = $$2x.d();

         try {
            v.c($$3x);
         } catch (IOException var5x) {
            throw new RuntimeException(var5x);
         }

         ae.m().a($$3x);
      }).a(200).a());
      this.D.a(fmd.a(v, $$2x -> $$0.a(new fqq(() -> $$0.a(this), ($$2xx, $$3x) -> {
            if ($$2xx) {
               a($$1);
            }

            $$0.a(fxb.a($$0, this.E, $$0.au(), $$1, $$3x));
         }, w, x, y, true))).a(200).a());
      this.D.a(new fpx(200, 20));
      this.D.a($$5);
      this.D.a($$1x -> {
         fmb var10000 = this.c($$1x);
      });
   }

   @Override
   protected void aF_() {
      this.b(this.G);
   }

   @Override
   protected void aR_() {
      this.c();
   }

   @Override
   protected void c() {
      this.D.a();
      fpq.a(this.D, this.H());
   }

   @Override
   public void aO_() {
      this.E.accept(false);
   }

   private void a(String $$0) {
      try {
         this.F.a($$0);
      } catch (uw | vc | IOException var3) {
         a.error("Failed to access world '{}'", this.F.f(), var3);
         fom.a(this.m, this.F.f());
      }

      this.E.accept(true);
   }

   public static boolean a(eub.c $$0) {
      long $$1 = 0L;
      IOException $$2 = null;

      try {
         $$1 = $$0.l();
      } catch (IOException var6) {
         $$2 = var6;
      }

      if ($$2 != null) {
         xj $$4 = xj.c("selectWorld.edit.backupFailed");
         xj $$5 = xj.b($$2.getMessage());
         fke.Q().aA().a(new fom(fom.a.b, $$4, $$5));
         return false;
      } else {
         xj $$6 = xj.a("selectWorld.edit.backupCreated", $$0.f());
         xj $$7 = xj.a("selectWorld.edit.backupSize", azm.c((double)$$1 / 1048576.0));
         fke.Q().aA().a(new fom(fom.a.b, $$6, $$7));
         return true;
      }
   }

   @Override
   public void a(flq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 15, 16777215);
   }
}

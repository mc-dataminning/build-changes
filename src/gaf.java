import com.mojang.authlib.minecraft.BanDetails;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.util.Objects;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class gaf extends gad {
   private static final Logger a = LogUtils.getLogger();
   private static final xa b = xa.c("narrator.screen.title");
   private static final xa c = xa.c("title.credits");
   private static final String d = "Demo_World";
   private static final float s = 2000.0F;
   @Nullable
   private fvp u;
   private ful v;
   @Nullable
   private fow w;
   private float x = 1.0F;
   private boolean y;
   private long z;
   private final fvc A;

   public gaf() {
      this(false);
   }

   public gaf(boolean $$0) {
      this($$0, null);
   }

   public gaf(boolean $$0, @Nullable fvc $$1) {
      super(b);
      this.y = $$0;
      this.A = Objects.requireNonNullElseGet($$1, () -> new fvc(false));
   }

   private boolean m() {
      return this.w != null;
   }

   @Override
   public void e() {
      if (this.m()) {
         this.w.e();
      }
   }

   public static void a(hlc $$0) {
      $$0.a(fvc.a);
      $$0.a(fvc.c);
      $$0.a(gsd.a);
      e.a($$0);
   }

   @Override
   public boolean k() {
      return false;
   }

   @Override
   public boolean aH_() {
      return false;
   }

   @Override
   protected void aS_() {
      if (this.u == null) {
         this.u = this.m.aL().a();
      }

      int $$0 = this.p.a(c);
      int $$1 = this.n - $$0 - 2;
      int $$2 = 24;
      int $$3 = this.o / 4 + 48;
      if (this.m.K()) {
         $$3 = this.c($$3, 24);
      } else {
         $$3 = this.b($$3, 24);
      }

      $$3 = this.a($$3, 24);
      fvq $$4 = this.c(fup.a(20, $$0x -> this.m.a(new gdf(this, this.m.n, this.m.ah())), true));
      int var10001 = this.n / 2 - 124;
      $$3 += 36;
      $$4.c(var10001, $$3);
      this.c(ful.a(xa.c("menu.options"), $$0x -> this.m.a(new gdi(this, this.m.n))).a(this.n / 2 - 100, $$3, 98, 20).a());
      this.c(ful.a(xa.c("menu.quit"), $$0x -> this.m.q()).a(this.n / 2 + 2, $$3, 98, 20).a());
      fvq $$5 = this.c(fup.b(20, $$0x -> this.m.a(new gdc(this, this.m.n)), true));
      $$5.c(this.n / 2 + 104, $$3);
      this.c(new fvj($$1, this.o - 10, $$0, 10, c, $$0x -> this.m.a(new fzf(this)), this.p));
      if (this.w == null) {
         this.w = new fow();
      }

      if (this.m()) {
         this.w.b(this.m, this.n, this.o);
      }
   }

   private int a(int $$0, int $$1) {
      if (ac.aU) {
         this.c(ful.a(xa.b("Create Test World"), $$0x -> gfe.b(this.m, this)).a(this.n / 2 - 100, $$0 += $$1, 200, 20).a());
      }

      return $$0;
   }

   private int b(int $$0, int $$1) {
      this.c(ful.a(xa.c("menu.singleplayer"), $$0x -> this.m.a(new gfm(this))).a(this.n / 2 - 100, $$0, 200, 20).a());
      xa $$2 = this.E();
      boolean $$3 = $$2 == null;
      fvw $$4 = $$2 != null ? fvw.a($$2) : null;
      int var6;
      this.c(ful.a(xa.c("menu.multiplayer"), $$0x -> {
         gad $$1x = (gad)(this.m.n.u ? new gcv(this) : new gcw(this));
         this.m.a($$1x);
      }).a(this.n / 2 - 100, var6 = $$0 + $$1, 200, 20).a($$4).a()).j = $$3;
      this.c(ful.a(xa.c("menu.online"), $$0x -> this.m.a(new fly(this))).a(this.n / 2 - 100, $$0 = var6 + $$1, 200, 20).a($$4).a()).j = $$3;
      return $$0;
   }

   @Nullable
   private xa E() {
      if (this.m.F()) {
         return null;
      } else if (this.m.I()) {
         return xa.c("title.multiplayer.disabled.banned.name");
      } else {
         BanDetails $$0 = this.m.H();
         if ($$0 != null) {
            return $$0.expires() != null ? xa.c("title.multiplayer.disabled.banned.temporary") : xa.c("title.multiplayer.disabled.banned.permanent");
         } else {
            return xa.c("title.multiplayer.disabled");
         }
      }
   }

   private int c(int $$0, int $$1) {
      boolean $$2 = this.F();
      this.c(ful.a(xa.c("menu.playdemo"), $$1x -> {
         if ($$2) {
            this.m.x().a("Demo_World", () -> this.m.a(this));
         } else {
            this.m.x().a("Demo_World", MinecraftServer.d, eib.b, err::a, this);
         }
      }).a(this.n / 2 - 100, $$0, 200, 20).a());
      int var4;
      this.v = this.c(
         ful.a(
               xa.c("menu.resetdemo"),
               $$0x -> {
                  ezv $$1x = this.m.m();

                  try (ezv.c $$2x = $$1x.e("Demo_World")) {
                     if ($$2x.m()) {
                        this.m
                           .a(
                              new fzb(
                                 this::c,
                                 xa.c("selectWorld.deleteQuestion"),
                                 xa.a("selectWorld.deleteWarning", MinecraftServer.d.a()),
                                 xa.c("selectWorld.deleteButton"),
                                 wz.e
                              )
                           );
                     }
                  } catch (IOException var8) {
                     fwu.a(this.m, "Demo_World");
                     a.warn("Failed to access demo world", var8);
                  }
               }
            )
            .a(this.n / 2 - 100, var4 = $$0 + $$1, 200, 20)
            .a()
      );
      this.v.j = $$2;
      return var4;
   }

   private boolean F() {
      try {
         boolean var2;
         try (ezv.c $$0 = this.m.m().e("Demo_World")) {
            var2 = $$0.m();
         }

         return var2;
      } catch (IOException var6) {
         fwu.a(this.m, "Demo_World");
         a.warn("Failed to read demo world data", var6);
         return false;
      }
   }

   @Override
   public void a(ftx $$0, int $$1, int $$2, float $$3) {
      if (this.z == 0L && this.y) {
         this.z = ag.c();
      }

      float $$4 = 1.0F;
      if (this.y) {
         float $$5 = (float)(ag.c() - this.z) / 2000.0F;
         if ($$5 > 1.0F) {
            this.y = false;
            this.x = 1.0F;
         } else {
            $$5 = azo.a($$5, 0.0F, 1.0F);
            $$4 = azo.b($$5, 0.5F, 1.0F, 0.0F, 1.0F);
            this.x = azo.b($$5, 0.0F, 0.5F, 0.0F, 1.0F);
         }

         this.a($$4);
      }

      this.a($$0, $$3);
      int $$6 = azo.f($$4 * 255.0F) << 24;
      if (($$6 & -67108864) != 0) {
         super.a($$0, $$1, $$2, $$3);
         this.A.a($$0, this.n, $$4);
         if (this.u != null && !this.m.n.c().c()) {
            this.u.a($$0, this.n, this.p, $$6);
         }

         String $$7 = "Minecraft " + ac.b().c();
         if (this.m.K()) {
            $$7 = $$7 + " Demo";
         } else {
            $$7 = $$7 + ("release".equalsIgnoreCase(this.m.j()) ? "" : "/" + this.m.j());
         }

         if (frd.e().a()) {
            $$7 = $$7 + hmi.a("menu.modded");
         }

         $$0.b(this.p, $$7, 2, this.o - 10, 16777215 | $$6);
         if (this.m() && $$4 >= 1.0F) {
            this.w.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private void a(float $$0) {
      for (fwi $$1 : this.aI_()) {
         if ($$1 instanceof fuj $$2) {
            $$2.a($$0);
         }
      }
   }

   @Override
   public void b(ftx $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   protected void a(ftx $$0, float $$1) {
      f.a($$0, this.n, this.o, this.x, $$1);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return super.a($$0, $$1, $$2) ? true : this.m() && this.w.a($$0, $$1, $$2);
   }

   @Override
   public void aJ_() {
      if (this.w != null) {
         this.w.aJ_();
      }
   }

   @Override
   public void aK_() {
      super.aK_();
      if (this.w != null) {
         this.w.aK_();
      }
   }

   private void c(boolean $$0) {
      if ($$0) {
         try (ezv.c $$1 = this.m.m().e("Demo_World")) {
            $$1.k();
         } catch (IOException var7) {
            fwu.b(this.m, "Demo_World");
            a.warn("Failed to delete demo world", var7);
         }
      }

      this.m.a(this);
   }
}

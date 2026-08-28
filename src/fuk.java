import com.mojang.authlib.minecraft.BanDetails;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.util.Objects;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class fuk extends fui {
   private static final Logger a = LogUtils.getLogger();
   private static final wo b = wo.c("narrator.screen.title");
   private static final wo c = wo.c("title.credits");
   private static final String d = "Demo_World";
   private static final float s = 2000.0F;
   @Nullable
   private fpu u;
   private fop v;
   @Nullable
   private fja w;
   private float x = 1.0F;
   private boolean y;
   private long z;
   private final fph A;

   public fuk() {
      this(false);
   }

   public fuk(boolean $$0) {
      this($$0, null);
   }

   public fuk(boolean $$0, @Nullable fph $$1) {
      super(b);
      this.y = $$0;
      this.A = Objects.requireNonNullElseGet($$1, () -> new fph(false));
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

   public static void a(heo $$0) {
      $$0.a(fph.a);
      $$0.a(fph.c);
      $$0.a(gly.a);
      e.a($$0);
   }

   @Override
   public boolean k() {
      return false;
   }

   @Override
   public boolean aG_() {
      return false;
   }

   @Override
   protected void aR_() {
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
      fpv $$4 = this.c(fou.a(20, $$0x -> this.m.a(new fxi(this, this.m.n, this.m.ah())), true));
      int var10001 = this.n / 2 - 124;
      $$3 += 36;
      $$4.c(var10001, $$3);
      this.c(fop.a(wo.c("menu.options"), $$0x -> this.m.a(new fxl(this, this.m.n))).a(this.n / 2 - 100, $$3, 98, 20).a());
      this.c(fop.a(wo.c("menu.quit"), $$0x -> this.m.q()).a(this.n / 2 + 2, $$3, 98, 20).a());
      fpv $$5 = this.c(fou.b(20, $$0x -> this.m.a(new fxf(this, this.m.n)), true));
      $$5.c(this.n / 2 + 104, $$3);
      this.c(new fpo($$1, this.o - 10, $$0, 10, c, $$0x -> this.m.a(new ftk(this)), this.p));
      if (this.w == null) {
         this.w = new fja();
      }

      if (this.m()) {
         this.w.b(this.m, this.n, this.o);
      }
   }

   private int a(int $$0, int $$1) {
      if (ab.aU) {
         this.c(fop.a(wo.b("Create Test World"), $$0x -> fzh.b(this.m, this)).a(this.n / 2 - 100, $$0 += $$1, 200, 20).a());
      }

      return $$0;
   }

   private int b(int $$0, int $$1) {
      this.c(fop.a(wo.c("menu.singleplayer"), $$0x -> this.m.a(new fzp(this))).a(this.n / 2 - 100, $$0, 200, 20).a());
      wo $$2 = this.E();
      boolean $$3 = $$2 == null;
      fqb $$4 = $$2 != null ? fqb.a($$2) : null;
      int var6;
      this.c(fop.a(wo.c("menu.multiplayer"), $$0x -> {
         fui $$1x = (fui)(this.m.n.u ? new fwy(this) : new fwz(this));
         this.m.a($$1x);
      }).a(this.n / 2 - 100, var6 = $$0 + $$1, 200, 20).a($$4).a()).j = $$3;
      this.c(fop.a(wo.c("menu.online"), $$0x -> this.m.a(new fgd(this))).a(this.n / 2 - 100, $$0 = var6 + $$1, 200, 20).a($$4).a()).j = $$3;
      return $$0;
   }

   @Nullable
   private wo E() {
      if (this.m.F()) {
         return null;
      } else if (this.m.I()) {
         return wo.c("title.multiplayer.disabled.banned.name");
      } else {
         BanDetails $$0 = this.m.H();
         if ($$0 != null) {
            return $$0.expires() != null ? wo.c("title.multiplayer.disabled.banned.temporary") : wo.c("title.multiplayer.disabled.banned.permanent");
         } else {
            return wo.c("title.multiplayer.disabled");
         }
      }
   }

   private int c(int $$0, int $$1) {
      boolean $$2 = this.F();
      this.c(fop.a(wo.c("menu.playdemo"), $$1x -> {
         if ($$2) {
            this.m.x().a("Demo_World", () -> this.m.a(this));
         } else {
            this.m.x().a("Demo_World", MinecraftServer.d, edo.b, ena::a, this);
         }
      }).a(this.n / 2 - 100, $$0, 200, 20).a());
      int var4;
      this.v = this.c(
         fop.a(
               wo.c("menu.resetdemo"),
               $$0x -> {
                  evd $$1x = this.m.m();

                  try (evd.c $$2x = $$1x.e("Demo_World")) {
                     if ($$2x.m()) {
                        this.m
                           .a(
                              new ftg(
                                 this::c,
                                 wo.c("selectWorld.deleteQuestion"),
                                 wo.a("selectWorld.deleteWarning", MinecraftServer.d.a()),
                                 wo.c("selectWorld.deleteButton"),
                                 wn.e
                              )
                           );
                     }
                  } catch (IOException var8) {
                     fqz.a(this.m, "Demo_World");
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
         try (evd.c $$0 = this.m.m().e("Demo_World")) {
            var2 = $$0.m();
         }

         return var2;
      } catch (IOException var6) {
         fqz.a(this.m, "Demo_World");
         a.warn("Failed to read demo world data", var6);
         return false;
      }
   }

   @Override
   public void a(fob $$0, int $$1, int $$2, float $$3) {
      if (this.z == 0L && this.y) {
         this.z = af.c();
      }

      float $$4 = 1.0F;
      if (this.y) {
         float $$5 = (float)(af.c() - this.z) / 2000.0F;
         if ($$5 > 1.0F) {
            this.y = false;
            this.x = 1.0F;
         } else {
            $$5 = ayy.a($$5, 0.0F, 1.0F);
            $$4 = ayy.b($$5, 0.5F, 1.0F, 0.0F, 1.0F);
            this.x = ayy.b($$5, 0.0F, 0.5F, 0.0F, 1.0F);
         }

         this.a($$4);
      }

      this.a($$0, $$3);
      int $$6 = ayy.f($$4 * 255.0F) << 24;
      if (($$6 & -67108864) != 0) {
         super.a($$0, $$1, $$2, $$3);
         this.A.a($$0, this.n, $$4);
         if (this.u != null && !this.m.n.c().c()) {
            this.u.a($$0, this.n, this.p, $$6);
         }

         String $$7 = "Minecraft " + ab.b().c();
         if (this.m.K()) {
            $$7 = $$7 + " Demo";
         } else {
            $$7 = $$7 + ("release".equalsIgnoreCase(this.m.j()) ? "" : "/" + this.m.j());
         }

         if (flh.e().a()) {
            $$7 = $$7 + hfu.a("menu.modded");
         }

         $$0.b(this.p, $$7, 2, this.o - 10, 16777215 | $$6);
         if (this.m() && $$4 >= 1.0F) {
            this.w.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private void a(float $$0) {
      for (fqn $$1 : this.aH_()) {
         if ($$1 instanceof fon $$2) {
            $$2.a($$0);
         }
      }
   }

   @Override
   public void b(fob $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   protected void a(fob $$0, float $$1) {
      f.a($$0, this.n, this.o, this.x, $$1);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return super.a($$0, $$1, $$2) ? true : this.m() && this.w.a($$0, $$1, $$2);
   }

   @Override
   public void aI_() {
      if (this.w != null) {
         this.w.aI_();
      }
   }

   @Override
   public void aJ_() {
      super.aJ_();
      if (this.w != null) {
         this.w.aJ_();
      }
   }

   private void c(boolean $$0) {
      if ($$0) {
         try (evd.c $$1 = this.m.m().e("Demo_World")) {
            $$1.k();
         } catch (IOException var7) {
            fqz.b(this.m, "Demo_World");
            a.warn("Failed to delete demo world", var7);
         }
      }

      this.m.a(this);
   }
}

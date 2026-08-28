import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fva extends fzq {
   private static final alr a = alr.b("popup/background");
   private static final int b = 12;
   private static final int c = 18;
   private static final int d = 6;
   private static final int s = 130;
   private static final int u = 64;
   private static final int v = 250;
   private final fzq w;
   @Nullable
   private final alr x;
   private final xg y;
   private final List<fva.b> z;
   @Nullable
   private final Runnable A;
   private final int B;
   private final fxq C = fxq.d();

   fva(fzq $$0, int $$1, @Nullable alr $$2, xg $$3, xg $$4, List<fva.b> $$5, @Nullable Runnable $$6) {
      super($$3);
      this.w = $$0;
      this.x = $$2;
      this.y = $$4;
      this.z = $$5;
      this.A = $$6;
      this.B = $$1 - 36;
   }

   @Override
   public void aL_() {
      super.aL_();
      this.w.o();
   }

   @Override
   protected void aT_() {
      this.w.b(this.m, this.n, this.o);
      this.C.a(12).c().b();
      this.C.a(new fus(this.l.f().a(o.r), this.p).d(this.B).b(true));
      if (this.x != null) {
         this.C.a(ful.a(130, 64, this.x, 130, 64));
      }

      this.C.a(new fus(this.y, this.p).d(this.B).b(true));
      this.C.a(this.m());
      this.C.a($$1 -> {
         ftw var10000 = this.c($$1);
      });
      this.c();
   }

   private fxq m() {
      int $$0 = 6 * (this.z.size() - 1);
      int $$1 = Math.min((this.B - $$0) / this.z.size(), 150);
      fxq $$2 = fxq.e();
      $$2.a(6);

      for (fva.b $$3 : this.z) {
         $$2.a(fty.a($$3.a(), $$1x -> $$3.b().accept(this)).a($$1).a());
      }

      return $$2;
   }

   @Override
   protected void c() {
      this.w.a(this.m, this.n, this.o);
      this.C.a();
      fxk.a(this.C, this.J());
   }

   @Override
   public void b(ftk $$0, int $$1, int $$2, float $$3) {
      this.w.a($$0, -1, -1, $$3);
      $$0.d();
      RenderSystem.getDevice().createCommandEncoder().clearDepthTexture(this.m.h().d(), 1.0);
      this.b($$0);
      $$0.a(gry::H, a, this.C.F() - 18, this.C.G() - 18, this.C.A() + 36, this.C.y() + 36);
   }

   @Override
   public xg i() {
      return xf.a(this.l, this.y);
   }

   @Override
   public void aQ_() {
      if (this.A != null) {
         this.A.run();
      }

      this.m.a(this.w);
   }

   public static class a {
      private final fzq a;
      private final xg b;
      private xg c = xf.a;
      private int d = 250;
      @Nullable
      private alr e;
      private final List<fva.b> f = new ArrayList<>();
      @Nullable
      private Runnable g = null;

      public a(fzq $$0, xg $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fva.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public fva.a a(alr $$0) {
         this.e = $$0;
         return this;
      }

      public fva.a a(xg $$0) {
         this.c = $$0;
         return this;
      }

      public fva.a a(xg $$0, Consumer<fva> $$1) {
         this.f.add(new fva.b($$0, $$1));
         return this;
      }

      public fva.a a(Runnable $$0) {
         this.g = $$0;
         return this;
      }

      public fva a() {
         if (this.f.isEmpty()) {
            throw new IllegalStateException("Popup must have at least one button");
         } else {
            return new fva(this.a, this.d, this.e, this.b, this.c, List.copyOf(this.f), this.g);
         }
      }
   }

   static record b(xg a, Consumer<fva> b) {
   }
}

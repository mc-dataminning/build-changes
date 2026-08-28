import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class gbe extends gba {
   private static final wy a = wy.c("options.videoTitle");
   private static final wy u = wy.c("options.graphics.fabulous").a(n.u);
   private static final wy v = wy.a("options.graphics.warning.message", u, u);
   private static final wy w = wy.c("options.graphics.warning.title").a(n.m);
   private static final wy x = wy.c("options.graphics.warning.accept");
   private static final wy y = wy.c("options.graphics.warning.cancel");
   private final gpj z;
   private final int A;

   private static fov<?>[] a(fow $$0) {
      return new fov[]{
         $$0.k(),
         $$0.e(),
         $$0.m(),
         $$0.f(),
         $$0.l(),
         $$0.h(),
         $$0.Q(),
         $$0.i(),
         $$0.at(),
         $$0.F(),
         $$0.as(),
         $$0.j(),
         $$0.ad(),
         $$0.au(),
         $$0.E(),
         $$0.R(),
         $$0.am(),
         $$0.g(),
         $$0.an(),
         $$0.ai(),
         $$0.ap(),
         $$0.aq(),
         $$0.q(),
         $$0.ae()
      };
   }

   public gbe(fxu $$0, fos $$1, fow $$2) {
      super($$0, $$2, a);
      this.z = $$1.aj();
      this.z.i();
      if ($$2.k().c() == foj.c) {
         this.z.e();
      }

      this.A = $$2.E().c();
   }

   @Override
   protected void m() {
      int $$0 = -1;
      fif $$1 = this.m.aO();
      fia $$2 = $$1.t();
      int $$3;
      if ($$2 == null) {
         $$3 = -1;
      } else {
         Optional<fie> $$4 = $$1.e();
         $$3 = $$4.<Integer>map($$2::a).orElse(-1);
      }

      fov<Integer> $$6 = new fov<>("options.fullscreen.resolution", fov.a(), ($$1x, $$2x) -> {
         if ($$2 == null) {
            return wy.c("options.fullscreen.unavailable");
         } else if ($$2x == -1) {
            return fow.a($$1x, wy.c("options.fullscreen.current"));
         } else {
            fie $$3x = $$2.a($$2x);
            return fow.a($$1x, wy.a("options.fullscreen.entry", $$3x.a(), $$3x.b(), $$3x.f(), $$3x.c() + $$3x.d() + $$3x.e()));
         }
      }, new fov.f(-1, $$2 != null ? $$2.e() - 1 : -1), $$3, $$2x -> {
         if ($$2 != null) {
            $$1.a($$2x == -1 ? Optional.empty() : Optional.of($$2.a($$2x)));
         }
      });
      this.d.a($$6);
      this.d.a(this.c.G());
      this.d.a(a(this.c));
   }

   @Override
   public void aK_() {
      this.m.aO().f();
      super.aK_();
   }

   @Override
   public void aE_() {
      if (this.c.E().c() != this.A) {
         this.m.a(this.c.E().c());
         this.m.R();
      }

      super.aE_();
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         if (this.z.g()) {
            List<wy> $$3 = Lists.newArrayList(new wy[]{v, wx.s});
            String $$4 = this.z.j();
            if ($$4 != null) {
               $$3.add(wx.s);
               $$3.add(wy.a("options.graphics.warning.renderer", $$4).a(n.h));
            }

            String $$5 = this.z.l();
            if ($$5 != null) {
               $$3.add(wx.s);
               $$3.add(wy.a("options.graphics.warning.vendor", $$5).a(n.h));
            }

            String $$6 = this.z.k();
            if ($$6 != null) {
               $$3.add(wx.s);
               $$3.add(wy.a("options.graphics.warning.version", $$6).a(n.h));
            }

            this.m.a(new gbd(w, $$3, ImmutableList.of(new gbd.a(x, $$0x -> {
               this.c.k().a(foj.c);
               fos.Q().f.e();
               this.z.e();
               this.m.a(this);
            }), new gbd.a(y, $$0x -> {
               this.z.f();
               this.m.a(this);
            }))));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (fxu.s()) {
         fov<Integer> $$4 = this.c.at();
         if ($$4.e() instanceof fov.c $$5) {
            int $$6 = $$4.c();
            int $$7 = $$6 == 0 ? $$5.b() + 1 : $$6;
            int $$8 = $$7 + (int)Math.signum($$3);
            if ($$8 != 0 && $$8 <= $$5.b() && $$8 >= $$5.d()) {
               fsj<Integer> $$9 = (fsj<Integer>)this.d.b($$4);
               if ($$9 != null) {
                  $$4.a($$8);
                  $$9.a($$8);
                  this.d.a(0.0);
                  return true;
               }
            }
         }

         return false;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void c(boolean $$0) {
      if (this.d != null) {
         fsa $$1 = this.d.b(this.c.ad());
         if ($$1 != null) {
            fsj<Boolean> $$2 = (fsj<Boolean>)$$1;
            $$2.a($$0);
         }
      }
   }
}

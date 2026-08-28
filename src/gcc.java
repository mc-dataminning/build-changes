import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class gcc extends gby {
   private static final wy a = wy.c("options.videoTitle");
   private static final wy u = wy.c("options.graphics.fabulous").a(o.u);
   private static final wy v = wy.a("options.graphics.warning.message", u, u);
   private static final wy w = wy.c("options.graphics.warning.title").a(o.m);
   private static final wy x = wy.c("options.graphics.warning.accept");
   private static final wy y = wy.c("options.graphics.warning.cancel");
   private final gqi z;
   private final int A;

   private static fpw<?>[] a(fpx $$0) {
      return new fpw[]{
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

   public gcc(fys $$0, fpt $$1, fpx $$2) {
      super($$0, $$2, a);
      this.z = $$1.aj();
      this.z.h();
      if ($$2.k().c() == fpl.c) {
         this.z.d();
      }

      this.A = $$2.E().c();
   }

   @Override
   protected void m() {
      int $$0 = -1;
      fjc $$1 = this.m.aO();
      fix $$2 = $$1.t();
      int $$3;
      if ($$2 == null) {
         $$3 = -1;
      } else {
         Optional<fjb> $$4 = $$1.e();
         $$3 = $$4.<Integer>map($$2::a).orElse(-1);
      }

      fpw<Integer> $$6 = new fpw<>("options.fullscreen.resolution", fpw.a(), ($$1x, $$2x) -> {
         if ($$2 == null) {
            return wy.c("options.fullscreen.unavailable");
         } else if ($$2x == -1) {
            return fpx.a($$1x, wy.c("options.fullscreen.current"));
         } else {
            fjb $$3x = $$2.a($$2x);
            return fpx.a($$1x, wy.a("options.fullscreen.entry", $$3x.a(), $$3x.b(), $$3x.f(), $$3x.c() + $$3x.d() + $$3x.e()));
         }
      }, new fpw.f(-1, $$2 != null ? $$2.e() - 1 : -1), $$3, $$2x -> {
         if ($$2 != null) {
            $$1.a($$2x == -1 ? Optional.empty() : Optional.of($$2.a($$2x)));
         }
      });
      this.d.a($$6);
      this.d.a(this.c.G());
      this.d.a(a(this.c));
   }

   @Override
   public void aL_() {
      this.m.aO().f();
      super.aL_();
   }

   @Override
   public void aF_() {
      if (this.c.E().c() != this.A) {
         this.m.a(this.c.E().c());
         this.m.R();
      }

      super.aF_();
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         if (this.z.f()) {
            List<wy> $$3 = Lists.newArrayList(new wy[]{v, wx.s});
            String $$4 = this.z.i();
            if ($$4 != null) {
               $$3.add(wx.s);
               $$3.add(wy.a("options.graphics.warning.renderer", $$4).a(o.h));
            }

            String $$5 = this.z.k();
            if ($$5 != null) {
               $$3.add(wx.s);
               $$3.add(wy.a("options.graphics.warning.vendor", $$5).a(o.h));
            }

            String $$6 = this.z.j();
            if ($$6 != null) {
               $$3.add(wx.s);
               $$3.add(wy.a("options.graphics.warning.version", $$6).a(o.h));
            }

            this.m.a(new gcb(w, $$3, ImmutableList.of(new gcb.a(x, $$0x -> {
               this.c.k().a(fpl.c);
               fpt.Q().f.d();
               this.z.d();
               this.m.a(this);
            }), new gcb.a(y, $$0x -> {
               this.z.e();
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
      if (fys.s()) {
         fpw<Integer> $$4 = this.c.at();
         if ($$4.e() instanceof fpw.c $$5) {
            int $$6 = $$4.c();
            int $$7 = $$6 == 0 ? $$5.b() + 1 : $$6;
            int $$8 = $$7 + (int)Math.signum($$3);
            if ($$8 != 0 && $$8 <= $$5.b() && $$8 >= $$5.d()) {
               fth<Integer> $$9 = (fth<Integer>)this.d.b($$4);
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
         fsy $$1 = this.d.b(this.c.ad());
         if ($$1 != null) {
            fth<Boolean> $$2 = (fth<Boolean>)$$1;
            $$2.a($$0);
         }
      }
   }
}

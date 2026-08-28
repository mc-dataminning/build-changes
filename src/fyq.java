import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fyq extends fym {
   private static final wp a = wp.c("options.videoTitle");
   private static final wp u = wp.c("options.graphics.fabulous").a(n.u);
   private static final wp v = wp.a("options.graphics.warning.message", u, u);
   private static final wp w = wp.c("options.graphics.warning.title").a(n.m);
   private static final wp x = wp.c("options.graphics.warning.accept");
   private static final wp y = wp.c("options.graphics.warning.cancel");
   private final gmp z;
   private final int A;

   private static fmj<?>[] a(fmk $$0) {
      return new fmj[]{
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

   public fyq(fvi $$0, fmg $$1, fmk $$2) {
      super($$0, $$2, a);
      this.z = $$1.aj();
      this.z.i();
      if ($$2.k().c() == fly.c) {
         this.z.e();
      }

      this.A = $$2.E().c();
   }

   @Override
   protected void m() {
      int $$0 = -1;
      ffu $$1 = this.m.aO();
      ffp $$2 = $$1.t();
      int $$3;
      if ($$2 == null) {
         $$3 = -1;
      } else {
         Optional<fft> $$4 = $$1.e();
         $$3 = $$4.<Integer>map($$2::a).orElse(-1);
      }

      fmj<Integer> $$6 = new fmj<>("options.fullscreen.resolution", fmj.a(), ($$1x, $$2x) -> {
         if ($$2 == null) {
            return wp.c("options.fullscreen.unavailable");
         } else if ($$2x == -1) {
            return fmk.a($$1x, wp.c("options.fullscreen.current"));
         } else {
            fft $$3x = $$2.a($$2x);
            return fmk.a($$1x, wp.a("options.fullscreen.entry", $$3x.a(), $$3x.b(), $$3x.f(), $$3x.c() + $$3x.d() + $$3x.e()));
         }
      }, new fmj.f(-1, $$2 != null ? $$2.e() - 1 : -1), $$3, $$2x -> {
         if ($$2 != null) {
            $$1.a($$2x == -1 ? Optional.empty() : Optional.of($$2.a($$2x)));
         }
      });
      this.d.a($$6);
      this.d.a(this.c.G());
      this.d.a(a(this.c));
   }

   @Override
   public void aO_() {
      this.m.aO().f();
      super.aO_();
   }

   @Override
   public void aI_() {
      if (this.c.E().c() != this.A) {
         this.m.a(this.c.E().c());
         this.m.R();
      }

      super.aI_();
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         if (this.z.g()) {
            List<wp> $$3 = Lists.newArrayList(new wp[]{v, wo.s});
            String $$4 = this.z.j();
            if ($$4 != null) {
               $$3.add(wo.s);
               $$3.add(wp.a("options.graphics.warning.renderer", $$4).a(n.h));
            }

            String $$5 = this.z.l();
            if ($$5 != null) {
               $$3.add(wo.s);
               $$3.add(wp.a("options.graphics.warning.vendor", $$5).a(n.h));
            }

            String $$6 = this.z.k();
            if ($$6 != null) {
               $$3.add(wo.s);
               $$3.add(wp.a("options.graphics.warning.version", $$6).a(n.h));
            }

            this.m.a(new fyp(w, $$3, ImmutableList.of(new fyp.a(x, $$0x -> {
               this.c.k().a(fly.c);
               fmg.Q().f.e();
               this.z.e();
               this.m.a(this);
            }), new fyp.a(y, $$0x -> {
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
      if (fvi.s()) {
         fmj<Integer> $$4 = this.c.at();
         if ($$4.e() instanceof fmj.c $$5) {
            int $$6 = $$4.c();
            int $$7 = $$6 == 0 ? $$5.b() + 1 : $$6;
            int $$8 = $$7 + (int)Math.signum($$3);
            if ($$8 != 0 && $$8 <= $$5.b() && $$8 >= $$5.d()) {
               fpx<Integer> $$9 = (fpx<Integer>)this.d.b($$4);
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
}

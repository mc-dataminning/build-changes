import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fwz extends fwv {
   private static final xv a = xv.c("options.videoTitle");
   private static final xv u = xv.c("options.graphics.fabulous").a(n.u);
   private static final xv v = xv.a("options.graphics.warning.message", u, u);
   private static final xv w = xv.c("options.graphics.warning.title").a(n.m);
   private static final xv x = xv.c("options.graphics.warning.accept");
   private static final xv y = xv.c("options.graphics.warning.cancel");
   private final gkv z;
   private final int A;

   private static fmc<?>[] a(fmd $$0) {
      return new fmc[]{
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

   public fwz(ftr $$0, flz $$1, fmd $$2) {
      super($$0, $$2, a);
      this.z = $$1.aj();
      this.z.i();
      if ($$2.k().c() == flr.c) {
         this.z.e();
      }

      this.A = $$2.E().c();
   }

   @Override
   protected void l() {
      int $$0 = -1;
      ffo $$1 = this.m.aO();
      ffj $$2 = $$1.t();
      int $$3;
      if ($$2 == null) {
         $$3 = -1;
      } else {
         Optional<ffn> $$4 = $$1.e();
         $$3 = $$4.<Integer>map($$2::a).orElse(-1);
      }

      fmc<Integer> $$6 = new fmc<>("options.fullscreen.resolution", fmc.a(), ($$1x, $$2x) -> {
         if ($$2 == null) {
            return xv.c("options.fullscreen.unavailable");
         } else if ($$2x == -1) {
            return fmd.a($$1x, xv.c("options.fullscreen.current"));
         } else {
            ffn $$3x = $$2.a($$2x);
            return fmd.a($$1x, xv.a("options.fullscreen.entry", $$3x.a(), $$3x.b(), $$3x.f(), $$3x.c() + $$3x.d() + $$3x.e()));
         }
      }, new fmc.f(-1, $$2 != null ? $$2.e() - 1 : -1), $$3, $$2x -> {
         if ($$2 != null) {
            $$1.a($$2x == -1 ? Optional.empty() : Optional.of($$2.a($$2x)));
         }
      });
      this.d.a($$6);
      this.d.a(this.c.G());
      this.d.a(a(this.c));
   }

   @Override
   public void aP_() {
      this.m.aO().f();
      super.aP_();
   }

   @Override
   public void aJ_() {
      if (this.c.E().c() != this.A) {
         this.m.a(this.c.E().c());
         this.m.R();
      }

      super.aJ_();
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         if (this.z.g()) {
            List<xv> $$3 = Lists.newArrayList(new xv[]{v, xu.s});
            String $$4 = this.z.j();
            if ($$4 != null) {
               $$3.add(xu.s);
               $$3.add(xv.a("options.graphics.warning.renderer", $$4).a(n.h));
            }

            String $$5 = this.z.l();
            if ($$5 != null) {
               $$3.add(xu.s);
               $$3.add(xv.a("options.graphics.warning.vendor", $$5).a(n.h));
            }

            String $$6 = this.z.k();
            if ($$6 != null) {
               $$3.add(xu.s);
               $$3.add(xv.a("options.graphics.warning.version", $$6).a(n.h));
            }

            this.m.a(new fwy(w, $$3, ImmutableList.of(new fwy.a(x, $$0x -> {
               this.c.k().a(flr.c);
               flz.Q().f.e();
               this.z.e();
               this.m.a(this);
            }), new fwy.a(y, $$0x -> {
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
      if (ftr.r()) {
         fmc<Integer> $$4 = this.c.at();
         if ($$4.e() instanceof fmc.c $$5) {
            int $$6 = $$4.c();
            int $$7 = $$6 == 0 ? $$5.b() + 1 : $$6;
            int $$8 = $$7 + (int)Math.signum($$3);
            if ($$8 != 0 && $$8 <= $$5.b() && $$8 >= $$5.d()) {
               fof<Integer> $$9 = (fof<Integer>)this.d.b($$4);
               if ($$9 != null) {
                  $$4.a($$8);
                  $$9.a($$8);
                  this.d.b(0.0);
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

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class gda extends gcw {
   private static final xg a = xg.c("options.videoTitle");
   private static final xg u = xg.c("options.graphics.fabulous").a(o.u);
   private static final xg v = xg.a("options.graphics.warning.message", u, u);
   private static final xg w = xg.c("options.graphics.warning.title").a(o.m);
   private static final xg x = xg.c("options.graphics.warning.accept");
   private static final xg y = xg.c("options.graphics.warning.cancel");
   private final gre z;
   private final int A;

   private static fqt<?>[] a(fqu $$0) {
      return new fqt[]{
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

   public gda(fzq $$0, fqq $$1, fqu $$2) {
      super($$0, $$2, a);
      this.z = $$1.aj();
      this.z.h();
      if ($$2.k().c() == fqi.c) {
         this.z.d();
      }

      this.A = $$2.E().c();
   }

   @Override
   protected void m() {
      int $$0 = -1;
      fki $$1 = this.m.aO();
      fkd $$2 = $$1.t();
      int $$3;
      if ($$2 == null) {
         $$3 = -1;
      } else {
         Optional<fkh> $$4 = $$1.e();
         $$3 = $$4.<Integer>map($$2::a).orElse(-1);
      }

      fqt<Integer> $$6 = new fqt<>("options.fullscreen.resolution", fqt.a(), ($$1x, $$2x) -> {
         if ($$2 == null) {
            return xg.c("options.fullscreen.unavailable");
         } else if ($$2x == -1) {
            return fqu.a($$1x, xg.c("options.fullscreen.current"));
         } else {
            fkh $$3x = $$2.a($$2x);
            return fqu.a($$1x, xg.a("options.fullscreen.entry", $$3x.a(), $$3x.b(), $$3x.f(), $$3x.c() + $$3x.d() + $$3x.e()));
         }
      }, new fqt.f(-1, $$2 != null ? $$2.e() - 1 : -1), $$3, $$2x -> {
         if ($$2 != null) {
            $$1.a($$2x == -1 ? Optional.empty() : Optional.of($$2.a($$2x)));
         }
      });
      this.d.a($$6);
      this.d.a(this.c.G());
      this.d.a(a(this.c));
   }

   @Override
   public void aQ_() {
      this.m.aO().f();
      super.aQ_();
   }

   @Override
   public void aK_() {
      if (this.c.E().c() != this.A) {
         this.m.a(this.c.E().c());
         this.m.R();
      }

      super.aK_();
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         if (this.z.f()) {
            List<xg> $$3 = Lists.newArrayList(new xg[]{v, xf.s});
            String $$4 = this.z.i();
            if ($$4 != null) {
               $$3.add(xf.s);
               $$3.add(xg.a("options.graphics.warning.renderer", $$4).a(o.h));
            }

            String $$5 = this.z.k();
            if ($$5 != null) {
               $$3.add(xf.s);
               $$3.add(xg.a("options.graphics.warning.vendor", $$5).a(o.h));
            }

            String $$6 = this.z.j();
            if ($$6 != null) {
               $$3.add(xf.s);
               $$3.add(xg.a("options.graphics.warning.version", $$6).a(o.h));
            }

            this.m.a(new gcz(w, $$3, ImmutableList.of(new gcz.a(x, $$0x -> {
               this.c.k().a(fqi.c);
               fqq.Q().f.d();
               this.z.d();
               this.m.a(this);
            }), new gcz.a(y, $$0x -> {
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
      if (fzq.s()) {
         fqt<Integer> $$4 = this.c.at();
         if ($$4.e() instanceof fqt.c $$5) {
            int $$6 = $$4.c();
            int $$7 = $$6 == 0 ? $$5.b() + 1 : $$6;
            int $$8 = $$7 + (int)Math.signum($$3);
            if ($$8 != 0 && $$8 <= $$5.b() && $$8 >= $$5.d()) {
               fuf<Integer> $$9 = (fuf<Integer>)this.d.b($$4);
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
         ftw $$1 = this.d.b(this.c.ad());
         if ($$1 != null) {
            fuf<Boolean> $$2 = (fuf<Boolean>)$$1;
            $$2.a($$0);
         }
      }
   }
}

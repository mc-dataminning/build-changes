import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fzn extends fuk {
   private static final wo a = wo.c("selectWorld.experiments");
   private static final wo b = wo.c("selectWorld.experiments.info").a(n.m);
   private static final int c = 310;
   private static final int d = 130;
   private final fsg s = new fsg(this);
   private final fuk u;
   private final aua v;
   private final Consumer<aua> w;
   private final Object2BooleanMap<atx> x = new Object2BooleanLinkedOpenHashMap();
   @Nullable
   private fzn.a y;

   public fzn(fuk $$0, aua $$1, Consumer<aua> $$2) {
      super(a);
      this.u = $$0;
      this.v = $$1;
      this.w = $$2;

      for (atx $$3 : $$1.d()) {
         if ($$3.l() == aub.d) {
            this.x.put($$3, $$1.g().contains($$3));
         }
      }
   }

   @Override
   protected void aR_() {
      this.s.a(a, this.p);
      fsk $$0 = this.s.c(fsk.d());
      $$0.a(new fpm(b, this.p).d(310), $$0x -> $$0x.e(15));
      fzs.a $$1 = fzs.a(299).a(2, true).b(4);
      this.x.forEach(($$1x, $$2x) -> $$1.a(a($$1x), () -> this.x.getBoolean($$1x), $$1xx -> this.x.put($$1x, $$1xx)).a($$1x.c()));
      fsh $$2 = $$1.a().a();
      this.y = new fzn.a($$2, 310, 130);
      $$0.a(this.y);
      fsk $$3 = this.s.b(fsk.e().a(8));
      $$3.a(fos.a(wn.d, $$0x -> this.m()).a());
      $$3.a(fos.a(wn.e, $$0x -> this.aO_()).a());
      this.s.a($$1x -> {
         fop var10000 = this.c($$1x);
      });
      this.c();
   }

   private static wo a(atx $$0) {
      String $$1 = "dataPack." + $$0.g() + ".name";
      return (wo)(hfq.a($$1) ? wo.c($$1) : $$0.b());
   }

   @Override
   protected void c() {
      this.y.i(130);
      this.s.a();
      int $$0 = this.o - this.s.b() - this.y.J().c();
      this.y.i(this.y.y() + $$0);
      this.y.h();
   }

   @Override
   public wo i() {
      return wn.a(super.i(), b);
   }

   @Override
   public void aO_() {
      this.m.a(this.u);
   }

   private void m() {
      List<atx> $$0 = new ArrayList<>(this.v.g());
      List<atx> $$1 = new ArrayList<>();
      this.x.forEach(($$2, $$3) -> {
         $$0.remove($$2);
         if ($$3) {
            $$1.add($$2);
         }
      });
      $$0.addAll(Lists.reverse($$1));
      this.v.b($$0.stream().map(atx::g).toList());
      this.w.accept(this.v);
   }

   public class a extends foi {
      private final List<fop> a = new ArrayList<>();
      private final fsh c;

      public a(final fsh $$1, final int $$2, final int $$3) {
         super(0, 0, $$2, $$3, wn.a);
         this.c = $$1;
         $$1.a(this::a);
      }

      public void a(fop $$0) {
         this.a.add($$0);
      }

      @Override
      protected int n() {
         return this.c.y();
      }

      @Override
      protected double o() {
         return 10.0;
      }

      @Override
      protected void b(fod $$0, int $$1, int $$2, float $$3) {
         $$0.c(this.F(), this.G(), this.F() + this.g, this.G() + this.h);
         $$0.c().a();
         $$0.c().a(0.0, -this.g(), 0.0);

         for (fop $$4 : this.a) {
            $$4.a($$0, $$1, $$2, $$3);
         }

         $$0.c().b();
         $$0.e();
         this.a($$0);
      }

      @Override
      protected void a(fsp $$0) {
      }

      @Override
      public fsz b(fsx $$0) {
         return new fsz(this.F(), this.G(), this.g, this.n());
      }

      @Override
      public void a(@Nullable fqp $$0) {
         super.a($$0);
         if ($$0 != null) {
            fsz $$1 = this.J();
            fsz $$2 = $$0.J();
            int $$3 = (int)((double)$$2.b() - this.g() - (double)$$1.b());
            int $$4 = (int)((double)$$2.c() - this.g() - (double)$$1.c());
            if ($$3 < 0) {
               this.a(this.g() + (double)$$3 - 14.0);
            } else if ($$4 > 0) {
               this.a(this.g() + (double)$$4 + 14.0);
            }
         }
      }

      @Override
      public List<? extends fqp> aH_() {
         return this.a;
      }

      @Override
      public void j(int $$0) {
         super.j($$0);
         this.c.j($$0);
         this.c.a();
      }

      @Override
      public void k(int $$0) {
         super.k($$0);
         this.c.k($$0);
         this.c.a();
      }

      @Override
      public Collection<? extends fsn> L() {
         return this.a;
      }
   }
}

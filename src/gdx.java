import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class gdx extends fys {
   private static final wy a = wy.c("selectWorld.experiments");
   private static final wy b = wy.c("selectWorld.experiments.info").a(o.m);
   private static final int c = 310;
   private static final int d = 130;
   private final fwo s = new fwo(this);
   private final fys u;
   private final aun v;
   private final Consumer<aun> w;
   private final Object2BooleanMap<auk> x = new Object2BooleanLinkedOpenHashMap();
   @Nullable
   private gdx.a y;

   public gdx(fys $$0, aun $$1, Consumer<aun> $$2) {
      super(a);
      this.u = $$0;
      this.v = $$1;
      this.w = $$2;

      for (auk $$3 : $$1.d()) {
         if ($$3.l() == auo.d) {
            this.x.put($$3, $$1.g().contains($$3));
         }
      }
   }

   @Override
   protected void aO_() {
      this.s.a(a, this.p);
      fws $$0 = this.s.c(fws.d());
      $$0.a(new ftu(b, this.p).d(310), $$0x -> $$0x.e(15));
      gec.a $$1 = gec.a(299).a(2, true).b(4);
      this.x.forEach(($$1x, $$2x) -> $$1.a(a($$1x), () -> this.x.getBoolean($$1x), $$1xx -> this.x.put($$1x, $$1xx)).a($$1x.c()));
      fwp $$2 = $$1.a().a();
      this.y = new gdx.a($$2, 310, 130);
      $$0.a(this.y);
      fws $$3 = this.s.b(fws.e().a(8));
      $$3.a(fta.a(wx.d, $$0x -> this.m()).a());
      $$3.a(fta.a(wx.e, $$0x -> this.aL_()).a());
      this.s.a($$1x -> {
         fsy var10000 = this.c($$1x);
      });
      this.c();
   }

   private static wy a(auk $$0) {
      String $$1 = "dataPack." + $$0.g() + ".name";
      return (wy)(hky.a($$1) ? wy.c($$1) : $$0.b());
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
   public wy i() {
      return wx.a(super.i(), b);
   }

   @Override
   public void aL_() {
      this.m.a(this.u);
   }

   private void m() {
      List<auk> $$0 = new ArrayList<>(this.v.g());
      List<auk> $$1 = new ArrayList<>();
      this.x.forEach(($$2, $$3) -> {
         $$0.remove($$2);
         if ($$3) {
            $$1.add($$2);
         }
      });
      $$0.addAll(Lists.reverse($$1));
      this.v.b($$0.stream().map(auk::g).toList());
      this.w.accept(this.v);
   }

   public class a extends fsr {
      private final List<fsy> a = new ArrayList<>();
      private final fwp c;

      public a(final fwp $$1, final int $$2, final int $$3) {
         super(0, 0, $$2, $$3, wx.a);
         this.c = $$1;
         $$1.a(this::a);
      }

      public void a(fsy $$0) {
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
      protected void b(fsm $$0, int $$1, int $$2, float $$3) {
         $$0.c(this.F(), this.G(), this.F() + this.g, this.G() + this.h);
         $$0.c().a();
         $$0.c().a(0.0, -this.g(), 0.0);

         for (fsy $$4 : this.a) {
            $$4.a($$0, $$1, $$2, $$3);
         }

         $$0.c().b();
         $$0.e();
         this.a($$0);
      }

      @Override
      protected void a(fwx $$0) {
      }

      @Override
      public fxh b(fxf $$0) {
         return new fxh(this.F(), this.G(), this.g, this.n());
      }

      @Override
      public void a(@Nullable fux $$0) {
         super.a($$0);
         if ($$0 != null) {
            fxh $$1 = this.J();
            fxh $$2 = $$0.J();
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
      public List<? extends fux> aE_() {
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
      public Collection<? extends fwv> L() {
         return this.a;
      }
   }
}

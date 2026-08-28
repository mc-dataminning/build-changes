import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class gcn extends fxi {
   private static final ww a = ww.c("selectWorld.experiments");
   private static final ww b = ww.c("selectWorld.experiments.info").a(n.m);
   private static final int c = 310;
   private static final int d = 130;
   private final fve s = new fve(this);
   private final fxi u;
   private final aul v;
   private final Consumer<aul> w;
   private final Object2BooleanMap<aui> x = new Object2BooleanLinkedOpenHashMap();
   @Nullable
   private gcn.a y;

   public gcn(fxi $$0, aul $$1, Consumer<aul> $$2) {
      super(a);
      this.u = $$0;
      this.v = $$1;
      this.w = $$2;

      for (aui $$3 : $$1.d()) {
         if ($$3.l() == aum.d) {
            this.x.put($$3, $$1.g().contains($$3));
         }
      }
   }

   @Override
   protected void aN_() {
      this.s.a(a, this.p);
      fvi $$0 = this.s.c(fvi.d());
      $$0.a(new fsk(b, this.p).d(310), $$0x -> $$0x.e(15));
      gcs.a $$1 = gcs.a(299).a(2, true).b(4);
      this.x.forEach(($$1x, $$2x) -> $$1.a(a($$1x), () -> this.x.getBoolean($$1x), $$1xx -> this.x.put($$1x, $$1xx)).a($$1x.c()));
      fvf $$2 = $$1.a().a();
      this.y = new gcn.a($$2, 310, 130);
      $$0.a(this.y);
      fvi $$3 = this.s.b(fvi.e().a(8));
      $$3.a(frq.a(wv.d, $$0x -> this.m()).a());
      $$3.a(frq.a(wv.e, $$0x -> this.aK_()).a());
      this.s.a($$1x -> {
         fro var10000 = this.c($$1x);
      });
      this.c();
   }

   private static ww a(aui $$0) {
      String $$1 = "dataPack." + $$0.g() + ".name";
      return (ww)(hjg.a($$1) ? ww.c($$1) : $$0.b());
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
   public ww i() {
      return wv.a(super.i(), b);
   }

   @Override
   public void aK_() {
      this.m.a(this.u);
   }

   private void m() {
      List<aui> $$0 = new ArrayList<>(this.v.g());
      List<aui> $$1 = new ArrayList<>();
      this.x.forEach(($$2, $$3) -> {
         $$0.remove($$2);
         if ($$3) {
            $$1.add($$2);
         }
      });
      $$0.addAll(Lists.reverse($$1));
      this.v.b($$0.stream().map(aui::g).toList());
      this.w.accept(this.v);
   }

   public class a extends frh {
      private final List<fro> a = new ArrayList<>();
      private final fvf c;

      public a(final fvf $$1, final int $$2, final int $$3) {
         super(0, 0, $$2, $$3, wv.a);
         this.c = $$1;
         $$1.a(this::a);
      }

      public void a(fro $$0) {
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
      protected void b(frc $$0, int $$1, int $$2, float $$3) {
         $$0.c(this.F(), this.G(), this.F() + this.g, this.G() + this.h);
         $$0.c().a();
         $$0.c().a(0.0, -this.g(), 0.0);

         for (fro $$4 : this.a) {
            $$4.a($$0, $$1, $$2, $$3);
         }

         $$0.c().b();
         $$0.e();
         this.a($$0);
      }

      @Override
      protected void a(fvn $$0) {
      }

      @Override
      public fvx b(fvv $$0) {
         return new fvx(this.F(), this.G(), this.g, this.n());
      }

      @Override
      public void a(@Nullable ftn $$0) {
         super.a($$0);
         if ($$0 != null) {
            fvx $$1 = this.J();
            fvx $$2 = $$0.J();
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
      public List<? extends ftn> aD_() {
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
      public Collection<? extends fvl> L() {
         return this.a;
      }
   }
}

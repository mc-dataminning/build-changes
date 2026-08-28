import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fwd extends fvt implements fvb, fxt {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final xg e = xg.c("narration.tab_navigation.usage");
   private final fxq f = fxq.e();
   private int g;
   private final fwc h;
   private final ImmutableList<fwb> i;
   private final ImmutableList<fvh> j;

   fwd(int $$0, fwc $$1, Iterable<fwb> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f.c().b();
      Builder<fvh> $$3 = ImmutableList.builder();

      for (fwb $$4 : $$2) {
         $$3.add(this.f.a(new fvh($$1, $$4, 0, 24)));
      }

      this.j = $$3.build();
   }

   public static fwd.a a(fwc $$0, int $$1) {
      return new fwd.a($$0, $$1);
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   @Override
   public boolean a_(double $$0, double $$1) {
      return $$0 >= (double)this.f.F() && $$1 >= (double)this.f.G() && $$0 < (double)(this.f.F() + this.f.A()) && $$1 < (double)(this.f.G() + this.f.y());
   }

   @Override
   public void a(boolean $$0) {
      super.a($$0);
      if (this.aI_() != null) {
         this.aI_().a($$0);
      }
   }

   @Override
   public void a(@Nullable fvv $$0) {
      super.a($$0);
      if ($$0 instanceof fvh $$1) {
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public fth a(fyb $$0) {
      if (!this.aJ_()) {
         fvh $$1 = this.g();
         if ($$1 != null) {
            return fth.a(this, fth.a($$1));
         }
      }

      return $$0 instanceof fyb.c ? null : super.a($$0);
   }

   @Override
   public List<? extends fvv> aE_() {
      return this.j;
   }

   @Override
   public fxt.a w() {
      return this.j.stream().map(ftw::w).max(Comparator.naturalOrder()).orElse(fxt.a.a);
   }

   @Override
   public void b(fxv $$0) {
      Optional<fvh> $$1 = this.j.stream().filter(ftw::C).findFirst().or(() -> Optional.ofNullable(this.g()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.aJ_()) {
         $$0.a(fxu.d, e);
      }
   }

   protected void a(fxv $$0, fvh $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(fxu.b, xg.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(ftk $$0, int $$1, int $$2, float $$3) {
      $$0.a(gry::H, fzq.h, 0, this.f.G() + this.f.y() - 2, 0.0F, 0.0F, ((fvh)this.j.get(0)).F(), 2, 32, 2);
      int $$4 = ((fvh)this.j.get(this.j.size() - 1)).H();
      $$0.a(gry::H, fzq.h, $$4, this.f.G() + this.f.y() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      UnmodifiableIterator var6 = this.j.iterator();

      while (var6.hasNext()) {
         fvh $$5 = (fvh)var6.next();
         $$5.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public fyf J() {
      return this.f.J();
   }

   public void b() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = azz.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         fvh $$2 = (fvh)var3.next();
         $$2.h($$1);
      }

      this.f.a();
      this.f.j(azz.d((this.g - $$0) / 2, 2));
      this.f.k(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.aJ_()) {
         this.a((fvv)this.j.get($$0));
      } else {
         this.h.a((fwb)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (fzq.s()) {
         int $$1 = this.c($$0);
         if ($$1 != -1) {
            this.a(azz.a($$1, 0, this.i.size() - 1), true);
            return true;
         }
      }

      return false;
   }

   private int c(int $$0) {
      if ($$0 >= 49 && $$0 <= 57) {
         return $$0 - 49;
      } else {
         if ($$0 == 258) {
            int $$1 = this.c();
            if ($$1 != -1) {
               int $$2 = fzq.t() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int c() {
      fwb $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private fvh g() {
      int $$0 = this.c();
      return $$0 != -1 ? (fvh)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final fwc b;
      private final List<fwb> c = new ArrayList<>();

      a(fwc $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public fwd.a a(fwb... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public fwd a() {
         return new fwd(this.a, this.b, this.c);
      }
   }
}

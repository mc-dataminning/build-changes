import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fws extends fwi implements fvq, fyi {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final xc e = xc.c("narration.tab_navigation.usage");
   private final fyf f = fyf.e();
   private int g;
   private final fwr h;
   private final ImmutableList<fwq> i;
   private final ImmutableList<fvw> j;

   fws(int $$0, fwr $$1, Iterable<fwq> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f.c().b();
      Builder<fvw> $$3 = ImmutableList.builder();

      for (fwq $$4 : $$2) {
         $$3.add(this.f.a(new fvw($$1, $$4, 0, 24)));
      }

      this.j = $$3.build();
   }

   public static fws.a a(fwr $$0, int $$1) {
      return new fws.a($$0, $$1);
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
      if (this.aM_() != null) {
         this.aM_().a($$0);
      }
   }

   @Override
   public void a(@Nullable fwk $$0) {
      super.a($$0);
      if ($$0 instanceof fvw $$1) {
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public ftw a(fyq $$0) {
      if (!this.aN_()) {
         fvw $$1 = this.g();
         if ($$1 != null) {
            return ftw.a(this, ftw.a($$1));
         }
      }

      return $$0 instanceof fyq.c ? null : super.a($$0);
   }

   @Override
   public List<? extends fwk> aI_() {
      return this.j;
   }

   @Override
   public fyi.a w() {
      return this.j.stream().map(ful::w).max(Comparator.naturalOrder()).orElse(fyi.a.a);
   }

   @Override
   public void b(fyk $$0) {
      Optional<fvw> $$1 = this.j.stream().filter(ful::C).findFirst().or(() -> Optional.ofNullable(this.g()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.aN_()) {
         $$0.a(fyj.d, e);
      }
   }

   protected void a(fyk $$0, fvw $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(fyj.b, xc.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(ftz $$0, int $$1, int $$2, float $$3) {
      $$0.a(gsn::H, gaf.h, 0, this.f.G() + this.f.y() - 2, 0.0F, 0.0F, ((fvw)this.j.get(0)).F(), 2, 32, 2);
      int $$4 = ((fvw)this.j.get(this.j.size() - 1)).H();
      $$0.a(gsn::H, gaf.h, $$4, this.f.G() + this.f.y() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      UnmodifiableIterator var6 = this.j.iterator();

      while (var6.hasNext()) {
         fvw $$5 = (fvw)var6.next();
         $$5.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public fyu J() {
      return this.f.J();
   }

   public void b() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = azq.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         fvw $$2 = (fvw)var3.next();
         $$2.h($$1);
      }

      this.f.a();
      this.f.j(azq.d((this.g - $$0) / 2, 2));
      this.f.k(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.aN_()) {
         this.a((fwk)this.j.get($$0));
      } else {
         this.h.a((fwq)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (gaf.s()) {
         int $$1 = this.c($$0);
         if ($$1 != -1) {
            this.a(azq.a($$1, 0, this.i.size() - 1), true);
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
               int $$2 = gaf.t() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int c() {
      fwq $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private fvw g() {
      int $$0 = this.c();
      return $$0 != -1 ? (fvw)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final fwr b;
      private final List<fwq> c = new ArrayList<>();

      a(fwr $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public fws.a a(fwq... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public fws a() {
         return new fws(this.a, this.b, this.c);
      }
   }
}

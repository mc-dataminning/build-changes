import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fvk extends fut<fvk.a> {
   private static final int a = 310;
   private static final int m = 25;
   private final gdl n;

   public fvk(frf $$0, int $$1, gdl $$2) {
      super($$0, $$1, $$2.s.d(), $$2.s.c(), 25);
      this.e = false;
      this.n = $$2;
   }

   public void a(fri<?> $$0) {
      this.b(fvk.b.a(this.c.n, $$0, this.n));
   }

   public void a(fri<?>... $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         fri<?> $$2 = $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null;
         this.b(fvk.b.a(this.c.n, $$0[$$1], $$2, this.n));
      }
   }

   public void a(List<ful> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1 += 2) {
         this.a($$0.get($$1), $$1 < $$0.size() - 1 ? $$0.get($$1 + 1) : null);
      }
   }

   public void a(ful $$0, @Nullable ful $$1) {
      this.b(fvk.a.a($$0, $$1, this.n));
   }

   @Override
   public int a() {
      return 310;
   }

   @Nullable
   public ful b(fri<?> $$0) {
      for (fvk.a $$1 : this.aI_()) {
         if ($$1 instanceof fvk.b $$2) {
            ful $$3 = $$2.a.get($$0);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public void b() {
      for (fvk.a $$0 : this.aI_()) {
         if ($$0 instanceof fvk.b) {
            fvk.b $$1 = (fvk.b)$$0;

            for (ful $$2 : $$1.a.values()) {
               if ($$2 instanceof fri.i<?> $$3) {
                  $$3.c();
               }
            }
         }
      }
   }

   public Optional<fwk> e(double $$0, double $$1) {
      for (fvk.a $$2 : this.aI_()) {
         for (fwk $$3 : $$2.aI_()) {
            if ($$3.a_($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends fut.a<fvk.a> {
      private final List<ful> a;
      private final gaf b;
      private static final int c = 160;

      a(List<ful> $$0, gaf $$1) {
         this.a = ImmutableList.copyOf($$0);
         this.b = $$1;
      }

      public static fvk.a a(List<ful> $$0, gaf $$1) {
         return new fvk.a($$0, $$1);
      }

      public static fvk.a a(ful $$0, @Nullable ful $$1, gaf $$2) {
         return $$1 == null ? new fvk.a(ImmutableList.of($$0), $$2) : new fvk.a(ImmutableList.of($$0, $$1), $$2);
      }

      @Override
      public void a(ftz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = 0;
         int $$11 = this.b.n / 2 - 155;

         for (ful $$12 : this.a) {
            $$12.c($$11 + $$10, $$2);
            $$12.a($$0, $$6, $$7, $$9);
            $$10 += 160;
         }
      }

      @Override
      public List<? extends fwk> aI_() {
         return this.a;
      }

      @Override
      public List<? extends fyi> b() {
         return this.a;
      }
   }

   protected static class b extends fvk.a {
      final Map<fri<?>, ful> a;

      private b(Map<fri<?>, ful> $$0, gdl $$1) {
         super(ImmutableList.copyOf($$0.values()), $$1);
         this.a = $$0;
      }

      public static fvk.b a(frj $$0, fri<?> $$1, gdl $$2) {
         return new fvk.b(ImmutableMap.of($$1, $$1.a($$0, 0, 0, 310)), $$2);
      }

      public static fvk.b a(frj $$0, fri<?> $$1, @Nullable fri<?> $$2, gdl $$3) {
         ful $$4 = $$1.a($$0);
         return $$2 == null ? new fvk.b(ImmutableMap.of($$1, $$4), $$3) : new fvk.b(ImmutableMap.of($$1, $$4, $$2, $$2.a($$0)), $$3);
      }
   }
}

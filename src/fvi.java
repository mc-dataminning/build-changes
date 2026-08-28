import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fvi extends fur<fvi.a> {
   private static final int a = 310;
   private static final int m = 25;
   private final gdj n;

   public fvi(frd $$0, int $$1, gdj $$2) {
      super($$0, $$1, $$2.s.d(), $$2.s.c(), 25);
      this.e = false;
      this.n = $$2;
   }

   public void a(frg<?> $$0) {
      this.b(fvi.b.a(this.c.n, $$0, this.n));
   }

   public void a(frg<?>... $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         frg<?> $$2 = $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null;
         this.b(fvi.b.a(this.c.n, $$0[$$1], $$2, this.n));
      }
   }

   public void a(List<fuj> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1 += 2) {
         this.a($$0.get($$1), $$1 < $$0.size() - 1 ? $$0.get($$1 + 1) : null);
      }
   }

   public void a(fuj $$0, @Nullable fuj $$1) {
      this.b(fvi.a.a($$0, $$1, this.n));
   }

   @Override
   public int a() {
      return 310;
   }

   @Nullable
   public fuj b(frg<?> $$0) {
      for (fvi.a $$1 : this.aI_()) {
         if ($$1 instanceof fvi.b $$2) {
            fuj $$3 = $$2.a.get($$0);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public void b() {
      for (fvi.a $$0 : this.aI_()) {
         if ($$0 instanceof fvi.b) {
            fvi.b $$1 = (fvi.b)$$0;

            for (fuj $$2 : $$1.a.values()) {
               if ($$2 instanceof frg.i<?> $$3) {
                  $$3.c();
               }
            }
         }
      }
   }

   public Optional<fwi> e(double $$0, double $$1) {
      for (fvi.a $$2 : this.aI_()) {
         for (fwi $$3 : $$2.aI_()) {
            if ($$3.a_($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends fur.a<fvi.a> {
      private final List<fuj> a;
      private final gad b;
      private static final int c = 160;

      a(List<fuj> $$0, gad $$1) {
         this.a = ImmutableList.copyOf($$0);
         this.b = $$1;
      }

      public static fvi.a a(List<fuj> $$0, gad $$1) {
         return new fvi.a($$0, $$1);
      }

      public static fvi.a a(fuj $$0, @Nullable fuj $$1, gad $$2) {
         return $$1 == null ? new fvi.a(ImmutableList.of($$0), $$2) : new fvi.a(ImmutableList.of($$0, $$1), $$2);
      }

      @Override
      public void a(ftx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = 0;
         int $$11 = this.b.n / 2 - 155;

         for (fuj $$12 : this.a) {
            $$12.c($$11 + $$10, $$2);
            $$12.a($$0, $$6, $$7, $$9);
            $$10 += 160;
         }
      }

      @Override
      public List<? extends fwi> aI_() {
         return this.a;
      }

      @Override
      public List<? extends fyg> b() {
         return this.a;
      }
   }

   protected static class b extends fvi.a {
      final Map<frg<?>, fuj> a;

      private b(Map<frg<?>, fuj> $$0, gdj $$1) {
         super(ImmutableList.copyOf($$0.values()), $$1);
         this.a = $$0;
      }

      public static fvi.b a(frh $$0, frg<?> $$1, gdj $$2) {
         return new fvi.b(ImmutableMap.of($$1, $$1.a($$0, 0, 0, 310)), $$2);
      }

      public static fvi.b a(frh $$0, frg<?> $$1, @Nullable frg<?> $$2, gdj $$3) {
         fuj $$4 = $$1.a($$0);
         return $$2 == null ? new fvi.b(ImmutableMap.of($$1, $$4), $$3) : new fvi.b(ImmutableMap.of($$1, $$4, $$2, $$2.a($$0)), $$3);
      }
   }
}

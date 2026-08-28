import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class fuv extends fue<fuv.a> {
   private static final int a = 310;
   private static final int m = 25;
   private final gcw n;

   public fuv(fqq $$0, int $$1, gcw $$2) {
      super($$0, $$1, $$2.s.d(), $$2.s.c(), 25);
      this.e = false;
      this.n = $$2;
   }

   public void a(fqt<?> $$0) {
      this.b(fuv.b.a(this.c.n, $$0, this.n));
   }

   public void a(fqt<?>... $$0) {
      for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
         fqt<?> $$2 = $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null;
         this.b(fuv.b.a(this.c.n, $$0[$$1], $$2, this.n));
      }
   }

   public void a(List<ftw> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1 += 2) {
         this.a($$0.get($$1), $$1 < $$0.size() - 1 ? $$0.get($$1 + 1) : null);
      }
   }

   public void a(ftw $$0, @Nullable ftw $$1) {
      this.b(fuv.a.a($$0, $$1, this.n));
   }

   @Override
   public int a() {
      return 310;
   }

   @Nullable
   public ftw b(fqt<?> $$0) {
      for (fuv.a $$1 : this.aE_()) {
         if ($$1 instanceof fuv.b $$2) {
            ftw $$3 = $$2.a.get($$0);
            if ($$3 != null) {
               return $$3;
            }
         }
      }

      return null;
   }

   public void b() {
      for (fuv.a $$0 : this.aE_()) {
         if ($$0 instanceof fuv.b) {
            fuv.b $$1 = (fuv.b)$$0;

            for (ftw $$2 : $$1.a.values()) {
               if ($$2 instanceof fqt.i<?> $$3) {
                  $$3.c();
               }
            }
         }
      }
   }

   public Optional<fvv> e(double $$0, double $$1) {
      for (fuv.a $$2 : this.aE_()) {
         for (fvv $$3 : $$2.aE_()) {
            if ($$3.a_($$0, $$1)) {
               return Optional.of($$3);
            }
         }
      }

      return Optional.empty();
   }

   protected static class a extends fue.a<fuv.a> {
      private final List<ftw> a;
      private final fzq b;
      private static final int c = 160;

      a(List<ftw> $$0, fzq $$1) {
         this.a = ImmutableList.copyOf($$0);
         this.b = $$1;
      }

      public static fuv.a a(List<ftw> $$0, fzq $$1) {
         return new fuv.a($$0, $$1);
      }

      public static fuv.a a(ftw $$0, @Nullable ftw $$1, fzq $$2) {
         return $$1 == null ? new fuv.a(ImmutableList.of($$0), $$2) : new fuv.a(ImmutableList.of($$0, $$1), $$2);
      }

      @Override
      public void a(ftk $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = 0;
         int $$11 = this.b.n / 2 - 155;

         for (ftw $$12 : this.a) {
            $$12.c($$11 + $$10, $$2);
            $$12.a($$0, $$6, $$7, $$9);
            $$10 += 160;
         }
      }

      @Override
      public List<? extends fvv> aE_() {
         return this.a;
      }

      @Override
      public List<? extends fxt> b() {
         return this.a;
      }
   }

   protected static class b extends fuv.a {
      final Map<fqt<?>, ftw> a;

      private b(Map<fqt<?>, ftw> $$0, gcw $$1) {
         super(ImmutableList.copyOf($$0.values()), $$1);
         this.a = $$0;
      }

      public static fuv.b a(fqu $$0, fqt<?> $$1, gcw $$2) {
         return new fuv.b(ImmutableMap.of($$1, $$1.a($$0, 0, 0, 310)), $$2);
      }

      public static fuv.b a(fqu $$0, fqt<?> $$1, @Nullable fqt<?> $$2, gcw $$3) {
         ftw $$4 = $$1.a($$0);
         return $$2 == null ? new fuv.b(ImmutableMap.of($$1, $$4), $$3) : new fuv.b(ImmutableMap.of($$1, $$4, $$2, $$2.a($$0)), $$3);
      }
   }
}

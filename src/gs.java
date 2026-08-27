import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gs {
   public static final int a = Integer.MAX_VALUE;
   public static final BiConsumer<etp, List<? extends brh>> b = ($$0, $$1) -> {
   };
   private static final duo<brh, ?> c = new duo<brh, brh>() {
      public brh a(brh $$0) {
         return $$0;
      }

      @Override
      public Class<? extends brh> a() {
         return brh.class;
      }
   };
   private final int d;
   private final boolean e;
   private final boolean f;
   private final Predicate<brh> g;
   private final ct.c h;
   private final Function<etp, etp> i;
   @Nullable
   private final etk j;
   private final BiConsumer<etp, List<? extends brh>> k;
   private final boolean l;
   @Nullable
   private final String m;
   @Nullable
   private final UUID n;
   private final duo<brh, ?> o;
   private final boolean p;

   public gs(
      int $$0,
      boolean $$1,
      boolean $$2,
      Predicate<brh> $$3,
      ct.c $$4,
      Function<etp, etp> $$5,
      @Nullable etk $$6,
      BiConsumer<etp, List<? extends brh>> $$7,
      boolean $$8,
      @Nullable String $$9,
      @Nullable UUID $$10,
      @Nullable brn<?> $$11,
      boolean $$12
   ) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
      this.l = $$8;
      this.m = $$9;
      this.n = $$10;
      this.o = (duo<brh, ?>)($$11 == null ? c : $$11);
      this.p = $$12;
   }

   public int a() {
      return this.d;
   }

   public boolean b() {
      return this.e;
   }

   public boolean c() {
      return this.l;
   }

   public boolean d() {
      return this.f;
   }

   public boolean e() {
      return this.p;
   }

   private void e(ed $$0) throws CommandSyntaxException {
      if (this.p && !$$0.c(2)) {
         throw eq.f.create();
      }
   }

   public brh a(ed $$0) throws CommandSyntaxException {
      this.e($$0);
      List<? extends brh> $$1 = this.b($$0);
      if ($$1.isEmpty()) {
         throw eq.d.create();
      } else if ($$1.size() > 1) {
         throw eq.a.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<? extends brh> b(ed $$0) throws CommandSyntaxException {
      return this.f($$0).stream().filter($$1 -> $$1.ai().a($$0.w())).toList();
   }

   private List<? extends brh> f(ed $$0) throws CommandSyntaxException {
      this.e($$0);
      if (!this.e) {
         return this.d($$0);
      } else if (this.m != null) {
         aqi $$1 = $$0.l().ah().a(this.m);
         return (List<? extends brh>)($$1 == null ? Collections.emptyList() : Lists.newArrayList(new aqi[]{$$1}));
      } else if (this.n != null) {
         for (aqh $$2 : $$0.l().K()) {
            brh $$3 = $$2.a(this.n);
            if ($$3 != null) {
               return Lists.newArrayList(new brh[]{$$3});
            }
         }

         return Collections.emptyList();
      } else {
         etp $$4 = this.i.apply($$0.d());
         Predicate<brh> $$5 = this.a($$4);
         if (this.l) {
            return (List<? extends brh>)($$0.f() != null && $$5.test($$0.f()) ? Lists.newArrayList(new brh[]{$$0.f()}) : Collections.emptyList());
         } else {
            List<brh> $$6 = Lists.newArrayList();
            if (this.d()) {
               this.a($$6, $$0.e(), $$4, $$5);
            } else {
               for (aqh $$7 : $$0.l().K()) {
                  this.a($$6, $$7, $$4, $$5);
               }
            }

            return this.a($$4, $$6);
         }
      }
   }

   private void a(List<brh> $$0, aqh $$1, etp $$2, Predicate<brh> $$3) {
      int $$4 = this.f();
      if ($$0.size() < $$4) {
         if (this.j != null) {
            $$1.a(this.o, this.j.c($$2), $$3, $$0, $$4);
         } else {
            $$1.a(this.o, $$3, $$0, $$4);
         }
      }
   }

   private int f() {
      return this.k == b ? this.d : Integer.MAX_VALUE;
   }

   public aqi c(ed $$0) throws CommandSyntaxException {
      this.e($$0);
      List<aqi> $$1 = this.d($$0);
      if ($$1.size() != 1) {
         throw eq.e.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<aqi> d(ed $$0) throws CommandSyntaxException {
      this.e($$0);
      if (this.m != null) {
         aqi $$1 = $$0.l().ah().a(this.m);
         return (List<aqi>)($$1 == null ? Collections.emptyList() : Lists.newArrayList(new aqi[]{$$1}));
      } else if (this.n != null) {
         aqi $$2 = $$0.l().ah().a(this.n);
         return (List<aqi>)($$2 == null ? Collections.emptyList() : Lists.newArrayList(new aqi[]{$$2}));
      } else {
         etp $$3 = this.i.apply($$0.d());
         Predicate<brh> $$4 = this.a($$3);
         if (this.l) {
            if ($$0.f() instanceof aqi $$5 && $$4.test($$5)) {
               return Lists.newArrayList(new aqi[]{$$5});
            }

            return Collections.emptyList();
         } else {
            int $$6 = this.f();
            List<aqi> $$7;
            if (this.d()) {
               $$7 = $$0.e().a($$4, $$6);
            } else {
               $$7 = Lists.newArrayList();

               for (aqi $$9 : $$0.l().ah().t()) {
                  if ($$4.test($$9)) {
                     $$7.add($$9);
                     if ($$7.size() >= $$6) {
                        return $$7;
                     }
                  }
               }
            }

            return this.a($$3, $$7);
         }
      }
   }

   private Predicate<brh> a(etp $$0) {
      Predicate<brh> $$1 = this.g;
      if (this.j != null) {
         etk $$2 = this.j.c($$0);
         $$1 = $$1.and($$1x -> $$2.c($$1x.cI()));
      }

      if (!this.h.c()) {
         $$1 = $$1.and($$1x -> this.h.e($$1x.f($$0)));
      }

      return $$1;
   }

   private <T extends brh> List<T> a(etp $$0, List<T> $$1) {
      if ($$1.size() > 1) {
         this.k.accept($$0, $$1);
      }

      return $$1.subList(0, Math.min(this.d, $$1.size()));
   }

   public static wu a(List<? extends brh> $$0) {
      return wx.b($$0, brh::O_);
   }
}

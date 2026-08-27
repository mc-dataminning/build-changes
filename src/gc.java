import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gc {
   public static final int a = Integer.MAX_VALUE;
   public static final BiConsumer<ehh, List<? extends biw>> b = ($$0, $$1) -> {
   };
   private static final djb<biw, ?> c = new djb<biw, biw>() {
      public biw a(biw $$0) {
         return $$0;
      }

      @Override
      public Class<? extends biw> a() {
         return biw.class;
      }
   };
   private final int d;
   private final boolean e;
   private final boolean f;
   private final Predicate<biw> g;
   private final cl.c h;
   private final Function<ehh, ehh> i;
   @Nullable
   private final ehc j;
   private final BiConsumer<ehh, List<? extends biw>> k;
   private final boolean l;
   @Nullable
   private final String m;
   @Nullable
   private final UUID n;
   private final djb<biw, ?> o;
   private final boolean p;

   public gc(
      int $$0,
      boolean $$1,
      boolean $$2,
      Predicate<biw> $$3,
      cl.c $$4,
      Function<ehh, ehh> $$5,
      @Nullable ehc $$6,
      BiConsumer<ehh, List<? extends biw>> $$7,
      boolean $$8,
      @Nullable String $$9,
      @Nullable UUID $$10,
      @Nullable bja<?> $$11,
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
      this.o = (djb<biw, ?>)($$11 == null ? c : $$11);
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

   private void e(dt $$0) throws CommandSyntaxException {
      if (this.p && !$$0.c(2)) {
         throw ee.f.create();
      }
   }

   public biw a(dt $$0) throws CommandSyntaxException {
      this.e($$0);
      List<? extends biw> $$1 = this.b($$0);
      if ($$1.isEmpty()) {
         throw ee.d.create();
      } else if ($$1.size() > 1) {
         throw ee.a.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<? extends biw> b(dt $$0) throws CommandSyntaxException {
      return this.f($$0).stream().filter($$1 -> $$1.ag().a($$0.w())).toList();
   }

   private List<? extends biw> f(dt $$0) throws CommandSyntaxException {
      this.e($$0);
      if (!this.e) {
         return this.d($$0);
      } else if (this.m != null) {
         aku $$1 = $$0.l().ac().a(this.m);
         return (List<? extends biw>)($$1 == null ? Collections.emptyList() : Lists.newArrayList(new aku[]{$$1}));
      } else if (this.n != null) {
         for (akt $$2 : $$0.l().F()) {
            biw $$3 = $$2.a(this.n);
            if ($$3 != null) {
               return Lists.newArrayList(new biw[]{$$3});
            }
         }

         return Collections.emptyList();
      } else {
         ehh $$4 = this.i.apply($$0.d());
         Predicate<biw> $$5 = this.a($$4);
         if (this.l) {
            return (List<? extends biw>)($$0.f() != null && $$5.test($$0.f()) ? Lists.newArrayList(new biw[]{$$0.f()}) : Collections.emptyList());
         } else {
            List<biw> $$6 = Lists.newArrayList();
            if (this.d()) {
               this.a($$6, $$0.e(), $$4, $$5);
            } else {
               for (akt $$7 : $$0.l().F()) {
                  this.a($$6, $$7, $$4, $$5);
               }
            }

            return this.a($$4, $$6);
         }
      }
   }

   private void a(List<biw> $$0, akt $$1, ehh $$2, Predicate<biw> $$3) {
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

   public aku c(dt $$0) throws CommandSyntaxException {
      this.e($$0);
      List<aku> $$1 = this.d($$0);
      if ($$1.size() != 1) {
         throw ee.e.create();
      } else {
         return $$1.get(0);
      }
   }

   public List<aku> d(dt $$0) throws CommandSyntaxException {
      this.e($$0);
      if (this.m != null) {
         aku $$1 = $$0.l().ac().a(this.m);
         return (List<aku>)($$1 == null ? Collections.emptyList() : Lists.newArrayList(new aku[]{$$1}));
      } else if (this.n != null) {
         aku $$2 = $$0.l().ac().a(this.n);
         return (List<aku>)($$2 == null ? Collections.emptyList() : Lists.newArrayList(new aku[]{$$2}));
      } else {
         ehh $$3 = this.i.apply($$0.d());
         Predicate<biw> $$4 = this.a($$3);
         if (this.l) {
            if ($$0.f() instanceof aku $$5 && $$4.test($$5)) {
               return Lists.newArrayList(new aku[]{$$5});
            }

            return Collections.emptyList();
         } else {
            int $$6 = this.f();
            List<aku> $$7;
            if (this.d()) {
               $$7 = $$0.e().a($$4, $$6);
            } else {
               $$7 = Lists.newArrayList();

               for (aku $$9 : $$0.l().ac().t()) {
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

   private Predicate<biw> a(ehh $$0) {
      Predicate<biw> $$1 = this.g;
      if (this.j != null) {
         ehc $$2 = this.j.c($$0);
         $$1 = $$1.and($$1x -> $$2.c($$1x.cG()));
      }

      if (!this.h.c()) {
         $$1 = $$1.and($$1x -> this.h.e($$1x.e($$0)));
      }

      return $$1;
   }

   private <T extends biw> List<T> a(ehh $$0, List<T> $$1) {
      if ($$1.size() > 1) {
         this.k.accept($$0, $$1);
      }

      return $$1.subList(0, Math.min(this.d, $$1.size()));
   }

   public static tl a(List<? extends biw> $$0) {
      return to.b($$0, biw::N_);
   }
}

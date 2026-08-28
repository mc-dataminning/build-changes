import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class gfg extends gad {
   private static final xa a = xa.c("editGamerule.title");
   private static final int b = 8;
   final fxz c = new fxz(this);
   private final Consumer<Optional<djt>> d;
   private final Set<gfg.f> s = Sets.newHashSet();
   private final djt u;
   @Nullable
   private gfg.g v;
   @Nullable
   private ful w;

   public gfg(djt $$0, Consumer<Optional<djt>> $$1) {
      super(a);
      this.u = $$0;
      this.d = $$1;
   }

   @Override
   protected void aS_() {
      this.c.a(a, this.p);
      this.v = this.c.c(new gfg.g(this.u));
      fyd $$0 = this.c.b(fyd.e().a(8));
      this.w = $$0.a(ful.a(wz.d, $$0x -> this.d.accept(Optional.of(this.u))).a());
      $$0.a(ful.a(wz.e, $$0x -> this.aP_()).a());
      this.c.a($$1 -> {
         fuj var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.c.a();
      if (this.v != null) {
         this.v.a(this.n, this.c);
      }
   }

   @Override
   public void aP_() {
      this.d.accept(Optional.empty());
   }

   private void m() {
      if (this.w != null) {
         this.w.j = this.s.isEmpty();
      }
   }

   void a(gfg.f $$0) {
      this.s.add($$0);
      this.m();
   }

   void b(gfg.f $$0) {
      this.s.remove($$0);
      this.m();
   }

   public class a extends gfg.d {
      private final fus<Boolean> c;

      public a(final xa $$1, final List<aza> $$2, final String $$3, final djt.a $$4) {
         super($$2, $$1);
         this.c = fus.b($$4.a()).a().a($$1x -> $$1x.c().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.a.add(this.c);
      }

      @Override
      public void a(ftx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.c.j($$3 + $$4 - 45);
         this.c.k($$2);
         this.c.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends gfg.f {
      final xa b;

      public b(final xa $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(ftx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(gfg.this.m.h, this.b, $$3 + $$4 / 2, $$2 + 5, -1);
      }

      @Override
      public List<? extends fwi> aI_() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends fyg> b() {
         return ImmutableList.of(new fyg() {
            @Override
            public fyg.a w() {
               return fyg.a.b;
            }

            @Override
            public void b(fyi $$0) {
               $$0.a(fyh.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends djt.g<T>> {
      gfg.f create(xa var1, List<aza> var2, String var3, T var4);
   }

   public abstract class d extends gfg.f {
      private final List<aza> c;
      protected final List<fuj> a = Lists.newArrayList();

      public d(@Nullable final List<aza> $$1, final xa $$2) {
         super($$1);
         this.c = gfg.this.m.h.c($$2, 175);
      }

      @Override
      public List<? extends fwi> aI_() {
         return this.a;
      }

      @Override
      public List<? extends fyg> b() {
         return this.a;
      }

      protected void a(ftx $$0, int $$1, int $$2) {
         if (this.c.size() == 1) {
            $$0.b(gfg.this.m.h, this.c.get(0), $$2, $$1 + 5, -1);
         } else if (this.c.size() >= 2) {
            $$0.b(gfg.this.m.h, this.c.get(0), $$2, $$1, -1);
            $$0.b(gfg.this.m.h, this.c.get(1), $$2, $$1 + 10, -1);
         }
      }
   }

   public class e extends gfg.d {
      private final fuu d;

      public e(final xa $$1, final List<aza> $$2, final String $$3, final djt.d $$4) {
         super($$2, $$1);
         this.d = new fuu(gfg.this.m.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.m(14737632);
               gfg.this.b(this);
            } else {
               this.d.m(-65536);
               gfg.this.a(this);
            }
         });
         this.a.add(this.d);
      }

      @Override
      public void a(ftx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.j($$3 + $$4 - 45);
         this.d.k($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends fur.a<gfg.f> {
      @Nullable
      final List<aza> a;

      public f(@Nullable List<aza> $$0) {
         this.a = $$0;
      }
   }

   public class g extends fur<gfg.f> {
      private static final int m = 24;

      public g(final djt $$1) {
         super(frd.Q(), gfg.this.n, gfg.this.c.d(), gfg.this.c.c(), 24);
         final Map<djt.b, Map<djt.e<?>, gfg.f>> $$2 = Maps.newHashMap();
         $$1.a(new djt.c() {
            @Override
            public void b(djt.e<djt.a> $$0, djt.f<djt.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> gfg.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(djt.e<djt.d> $$0, djt.f<djt.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> gfg.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends djt.g<T>> void a(djt.e<T> $$0, gfg.c<T> $$1x) {
               xa $$2 = xa.c($$0.b());
               xa $$3 = xa.b($$0.a()).a(o.o);
               T $$4 = $$1.b($$0);
               String $$5 = $$4.b();
               xa $$6 = xa.a("editGamerule.default", xa.b($$5)).a(o.h);
               String $$7 = $$0.b() + ".description";
               List<aza> $$10;
               String $$11;
               if (hmi.a($$7)) {
                  Builder<aza> $$8 = ImmutableList.builder().add($$3.g());
                  xa $$9 = xa.c($$7);
                  gfg.this.p.c($$9, 150).forEach($$8::add);
                  $$10 = $$8.add($$6.g()).build();
                  $$11 = $$9.getString() + "\n" + $$6.getString();
               } else {
                  $$10 = ImmutableList.of($$3.g(), $$6.g());
                  $$11 = $$6.getString();
               }

               $$2.computeIfAbsent($$0.c(), $$0x -> Maps.newHashMap()).put($$0, $$1.create($$2, $$10, $$11, $$4));
            }
         });
         $$2.entrySet()
            .stream()
            .sorted(Entry.comparingByKey())
            .forEach(
               $$0x -> {
                  this.b(gfg.this.new b(xa.c(((djt.b)$$0x.getKey()).a()).a(o.r, o.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(djt.e::a)))
                     .forEach($$0xx -> this.b((gfg.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void b(ftx $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         gfg.f $$4 = this.x();
         if ($$4 != null && $$4.a != null) {
            gfg.this.b($$4.a);
         }
      }
   }
}

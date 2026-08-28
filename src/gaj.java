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

public class gaj extends fvi {
   private static final wp a = wp.c("editGamerule.title");
   private static final int b = 8;
   final fte c = new fte(this);
   private final Consumer<Optional<dgv>> d;
   private final Set<gaj.f> s = Sets.newHashSet();
   private final dgv u;
   @Nullable
   private gaj.g v;
   @Nullable
   private fpq w;

   public gaj(dgv $$0, Consumer<Optional<dgv>> $$1) {
      super(a);
      this.u = $$0;
      this.d = $$1;
   }

   @Override
   protected void aR_() {
      this.c.a(a, this.p);
      this.v = this.c.c(new gaj.g(this.u));
      fti $$0 = this.c.b(fti.e().a(8));
      this.w = $$0.a(fpq.a(wo.d, $$0x -> this.d.accept(Optional.of(this.u))).a());
      $$0.a(fpq.a(wo.e, $$0x -> this.aO_()).a());
      this.c.a($$1 -> {
         fpo var10000 = this.c($$1);
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
   public void aO_() {
      this.d.accept(Optional.empty());
   }

   private void m() {
      if (this.w != null) {
         this.w.j = this.s.isEmpty();
      }
   }

   void a(gaj.f $$0) {
      this.s.add($$0);
      this.m();
   }

   void b(gaj.f $$0) {
      this.s.remove($$0);
      this.m();
   }

   public class a extends gaj.d {
      private final fpx<Boolean> c;

      public a(final wp $$1, final List<ayl> $$2, final String $$3, final dgv.a $$4) {
         super($$2, $$1);
         this.c = fpx.b($$4.a()).a().a($$1x -> $$1x.c().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.a.add(this.c);
      }

      @Override
      public void a(fpc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.c.j($$3 + $$4 - 45);
         this.c.k($$2);
         this.c.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends gaj.f {
      final wp b;

      public b(final wp $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(fpc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(gaj.this.m.h, this.b, $$3 + $$4 / 2, $$2 + 5, -1);
      }

      @Override
      public List<? extends frn> aH_() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends ftl> b() {
         return ImmutableList.of(new ftl() {
            @Override
            public ftl.a w() {
               return ftl.a.b;
            }

            @Override
            public void b(ftn $$0) {
               $$0.a(ftm.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends dgv.g<T>> {
      gaj.f create(wp var1, List<ayl> var2, String var3, T var4);
   }

   public abstract class d extends gaj.f {
      private final List<ayl> c;
      protected final List<fpo> a = Lists.newArrayList();

      public d(@Nullable final List<ayl> $$1, final wp $$2) {
         super($$1);
         this.c = gaj.this.m.h.c($$2, 175);
      }

      @Override
      public List<? extends frn> aH_() {
         return this.a;
      }

      @Override
      public List<? extends ftl> b() {
         return this.a;
      }

      protected void a(fpc $$0, int $$1, int $$2) {
         if (this.c.size() == 1) {
            $$0.b(gaj.this.m.h, this.c.get(0), $$2, $$1 + 5, -1);
         } else if (this.c.size() >= 2) {
            $$0.b(gaj.this.m.h, this.c.get(0), $$2, $$1, -1);
            $$0.b(gaj.this.m.h, this.c.get(1), $$2, $$1 + 10, -1);
         }
      }
   }

   public class e extends gaj.d {
      private final fpz d;

      public e(final wp $$1, final List<ayl> $$2, final String $$3, final dgv.d $$4) {
         super($$2, $$1);
         this.d = new fpz(gaj.this.m.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.m(14737632);
               gaj.this.b(this);
            } else {
               this.d.m(-65536);
               gaj.this.a(this);
            }
         });
         this.a.add(this.d);
      }

      @Override
      public void a(fpc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.j($$3 + $$4 - 45);
         this.d.k($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends fpw.a<gaj.f> {
      @Nullable
      final List<ayl> a;

      public f(@Nullable List<ayl> $$0) {
         this.a = $$0;
      }
   }

   public class g extends fpw<gaj.f> {
      private static final int m = 24;

      public g(final dgv $$1) {
         super(fmg.Q(), gaj.this.n, gaj.this.c.d(), gaj.this.c.c(), 24);
         final Map<dgv.b, Map<dgv.e<?>, gaj.f>> $$2 = Maps.newHashMap();
         $$1.a(new dgv.c() {
            @Override
            public void b(dgv.e<dgv.a> $$0, dgv.f<dgv.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> gaj.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(dgv.e<dgv.d> $$0, dgv.f<dgv.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> gaj.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends dgv.g<T>> void a(dgv.e<T> $$0, gaj.c<T> $$1x) {
               wp $$2 = wp.c($$0.b());
               wp $$3 = wp.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               wp $$6 = wp.a("editGamerule.default", wp.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<ayl> $$10;
               String $$11;
               if (hgz.a($$7)) {
                  Builder<ayl> $$8 = ImmutableList.builder().add($$3.g());
                  wp $$9 = wp.c($$7);
                  gaj.this.p.c($$9, 150).forEach($$8::add);
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
                  this.b(gaj.this.new b(wp.c(((dgv.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(dgv.e::a)))
                     .forEach($$0xx -> this.b((gaj.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void b(fpc $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         gaj.f $$4 = this.x();
         if ($$4 != null && $$4.a != null) {
            gaj.this.b($$4.a);
         }
      }
   }
}

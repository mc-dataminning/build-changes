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

public class gbi extends fwf {
   private static final wv a = wv.c("editGamerule.title");
   private static final int b = 8;
   final fub c = new fub(this);
   private final Consumer<Optional<dhl>> d;
   private final Set<gbi.f> s = Sets.newHashSet();
   private final dhl u;
   @Nullable
   private gbi.g v;
   @Nullable
   private fqn w;

   public gbi(dhl $$0, Consumer<Optional<dhl>> $$1) {
      super(a);
      this.u = $$0;
      this.d = $$1;
   }

   @Override
   protected void aN_() {
      this.c.a(a, this.p);
      this.v = this.c.c(new gbi.g(this.u));
      fuf $$0 = this.c.b(fuf.e().a(8));
      this.w = $$0.a(fqn.a(wu.d, $$0x -> this.d.accept(Optional.of(this.u))).a());
      $$0.a(fqn.a(wu.e, $$0x -> this.aK_()).a());
      this.c.a($$1 -> {
         fql var10000 = this.c($$1);
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
   public void aK_() {
      this.d.accept(Optional.empty());
   }

   private void m() {
      if (this.w != null) {
         this.w.j = this.s.isEmpty();
      }
   }

   void a(gbi.f $$0) {
      this.s.add($$0);
      this.m();
   }

   void b(gbi.f $$0) {
      this.s.remove($$0);
      this.m();
   }

   public class a extends gbi.d {
      private final fqu<Boolean> c;

      public a(final wv $$1, final List<ayw> $$2, final String $$3, final dhl.a $$4) {
         super($$2, $$1);
         this.c = fqu.b($$4.a()).a().a($$1x -> $$1x.c().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.a.add(this.c);
      }

      @Override
      public void a(fpz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.c.j($$3 + $$4 - 45);
         this.c.k($$2);
         this.c.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends gbi.f {
      final wv b;

      public b(final wv $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(fpz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(gbi.this.m.h, this.b, $$3 + $$4 / 2, $$2 + 5, -1);
      }

      @Override
      public List<? extends fsk> aD_() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends fui> b() {
         return ImmutableList.of(new fui() {
            @Override
            public fui.a w() {
               return fui.a.b;
            }

            @Override
            public void b(fuk $$0) {
               $$0.a(fuj.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends dhl.g<T>> {
      gbi.f create(wv var1, List<ayw> var2, String var3, T var4);
   }

   public abstract class d extends gbi.f {
      private final List<ayw> c;
      protected final List<fql> a = Lists.newArrayList();

      public d(@Nullable final List<ayw> $$1, final wv $$2) {
         super($$1);
         this.c = gbi.this.m.h.c($$2, 175);
      }

      @Override
      public List<? extends fsk> aD_() {
         return this.a;
      }

      @Override
      public List<? extends fui> b() {
         return this.a;
      }

      protected void a(fpz $$0, int $$1, int $$2) {
         if (this.c.size() == 1) {
            $$0.b(gbi.this.m.h, this.c.get(0), $$2, $$1 + 5, -1);
         } else if (this.c.size() >= 2) {
            $$0.b(gbi.this.m.h, this.c.get(0), $$2, $$1, -1);
            $$0.b(gbi.this.m.h, this.c.get(1), $$2, $$1 + 10, -1);
         }
      }
   }

   public class e extends gbi.d {
      private final fqw d;

      public e(final wv $$1, final List<ayw> $$2, final String $$3, final dhl.d $$4) {
         super($$2, $$1);
         this.d = new fqw(gbi.this.m.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.m(14737632);
               gbi.this.b(this);
            } else {
               this.d.m(-65536);
               gbi.this.a(this);
            }
         });
         this.a.add(this.d);
      }

      @Override
      public void a(fpz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.j($$3 + $$4 - 45);
         this.d.k($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends fqt.a<gbi.f> {
      @Nullable
      final List<ayw> a;

      public f(@Nullable List<ayw> $$0) {
         this.a = $$0;
      }
   }

   public class g extends fqt<gbi.f> {
      private static final int m = 24;

      public g(final dhl $$1) {
         super(fnd.Q(), gbi.this.n, gbi.this.c.d(), gbi.this.c.c(), 24);
         final Map<dhl.b, Map<dhl.e<?>, gbi.f>> $$2 = Maps.newHashMap();
         $$1.a(new dhl.c() {
            @Override
            public void b(dhl.e<dhl.a> $$0, dhl.f<dhl.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> gbi.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(dhl.e<dhl.d> $$0, dhl.f<dhl.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> gbi.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends dhl.g<T>> void a(dhl.e<T> $$0, gbi.c<T> $$1x) {
               wv $$2 = wv.c($$0.b());
               wv $$3 = wv.b($$0.a()).a(n.o);
               T $$4 = $$1.b($$0);
               String $$5 = $$4.b();
               wv $$6 = wv.a("editGamerule.default", wv.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<ayw> $$10;
               String $$11;
               if (hia.a($$7)) {
                  Builder<ayw> $$8 = ImmutableList.builder().add($$3.g());
                  wv $$9 = wv.c($$7);
                  gbi.this.p.c($$9, 150).forEach($$8::add);
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
                  this.b(gbi.this.new b(wv.c(((dhl.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(dhl.e::a)))
                     .forEach($$0xx -> this.b((gbi.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void b(fpz $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         gbi.f $$4 = this.x();
         if ($$4 != null && $$4.a != null) {
            gbi.this.b($$4.a);
         }
      }
   }
}

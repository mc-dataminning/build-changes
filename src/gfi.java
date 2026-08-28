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

public class gfi extends gaf {
   private static final xc a = xc.c("editGamerule.title");
   private static final int b = 8;
   final fyb c = new fyb(this);
   private final Consumer<Optional<djv>> d;
   private final Set<gfi.f> s = Sets.newHashSet();
   private final djv u;
   @Nullable
   private gfi.g v;
   @Nullable
   private fun w;

   public gfi(djv $$0, Consumer<Optional<djv>> $$1) {
      super(a);
      this.u = $$0;
      this.d = $$1;
   }

   @Override
   protected void aS_() {
      this.c.a(a, this.p);
      this.v = this.c.c(new gfi.g(this.u));
      fyf $$0 = this.c.b(fyf.e().a(8));
      this.w = $$0.a(fun.a(xb.d, $$0x -> this.d.accept(Optional.of(this.u))).a());
      $$0.a(fun.a(xb.e, $$0x -> this.aP_()).a());
      this.c.a($$1 -> {
         ful var10000 = this.c($$1);
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

   void a(gfi.f $$0) {
      this.s.add($$0);
      this.m();
   }

   void b(gfi.f $$0) {
      this.s.remove($$0);
      this.m();
   }

   public class a extends gfi.d {
      private final fuu<Boolean> c;

      public a(final xc $$1, final List<azc> $$2, final String $$3, final djv.a $$4) {
         super($$2, $$1);
         this.c = fuu.b($$4.a()).a().a($$1x -> $$1x.c().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.a.add(this.c);
      }

      @Override
      public void a(ftz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.c.j($$3 + $$4 - 45);
         this.c.k($$2);
         this.c.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends gfi.f {
      final xc b;

      public b(final xc $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(ftz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(gfi.this.m.h, this.b, $$3 + $$4 / 2, $$2 + 5, -1);
      }

      @Override
      public List<? extends fwk> aI_() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends fyi> b() {
         return ImmutableList.of(new fyi() {
            @Override
            public fyi.a w() {
               return fyi.a.b;
            }

            @Override
            public void b(fyk $$0) {
               $$0.a(fyj.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends djv.g<T>> {
      gfi.f create(xc var1, List<azc> var2, String var3, T var4);
   }

   public abstract class d extends gfi.f {
      private final List<azc> c;
      protected final List<ful> a = Lists.newArrayList();

      public d(@Nullable final List<azc> $$1, final xc $$2) {
         super($$1);
         this.c = gfi.this.m.h.c($$2, 175);
      }

      @Override
      public List<? extends fwk> aI_() {
         return this.a;
      }

      @Override
      public List<? extends fyi> b() {
         return this.a;
      }

      protected void a(ftz $$0, int $$1, int $$2) {
         if (this.c.size() == 1) {
            $$0.b(gfi.this.m.h, this.c.get(0), $$2, $$1 + 5, -1);
         } else if (this.c.size() >= 2) {
            $$0.b(gfi.this.m.h, this.c.get(0), $$2, $$1, -1);
            $$0.b(gfi.this.m.h, this.c.get(1), $$2, $$1 + 10, -1);
         }
      }
   }

   public class e extends gfi.d {
      private final fuw d;

      public e(final xc $$1, final List<azc> $$2, final String $$3, final djv.d $$4) {
         super($$2, $$1);
         this.d = new fuw(gfi.this.m.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.m(14737632);
               gfi.this.b(this);
            } else {
               this.d.m(-65536);
               gfi.this.a(this);
            }
         });
         this.a.add(this.d);
      }

      @Override
      public void a(ftz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.j($$3 + $$4 - 45);
         this.d.k($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends fut.a<gfi.f> {
      @Nullable
      final List<azc> a;

      public f(@Nullable List<azc> $$0) {
         this.a = $$0;
      }
   }

   public class g extends fut<gfi.f> {
      private static final int m = 24;

      public g(final djv $$1) {
         super(frf.Q(), gfi.this.n, gfi.this.c.d(), gfi.this.c.c(), 24);
         final Map<djv.b, Map<djv.e<?>, gfi.f>> $$2 = Maps.newHashMap();
         $$1.a(new djv.c() {
            @Override
            public void b(djv.e<djv.a> $$0, djv.f<djv.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> gfi.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(djv.e<djv.d> $$0, djv.f<djv.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> gfi.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends djv.g<T>> void a(djv.e<T> $$0, gfi.c<T> $$1x) {
               xc $$2 = xc.c($$0.b());
               xc $$3 = xc.b($$0.a()).a(o.o);
               T $$4 = $$1.b($$0);
               String $$5 = $$4.b();
               xc $$6 = xc.a("editGamerule.default", xc.b($$5)).a(o.h);
               String $$7 = $$0.b() + ".description";
               List<azc> $$10;
               String $$11;
               if (hmk.a($$7)) {
                  Builder<azc> $$8 = ImmutableList.builder().add($$3.g());
                  xc $$9 = xc.c($$7);
                  gfi.this.p.c($$9, 150).forEach($$8::add);
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
                  this.b(gfi.this.new b(xc.c(((djv.b)$$0x.getKey()).a()).a(o.r, o.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(djv.e::a)))
                     .forEach($$0xx -> this.b((gfi.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void b(ftz $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         gfi.f $$4 = this.x();
         if ($$4 != null && $$4.a != null) {
            gfi.this.b($$4.a);
         }
      }
   }
}

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

public class gde extends fyb {
   private static final wy a = wy.c("editGamerule.title");
   private static final int b = 8;
   final fvx c = new fvx(this);
   private final Consumer<Optional<diw>> d;
   private final Set<gde.f> s = Sets.newHashSet();
   private final diw u;
   @Nullable
   private gde.g v;
   @Nullable
   private fsj w;

   public gde(diw $$0, Consumer<Optional<diw>> $$1) {
      super(a);
      this.u = $$0;
      this.d = $$1;
   }

   @Override
   protected void aO_() {
      this.c.a(a, this.p);
      this.v = this.c.c(new gde.g(this.u));
      fwb $$0 = this.c.b(fwb.e().a(8));
      this.w = $$0.a(fsj.a(wx.d, $$0x -> this.d.accept(Optional.of(this.u))).a());
      $$0.a(fsj.a(wx.e, $$0x -> this.aL_()).a());
      this.c.a($$1 -> {
         fsh var10000 = this.c($$1);
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
   public void aL_() {
      this.d.accept(Optional.empty());
   }

   private void m() {
      if (this.w != null) {
         this.w.j = this.s.isEmpty();
      }
   }

   void a(gde.f $$0) {
      this.s.add($$0);
      this.m();
   }

   void b(gde.f $$0) {
      this.s.remove($$0);
      this.m();
   }

   public class a extends gde.d {
      private final fsq<Boolean> c;

      public a(final wy $$1, final List<ayy> $$2, final String $$3, final diw.a $$4) {
         super($$2, $$1);
         this.c = fsq.b($$4.a()).a().a($$1x -> $$1x.c().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.a.add(this.c);
      }

      @Override
      public void a(frv $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.c.j($$3 + $$4 - 45);
         this.c.k($$2);
         this.c.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends gde.f {
      final wy b;

      public b(final wy $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(frv $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(gde.this.m.h, this.b, $$3 + $$4 / 2, $$2 + 5, -1);
      }

      @Override
      public List<? extends fug> aE_() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends fwe> b() {
         return ImmutableList.of(new fwe() {
            @Override
            public fwe.a w() {
               return fwe.a.b;
            }

            @Override
            public void b(fwg $$0) {
               $$0.a(fwf.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends diw.g<T>> {
      gde.f create(wy var1, List<ayy> var2, String var3, T var4);
   }

   public abstract class d extends gde.f {
      private final List<ayy> c;
      protected final List<fsh> a = Lists.newArrayList();

      public d(@Nullable final List<ayy> $$1, final wy $$2) {
         super($$1);
         this.c = gde.this.m.h.c($$2, 175);
      }

      @Override
      public List<? extends fug> aE_() {
         return this.a;
      }

      @Override
      public List<? extends fwe> b() {
         return this.a;
      }

      protected void a(frv $$0, int $$1, int $$2) {
         if (this.c.size() == 1) {
            $$0.b(gde.this.m.h, this.c.get(0), $$2, $$1 + 5, -1);
         } else if (this.c.size() >= 2) {
            $$0.b(gde.this.m.h, this.c.get(0), $$2, $$1, -1);
            $$0.b(gde.this.m.h, this.c.get(1), $$2, $$1 + 10, -1);
         }
      }
   }

   public class e extends gde.d {
      private final fss d;

      public e(final wy $$1, final List<ayy> $$2, final String $$3, final diw.d $$4) {
         super($$2, $$1);
         this.d = new fss(gde.this.m.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.m(14737632);
               gde.this.b(this);
            } else {
               this.d.m(-65536);
               gde.this.a(this);
            }
         });
         this.a.add(this.d);
      }

      @Override
      public void a(frv $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.j($$3 + $$4 - 45);
         this.d.k($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends fsp.a<gde.f> {
      @Nullable
      final List<ayy> a;

      public f(@Nullable List<ayy> $$0) {
         this.a = $$0;
      }
   }

   public class g extends fsp<gde.f> {
      private static final int m = 24;

      public g(final diw $$1) {
         super(foz.Q(), gde.this.n, gde.this.c.d(), gde.this.c.c(), 24);
         final Map<diw.b, Map<diw.e<?>, gde.f>> $$2 = Maps.newHashMap();
         $$1.a(new diw.c() {
            @Override
            public void b(diw.e<diw.a> $$0, diw.f<diw.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> gde.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(diw.e<diw.d> $$0, diw.f<diw.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> gde.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends diw.g<T>> void a(diw.e<T> $$0, gde.c<T> $$1x) {
               wy $$2 = wy.c($$0.b());
               wy $$3 = wy.b($$0.a()).a(n.o);
               T $$4 = $$1.b($$0);
               String $$5 = $$4.b();
               wy $$6 = wy.a("editGamerule.default", wy.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<ayy> $$10;
               String $$11;
               if (hke.a($$7)) {
                  Builder<ayy> $$8 = ImmutableList.builder().add($$3.g());
                  wy $$9 = wy.c($$7);
                  gde.this.p.c($$9, 150).forEach($$8::add);
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
                  this.b(gde.this.new b(wy.c(((diw.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(diw.e::a)))
                     .forEach($$0xx -> this.b((gde.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void b(frv $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         gde.f $$4 = this.x();
         if ($$4 != null && $$4.a != null) {
            gde.this.b($$4.a);
         }
      }
   }
}

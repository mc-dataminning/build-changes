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

public class fvz extends fra {
   private static final xi a = xi.c("editGamerule.title");
   private static final int b = 8;
   final fow c = new fow(this);
   private final Consumer<Optional<dex>> d;
   private final Set<fvz.f> s = Sets.newHashSet();
   private final dex u;
   @Nullable
   private fvz.g v;
   @Nullable
   private flh w;

   public fvz(dex $$0, Consumer<Optional<dex>> $$1) {
      super(a);
      this.u = $$0;
      this.d = $$1;
   }

   @Override
   protected void aR_() {
      this.c.a(a, this.p);
      this.v = this.c.c(new fvz.g(this.u));
      fpa $$0 = this.c.b(fpa.e().a(8));
      this.w = $$0.a(flh.a(xh.d, $$0x -> this.d.accept(Optional.of(this.u))).a());
      $$0.a(flh.a(xh.e, $$0x -> this.d()).a());
      this.c.a($$1 -> {
         flf var10000 = this.c($$1);
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
   public void d() {
      this.d.accept(Optional.empty());
   }

   private void m() {
      if (this.w != null) {
         this.w.j = this.s.isEmpty();
      }
   }

   void a(fvz.f $$0) {
      this.s.add($$0);
      this.m();
   }

   void b(fvz.f $$0) {
      this.s.remove($$0);
      this.m();
   }

   public class a extends fvz.d {
      private final flo<Boolean> c;

      public a(final xi $$1, final List<ayw> $$2, final String $$3, final dex.a $$4) {
         super($$2, $$1);
         this.c = flo.b($$4.a()).a().a($$1x -> $$1x.c().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.a.add(this.c);
      }

      @Override
      public void a(fku $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.c.m($$3 + $$4 - 45);
         this.c.n($$2);
         this.c.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends fvz.f {
      final xi b;

      public b(final xi $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(fku $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fvz.this.m.h, this.b, $$3 + $$4 / 2, $$2 + 5, -1);
      }

      @Override
      public List<? extends fne> aI_() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends fpd> b() {
         return ImmutableList.of(new fpd() {
            @Override
            public fpd.a u() {
               return fpd.a.b;
            }

            @Override
            public void b(fpf $$0) {
               $$0.a(fpe.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends dex.g<T>> {
      fvz.f create(xi var1, List<ayw> var2, String var3, T var4);
   }

   public abstract class d extends fvz.f {
      private final List<ayw> c;
      protected final List<flf> a = Lists.newArrayList();

      public d(@Nullable final List<ayw> $$1, final xi $$2) {
         super($$1);
         this.c = fvz.this.m.h.c($$2, 175);
      }

      @Override
      public List<? extends fne> aI_() {
         return this.a;
      }

      @Override
      public List<? extends fpd> b() {
         return this.a;
      }

      protected void a(fku $$0, int $$1, int $$2) {
         if (this.c.size() == 1) {
            $$0.a(fvz.this.m.h, this.c.get(0), $$2, $$1 + 5, -1, false);
         } else if (this.c.size() >= 2) {
            $$0.a(fvz.this.m.h, this.c.get(0), $$2, $$1, -1, false);
            $$0.a(fvz.this.m.h, this.c.get(1), $$2, $$1 + 10, -1, false);
         }
      }
   }

   public class e extends fvz.d {
      private final flq d;

      public e(final xi $$1, final List<ayw> $$2, final String $$3, final dex.d $$4) {
         super($$2, $$1);
         this.d = new flq(fvz.this.m.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.g(14737632);
               fvz.this.b(this);
            } else {
               this.d.g(-65536);
               fvz.this.a(this);
            }
         });
         this.a.add(this.d);
      }

      @Override
      public void a(fku $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.m($$3 + $$4 - 45);
         this.d.n($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends fln.a<fvz.f> {
      @Nullable
      final List<ayw> a;

      public f(@Nullable List<ayw> $$0) {
         this.a = $$0;
      }
   }

   public class g extends fln<fvz.f> {
      private static final int m = 24;

      public g(final dex $$1) {
         super(fji.Q(), fvz.this.n, fvz.this.c.d(), fvz.this.c.c(), 24);
         final Map<dex.b, Map<dex.e<?>, fvz.f>> $$2 = Maps.newHashMap();
         $$1.a(new dex.c() {
            @Override
            public void b(dex.e<dex.a> $$0, dex.f<dex.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fvz.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(dex.e<dex.d> $$0, dex.f<dex.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fvz.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends dex.g<T>> void a(dex.e<T> $$0, fvz.c<T> $$1x) {
               xi $$2 = xi.c($$0.b());
               xi $$3 = xi.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               xi $$6 = xi.a("editGamerule.default", xi.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<ayw> $$10;
               String $$11;
               if (gzk.a($$7)) {
                  Builder<ayw> $$8 = ImmutableList.builder().add($$3.g());
                  xi $$9 = xi.c($$7);
                  fvz.this.p.c($$9, 150).forEach($$8::add);
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
                  this.b(fvz.this.new b(xi.c(((dex.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(dex.e::a)))
                     .forEach($$0xx -> this.b((fvz.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void b(fku $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         fvz.f $$4 = this.v();
         if ($$4 != null && $$4.a != null) {
            fvz.this.b($$4.a);
         }
      }
   }
}

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

public class fwp extends frp {
   private static final xl a = xl.c("editGamerule.title");
   private static final int b = 8;
   final fpl c = new fpl(this);
   private final Consumer<Optional<dfb>> d;
   private final Set<fwp.f> s = Sets.newHashSet();
   private final dfb u;
   @Nullable
   private fwp.g v;
   @Nullable
   private flw w;

   public fwp(dfb $$0, Consumer<Optional<dfb>> $$1) {
      super(a);
      this.u = $$0;
      this.d = $$1;
   }

   @Override
   protected void aS_() {
      this.c.a(a, this.p);
      this.v = this.c.c(new fwp.g(this.u));
      fpp $$0 = this.c.b(fpp.e().a(8));
      this.w = $$0.a(flw.a(xk.d, $$0x -> this.d.accept(Optional.of(this.u))).a());
      $$0.a(flw.a(xk.e, $$0x -> this.aP_()).a());
      this.c.a($$1 -> {
         flu var10000 = this.c($$1);
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

   void a(fwp.f $$0) {
      this.s.add($$0);
      this.m();
   }

   void b(fwp.f $$0) {
      this.s.remove($$0);
      this.m();
   }

   public class a extends fwp.d {
      private final fmd<Boolean> c;

      public a(final xl $$1, final List<ayz> $$2, final String $$3, final dfb.a $$4) {
         super($$2, $$1);
         this.c = fmd.b($$4.a()).a().a($$1x -> $$1x.c().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.a.add(this.c);
      }

      @Override
      public void a(flj $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.c.m($$3 + $$4 - 45);
         this.c.n($$2);
         this.c.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends fwp.f {
      final xl b;

      public b(final xl $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(flj $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fwp.this.m.h, this.b, $$3 + $$4 / 2, $$2 + 5, -1);
      }

      @Override
      public List<? extends fnt> aI_() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends fps> b() {
         return ImmutableList.of(new fps() {
            @Override
            public fps.a u() {
               return fps.a.b;
            }

            @Override
            public void b(fpu $$0) {
               $$0.a(fpt.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends dfb.g<T>> {
      fwp.f create(xl var1, List<ayz> var2, String var3, T var4);
   }

   public abstract class d extends fwp.f {
      private final List<ayz> c;
      protected final List<flu> a = Lists.newArrayList();

      public d(@Nullable final List<ayz> $$1, final xl $$2) {
         super($$1);
         this.c = fwp.this.m.h.c($$2, 175);
      }

      @Override
      public List<? extends fnt> aI_() {
         return this.a;
      }

      @Override
      public List<? extends fps> b() {
         return this.a;
      }

      protected void a(flj $$0, int $$1, int $$2) {
         if (this.c.size() == 1) {
            $$0.a(fwp.this.m.h, this.c.get(0), $$2, $$1 + 5, -1, false);
         } else if (this.c.size() >= 2) {
            $$0.a(fwp.this.m.h, this.c.get(0), $$2, $$1, -1, false);
            $$0.a(fwp.this.m.h, this.c.get(1), $$2, $$1 + 10, -1, false);
         }
      }
   }

   public class e extends fwp.d {
      private final fmf d;

      public e(final xl $$1, final List<ayz> $$2, final String $$3, final dfb.d $$4) {
         super($$2, $$1);
         this.d = new fmf(fwp.this.m.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.g(14737632);
               fwp.this.b(this);
            } else {
               this.d.g(-65536);
               fwp.this.a(this);
            }
         });
         this.a.add(this.d);
      }

      @Override
      public void a(flj $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.m($$3 + $$4 - 45);
         this.d.n($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends fmc.a<fwp.f> {
      @Nullable
      final List<ayz> a;

      public f(@Nullable List<ayz> $$0) {
         this.a = $$0;
      }
   }

   public class g extends fmc<fwp.f> {
      private static final int m = 24;

      public g(final dfb $$1) {
         super(fjx.Q(), fwp.this.n, fwp.this.c.d(), fwp.this.c.c(), 24);
         final Map<dfb.b, Map<dfb.e<?>, fwp.f>> $$2 = Maps.newHashMap();
         $$1.a(new dfb.c() {
            @Override
            public void b(dfb.e<dfb.a> $$0, dfb.f<dfb.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fwp.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(dfb.e<dfb.d> $$0, dfb.f<dfb.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fwp.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends dfb.g<T>> void a(dfb.e<T> $$0, fwp.c<T> $$1x) {
               xl $$2 = xl.c($$0.b());
               xl $$3 = xl.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               xl $$6 = xl.a("editGamerule.default", xl.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<ayz> $$10;
               String $$11;
               if (haa.a($$7)) {
                  Builder<ayz> $$8 = ImmutableList.builder().add($$3.g());
                  xl $$9 = xl.c($$7);
                  fwp.this.p.c($$9, 150).forEach($$8::add);
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
                  this.b(fwp.this.new b(xl.c(((dfb.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(dfb.e::a)))
                     .forEach($$0xx -> this.b((fwp.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void b(flj $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         fwp.f $$4 = this.v();
         if ($$4 != null && $$4.a != null) {
            fwp.this.b($$4.a);
         }
      }
   }
}

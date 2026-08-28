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

public class fvb extends fqd {
   private static final xd a = xd.c("editGamerule.title");
   private static final int b = 8;
   final fny c = new fny(this);
   private final Consumer<Optional<dec>> d;
   private final Set<fvb.f> s = Sets.newHashSet();
   private final dec u;
   @Nullable
   private fvb.g v;
   @Nullable
   private fkk w;

   public fvb(dec $$0, Consumer<Optional<dec>> $$1) {
      super(a);
      this.u = $$0;
      this.d = $$1;
   }

   @Override
   protected void aR_() {
      this.c.a(a, this.p);
      this.v = this.c.c(new fvb.g(this.u));
      foc $$0 = this.c.b(foc.e().a(8));
      this.w = $$0.a(fkk.a(xc.d, $$0x -> this.d.accept(Optional.of(this.u))).a());
      $$0.a(fkk.a(xc.e, $$0x -> this.d()).a());
      this.c.a($$1 -> {
         fki var10000 = this.c($$1);
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

   void a(fvb.f $$0) {
      this.s.add($$0);
      this.m();
   }

   void b(fvb.f $$0) {
      this.s.remove($$0);
      this.m();
   }

   public class a extends fvb.d {
      private final fkr<Boolean> c;

      public a(final xd $$1, final List<ayp> $$2, final String $$3, final dec.a $$4) {
         super($$2, $$1);
         this.c = fkr.b($$4.a()).a().a($$1x -> $$1x.c().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.a.add(this.c);
      }

      @Override
      public void a(fjx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.c.m($$3 + $$4 - 45);
         this.c.n($$2);
         this.c.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends fvb.f {
      final xd b;

      public b(final xd $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(fjx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fvb.this.m.h, this.b, $$3 + $$4 / 2, $$2 + 5, -1);
      }

      @Override
      public List<? extends fmh> aI_() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends fof> b() {
         return ImmutableList.of(new fof() {
            @Override
            public fof.a u() {
               return fof.a.b;
            }

            @Override
            public void b(foh $$0) {
               $$0.a(fog.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends dec.g<T>> {
      fvb.f create(xd var1, List<ayp> var2, String var3, T var4);
   }

   public abstract class d extends fvb.f {
      private final List<ayp> c;
      protected final List<fki> a = Lists.newArrayList();

      public d(@Nullable final List<ayp> $$1, final xd $$2) {
         super($$1);
         this.c = fvb.this.m.h.c($$2, 175);
      }

      @Override
      public List<? extends fmh> aI_() {
         return this.a;
      }

      @Override
      public List<? extends fof> b() {
         return this.a;
      }

      protected void a(fjx $$0, int $$1, int $$2) {
         if (this.c.size() == 1) {
            $$0.a(fvb.this.m.h, this.c.get(0), $$2, $$1 + 5, -1, false);
         } else if (this.c.size() >= 2) {
            $$0.a(fvb.this.m.h, this.c.get(0), $$2, $$1, -1, false);
            $$0.a(fvb.this.m.h, this.c.get(1), $$2, $$1 + 10, -1, false);
         }
      }
   }

   public class e extends fvb.d {
      private final fkt d;

      public e(final xd $$1, final List<ayp> $$2, final String $$3, final dec.d $$4) {
         super($$2, $$1);
         this.d = new fkt(fvb.this.m.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.g(14737632);
               fvb.this.b(this);
            } else {
               this.d.g(-65536);
               fvb.this.a(this);
            }
         });
         this.a.add(this.d);
      }

      @Override
      public void a(fjx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.m($$3 + $$4 - 45);
         this.d.n($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends fkq.a<fvb.f> {
      @Nullable
      final List<ayp> a;

      public f(@Nullable List<ayp> $$0) {
         this.a = $$0;
      }
   }

   public class g extends fkq<fvb.f> {
      private static final int m = 24;

      public g(final dec $$1) {
         super(fil.Q(), fvb.this.n, fvb.this.c.d(), fvb.this.c.c(), 24);
         final Map<dec.b, Map<dec.e<?>, fvb.f>> $$2 = Maps.newHashMap();
         $$1.a(new dec.c() {
            @Override
            public void b(dec.e<dec.a> $$0, dec.f<dec.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fvb.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(dec.e<dec.d> $$0, dec.f<dec.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fvb.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends dec.g<T>> void a(dec.e<T> $$0, fvb.c<T> $$1x) {
               xd $$2 = xd.c($$0.b());
               xd $$3 = xd.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               xd $$6 = xd.a("editGamerule.default", xd.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<ayp> $$10;
               String $$11;
               if (gyi.a($$7)) {
                  Builder<ayp> $$8 = ImmutableList.builder().add($$3.g());
                  xd $$9 = xd.c($$7);
                  fvb.this.p.c($$9, 150).forEach($$8::add);
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
                  this.b(fvb.this.new b(xd.c(((dec.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(dec.e::a)))
                     .forEach($$0xx -> this.b((fvb.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void b(fjx $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         fvb.f $$4 = this.v();
         if ($$4 != null && $$4.a != null) {
            fvb.this.b($$4.a);
         }
      }
   }
}

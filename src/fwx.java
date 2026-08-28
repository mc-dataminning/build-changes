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

public class fwx extends frw {
   private static final xj a = xj.c("editGamerule.title");
   private static final int b = 8;
   final fps c = new fps(this);
   private final Consumer<Optional<dfi>> d;
   private final Set<fwx.f> s = Sets.newHashSet();
   private final dfi u;
   @Nullable
   private fwx.g v;
   @Nullable
   private fmd w;

   public fwx(dfi $$0, Consumer<Optional<dfi>> $$1) {
      super(a);
      this.u = $$0;
      this.d = $$1;
   }

   @Override
   protected void aR_() {
      this.c.a(a, this.p);
      this.v = this.c.c(new fwx.g(this.u));
      fpw $$0 = this.c.b(fpw.e().a(8));
      this.w = $$0.a(fmd.a(xi.d, $$0x -> this.d.accept(Optional.of(this.u))).a());
      $$0.a(fmd.a(xi.e, $$0x -> this.aO_()).a());
      this.c.a($$1 -> {
         fmb var10000 = this.c($$1);
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

   void a(fwx.f $$0) {
      this.s.add($$0);
      this.m();
   }

   void b(fwx.f $$0) {
      this.s.remove($$0);
      this.m();
   }

   public class a extends fwx.d {
      private final fmk<Boolean> c;

      public a(final xj $$1, final List<ayy> $$2, final String $$3, final dfi.a $$4) {
         super($$2, $$1);
         this.c = fmk.b($$4.a()).a().a($$1x -> $$1x.c().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.a.add(this.c);
      }

      @Override
      public void a(flq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.c.m($$3 + $$4 - 45);
         this.c.n($$2);
         this.c.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends fwx.f {
      final xj b;

      public b(final xj $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(flq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fwx.this.m.h, this.b, $$3 + $$4 / 2, $$2 + 5, -1);
      }

      @Override
      public List<? extends foa> aH_() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends fpz> b() {
         return ImmutableList.of(new fpz() {
            @Override
            public fpz.a u() {
               return fpz.a.b;
            }

            @Override
            public void b(fqb $$0) {
               $$0.a(fqa.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends dfi.g<T>> {
      fwx.f create(xj var1, List<ayy> var2, String var3, T var4);
   }

   public abstract class d extends fwx.f {
      private final List<ayy> c;
      protected final List<fmb> a = Lists.newArrayList();

      public d(@Nullable final List<ayy> $$1, final xj $$2) {
         super($$1);
         this.c = fwx.this.m.h.c($$2, 175);
      }

      @Override
      public List<? extends foa> aH_() {
         return this.a;
      }

      @Override
      public List<? extends fpz> b() {
         return this.a;
      }

      protected void a(flq $$0, int $$1, int $$2) {
         if (this.c.size() == 1) {
            $$0.a(fwx.this.m.h, this.c.get(0), $$2, $$1 + 5, -1, false);
         } else if (this.c.size() >= 2) {
            $$0.a(fwx.this.m.h, this.c.get(0), $$2, $$1, -1, false);
            $$0.a(fwx.this.m.h, this.c.get(1), $$2, $$1 + 10, -1, false);
         }
      }
   }

   public class e extends fwx.d {
      private final fmm d;

      public e(final xj $$1, final List<ayy> $$2, final String $$3, final dfi.d $$4) {
         super($$2, $$1);
         this.d = new fmm(fwx.this.m.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.g(14737632);
               fwx.this.b(this);
            } else {
               this.d.g(-65536);
               fwx.this.a(this);
            }
         });
         this.a.add(this.d);
      }

      @Override
      public void a(flq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.m($$3 + $$4 - 45);
         this.d.n($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends fmj.a<fwx.f> {
      @Nullable
      final List<ayy> a;

      public f(@Nullable List<ayy> $$0) {
         this.a = $$0;
      }
   }

   public class g extends fmj<fwx.f> {
      private static final int m = 24;

      public g(final dfi $$1) {
         super(fke.Q(), fwx.this.n, fwx.this.c.d(), fwx.this.c.c(), 24);
         final Map<dfi.b, Map<dfi.e<?>, fwx.f>> $$2 = Maps.newHashMap();
         $$1.a(new dfi.c() {
            @Override
            public void b(dfi.e<dfi.a> $$0, dfi.f<dfi.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fwx.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(dfi.e<dfi.d> $$0, dfi.f<dfi.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fwx.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends dfi.g<T>> void a(dfi.e<T> $$0, fwx.c<T> $$1x) {
               xj $$2 = xj.c($$0.b());
               xj $$3 = xj.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               xj $$6 = xj.a("editGamerule.default", xj.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<ayy> $$10;
               String $$11;
               if (hal.a($$7)) {
                  Builder<ayy> $$8 = ImmutableList.builder().add($$3.g());
                  xj $$9 = xj.c($$7);
                  fwx.this.p.c($$9, 150).forEach($$8::add);
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
                  this.b(fwx.this.new b(xj.c(((dfi.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(dfi.e::a)))
                     .forEach($$0xx -> this.b((fwx.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void b(flq $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         fwx.f $$4 = this.v();
         if ($$4 != null && $$4.a != null) {
            fwx.this.b($$4.a);
         }
      }
   }
}

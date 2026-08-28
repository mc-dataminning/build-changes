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

public class gcl extends fxi {
   private static final ww a = ww.c("editGamerule.title");
   private static final int b = 8;
   final fve c = new fve(this);
   private final Consumer<Optional<dil>> d;
   private final Set<gcl.f> s = Sets.newHashSet();
   private final dil u;
   @Nullable
   private gcl.g v;
   @Nullable
   private frq w;

   public gcl(dil $$0, Consumer<Optional<dil>> $$1) {
      super(a);
      this.u = $$0;
      this.d = $$1;
   }

   @Override
   protected void aN_() {
      this.c.a(a, this.p);
      this.v = this.c.c(new gcl.g(this.u));
      fvi $$0 = this.c.b(fvi.e().a(8));
      this.w = $$0.a(frq.a(wv.d, $$0x -> this.d.accept(Optional.of(this.u))).a());
      $$0.a(frq.a(wv.e, $$0x -> this.aK_()).a());
      this.c.a($$1 -> {
         fro var10000 = this.c($$1);
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

   void a(gcl.f $$0) {
      this.s.add($$0);
      this.m();
   }

   void b(gcl.f $$0) {
      this.s.remove($$0);
      this.m();
   }

   public class a extends gcl.d {
      private final frx<Boolean> c;

      public a(final ww $$1, final List<ayw> $$2, final String $$3, final dil.a $$4) {
         super($$2, $$1);
         this.c = frx.b($$4.a()).a().a($$1x -> $$1x.c().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.a.add(this.c);
      }

      @Override
      public void a(frc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.c.j($$3 + $$4 - 45);
         this.c.k($$2);
         this.c.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends gcl.f {
      final ww b;

      public b(final ww $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(frc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(gcl.this.m.h, this.b, $$3 + $$4 / 2, $$2 + 5, -1);
      }

      @Override
      public List<? extends ftn> aD_() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends fvl> b() {
         return ImmutableList.of(new fvl() {
            @Override
            public fvl.a w() {
               return fvl.a.b;
            }

            @Override
            public void b(fvn $$0) {
               $$0.a(fvm.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends dil.g<T>> {
      gcl.f create(ww var1, List<ayw> var2, String var3, T var4);
   }

   public abstract class d extends gcl.f {
      private final List<ayw> c;
      protected final List<fro> a = Lists.newArrayList();

      public d(@Nullable final List<ayw> $$1, final ww $$2) {
         super($$1);
         this.c = gcl.this.m.h.c($$2, 175);
      }

      @Override
      public List<? extends ftn> aD_() {
         return this.a;
      }

      @Override
      public List<? extends fvl> b() {
         return this.a;
      }

      protected void a(frc $$0, int $$1, int $$2) {
         if (this.c.size() == 1) {
            $$0.b(gcl.this.m.h, this.c.get(0), $$2, $$1 + 5, -1);
         } else if (this.c.size() >= 2) {
            $$0.b(gcl.this.m.h, this.c.get(0), $$2, $$1, -1);
            $$0.b(gcl.this.m.h, this.c.get(1), $$2, $$1 + 10, -1);
         }
      }
   }

   public class e extends gcl.d {
      private final frz d;

      public e(final ww $$1, final List<ayw> $$2, final String $$3, final dil.d $$4) {
         super($$2, $$1);
         this.d = new frz(gcl.this.m.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.m(14737632);
               gcl.this.b(this);
            } else {
               this.d.m(-65536);
               gcl.this.a(this);
            }
         });
         this.a.add(this.d);
      }

      @Override
      public void a(frc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.j($$3 + $$4 - 45);
         this.d.k($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends frw.a<gcl.f> {
      @Nullable
      final List<ayw> a;

      public f(@Nullable List<ayw> $$0) {
         this.a = $$0;
      }
   }

   public class g extends frw<gcl.f> {
      private static final int m = 24;

      public g(final dil $$1) {
         super(fof.Q(), gcl.this.n, gcl.this.c.d(), gcl.this.c.c(), 24);
         final Map<dil.b, Map<dil.e<?>, gcl.f>> $$2 = Maps.newHashMap();
         $$1.a(new dil.c() {
            @Override
            public void b(dil.e<dil.a> $$0, dil.f<dil.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> gcl.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(dil.e<dil.d> $$0, dil.f<dil.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> gcl.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends dil.g<T>> void a(dil.e<T> $$0, gcl.c<T> $$1x) {
               ww $$2 = ww.c($$0.b());
               ww $$3 = ww.b($$0.a()).a(n.o);
               T $$4 = $$1.b($$0);
               String $$5 = $$4.b();
               ww $$6 = ww.a("editGamerule.default", ww.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<ayw> $$10;
               String $$11;
               if (hjg.a($$7)) {
                  Builder<ayw> $$8 = ImmutableList.builder().add($$3.g());
                  ww $$9 = ww.c($$7);
                  gcl.this.p.c($$9, 150).forEach($$8::add);
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
                  this.b(gcl.this.new b(ww.c(((dil.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(dil.e::a)))
                     .forEach($$0xx -> this.b((gcl.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void b(frc $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         gcl.f $$4 = this.x();
         if ($$4 != null && $$4.a != null) {
            gcl.this.b($$4.a);
         }
      }
   }
}

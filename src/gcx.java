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

public class gcx extends fxu {
   private static final wy a = wy.c("editGamerule.title");
   private static final int b = 8;
   final fvq c = new fvq(this);
   private final Consumer<Optional<dir>> d;
   private final Set<gcx.f> s = Sets.newHashSet();
   private final dir u;
   @Nullable
   private gcx.g v;
   @Nullable
   private fsc w;

   public gcx(dir $$0, Consumer<Optional<dir>> $$1) {
      super(a);
      this.u = $$0;
      this.d = $$1;
   }

   @Override
   protected void aN_() {
      this.c.a(a, this.p);
      this.v = this.c.c(new gcx.g(this.u));
      fvu $$0 = this.c.b(fvu.e().a(8));
      this.w = $$0.a(fsc.a(wx.d, $$0x -> this.d.accept(Optional.of(this.u))).a());
      $$0.a(fsc.a(wx.e, $$0x -> this.aK_()).a());
      this.c.a($$1 -> {
         fsa var10000 = this.c($$1);
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

   void a(gcx.f $$0) {
      this.s.add($$0);
      this.m();
   }

   void b(gcx.f $$0) {
      this.s.remove($$0);
      this.m();
   }

   public class a extends gcx.d {
      private final fsj<Boolean> c;

      public a(final wy $$1, final List<ayy> $$2, final String $$3, final dir.a $$4) {
         super($$2, $$1);
         this.c = fsj.b($$4.a()).a().a($$1x -> $$1x.c().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.a.add(this.c);
      }

      @Override
      public void a(fro $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.c.j($$3 + $$4 - 45);
         this.c.k($$2);
         this.c.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends gcx.f {
      final wy b;

      public b(final wy $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(fro $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(gcx.this.m.h, this.b, $$3 + $$4 / 2, $$2 + 5, -1);
      }

      @Override
      public List<? extends ftz> aD_() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends fvx> b() {
         return ImmutableList.of(new fvx() {
            @Override
            public fvx.a w() {
               return fvx.a.b;
            }

            @Override
            public void b(fvz $$0) {
               $$0.a(fvy.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends dir.g<T>> {
      gcx.f create(wy var1, List<ayy> var2, String var3, T var4);
   }

   public abstract class d extends gcx.f {
      private final List<ayy> c;
      protected final List<fsa> a = Lists.newArrayList();

      public d(@Nullable final List<ayy> $$1, final wy $$2) {
         super($$1);
         this.c = gcx.this.m.h.c($$2, 175);
      }

      @Override
      public List<? extends ftz> aD_() {
         return this.a;
      }

      @Override
      public List<? extends fvx> b() {
         return this.a;
      }

      protected void a(fro $$0, int $$1, int $$2) {
         if (this.c.size() == 1) {
            $$0.b(gcx.this.m.h, this.c.get(0), $$2, $$1 + 5, -1);
         } else if (this.c.size() >= 2) {
            $$0.b(gcx.this.m.h, this.c.get(0), $$2, $$1, -1);
            $$0.b(gcx.this.m.h, this.c.get(1), $$2, $$1 + 10, -1);
         }
      }
   }

   public class e extends gcx.d {
      private final fsl d;

      public e(final wy $$1, final List<ayy> $$2, final String $$3, final dir.d $$4) {
         super($$2, $$1);
         this.d = new fsl(gcx.this.m.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.m(14737632);
               gcx.this.b(this);
            } else {
               this.d.m(-65536);
               gcx.this.a(this);
            }
         });
         this.a.add(this.d);
      }

      @Override
      public void a(fro $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.j($$3 + $$4 - 45);
         this.d.k($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends fsi.a<gcx.f> {
      @Nullable
      final List<ayy> a;

      public f(@Nullable List<ayy> $$0) {
         this.a = $$0;
      }
   }

   public class g extends fsi<gcx.f> {
      private static final int m = 24;

      public g(final dir $$1) {
         super(fos.Q(), gcx.this.n, gcx.this.c.d(), gcx.this.c.c(), 24);
         final Map<dir.b, Map<dir.e<?>, gcx.f>> $$2 = Maps.newHashMap();
         $$1.a(new dir.c() {
            @Override
            public void b(dir.e<dir.a> $$0, dir.f<dir.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> gcx.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(dir.e<dir.d> $$0, dir.f<dir.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> gcx.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends dir.g<T>> void a(dir.e<T> $$0, gcx.c<T> $$1x) {
               wy $$2 = wy.c($$0.b());
               wy $$3 = wy.b($$0.a()).a(n.o);
               T $$4 = $$1.b($$0);
               String $$5 = $$4.b();
               wy $$6 = wy.a("editGamerule.default", wy.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<ayy> $$10;
               String $$11;
               if (hjw.a($$7)) {
                  Builder<ayy> $$8 = ImmutableList.builder().add($$3.g());
                  wy $$9 = wy.c($$7);
                  gcx.this.p.c($$9, 150).forEach($$8::add);
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
                  this.b(gcx.this.new b(wy.c(((dir.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(dir.e::a)))
                     .forEach($$0xx -> this.b((gcx.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void b(fro $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         gcx.f $$4 = this.x();
         if ($$4 != null && $$4.a != null) {
            gcx.this.b($$4.a);
         }
      }
   }
}

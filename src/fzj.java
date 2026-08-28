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

public class fzj extends fui {
   private static final wo a = wo.c("editGamerule.title");
   private static final int b = 8;
   final fse c = new fse(this);
   private final Consumer<Optional<dgc>> d;
   private final Set<fzj.f> s = Sets.newHashSet();
   private final dgc u;
   @Nullable
   private fzj.g v;
   @Nullable
   private fop w;

   public fzj(dgc $$0, Consumer<Optional<dgc>> $$1) {
      super(a);
      this.u = $$0;
      this.d = $$1;
   }

   @Override
   protected void aR_() {
      this.c.a(a, this.p);
      this.v = this.c.c(new fzj.g(this.u));
      fsi $$0 = this.c.b(fsi.e().a(8));
      this.w = $$0.a(fop.a(wn.d, $$0x -> this.d.accept(Optional.of(this.u))).a());
      $$0.a(fop.a(wn.e, $$0x -> this.aO_()).a());
      this.c.a($$1 -> {
         fon var10000 = this.c($$1);
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

   void a(fzj.f $$0) {
      this.s.add($$0);
      this.m();
   }

   void b(fzj.f $$0) {
      this.s.remove($$0);
      this.m();
   }

   public class a extends fzj.d {
      private final fox<Boolean> c;

      public a(final wo $$1, final List<ayk> $$2, final String $$3, final dgc.a $$4) {
         super($$2, $$1);
         this.c = fox.b($$4.a()).a().a($$1x -> $$1x.c().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.a.add(this.c);
      }

      @Override
      public void a(fob $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.c.j($$3 + $$4 - 45);
         this.c.k($$2);
         this.c.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends fzj.f {
      final wo b;

      public b(final wo $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(fob $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fzj.this.m.h, this.b, $$3 + $$4 / 2, $$2 + 5, -1);
      }

      @Override
      public List<? extends fqn> aH_() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends fsl> b() {
         return ImmutableList.of(new fsl() {
            @Override
            public fsl.a w() {
               return fsl.a.b;
            }

            @Override
            public void b(fsn $$0) {
               $$0.a(fsm.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends dgc.g<T>> {
      fzj.f create(wo var1, List<ayk> var2, String var3, T var4);
   }

   public abstract class d extends fzj.f {
      private final List<ayk> c;
      protected final List<fon> a = Lists.newArrayList();

      public d(@Nullable final List<ayk> $$1, final wo $$2) {
         super($$1);
         this.c = fzj.this.m.h.c($$2, 175);
      }

      @Override
      public List<? extends fqn> aH_() {
         return this.a;
      }

      @Override
      public List<? extends fsl> b() {
         return this.a;
      }

      protected void a(fob $$0, int $$1, int $$2) {
         if (this.c.size() == 1) {
            $$0.b(fzj.this.m.h, this.c.get(0), $$2, $$1 + 5, -1);
         } else if (this.c.size() >= 2) {
            $$0.b(fzj.this.m.h, this.c.get(0), $$2, $$1, -1);
            $$0.b(fzj.this.m.h, this.c.get(1), $$2, $$1 + 10, -1);
         }
      }
   }

   public class e extends fzj.d {
      private final foz d;

      public e(final wo $$1, final List<ayk> $$2, final String $$3, final dgc.d $$4) {
         super($$2, $$1);
         this.d = new foz(fzj.this.m.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.m(14737632);
               fzj.this.b(this);
            } else {
               this.d.m(-65536);
               fzj.this.a(this);
            }
         });
         this.a.add(this.d);
      }

      @Override
      public void a(fob $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.j($$3 + $$4 - 45);
         this.d.k($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends fow.a<fzj.f> {
      @Nullable
      final List<ayk> a;

      public f(@Nullable List<ayk> $$0) {
         this.a = $$0;
      }
   }

   public class g extends fow<fzj.f> {
      private static final int m = 24;

      public g(final dgc $$1) {
         super(flh.Q(), fzj.this.n, fzj.this.c.d(), fzj.this.c.c(), 24);
         final Map<dgc.b, Map<dgc.e<?>, fzj.f>> $$2 = Maps.newHashMap();
         $$1.a(new dgc.c() {
            @Override
            public void b(dgc.e<dgc.a> $$0, dgc.f<dgc.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fzj.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(dgc.e<dgc.d> $$0, dgc.f<dgc.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fzj.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends dgc.g<T>> void a(dgc.e<T> $$0, fzj.c<T> $$1x) {
               wo $$2 = wo.c($$0.b());
               wo $$3 = wo.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               wo $$6 = wo.a("editGamerule.default", wo.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<ayk> $$10;
               String $$11;
               if (hfu.a($$7)) {
                  Builder<ayk> $$8 = ImmutableList.builder().add($$3.g());
                  wo $$9 = wo.c($$7);
                  fzj.this.p.c($$9, 150).forEach($$8::add);
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
                  this.b(fzj.this.new b(wo.c(((dgc.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(dgc.e::a)))
                     .forEach($$0xx -> this.b((fzj.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void b(fob $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         fzj.f $$4 = this.x();
         if ($$4 != null && $$4.a != null) {
            fzj.this.b($$4.a);
         }
      }
   }
}

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

public class fvq extends fqs {
   private static final xh a = xh.c("editGamerule.title");
   private static final int b = 8;
   final fon c = new fon(this);
   private final Consumer<Optional<der>> d;
   private final Set<fvq.f> s = Sets.newHashSet();
   private final der u;
   @Nullable
   private fvq.g v;
   @Nullable
   private fkz w;

   public fvq(der $$0, Consumer<Optional<der>> $$1) {
      super(a);
      this.u = $$0;
      this.d = $$1;
   }

   @Override
   protected void aS_() {
      this.c.a(a, this.p);
      this.v = this.c.c(new fvq.g(this.u));
      fos $$0 = this.c.b(fos.e().a(8));
      this.w = $$0.a(fkz.a(xg.d, $$0x -> this.d.accept(Optional.of(this.u))).a());
      $$0.a(fkz.a(xg.e, $$0x -> this.d()).a());
      this.c.a($$1 -> {
         fkx var10000 = this.c($$1);
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

   void a(fvq.f $$0) {
      this.s.add($$0);
      this.m();
   }

   void b(fvq.f $$0) {
      this.s.remove($$0);
      this.m();
   }

   public class a extends fvq.d {
      private final flg<Boolean> c;

      public a(final xh $$1, final List<ayv> $$2, final String $$3, final der.a $$4) {
         super($$2, $$1);
         this.c = flg.b($$4.a()).a().a($$1x -> $$1x.c().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.a.add(this.c);
      }

      @Override
      public void a(fkm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.c.m($$3 + $$4 - 45);
         this.c.n($$2);
         this.c.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends fvq.f {
      final xh b;

      public b(final xh $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(fkm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fvq.this.m.h, this.b, $$3 + $$4 / 2, $$2 + 5, -1);
      }

      @Override
      public List<? extends fmw> aJ_() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends fov> b() {
         return ImmutableList.of(new fov() {
            @Override
            public fov.a u() {
               return fov.a.b;
            }

            @Override
            public void b(fox $$0) {
               $$0.a(fow.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends der.g<T>> {
      fvq.f create(xh var1, List<ayv> var2, String var3, T var4);
   }

   public abstract class d extends fvq.f {
      private final List<ayv> c;
      protected final List<fkx> a = Lists.newArrayList();

      public d(@Nullable final List<ayv> $$1, final xh $$2) {
         super($$1);
         this.c = fvq.this.m.h.c($$2, 175);
      }

      @Override
      public List<? extends fmw> aJ_() {
         return this.a;
      }

      @Override
      public List<? extends fov> b() {
         return this.a;
      }

      protected void a(fkm $$0, int $$1, int $$2) {
         if (this.c.size() == 1) {
            $$0.a(fvq.this.m.h, this.c.get(0), $$2, $$1 + 5, -1, false);
         } else if (this.c.size() >= 2) {
            $$0.a(fvq.this.m.h, this.c.get(0), $$2, $$1, -1, false);
            $$0.a(fvq.this.m.h, this.c.get(1), $$2, $$1 + 10, -1, false);
         }
      }
   }

   public class e extends fvq.d {
      private final fli d;

      public e(final xh $$1, final List<ayv> $$2, final String $$3, final der.d $$4) {
         super($$2, $$1);
         this.d = new fli(fvq.this.m.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.g(14737632);
               fvq.this.b(this);
            } else {
               this.d.g(-65536);
               fvq.this.a(this);
            }
         });
         this.a.add(this.d);
      }

      @Override
      public void a(fkm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.m($$3 + $$4 - 45);
         this.d.n($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends flf.a<fvq.f> {
      @Nullable
      final List<ayv> a;

      public f(@Nullable List<ayv> $$0) {
         this.a = $$0;
      }
   }

   public class g extends flf<fvq.f> {
      private static final int m = 24;

      public g(final der $$1) {
         super(fja.Q(), fvq.this.n, fvq.this.c.d(), fvq.this.c.c(), 24);
         final Map<der.b, Map<der.e<?>, fvq.f>> $$2 = Maps.newHashMap();
         $$1.a(new der.c() {
            @Override
            public void b(der.e<der.a> $$0, der.f<der.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fvq.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(der.e<der.d> $$0, der.f<der.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fvq.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends der.g<T>> void a(der.e<T> $$0, fvq.c<T> $$1x) {
               xh $$2 = xh.c($$0.b());
               xh $$3 = xh.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               xh $$6 = xh.a("editGamerule.default", xh.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<ayv> $$10;
               String $$11;
               if (gyz.a($$7)) {
                  Builder<ayv> $$8 = ImmutableList.builder().add($$3.g());
                  xh $$9 = xh.c($$7);
                  fvq.this.p.c($$9, 150).forEach($$8::add);
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
                  this.b(fvq.this.new b(xh.c(((der.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(der.e::a)))
                     .forEach($$0xx -> this.b((fvq.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void b(fkm $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         fvq.f $$4 = this.v();
         if ($$4 != null && $$4.a != null) {
            fvq.this.b($$4.a);
         }
      }
   }
}

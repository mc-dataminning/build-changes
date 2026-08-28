import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class gw {
   public static <T, C, P> bmn<List<T>> a(gw.b<T, C, P> $$0) {
      bmd<List<T>> $$1 = bmd.a("top");
      bmd<Optional<T>> $$2 = bmd.a("type");
      bmd<azx> $$3 = bmd.a("any_type");
      bmd<T> $$4 = bmd.a("element_type");
      bmd<T> $$5 = bmd.a("tag_type");
      bmd<List<T>> $$6 = bmd.a("conditions");
      bmd<List<T>> $$7 = bmd.a("alternatives");
      bmd<T> $$8 = bmd.a("term");
      bmd<T> $$9 = bmd.a("negation");
      bmd<T> $$10 = bmd.a("test");
      bmd<C> $$11 = bmd.a("component_type");
      bmd<P> $$12 = bmd.a("predicate_type");
      bmd<alb> $$13 = bmd.a("id");
      bmd<vo> $$14 = bmd.a("tag");
      bmf<StringReader> $$15 = new bmf<>();
      $$15.a($$1, bmm.b(bmm.a(bmm.a($$2), bms.a('['), bmm.a(), bmm.a(bmm.a($$6)), bms.a(']')), bmm.a($$2)), $$2x -> {
         Builder<T> $$3x = ImmutableList.builder();
         $$2x.b($$2).ifPresent($$3x::add);
         List<T> $$4x = $$2x.a($$6);
         if ($$4x != null) {
            $$3x.addAll($$4x);
         }

         return $$3x.build();
      });
      $$15.a($$2, bmm.b(bmm.a($$4), bmm.a(bms.a('#'), bmm.a(), bmm.a($$5)), bmm.a($$3)), $$2x -> Optional.ofNullable($$2x.a($$4, $$5)));
      $$15.a($$3, bms.a('*'), $$0x -> azx.a);
      $$15.a($$4, new gw.c<>($$13, $$0));
      $$15.a($$5, new gw.e<>($$13, $$0));
      $$15.a($$6, bmm.a(bmm.a($$7), bmm.a(bmm.a(bms.a(','), bmm.a($$6)))), $$3x -> {
         T $$4x = $$0.a($$3x.b($$7));
         return Optional.ofNullable($$3x.a($$6)).map($$1xx -> ac.a($$4x, $$1xx)).orElse(List.of($$4x));
      });
      $$15.a($$7, bmm.a(bmm.a($$8), bmm.a(bmm.a(bms.a('|'), bmm.a($$7)))), $$2x -> {
         T $$3x = $$2x.b($$8);
         return Optional.ofNullable($$2x.a($$7)).map($$1xx -> ac.a($$3x, $$1xx)).orElse(List.of($$3x));
      });
      $$15.a($$8, bmm.b(bmm.a($$10), bmm.a(bms.a('!'), bmm.a($$9))), $$2x -> $$2x.b($$10, $$9));
      $$15.a($$9, bmm.a($$10), $$2x -> $$0.a($$2x.b($$10)));
      $$15.a(
         $$10,
         bmm.b(bmm.a(bmm.a($$11), bms.a('='), bmm.a(), bmm.a($$14)), bmm.a(bmm.a($$12), bms.a('~'), bmm.a(), bmm.a($$14)), bmm.a($$11)),
         ($$4x, $$5x) -> {
            P $$6x = $$5x.a($$12);

            try {
               if ($$6x != null) {
                  vo $$7x = $$5x.b($$14);
                  return Optional.of($$0.b((ImmutableStringReader)$$4x.b(), $$6x, $$7x));
               } else {
                  C $$8x = $$5x.b($$11);
                  vo $$9x = $$5x.a($$14);
                  return Optional.of($$9x != null ? $$0.a((ImmutableStringReader)$$4x.b(), $$8x, $$9x) : $$0.a((ImmutableStringReader)$$4x.b(), $$8x));
               }
            } catch (CommandSyntaxException var9x) {
               $$4x.a().a($$4x.c(), var9x);
               return Optional.empty();
            }
         }
      );
      $$15.a($$11, new gw.a<>($$13, $$0));
      $$15.a($$12, new gw.d<>($$13, $$0));
      $$15.a($$14, bmt.a);
      $$15.a($$13, bmo.a);
      return new bmn<>($$15, $$1);
   }

   static class a<T, C, P> extends bmp<gw.b<T, C, P>, C> {
      a(bmd<alb> $$0, gw.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected C a(ImmutableStringReader $$0, alb $$1) throws Exception {
         return this.a.c($$0, $$1);
      }

      @Override
      public Stream<alb> a() {
         return this.a.c();
      }
   }

   public interface b<T, C, P> {
      T a(ImmutableStringReader var1, alb var2) throws CommandSyntaxException;

      Stream<alb> a();

      T b(ImmutableStringReader var1, alb var2) throws CommandSyntaxException;

      Stream<alb> b();

      C c(ImmutableStringReader var1, alb var2) throws CommandSyntaxException;

      Stream<alb> c();

      T a(ImmutableStringReader var1, C var2, vo var3) throws CommandSyntaxException;

      T a(ImmutableStringReader var1, C var2);

      P d(ImmutableStringReader var1, alb var2) throws CommandSyntaxException;

      Stream<alb> d();

      T b(ImmutableStringReader var1, P var2, vo var3) throws CommandSyntaxException;

      T a(T var1);

      T a(List<T> var1);
   }

   static class c<T, C, P> extends bmp<gw.b<T, C, P>, T> {
      c(bmd<alb> $$0, gw.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, alb $$1) throws Exception {
         return this.a.a($$0, $$1);
      }

      @Override
      public Stream<alb> a() {
         return this.a.a();
      }
   }

   static class d<T, C, P> extends bmp<gw.b<T, C, P>, P> {
      d(bmd<alb> $$0, gw.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected P a(ImmutableStringReader $$0, alb $$1) throws Exception {
         return this.a.d($$0, $$1);
      }

      @Override
      public Stream<alb> a() {
         return this.a.d();
      }
   }

   static class e<T, C, P> extends bmp<gw.b<T, C, P>, T> {
      e(bmd<alb> $$0, gw.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, alb $$1) throws Exception {
         return this.a.b($$0, $$1);
      }

      @Override
      public Stream<alb> a() {
         return this.a.b();
      }
   }
}

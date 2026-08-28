import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class gw {
   public static <T, C, P> bmt<List<T>> a(gw.b<T, C, P> $$0) {
      bmj<List<T>> $$1 = bmj.a("top");
      bmj<Optional<T>> $$2 = bmj.a("type");
      bmj<bac> $$3 = bmj.a("any_type");
      bmj<T> $$4 = bmj.a("element_type");
      bmj<T> $$5 = bmj.a("tag_type");
      bmj<List<T>> $$6 = bmj.a("conditions");
      bmj<List<T>> $$7 = bmj.a("alternatives");
      bmj<T> $$8 = bmj.a("term");
      bmj<T> $$9 = bmj.a("negation");
      bmj<T> $$10 = bmj.a("test");
      bmj<C> $$11 = bmj.a("component_type");
      bmj<P> $$12 = bmj.a("predicate_type");
      bmj<alf> $$13 = bmj.a("id");
      bmj<vp> $$14 = bmj.a("tag");
      bml<StringReader> $$15 = new bml<>();
      $$15.a($$1, bms.b(bms.a(bms.a($$2), bmy.a('['), bms.a(), bms.a(bms.a($$6)), bmy.a(']')), bms.a($$2)), $$2x -> {
         Builder<T> $$3x = ImmutableList.builder();
         $$2x.b($$2).ifPresent($$3x::add);
         List<T> $$4x = $$2x.a($$6);
         if ($$4x != null) {
            $$3x.addAll($$4x);
         }

         return $$3x.build();
      });
      $$15.a($$2, bms.b(bms.a($$4), bms.a(bmy.a('#'), bms.a(), bms.a($$5)), bms.a($$3)), $$2x -> Optional.ofNullable($$2x.a($$4, $$5)));
      $$15.a($$3, bmy.a('*'), $$0x -> bac.a);
      $$15.a($$4, new gw.c<>($$13, $$0));
      $$15.a($$5, new gw.e<>($$13, $$0));
      $$15.a($$6, bms.a(bms.a($$7), bms.a(bms.a(bmy.a(','), bms.a($$6)))), $$3x -> {
         T $$4x = $$0.a($$3x.b($$7));
         return Optional.ofNullable($$3x.a($$6)).map($$1xx -> ac.a($$4x, $$1xx)).orElse(List.of($$4x));
      });
      $$15.a($$7, bms.a(bms.a($$8), bms.a(bms.a(bmy.a('|'), bms.a($$7)))), $$2x -> {
         T $$3x = $$2x.b($$8);
         return Optional.ofNullable($$2x.a($$7)).map($$1xx -> ac.a($$3x, $$1xx)).orElse(List.of($$3x));
      });
      $$15.a($$8, bms.b(bms.a($$10), bms.a(bmy.a('!'), bms.a($$9))), $$2x -> $$2x.b($$10, $$9));
      $$15.a($$9, bms.a($$10), $$2x -> $$0.a($$2x.b($$10)));
      $$15.a(
         $$10,
         bms.b(bms.a(bms.a($$11), bmy.a('='), bms.a(), bms.a($$14)), bms.a(bms.a($$12), bmy.a('~'), bms.a(), bms.a($$14)), bms.a($$11)),
         ($$4x, $$5x) -> {
            P $$6x = $$5x.a($$12);

            try {
               if ($$6x != null) {
                  vp $$7x = $$5x.b($$14);
                  return Optional.of($$0.b((ImmutableStringReader)$$4x.b(), $$6x, $$7x));
               } else {
                  C $$8x = $$5x.b($$11);
                  vp $$9x = $$5x.a($$14);
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
      $$15.a($$14, bmz.a);
      $$15.a($$13, bmu.a);
      return new bmt<>($$15, $$1);
   }

   static class a<T, C, P> extends bmv<gw.b<T, C, P>, C> {
      a(bmj<alf> $$0, gw.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected C a(ImmutableStringReader $$0, alf $$1) throws Exception {
         return this.a.c($$0, $$1);
      }

      @Override
      public Stream<alf> a() {
         return this.a.c();
      }
   }

   public interface b<T, C, P> {
      T a(ImmutableStringReader var1, alf var2) throws CommandSyntaxException;

      Stream<alf> a();

      T b(ImmutableStringReader var1, alf var2) throws CommandSyntaxException;

      Stream<alf> b();

      C c(ImmutableStringReader var1, alf var2) throws CommandSyntaxException;

      Stream<alf> c();

      T a(ImmutableStringReader var1, C var2, vp var3) throws CommandSyntaxException;

      T a(ImmutableStringReader var1, C var2);

      P d(ImmutableStringReader var1, alf var2) throws CommandSyntaxException;

      Stream<alf> d();

      T b(ImmutableStringReader var1, P var2, vp var3) throws CommandSyntaxException;

      T a(T var1);

      T a(List<T> var1);
   }

   static class c<T, C, P> extends bmv<gw.b<T, C, P>, T> {
      c(bmj<alf> $$0, gw.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, alf $$1) throws Exception {
         return this.a.a($$0, $$1);
      }

      @Override
      public Stream<alf> a() {
         return this.a.a();
      }
   }

   static class d<T, C, P> extends bmv<gw.b<T, C, P>, P> {
      d(bmj<alf> $$0, gw.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected P a(ImmutableStringReader $$0, alf $$1) throws Exception {
         return this.a.d($$0, $$1);
      }

      @Override
      public Stream<alf> a() {
         return this.a.d();
      }
   }

   static class e<T, C, P> extends bmv<gw.b<T, C, P>, T> {
      e(bmj<alf> $$0, gw.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, alf $$1) throws Exception {
         return this.a.b($$0, $$1);
      }

      @Override
      public Stream<alf> a() {
         return this.a.b();
      }
   }
}

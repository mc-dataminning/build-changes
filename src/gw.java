import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class gw {
   public static <T, C, P> bms<List<T>> a(gw.b<T, C, P> $$0) {
      bmi<List<T>> $$1 = bmi.a("top");
      bmi<Optional<T>> $$2 = bmi.a("type");
      bmi<bac> $$3 = bmi.a("any_type");
      bmi<T> $$4 = bmi.a("element_type");
      bmi<T> $$5 = bmi.a("tag_type");
      bmi<List<T>> $$6 = bmi.a("conditions");
      bmi<List<T>> $$7 = bmi.a("alternatives");
      bmi<T> $$8 = bmi.a("term");
      bmi<T> $$9 = bmi.a("negation");
      bmi<T> $$10 = bmi.a("test");
      bmi<C> $$11 = bmi.a("component_type");
      bmi<P> $$12 = bmi.a("predicate_type");
      bmi<alf> $$13 = bmi.a("id");
      bmi<vp> $$14 = bmi.a("tag");
      bmk<StringReader> $$15 = new bmk<>();
      $$15.a($$1, bmr.b(bmr.a(bmr.a($$2), bmx.a('['), bmr.a(), bmr.a(bmr.a($$6)), bmx.a(']')), bmr.a($$2)), $$2x -> {
         Builder<T> $$3x = ImmutableList.builder();
         $$2x.b($$2).ifPresent($$3x::add);
         List<T> $$4x = $$2x.a($$6);
         if ($$4x != null) {
            $$3x.addAll($$4x);
         }

         return $$3x.build();
      });
      $$15.a($$2, bmr.b(bmr.a($$4), bmr.a(bmx.a('#'), bmr.a(), bmr.a($$5)), bmr.a($$3)), $$2x -> Optional.ofNullable($$2x.a($$4, $$5)));
      $$15.a($$3, bmx.a('*'), $$0x -> bac.a);
      $$15.a($$4, new gw.c<>($$13, $$0));
      $$15.a($$5, new gw.e<>($$13, $$0));
      $$15.a($$6, bmr.a(bmr.a($$7), bmr.a(bmr.a(bmx.a(','), bmr.a($$6)))), $$3x -> {
         T $$4x = $$0.a($$3x.b($$7));
         return Optional.ofNullable($$3x.a($$6)).map($$1xx -> ac.a($$4x, $$1xx)).orElse(List.of($$4x));
      });
      $$15.a($$7, bmr.a(bmr.a($$8), bmr.a(bmr.a(bmx.a('|'), bmr.a($$7)))), $$2x -> {
         T $$3x = $$2x.b($$8);
         return Optional.ofNullable($$2x.a($$7)).map($$1xx -> ac.a($$3x, $$1xx)).orElse(List.of($$3x));
      });
      $$15.a($$8, bmr.b(bmr.a($$10), bmr.a(bmx.a('!'), bmr.a($$9))), $$2x -> $$2x.b($$10, $$9));
      $$15.a($$9, bmr.a($$10), $$2x -> $$0.a($$2x.b($$10)));
      $$15.a(
         $$10,
         bmr.b(bmr.a(bmr.a($$11), bmx.a('='), bmr.a(), bmr.a($$14)), bmr.a(bmr.a($$12), bmx.a('~'), bmr.a(), bmr.a($$14)), bmr.a($$11)),
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
      $$15.a($$14, bmy.a);
      $$15.a($$13, bmt.a);
      return new bms<>($$15, $$1);
   }

   static class a<T, C, P> extends bmu<gw.b<T, C, P>, C> {
      a(bmi<alf> $$0, gw.b<T, C, P> $$1) {
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

   static class c<T, C, P> extends bmu<gw.b<T, C, P>, T> {
      c(bmi<alf> $$0, gw.b<T, C, P> $$1) {
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

   static class d<T, C, P> extends bmu<gw.b<T, C, P>, P> {
      d(bmi<alf> $$0, gw.b<T, C, P> $$1) {
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

   static class e<T, C, P> extends bmu<gw.b<T, C, P>, T> {
      e(bmi<alf> $$0, gw.b<T, C, P> $$1) {
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

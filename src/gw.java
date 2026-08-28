import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class gw {
   public static <T, C, P> bmq<List<T>> a(gw.b<T, C, P> $$0) {
      bmg<List<T>> $$1 = bmg.a("top");
      bmg<Optional<T>> $$2 = bmg.a("type");
      bmg<baa> $$3 = bmg.a("any_type");
      bmg<T> $$4 = bmg.a("element_type");
      bmg<T> $$5 = bmg.a("tag_type");
      bmg<List<T>> $$6 = bmg.a("conditions");
      bmg<List<T>> $$7 = bmg.a("alternatives");
      bmg<T> $$8 = bmg.a("term");
      bmg<T> $$9 = bmg.a("negation");
      bmg<T> $$10 = bmg.a("test");
      bmg<C> $$11 = bmg.a("component_type");
      bmg<P> $$12 = bmg.a("predicate_type");
      bmg<ale> $$13 = bmg.a("id");
      bmg<vo> $$14 = bmg.a("tag");
      bmi<StringReader> $$15 = new bmi<>();
      $$15.a($$1, bmp.b(bmp.a(bmp.a($$2), bmv.a('['), bmp.a(), bmp.a(bmp.a($$6)), bmv.a(']')), bmp.a($$2)), $$2x -> {
         Builder<T> $$3x = ImmutableList.builder();
         $$2x.b($$2).ifPresent($$3x::add);
         List<T> $$4x = $$2x.a($$6);
         if ($$4x != null) {
            $$3x.addAll($$4x);
         }

         return $$3x.build();
      });
      $$15.a($$2, bmp.b(bmp.a($$4), bmp.a(bmv.a('#'), bmp.a(), bmp.a($$5)), bmp.a($$3)), $$2x -> Optional.ofNullable($$2x.a($$4, $$5)));
      $$15.a($$3, bmv.a('*'), $$0x -> baa.a);
      $$15.a($$4, new gw.c<>($$13, $$0));
      $$15.a($$5, new gw.e<>($$13, $$0));
      $$15.a($$6, bmp.a(bmp.a($$7), bmp.a(bmp.a(bmv.a(','), bmp.a($$6)))), $$3x -> {
         T $$4x = $$0.a($$3x.b($$7));
         return Optional.ofNullable($$3x.a($$6)).map($$1xx -> ac.a($$4x, $$1xx)).orElse(List.of($$4x));
      });
      $$15.a($$7, bmp.a(bmp.a($$8), bmp.a(bmp.a(bmv.a('|'), bmp.a($$7)))), $$2x -> {
         T $$3x = $$2x.b($$8);
         return Optional.ofNullable($$2x.a($$7)).map($$1xx -> ac.a($$3x, $$1xx)).orElse(List.of($$3x));
      });
      $$15.a($$8, bmp.b(bmp.a($$10), bmp.a(bmv.a('!'), bmp.a($$9))), $$2x -> $$2x.b($$10, $$9));
      $$15.a($$9, bmp.a($$10), $$2x -> $$0.a($$2x.b($$10)));
      $$15.a(
         $$10,
         bmp.b(bmp.a(bmp.a($$11), bmv.a('='), bmp.a(), bmp.a($$14)), bmp.a(bmp.a($$12), bmv.a('~'), bmp.a(), bmp.a($$14)), bmp.a($$11)),
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
      $$15.a($$14, bmw.a);
      $$15.a($$13, bmr.a);
      return new bmq<>($$15, $$1);
   }

   static class a<T, C, P> extends bms<gw.b<T, C, P>, C> {
      a(bmg<ale> $$0, gw.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected C a(ImmutableStringReader $$0, ale $$1) throws Exception {
         return this.a.c($$0, $$1);
      }

      @Override
      public Stream<ale> a() {
         return this.a.c();
      }
   }

   public interface b<T, C, P> {
      T a(ImmutableStringReader var1, ale var2) throws CommandSyntaxException;

      Stream<ale> a();

      T b(ImmutableStringReader var1, ale var2) throws CommandSyntaxException;

      Stream<ale> b();

      C c(ImmutableStringReader var1, ale var2) throws CommandSyntaxException;

      Stream<ale> c();

      T a(ImmutableStringReader var1, C var2, vo var3) throws CommandSyntaxException;

      T a(ImmutableStringReader var1, C var2);

      P d(ImmutableStringReader var1, ale var2) throws CommandSyntaxException;

      Stream<ale> d();

      T b(ImmutableStringReader var1, P var2, vo var3) throws CommandSyntaxException;

      T a(T var1);

      T a(List<T> var1);
   }

   static class c<T, C, P> extends bms<gw.b<T, C, P>, T> {
      c(bmg<ale> $$0, gw.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, ale $$1) throws Exception {
         return this.a.a($$0, $$1);
      }

      @Override
      public Stream<ale> a() {
         return this.a.a();
      }
   }

   static class d<T, C, P> extends bms<gw.b<T, C, P>, P> {
      d(bmg<ale> $$0, gw.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected P a(ImmutableStringReader $$0, ale $$1) throws Exception {
         return this.a.d($$0, $$1);
      }

      @Override
      public Stream<ale> a() {
         return this.a.d();
      }
   }

   static class e<T, C, P> extends bms<gw.b<T, C, P>, T> {
      e(bmg<ale> $$0, gw.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, ale $$1) throws Exception {
         return this.a.b($$0, $$1);
      }

      @Override
      public Stream<ale> a() {
         return this.a.b();
      }
   }
}

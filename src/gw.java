import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class gw {
   public static <T, C, P> bmr<List<T>> a(gw.b<T, C, P> $$0) {
      bmh<List<T>> $$1 = bmh.a("top");
      bmh<Optional<T>> $$2 = bmh.a("type");
      bmh<bab> $$3 = bmh.a("any_type");
      bmh<T> $$4 = bmh.a("element_type");
      bmh<T> $$5 = bmh.a("tag_type");
      bmh<List<T>> $$6 = bmh.a("conditions");
      bmh<List<T>> $$7 = bmh.a("alternatives");
      bmh<T> $$8 = bmh.a("term");
      bmh<T> $$9 = bmh.a("negation");
      bmh<T> $$10 = bmh.a("test");
      bmh<C> $$11 = bmh.a("component_type");
      bmh<P> $$12 = bmh.a("predicate_type");
      bmh<ale> $$13 = bmh.a("id");
      bmh<vo> $$14 = bmh.a("tag");
      bmj<StringReader> $$15 = new bmj<>();
      $$15.a($$1, bmq.b(bmq.a(bmq.a($$2), bmw.a('['), bmq.a(), bmq.a(bmq.a($$6)), bmw.a(']')), bmq.a($$2)), $$2x -> {
         Builder<T> $$3x = ImmutableList.builder();
         $$2x.b($$2).ifPresent($$3x::add);
         List<T> $$4x = $$2x.a($$6);
         if ($$4x != null) {
            $$3x.addAll($$4x);
         }

         return $$3x.build();
      });
      $$15.a($$2, bmq.b(bmq.a($$4), bmq.a(bmw.a('#'), bmq.a(), bmq.a($$5)), bmq.a($$3)), $$2x -> Optional.ofNullable($$2x.a($$4, $$5)));
      $$15.a($$3, bmw.a('*'), $$0x -> bab.a);
      $$15.a($$4, new gw.c<>($$13, $$0));
      $$15.a($$5, new gw.e<>($$13, $$0));
      $$15.a($$6, bmq.a(bmq.a($$7), bmq.a(bmq.a(bmw.a(','), bmq.a($$6)))), $$3x -> {
         T $$4x = $$0.a($$3x.b($$7));
         return Optional.ofNullable($$3x.a($$6)).map($$1xx -> ac.a($$4x, $$1xx)).orElse(List.of($$4x));
      });
      $$15.a($$7, bmq.a(bmq.a($$8), bmq.a(bmq.a(bmw.a('|'), bmq.a($$7)))), $$2x -> {
         T $$3x = $$2x.b($$8);
         return Optional.ofNullable($$2x.a($$7)).map($$1xx -> ac.a($$3x, $$1xx)).orElse(List.of($$3x));
      });
      $$15.a($$8, bmq.b(bmq.a($$10), bmq.a(bmw.a('!'), bmq.a($$9))), $$2x -> $$2x.b($$10, $$9));
      $$15.a($$9, bmq.a($$10), $$2x -> $$0.a($$2x.b($$10)));
      $$15.a(
         $$10,
         bmq.b(bmq.a(bmq.a($$11), bmw.a('='), bmq.a(), bmq.a($$14)), bmq.a(bmq.a($$12), bmw.a('~'), bmq.a(), bmq.a($$14)), bmq.a($$11)),
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
      $$15.a($$14, bmx.a);
      $$15.a($$13, bms.a);
      return new bmr<>($$15, $$1);
   }

   static class a<T, C, P> extends bmt<gw.b<T, C, P>, C> {
      a(bmh<ale> $$0, gw.b<T, C, P> $$1) {
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

   static class c<T, C, P> extends bmt<gw.b<T, C, P>, T> {
      c(bmh<ale> $$0, gw.b<T, C, P> $$1) {
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

   static class d<T, C, P> extends bmt<gw.b<T, C, P>, P> {
      d(bmh<ale> $$0, gw.b<T, C, P> $$1) {
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

   static class e<T, C, P> extends bmt<gw.b<T, C, P>, T> {
      e(bmh<ale> $$0, gw.b<T, C, P> $$1) {
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

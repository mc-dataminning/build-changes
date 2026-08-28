import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class he {
   public static <T, C, P> boc<List<T>> a(he.b<T, C, P> $$0) {
      bns<List<T>> $$1 = bns.a("top");
      bns<Optional<T>> $$2 = bns.a("type");
      bns<baf> $$3 = bns.a("any_type");
      bns<T> $$4 = bns.a("element_type");
      bns<T> $$5 = bns.a("tag_type");
      bns<List<T>> $$6 = bns.a("conditions");
      bns<List<T>> $$7 = bns.a("alternatives");
      bns<T> $$8 = bns.a("term");
      bns<T> $$9 = bns.a("negation");
      bns<T> $$10 = bns.a("test");
      bns<C> $$11 = bns.a("component_type");
      bns<P> $$12 = bns.a("predicate_type");
      bns<akv> $$13 = bns.a("id");
      bns<un> $$14 = bns.a("tag");
      bnu<StringReader> $$15 = new bnu<>();
      $$15.a($$1, bob.b(bob.a(bob.a($$2), boh.a('['), bob.a(), bob.a(bob.a($$6)), boh.a(']')), bob.a($$2)), $$2x -> {
         Builder<T> $$3x = ImmutableList.builder();
         $$2x.b($$2).ifPresent($$3x::add);
         List<T> $$4x = $$2x.a($$6);
         if ($$4x != null) {
            $$3x.addAll($$4x);
         }

         return $$3x.build();
      });
      $$15.a($$2, bob.b(bob.a($$4), bob.a(boh.a('#'), bob.a(), bob.a($$5)), bob.a($$3)), $$2x -> Optional.ofNullable($$2x.a($$4, $$5)));
      $$15.a($$3, boh.a('*'), $$0x -> baf.a);
      $$15.a($$4, new he.c<>($$13, $$0));
      $$15.a($$5, new he.e<>($$13, $$0));
      $$15.a($$6, bob.a(bob.a($$7), bob.a(bob.a(boh.a(','), bob.a($$6)))), $$3x -> {
         T $$4x = $$0.a($$3x.b($$7));
         return Optional.ofNullable($$3x.a($$6)).map($$1xx -> af.a($$4x, $$1xx)).orElse(List.of($$4x));
      });
      $$15.a($$7, bob.a(bob.a($$8), bob.a(bob.a(boh.a('|'), bob.a($$7)))), $$2x -> {
         T $$3x = $$2x.b($$8);
         return Optional.ofNullable($$2x.a($$7)).map($$1xx -> af.a($$3x, $$1xx)).orElse(List.of($$3x));
      });
      $$15.a($$8, bob.b(bob.a($$10), bob.a(boh.a('!'), bob.a($$9))), $$2x -> $$2x.b($$10, $$9));
      $$15.a($$9, bob.a($$10), $$2x -> $$0.a($$2x.b($$10)));
      $$15.a(
         $$10,
         bob.b(bob.a(bob.a($$11), boh.a('='), bob.a(), bob.a($$14)), bob.a(bob.a($$12), boh.a('~'), bob.a(), bob.a($$14)), bob.a($$11)),
         ($$4x, $$5x) -> {
            P $$6x = $$5x.a($$12);

            try {
               if ($$6x != null) {
                  un $$7x = $$5x.b($$14);
                  return Optional.of($$0.b((ImmutableStringReader)$$4x.b(), $$6x, $$7x));
               } else {
                  C $$8x = $$5x.b($$11);
                  un $$9x = $$5x.a($$14);
                  return Optional.of($$9x != null ? $$0.a((ImmutableStringReader)$$4x.b(), $$8x, $$9x) : $$0.a((ImmutableStringReader)$$4x.b(), $$8x));
               }
            } catch (CommandSyntaxException var9x) {
               $$4x.a().a($$4x.c(), var9x);
               return Optional.empty();
            }
         }
      );
      $$15.a($$11, new he.a<>($$13, $$0));
      $$15.a($$12, new he.d<>($$13, $$0));
      $$15.a($$14, boi.a);
      $$15.a($$13, bod.a);
      return new boc<>($$15, $$1);
   }

   static class a<T, C, P> extends boe<he.b<T, C, P>, C> {
      a(bns<akv> $$0, he.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected C a(ImmutableStringReader $$0, akv $$1) throws Exception {
         return this.a.c($$0, $$1);
      }

      @Override
      public Stream<akv> a() {
         return this.a.c();
      }
   }

   public interface b<T, C, P> {
      T a(ImmutableStringReader var1, akv var2) throws CommandSyntaxException;

      Stream<akv> a();

      T b(ImmutableStringReader var1, akv var2) throws CommandSyntaxException;

      Stream<akv> b();

      C c(ImmutableStringReader var1, akv var2) throws CommandSyntaxException;

      Stream<akv> c();

      T a(ImmutableStringReader var1, C var2, un var3) throws CommandSyntaxException;

      T a(ImmutableStringReader var1, C var2);

      P d(ImmutableStringReader var1, akv var2) throws CommandSyntaxException;

      Stream<akv> d();

      T b(ImmutableStringReader var1, P var2, un var3) throws CommandSyntaxException;

      T a(T var1);

      T a(List<T> var1);
   }

   static class c<T, C, P> extends boe<he.b<T, C, P>, T> {
      c(bns<akv> $$0, he.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, akv $$1) throws Exception {
         return this.a.a($$0, $$1);
      }

      @Override
      public Stream<akv> a() {
         return this.a.a();
      }
   }

   static class d<T, C, P> extends boe<he.b<T, C, P>, P> {
      d(bns<akv> $$0, he.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected P a(ImmutableStringReader $$0, akv $$1) throws Exception {
         return this.a.d($$0, $$1);
      }

      @Override
      public Stream<akv> a() {
         return this.a.d();
      }
   }

   static class e<T, C, P> extends boe<he.b<T, C, P>, T> {
      e(bns<akv> $$0, he.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, akv $$1) throws Exception {
         return this.a.b($$0, $$1);
      }

      @Override
      public Stream<akv> a() {
         return this.a.b();
      }
   }
}

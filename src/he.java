import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class he {
   public static <T, C, P> bob<List<T>> a(he.b<T, C, P> $$0) {
      bnr<List<T>> $$1 = bnr.a("top");
      bnr<Optional<T>> $$2 = bnr.a("type");
      bnr<baf> $$3 = bnr.a("any_type");
      bnr<T> $$4 = bnr.a("element_type");
      bnr<T> $$5 = bnr.a("tag_type");
      bnr<List<T>> $$6 = bnr.a("conditions");
      bnr<List<T>> $$7 = bnr.a("alternatives");
      bnr<T> $$8 = bnr.a("term");
      bnr<T> $$9 = bnr.a("negation");
      bnr<T> $$10 = bnr.a("test");
      bnr<C> $$11 = bnr.a("component_type");
      bnr<P> $$12 = bnr.a("predicate_type");
      bnr<aku> $$13 = bnr.a("id");
      bnr<un> $$14 = bnr.a("tag");
      bnt<StringReader> $$15 = new bnt<>();
      $$15.a($$1, boa.b(boa.a(boa.a($$2), bog.a('['), boa.a(), boa.a(boa.a($$6)), bog.a(']')), boa.a($$2)), $$2x -> {
         Builder<T> $$3x = ImmutableList.builder();
         $$2x.b($$2).ifPresent($$3x::add);
         List<T> $$4x = $$2x.a($$6);
         if ($$4x != null) {
            $$3x.addAll($$4x);
         }

         return $$3x.build();
      });
      $$15.a($$2, boa.b(boa.a($$4), boa.a(bog.a('#'), boa.a(), boa.a($$5)), boa.a($$3)), $$2x -> Optional.ofNullable($$2x.a($$4, $$5)));
      $$15.a($$3, bog.a('*'), $$0x -> baf.a);
      $$15.a($$4, new he.c<>($$13, $$0));
      $$15.a($$5, new he.e<>($$13, $$0));
      $$15.a($$6, boa.a(boa.a($$7), boa.a(boa.a(bog.a(','), boa.a($$6)))), $$3x -> {
         T $$4x = $$0.a($$3x.b($$7));
         return Optional.ofNullable($$3x.a($$6)).map($$1xx -> af.a($$4x, $$1xx)).orElse(List.of($$4x));
      });
      $$15.a($$7, boa.a(boa.a($$8), boa.a(boa.a(bog.a('|'), boa.a($$7)))), $$2x -> {
         T $$3x = $$2x.b($$8);
         return Optional.ofNullable($$2x.a($$7)).map($$1xx -> af.a($$3x, $$1xx)).orElse(List.of($$3x));
      });
      $$15.a($$8, boa.b(boa.a($$10), boa.a(bog.a('!'), boa.a($$9))), $$2x -> $$2x.b($$10, $$9));
      $$15.a($$9, boa.a($$10), $$2x -> $$0.a($$2x.b($$10)));
      $$15.a(
         $$10,
         boa.b(boa.a(boa.a($$11), bog.a('='), boa.a(), boa.a($$14)), boa.a(boa.a($$12), bog.a('~'), boa.a(), boa.a($$14)), boa.a($$11)),
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
      $$15.a($$14, boh.a);
      $$15.a($$13, boc.a);
      return new bob<>($$15, $$1);
   }

   static class a<T, C, P> extends bod<he.b<T, C, P>, C> {
      a(bnr<aku> $$0, he.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected C a(ImmutableStringReader $$0, aku $$1) throws Exception {
         return this.a.c($$0, $$1);
      }

      @Override
      public Stream<aku> a() {
         return this.a.c();
      }
   }

   public interface b<T, C, P> {
      T a(ImmutableStringReader var1, aku var2) throws CommandSyntaxException;

      Stream<aku> a();

      T b(ImmutableStringReader var1, aku var2) throws CommandSyntaxException;

      Stream<aku> b();

      C c(ImmutableStringReader var1, aku var2) throws CommandSyntaxException;

      Stream<aku> c();

      T a(ImmutableStringReader var1, C var2, un var3) throws CommandSyntaxException;

      T a(ImmutableStringReader var1, C var2);

      P d(ImmutableStringReader var1, aku var2) throws CommandSyntaxException;

      Stream<aku> d();

      T b(ImmutableStringReader var1, P var2, un var3) throws CommandSyntaxException;

      T a(T var1);

      T a(List<T> var1);
   }

   static class c<T, C, P> extends bod<he.b<T, C, P>, T> {
      c(bnr<aku> $$0, he.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, aku $$1) throws Exception {
         return this.a.a($$0, $$1);
      }

      @Override
      public Stream<aku> a() {
         return this.a.a();
      }
   }

   static class d<T, C, P> extends bod<he.b<T, C, P>, P> {
      d(bnr<aku> $$0, he.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected P a(ImmutableStringReader $$0, aku $$1) throws Exception {
         return this.a.d($$0, $$1);
      }

      @Override
      public Stream<aku> a() {
         return this.a.d();
      }
   }

   static class e<T, C, P> extends bod<he.b<T, C, P>, T> {
      e(bnr<aku> $$0, he.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, aku $$1) throws Exception {
         return this.a.b($$0, $$1);
      }

      @Override
      public Stream<aku> a() {
         return this.a.b();
      }
   }
}

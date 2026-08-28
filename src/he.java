import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class he {
   public static <T, C, P> boa<List<T>> a(he.b<T, C, P> $$0) {
      bnq<List<T>> $$1 = bnq.a("top");
      bnq<Optional<T>> $$2 = bnq.a("type");
      bnq<bae> $$3 = bnq.a("any_type");
      bnq<T> $$4 = bnq.a("element_type");
      bnq<T> $$5 = bnq.a("tag_type");
      bnq<List<T>> $$6 = bnq.a("conditions");
      bnq<List<T>> $$7 = bnq.a("alternatives");
      bnq<T> $$8 = bnq.a("term");
      bnq<T> $$9 = bnq.a("negation");
      bnq<T> $$10 = bnq.a("test");
      bnq<C> $$11 = bnq.a("component_type");
      bnq<P> $$12 = bnq.a("predicate_type");
      bnq<aku> $$13 = bnq.a("id");
      bnq<un> $$14 = bnq.a("tag");
      bns<StringReader> $$15 = new bns<>();
      $$15.a($$1, bnz.b(bnz.a(bnz.a($$2), bof.a('['), bnz.a(), bnz.a(bnz.a($$6)), bof.a(']')), bnz.a($$2)), $$2x -> {
         Builder<T> $$3x = ImmutableList.builder();
         $$2x.b($$2).ifPresent($$3x::add);
         List<T> $$4x = $$2x.a($$6);
         if ($$4x != null) {
            $$3x.addAll($$4x);
         }

         return $$3x.build();
      });
      $$15.a($$2, bnz.b(bnz.a($$4), bnz.a(bof.a('#'), bnz.a(), bnz.a($$5)), bnz.a($$3)), $$2x -> Optional.ofNullable($$2x.a($$4, $$5)));
      $$15.a($$3, bof.a('*'), $$0x -> bae.a);
      $$15.a($$4, new he.c<>($$13, $$0));
      $$15.a($$5, new he.e<>($$13, $$0));
      $$15.a($$6, bnz.a(bnz.a($$7), bnz.a(bnz.a(bof.a(','), bnz.a($$6)))), $$3x -> {
         T $$4x = $$0.a($$3x.b($$7));
         return Optional.ofNullable($$3x.a($$6)).map($$1xx -> af.a($$4x, $$1xx)).orElse(List.of($$4x));
      });
      $$15.a($$7, bnz.a(bnz.a($$8), bnz.a(bnz.a(bof.a('|'), bnz.a($$7)))), $$2x -> {
         T $$3x = $$2x.b($$8);
         return Optional.ofNullable($$2x.a($$7)).map($$1xx -> af.a($$3x, $$1xx)).orElse(List.of($$3x));
      });
      $$15.a($$8, bnz.b(bnz.a($$10), bnz.a(bof.a('!'), bnz.a($$9))), $$2x -> $$2x.b($$10, $$9));
      $$15.a($$9, bnz.a($$10), $$2x -> $$0.a($$2x.b($$10)));
      $$15.a(
         $$10,
         bnz.b(bnz.a(bnz.a($$11), bof.a('='), bnz.a(), bnz.a($$14)), bnz.a(bnz.a($$12), bof.a('~'), bnz.a(), bnz.a($$14)), bnz.a($$11)),
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
      $$15.a($$14, bog.a);
      $$15.a($$13, bob.a);
      return new boa<>($$15, $$1);
   }

   static class a<T, C, P> extends boc<he.b<T, C, P>, C> {
      a(bnq<aku> $$0, he.b<T, C, P> $$1) {
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

   static class c<T, C, P> extends boc<he.b<T, C, P>, T> {
      c(bnq<aku> $$0, he.b<T, C, P> $$1) {
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

   static class d<T, C, P> extends boc<he.b<T, C, P>, P> {
      d(bnq<aku> $$0, he.b<T, C, P> $$1) {
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

   static class e<T, C, P> extends boc<he.b<T, C, P>, T> {
      e(bnq<aku> $$0, he.b<T, C, P> $$1) {
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

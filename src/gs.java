import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class gs {
   public static <T, C, P> bqq<List<T>> a(gs.b<T, C, P> $$0) {
      bqc<List<T>> $$1 = bqc.a("top");
      bqc<Optional<T>> $$2 = bqc.a("type");
      bqc<bbh> $$3 = bqc.a("any_type");
      bqc<T> $$4 = bqc.a("element_type");
      bqc<T> $$5 = bqc.a("tag_type");
      bqc<List<T>> $$6 = bqc.a("conditions");
      bqc<List<T>> $$7 = bqc.a("alternatives");
      bqc<T> $$8 = bqc.a("term");
      bqc<T> $$9 = bqc.a("negation");
      bqc<T> $$10 = bqc.a("test");
      bqc<C> $$11 = bqc.a("component_type");
      bqc<P> $$12 = bqc.a("predicate_type");
      bqc<alr> $$13 = bqc.a("id");
      bqc<Dynamic<?>> $$14 = bqc.a("tag");
      bqg<StringReader> $$15 = new bqg<>();
      bqj<StringReader, alr> $$16 = $$15.a($$13, bqv.a);
      bqj<StringReader, List<T>> $$17 = $$15.a($$1, bqo.b(bqo.a($$15.c($$2), bqz.a('['), bqo.c(), bqo.a($$15.c($$6)), bqz.a(']')), $$15.c($$2)), $$2x -> {
         Builder<T> $$3x = ImmutableList.builder();
         $$2x.b($$2).ifPresent($$3x::add);
         List<T> $$4x = $$2x.a($$6);
         if ($$4x != null) {
            $$3x.addAll($$4x);
         }

         return $$3x.build();
      });
      $$15.a($$2, bqo.b($$15.c($$4), bqo.a(bqz.a('#'), bqo.c(), $$15.c($$5)), $$15.c($$3)), $$2x -> Optional.ofNullable($$2x.b($$4, $$5)));
      $$15.a($$3, bqz.a('*'), $$0x -> bbh.a);
      $$15.a($$4, new gs.c<>($$16, $$0));
      $$15.a($$5, new gs.e<>($$16, $$0));
      $$15.a($$6, bqo.a($$15.c($$7), bqo.a(bqo.a(bqz.a(','), $$15.c($$6)))), $$3x -> {
         T $$4x = $$0.a($$3x.b($$7));
         return Optional.ofNullable($$3x.a($$6)).map($$1xx -> ag.a($$4x, $$1xx)).orElse(List.of($$4x));
      });
      $$15.a($$7, bqo.a($$15.c($$8), bqo.a(bqo.a(bqz.a('|'), $$15.c($$7)))), $$2x -> {
         T $$3x = $$2x.b($$8);
         return Optional.ofNullable($$2x.a($$7)).map($$1xx -> ag.a($$3x, $$1xx)).orElse(List.of($$3x));
      });
      $$15.a($$8, bqo.b($$15.c($$10), bqo.a(bqz.a('!'), $$15.c($$9))), $$2x -> $$2x.c($$10, $$9));
      $$15.a($$9, $$15.c($$10), $$2x -> $$0.a($$2x.b($$10)));
      $$15.a(
         $$10, bqo.b(bqo.a($$15.c($$11), bqz.a('='), bqo.c(), $$15.c($$14)), bqo.a($$15.c($$12), bqz.a('~'), bqo.c(), $$15.c($$14)), $$15.c($$11)), $$4x -> {
            bqm $$5x = $$4x.a();
            P $$6x = $$5x.a($$12);

            try {
               if ($$6x != null) {
                  Dynamic<?> $$7x = $$5x.b($$14);
                  return $$0.b((ImmutableStringReader)$$4x.f(), $$6x, $$7x);
               } else {
                  C $$8x = $$5x.b($$11);
                  Dynamic<?> $$9x = $$5x.a($$14);
                  return $$9x != null ? $$0.a((ImmutableStringReader)$$4x.f(), $$8x, $$9x) : $$0.a((ImmutableStringReader)$$4x.f(), $$8x);
               }
            } catch (CommandSyntaxException var9x) {
               $$4x.b().a($$4x.g(), var9x);
               return null;
            }
         }
      );
      $$15.a($$11, new gs.a<>($$16, $$0));
      $$15.a($$12, new gs.d<>($$16, $$0));
      $$15.a($$14, new bra(uo.a));
      return new bqq<>($$15, $$17);
   }

   static class a<T, C, P> extends bqw<gs.b<T, C, P>, C> {
      a(bqj<StringReader, alr> $$0, gs.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected C a(ImmutableStringReader $$0, alr $$1) throws Exception {
         return this.a.c($$0, $$1);
      }

      @Override
      public Stream<alr> a() {
         return this.a.c();
      }
   }

   public interface b<T, C, P> {
      T a(ImmutableStringReader var1, alr var2) throws CommandSyntaxException;

      Stream<alr> a();

      T b(ImmutableStringReader var1, alr var2) throws CommandSyntaxException;

      Stream<alr> b();

      C c(ImmutableStringReader var1, alr var2) throws CommandSyntaxException;

      Stream<alr> c();

      T a(ImmutableStringReader var1, C var2, Dynamic<?> var3) throws CommandSyntaxException;

      T a(ImmutableStringReader var1, C var2);

      P d(ImmutableStringReader var1, alr var2) throws CommandSyntaxException;

      Stream<alr> d();

      T b(ImmutableStringReader var1, P var2, Dynamic<?> var3) throws CommandSyntaxException;

      T a(T var1);

      T a(List<T> var1);
   }

   static class c<T, C, P> extends bqw<gs.b<T, C, P>, T> {
      c(bqj<StringReader, alr> $$0, gs.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, alr $$1) throws Exception {
         return this.a.a($$0, $$1);
      }

      @Override
      public Stream<alr> a() {
         return this.a.a();
      }
   }

   static class d<T, C, P> extends bqw<gs.b<T, C, P>, P> {
      d(bqj<StringReader, alr> $$0, gs.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected P a(ImmutableStringReader $$0, alr $$1) throws Exception {
         return this.a.d($$0, $$1);
      }

      @Override
      public Stream<alr> a() {
         return this.a.d();
      }
   }

   static class e<T, C, P> extends bqw<gs.b<T, C, P>, T> {
      e(bqj<StringReader, alr> $$0, gs.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, alr $$1) throws Exception {
         return this.a.b($$0, $$1);
      }

      @Override
      public Stream<alr> a() {
         return this.a.b();
      }
   }
}

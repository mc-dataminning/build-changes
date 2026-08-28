import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class he {
   public static <T, C, P> bos<List<T>> a(he.b<T, C, P> $$0) {
      boi<List<T>> $$1 = boi.a("top");
      boi<Optional<T>> $$2 = boi.a("type");
      boi<baf> $$3 = boi.a("any_type");
      boi<T> $$4 = boi.a("element_type");
      boi<T> $$5 = boi.a("tag_type");
      boi<List<T>> $$6 = boi.a("conditions");
      boi<List<T>> $$7 = boi.a("alternatives");
      boi<T> $$8 = boi.a("term");
      boi<T> $$9 = boi.a("negation");
      boi<T> $$10 = boi.a("test");
      boi<C> $$11 = boi.a("component_type");
      boi<P> $$12 = boi.a("predicate_type");
      boi<aku> $$13 = boi.a("id");
      boi<un> $$14 = boi.a("tag");
      bok<StringReader> $$15 = new bok<>();
      $$15.a($$1, bor.b(bor.a(bor.a($$2), box.a('['), bor.a(), bor.a(bor.a($$6)), box.a(']')), bor.a($$2)), $$2x -> {
         Builder<T> $$3x = ImmutableList.builder();
         $$2x.b($$2).ifPresent($$3x::add);
         List<T> $$4x = $$2x.a($$6);
         if ($$4x != null) {
            $$3x.addAll($$4x);
         }

         return $$3x.build();
      });
      $$15.a($$2, bor.b(bor.a($$4), bor.a(box.a('#'), bor.a(), bor.a($$5)), bor.a($$3)), $$2x -> Optional.ofNullable($$2x.a($$4, $$5)));
      $$15.a($$3, box.a('*'), $$0x -> baf.a);
      $$15.a($$4, new he.c<>($$13, $$0));
      $$15.a($$5, new he.e<>($$13, $$0));
      $$15.a($$6, bor.a(bor.a($$7), bor.a(bor.a(box.a(','), bor.a($$6)))), $$3x -> {
         T $$4x = $$0.a($$3x.b($$7));
         return Optional.ofNullable($$3x.a($$6)).map($$1xx -> af.a($$4x, $$1xx)).orElse(List.of($$4x));
      });
      $$15.a($$7, bor.a(bor.a($$8), bor.a(bor.a(box.a('|'), bor.a($$7)))), $$2x -> {
         T $$3x = $$2x.b($$8);
         return Optional.ofNullable($$2x.a($$7)).map($$1xx -> af.a($$3x, $$1xx)).orElse(List.of($$3x));
      });
      $$15.a($$8, bor.b(bor.a($$10), bor.a(box.a('!'), bor.a($$9))), $$2x -> $$2x.b($$10, $$9));
      $$15.a($$9, bor.a($$10), $$2x -> $$0.a($$2x.b($$10)));
      $$15.a(
         $$10,
         bor.b(bor.a(bor.a($$11), box.a('='), bor.a(), bor.a($$14)), bor.a(bor.a($$12), box.a('~'), bor.a(), bor.a($$14)), bor.a($$11)),
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
      $$15.a($$14, boy.a);
      $$15.a($$13, bot.a);
      return new bos<>($$15, $$1);
   }

   static class a<T, C, P> extends bou<he.b<T, C, P>, C> {
      a(boi<aku> $$0, he.b<T, C, P> $$1) {
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

   static class c<T, C, P> extends bou<he.b<T, C, P>, T> {
      c(boi<aku> $$0, he.b<T, C, P> $$1) {
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

   static class d<T, C, P> extends bou<he.b<T, C, P>, P> {
      d(boi<aku> $$0, he.b<T, C, P> $$1) {
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

   static class e<T, C, P> extends bou<he.b<T, C, P>, T> {
      e(boi<aku> $$0, he.b<T, C, P> $$1) {
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

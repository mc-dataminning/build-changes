import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class hd {
   public static <T, C, P> bod<List<T>> a(hd.b<T, C, P> $$0) {
      bnt<List<T>> $$1 = bnt.a("top");
      bnt<Optional<T>> $$2 = bnt.a("type");
      bnt<bas> $$3 = bnt.a("any_type");
      bnt<T> $$4 = bnt.a("element_type");
      bnt<T> $$5 = bnt.a("tag_type");
      bnt<List<T>> $$6 = bnt.a("conditions");
      bnt<List<T>> $$7 = bnt.a("alternatives");
      bnt<T> $$8 = bnt.a("term");
      bnt<T> $$9 = bnt.a("negation");
      bnt<T> $$10 = bnt.a("test");
      bnt<C> $$11 = bnt.a("component_type");
      bnt<P> $$12 = bnt.a("predicate_type");
      bnt<alj> $$13 = bnt.a("id");
      bnt<vi> $$14 = bnt.a("tag");
      bnv<StringReader> $$15 = new bnv<>();
      $$15.a($$1, boc.b(boc.a(boc.a($$2), boi.a('['), boc.a(), boc.a(boc.a($$6)), boi.a(']')), boc.a($$2)), $$2x -> {
         Builder<T> $$3x = ImmutableList.builder();
         $$2x.b($$2).ifPresent($$3x::add);
         List<T> $$4x = $$2x.a($$6);
         if ($$4x != null) {
            $$3x.addAll($$4x);
         }

         return $$3x.build();
      });
      $$15.a($$2, boc.b(boc.a($$4), boc.a(boi.a('#'), boc.a(), boc.a($$5)), boc.a($$3)), $$2x -> Optional.ofNullable($$2x.a($$4, $$5)));
      $$15.a($$3, boi.a('*'), $$0x -> bas.a);
      $$15.a($$4, new hd.c<>($$13, $$0));
      $$15.a($$5, new hd.e<>($$13, $$0));
      $$15.a($$6, boc.a(boc.a($$7), boc.a(boc.a(boi.a(','), boc.a($$6)))), $$3x -> {
         T $$4x = $$0.a($$3x.b($$7));
         return Optional.ofNullable($$3x.a($$6)).map($$1xx -> ae.a($$4x, $$1xx)).orElse(List.of($$4x));
      });
      $$15.a($$7, boc.a(boc.a($$8), boc.a(boc.a(boi.a('|'), boc.a($$7)))), $$2x -> {
         T $$3x = $$2x.b($$8);
         return Optional.ofNullable($$2x.a($$7)).map($$1xx -> ae.a($$3x, $$1xx)).orElse(List.of($$3x));
      });
      $$15.a($$8, boc.b(boc.a($$10), boc.a(boi.a('!'), boc.a($$9))), $$2x -> $$2x.b($$10, $$9));
      $$15.a($$9, boc.a($$10), $$2x -> $$0.a($$2x.b($$10)));
      $$15.a(
         $$10,
         boc.b(boc.a(boc.a($$11), boi.a('='), boc.a(), boc.a($$14)), boc.a(boc.a($$12), boi.a('~'), boc.a(), boc.a($$14)), boc.a($$11)),
         ($$4x, $$5x) -> {
            P $$6x = $$5x.a($$12);

            try {
               if ($$6x != null) {
                  vi $$7x = $$5x.b($$14);
                  return Optional.of($$0.b((ImmutableStringReader)$$4x.b(), $$6x, $$7x));
               } else {
                  C $$8x = $$5x.b($$11);
                  vi $$9x = $$5x.a($$14);
                  return Optional.of($$9x != null ? $$0.a((ImmutableStringReader)$$4x.b(), $$8x, $$9x) : $$0.a((ImmutableStringReader)$$4x.b(), $$8x));
               }
            } catch (CommandSyntaxException var9x) {
               $$4x.a().a($$4x.c(), var9x);
               return Optional.empty();
            }
         }
      );
      $$15.a($$11, new hd.a<>($$13, $$0));
      $$15.a($$12, new hd.d<>($$13, $$0));
      $$15.a($$14, boj.a);
      $$15.a($$13, boe.a);
      return new bod<>($$15, $$1);
   }

   static class a<T, C, P> extends bof<hd.b<T, C, P>, C> {
      a(bnt<alj> $$0, hd.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected C a(ImmutableStringReader $$0, alj $$1) throws Exception {
         return this.a.c($$0, $$1);
      }

      @Override
      public Stream<alj> a() {
         return this.a.c();
      }
   }

   public interface b<T, C, P> {
      T a(ImmutableStringReader var1, alj var2) throws CommandSyntaxException;

      Stream<alj> a();

      T b(ImmutableStringReader var1, alj var2) throws CommandSyntaxException;

      Stream<alj> b();

      C c(ImmutableStringReader var1, alj var2) throws CommandSyntaxException;

      Stream<alj> c();

      T a(ImmutableStringReader var1, C var2, vi var3) throws CommandSyntaxException;

      T a(ImmutableStringReader var1, C var2);

      P d(ImmutableStringReader var1, alj var2) throws CommandSyntaxException;

      Stream<alj> d();

      T b(ImmutableStringReader var1, P var2, vi var3) throws CommandSyntaxException;

      T a(T var1);

      T a(List<T> var1);
   }

   static class c<T, C, P> extends bof<hd.b<T, C, P>, T> {
      c(bnt<alj> $$0, hd.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, alj $$1) throws Exception {
         return this.a.a($$0, $$1);
      }

      @Override
      public Stream<alj> a() {
         return this.a.a();
      }
   }

   static class d<T, C, P> extends bof<hd.b<T, C, P>, P> {
      d(bnt<alj> $$0, hd.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected P a(ImmutableStringReader $$0, alj $$1) throws Exception {
         return this.a.d($$0, $$1);
      }

      @Override
      public Stream<alj> a() {
         return this.a.d();
      }
   }

   static class e<T, C, P> extends bof<hd.b<T, C, P>, T> {
      e(bnt<alj> $$0, hd.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, alj $$1) throws Exception {
         return this.a.b($$0, $$1);
      }

      @Override
      public Stream<alj> a() {
         return this.a.b();
      }
   }
}

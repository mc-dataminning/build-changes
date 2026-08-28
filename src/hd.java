import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class hd {
   public static <T, C, P> bnw<List<T>> a(hd.b<T, C, P> $$0) {
      bnm<List<T>> $$1 = bnm.a("top");
      bnm<Optional<T>> $$2 = bnm.a("type");
      bnm<bap> $$3 = bnm.a("any_type");
      bnm<T> $$4 = bnm.a("element_type");
      bnm<T> $$5 = bnm.a("tag_type");
      bnm<List<T>> $$6 = bnm.a("conditions");
      bnm<List<T>> $$7 = bnm.a("alternatives");
      bnm<T> $$8 = bnm.a("term");
      bnm<T> $$9 = bnm.a("negation");
      bnm<T> $$10 = bnm.a("test");
      bnm<C> $$11 = bnm.a("component_type");
      bnm<P> $$12 = bnm.a("predicate_type");
      bnm<ali> $$13 = bnm.a("id");
      bnm<vh> $$14 = bnm.a("tag");
      bno<StringReader> $$15 = new bno<>();
      $$15.a($$1, bnv.b(bnv.a(bnv.a($$2), bob.a('['), bnv.a(), bnv.a(bnv.a($$6)), bob.a(']')), bnv.a($$2)), $$2x -> {
         Builder<T> $$3x = ImmutableList.builder();
         $$2x.b($$2).ifPresent($$3x::add);
         List<T> $$4x = $$2x.a($$6);
         if ($$4x != null) {
            $$3x.addAll($$4x);
         }

         return $$3x.build();
      });
      $$15.a($$2, bnv.b(bnv.a($$4), bnv.a(bob.a('#'), bnv.a(), bnv.a($$5)), bnv.a($$3)), $$2x -> Optional.ofNullable($$2x.a($$4, $$5)));
      $$15.a($$3, bob.a('*'), $$0x -> bap.a);
      $$15.a($$4, new hd.c<>($$13, $$0));
      $$15.a($$5, new hd.e<>($$13, $$0));
      $$15.a($$6, bnv.a(bnv.a($$7), bnv.a(bnv.a(bob.a(','), bnv.a($$6)))), $$3x -> {
         T $$4x = $$0.a($$3x.b($$7));
         return Optional.ofNullable($$3x.a($$6)).map($$1xx -> ae.a($$4x, $$1xx)).orElse(List.of($$4x));
      });
      $$15.a($$7, bnv.a(bnv.a($$8), bnv.a(bnv.a(bob.a('|'), bnv.a($$7)))), $$2x -> {
         T $$3x = $$2x.b($$8);
         return Optional.ofNullable($$2x.a($$7)).map($$1xx -> ae.a($$3x, $$1xx)).orElse(List.of($$3x));
      });
      $$15.a($$8, bnv.b(bnv.a($$10), bnv.a(bob.a('!'), bnv.a($$9))), $$2x -> $$2x.b($$10, $$9));
      $$15.a($$9, bnv.a($$10), $$2x -> $$0.a($$2x.b($$10)));
      $$15.a(
         $$10,
         bnv.b(bnv.a(bnv.a($$11), bob.a('='), bnv.a(), bnv.a($$14)), bnv.a(bnv.a($$12), bob.a('~'), bnv.a(), bnv.a($$14)), bnv.a($$11)),
         ($$4x, $$5x) -> {
            P $$6x = $$5x.a($$12);

            try {
               if ($$6x != null) {
                  vh $$7x = $$5x.b($$14);
                  return Optional.of($$0.b((ImmutableStringReader)$$4x.b(), $$6x, $$7x));
               } else {
                  C $$8x = $$5x.b($$11);
                  vh $$9x = $$5x.a($$14);
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
      $$15.a($$14, boc.a);
      $$15.a($$13, bnx.a);
      return new bnw<>($$15, $$1);
   }

   static class a<T, C, P> extends bny<hd.b<T, C, P>, C> {
      a(bnm<ali> $$0, hd.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected C a(ImmutableStringReader $$0, ali $$1) throws Exception {
         return this.a.c($$0, $$1);
      }

      @Override
      public Stream<ali> a() {
         return this.a.c();
      }
   }

   public interface b<T, C, P> {
      T a(ImmutableStringReader var1, ali var2) throws CommandSyntaxException;

      Stream<ali> a();

      T b(ImmutableStringReader var1, ali var2) throws CommandSyntaxException;

      Stream<ali> b();

      C c(ImmutableStringReader var1, ali var2) throws CommandSyntaxException;

      Stream<ali> c();

      T a(ImmutableStringReader var1, C var2, vh var3) throws CommandSyntaxException;

      T a(ImmutableStringReader var1, C var2);

      P d(ImmutableStringReader var1, ali var2) throws CommandSyntaxException;

      Stream<ali> d();

      T b(ImmutableStringReader var1, P var2, vh var3) throws CommandSyntaxException;

      T a(T var1);

      T a(List<T> var1);
   }

   static class c<T, C, P> extends bny<hd.b<T, C, P>, T> {
      c(bnm<ali> $$0, hd.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, ali $$1) throws Exception {
         return this.a.a($$0, $$1);
      }

      @Override
      public Stream<ali> a() {
         return this.a.a();
      }
   }

   static class d<T, C, P> extends bny<hd.b<T, C, P>, P> {
      d(bnm<ali> $$0, hd.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected P a(ImmutableStringReader $$0, ali $$1) throws Exception {
         return this.a.d($$0, $$1);
      }

      @Override
      public Stream<ali> a() {
         return this.a.d();
      }
   }

   static class e<T, C, P> extends bny<hd.b<T, C, P>, T> {
      e(bnm<ali> $$0, hd.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, ali $$1) throws Exception {
         return this.a.b($$0, $$1);
      }

      @Override
      public Stream<ali> a() {
         return this.a.b();
      }
   }
}

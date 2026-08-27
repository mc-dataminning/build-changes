import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class gl {
   public static <T, C, P> blu<List<T>> a(gl.b<T, C, P> $$0) {
      blk<List<T>> $$1 = blk.a("top");
      blk<Optional<T>> $$2 = blk.a("type");
      blk<azh> $$3 = blk.a("any_type");
      blk<T> $$4 = blk.a("element_type");
      blk<T> $$5 = blk.a("tag_type");
      blk<List<T>> $$6 = blk.a("conditions");
      blk<List<T>> $$7 = blk.a("alternatives");
      blk<T> $$8 = blk.a("term");
      blk<T> $$9 = blk.a("negation");
      blk<T> $$10 = blk.a("test");
      blk<C> $$11 = blk.a("component_type");
      blk<P> $$12 = blk.a("predicate_type");
      blk<akn> $$13 = blk.a("id");
      blk<va> $$14 = blk.a("tag");
      blm<StringReader> $$15 = new blm<>();
      $$15.a($$1, blt.b(blt.a(blt.a($$2), blz.a('['), blt.a(), blt.a(blt.a($$6)), blz.a(']')), blt.a($$2)), $$2x -> {
         Builder<T> $$3x = ImmutableList.builder();
         $$2x.b($$2).ifPresent($$3x::add);
         List<T> $$4x = $$2x.a($$6);
         if ($$4x != null) {
            $$3x.addAll($$4x);
         }

         return $$3x.build();
      });
      $$15.a($$2, blt.b(blt.a($$4), blt.a(blz.a('#'), blt.a(), blt.a($$5)), blt.a($$3)), $$2x -> Optional.ofNullable($$2x.a($$4, $$5)));
      $$15.a($$3, blz.a('*'), $$0x -> azh.a);
      $$15.a($$4, new gl.c<>($$13, $$0));
      $$15.a($$5, new gl.e<>($$13, $$0));
      $$15.a($$6, blt.a(blt.a($$7), blt.a(blt.a(blz.a(','), blt.a($$6)))), $$3x -> {
         T $$4x = $$0.a($$3x.b($$7));
         return Optional.ofNullable($$3x.a($$6)).map($$1xx -> ac.a($$4x, $$1xx)).orElse(List.of($$4x));
      });
      $$15.a($$7, blt.a(blt.a($$8), blt.a(blt.a(blz.a('|'), blt.a($$7)))), $$2x -> {
         T $$3x = $$2x.b($$8);
         return Optional.ofNullable($$2x.a($$7)).map($$1xx -> ac.a($$3x, $$1xx)).orElse(List.of($$3x));
      });
      $$15.a($$8, blt.b(blt.a($$10), blt.a(blz.a('!'), blt.a($$9))), $$2x -> $$2x.b($$10, $$9));
      $$15.a($$9, blt.a($$10), $$2x -> $$0.a($$2x.b($$10)));
      $$15.a(
         $$10,
         blt.b(blt.a(blt.a($$11), blz.a('='), blt.a(), blt.a($$14)), blt.a(blt.a($$12), blz.a('~'), blt.a(), blt.a($$14)), blt.a($$11)),
         ($$4x, $$5x) -> {
            P $$6x = $$5x.a($$12);

            try {
               if ($$6x != null) {
                  va $$7x = $$5x.b($$14);
                  return Optional.of($$0.b((ImmutableStringReader)$$4x.b(), $$6x, $$7x));
               } else {
                  C $$8x = $$5x.b($$11);
                  va $$9x = $$5x.a($$14);
                  return Optional.of($$9x != null ? $$0.a((ImmutableStringReader)$$4x.b(), $$8x, $$9x) : $$0.a((ImmutableStringReader)$$4x.b(), $$8x));
               }
            } catch (CommandSyntaxException var9x) {
               $$4x.a().a($$4x.c(), var9x);
               return Optional.empty();
            }
         }
      );
      $$15.a($$11, new gl.a<>($$13, $$0));
      $$15.a($$12, new gl.d<>($$13, $$0));
      $$15.a($$14, bma.a);
      $$15.a($$13, blv.a);
      return new blu<>($$15, $$1);
   }

   static class a<T, C, P> extends blw<gl.b<T, C, P>, C> {
      a(blk<akn> $$0, gl.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected C a(ImmutableStringReader $$0, akn $$1) throws Exception {
         return this.a.c($$0, $$1);
      }

      @Override
      public Stream<akn> a() {
         return this.a.c();
      }
   }

   public interface b<T, C, P> {
      T a(ImmutableStringReader var1, akn var2) throws CommandSyntaxException;

      Stream<akn> a();

      T b(ImmutableStringReader var1, akn var2) throws CommandSyntaxException;

      Stream<akn> b();

      C c(ImmutableStringReader var1, akn var2) throws CommandSyntaxException;

      Stream<akn> c();

      T a(ImmutableStringReader var1, C var2, va var3) throws CommandSyntaxException;

      T a(ImmutableStringReader var1, C var2);

      P d(ImmutableStringReader var1, akn var2) throws CommandSyntaxException;

      Stream<akn> d();

      T b(ImmutableStringReader var1, P var2, va var3) throws CommandSyntaxException;

      T a(T var1);

      T a(List<T> var1);
   }

   static class c<T, C, P> extends blw<gl.b<T, C, P>, T> {
      c(blk<akn> $$0, gl.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, akn $$1) throws Exception {
         return this.a.a($$0, $$1);
      }

      @Override
      public Stream<akn> a() {
         return this.a.a();
      }
   }

   static class d<T, C, P> extends blw<gl.b<T, C, P>, P> {
      d(blk<akn> $$0, gl.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected P a(ImmutableStringReader $$0, akn $$1) throws Exception {
         return this.a.d($$0, $$1);
      }

      @Override
      public Stream<akn> a() {
         return this.a.d();
      }
   }

   static class e<T, C, P> extends blw<gl.b<T, C, P>, T> {
      e(blk<akn> $$0, gl.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, akn $$1) throws Exception {
         return this.a.b($$0, $$1);
      }

      @Override
      public Stream<akn> a() {
         return this.a.b();
      }
   }
}

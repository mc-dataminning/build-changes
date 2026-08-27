import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class gk {
   public static <T, C, P> blk<List<T>> a(gk.b<T, C, P> $$0) {
      bla<List<T>> $$1 = bla.a("top");
      bla<Optional<T>> $$2 = bla.a("type");
      bla<azb> $$3 = bla.a("any_type");
      bla<T> $$4 = bla.a("element_type");
      bla<T> $$5 = bla.a("tag_type");
      bla<List<T>> $$6 = bla.a("conditions");
      bla<List<T>> $$7 = bla.a("alternatives");
      bla<T> $$8 = bla.a("term");
      bla<T> $$9 = bla.a("negation");
      bla<T> $$10 = bla.a("test");
      bla<C> $$11 = bla.a("component_type");
      bla<P> $$12 = bla.a("predicate_type");
      bla<akh> $$13 = bla.a("id");
      bla<ux> $$14 = bla.a("tag");
      blc<StringReader> $$15 = new blc<>();
      $$15.a($$1, blj.b(blj.a(blj.a($$2), blp.a('['), blj.a(), blj.a(blj.a($$6)), blp.a(']')), blj.a($$2)), $$2x -> {
         Builder<T> $$3x = ImmutableList.builder();
         $$2x.b($$2).ifPresent($$3x::add);
         List<T> $$4x = $$2x.a($$6);
         if ($$4x != null) {
            $$3x.addAll($$4x);
         }

         return $$3x.build();
      });
      $$15.a($$2, blj.b(blj.a($$4), blj.a(blp.a('#'), blj.a(), blj.a($$5)), blj.a($$3)), $$2x -> Optional.ofNullable($$2x.a($$4, $$5)));
      $$15.a($$3, blp.a('*'), $$0x -> azb.a);
      $$15.a($$4, new gk.c<>($$13, $$0));
      $$15.a($$5, new gk.e<>($$13, $$0));
      $$15.a($$6, blj.a(blj.a($$7), blj.a(blj.a(blp.a(','), blj.a($$6)))), $$3x -> {
         T $$4x = $$0.a($$3x.b($$7));
         return Optional.ofNullable($$3x.a($$6)).map($$1xx -> ac.a($$4x, $$1xx)).orElse(List.of($$4x));
      });
      $$15.a($$7, blj.a(blj.a($$8), blj.a(blj.a(blp.a('|'), blj.a($$7)))), $$2x -> {
         T $$3x = $$2x.b($$8);
         return Optional.ofNullable($$2x.a($$7)).map($$1xx -> ac.a($$3x, $$1xx)).orElse(List.of($$3x));
      });
      $$15.a($$8, blj.b(blj.a($$10), blj.a(blp.a('!'), blj.a($$9))), $$2x -> $$2x.b($$10, $$9));
      $$15.a($$9, blj.a($$10), $$2x -> $$0.a($$2x.b($$10)));
      $$15.a(
         $$10,
         blj.b(blj.a(blj.a($$11), blp.a('='), blj.a(), blj.a($$14)), blj.a(blj.a($$12), blp.a('~'), blj.a(), blj.a($$14)), blj.a($$11)),
         ($$4x, $$5x) -> {
            P $$6x = $$5x.a($$12);

            try {
               if ($$6x != null) {
                  ux $$7x = $$5x.b($$14);
                  return Optional.of($$0.b((ImmutableStringReader)$$4x.b(), $$6x, $$7x));
               } else {
                  C $$8x = $$5x.b($$11);
                  ux $$9x = $$5x.a($$14);
                  return Optional.of($$9x != null ? $$0.a((ImmutableStringReader)$$4x.b(), $$8x, $$9x) : $$0.a((ImmutableStringReader)$$4x.b(), $$8x));
               }
            } catch (CommandSyntaxException var9x) {
               $$4x.a().a($$4x.c(), var9x);
               return Optional.empty();
            }
         }
      );
      $$15.a($$11, new gk.a<>($$13, $$0));
      $$15.a($$12, new gk.d<>($$13, $$0));
      $$15.a($$14, blq.a);
      $$15.a($$13, bll.a);
      return new blk<>($$15, $$1);
   }

   static class a<T, C, P> extends blm<gk.b<T, C, P>, C> {
      a(bla<akh> $$0, gk.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected C a(ImmutableStringReader $$0, akh $$1) throws Exception {
         return this.a.c($$0, $$1);
      }

      @Override
      public Stream<akh> a() {
         return this.a.c();
      }
   }

   public interface b<T, C, P> {
      T a(ImmutableStringReader var1, akh var2) throws CommandSyntaxException;

      Stream<akh> a();

      T b(ImmutableStringReader var1, akh var2) throws CommandSyntaxException;

      Stream<akh> b();

      C c(ImmutableStringReader var1, akh var2) throws CommandSyntaxException;

      Stream<akh> c();

      T a(ImmutableStringReader var1, C var2, ux var3) throws CommandSyntaxException;

      T a(ImmutableStringReader var1, C var2);

      P d(ImmutableStringReader var1, akh var2) throws CommandSyntaxException;

      Stream<akh> d();

      T b(ImmutableStringReader var1, P var2, ux var3) throws CommandSyntaxException;

      T a(T var1);

      T a(List<T> var1);
   }

   static class c<T, C, P> extends blm<gk.b<T, C, P>, T> {
      c(bla<akh> $$0, gk.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, akh $$1) throws Exception {
         return this.a.a($$0, $$1);
      }

      @Override
      public Stream<akh> a() {
         return this.a.a();
      }
   }

   static class d<T, C, P> extends blm<gk.b<T, C, P>, P> {
      d(bla<akh> $$0, gk.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected P a(ImmutableStringReader $$0, akh $$1) throws Exception {
         return this.a.d($$0, $$1);
      }

      @Override
      public Stream<akh> a() {
         return this.a.d();
      }
   }

   static class e<T, C, P> extends blm<gk.b<T, C, P>, T> {
      e(bla<akh> $$0, gk.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, akh $$1) throws Exception {
         return this.a.b($$0, $$1);
      }

      @Override
      public Stream<akh> a() {
         return this.a.b();
      }
   }
}

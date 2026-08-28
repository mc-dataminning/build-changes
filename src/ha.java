import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ha {
   public static <T, C, P> bni<List<T>> a(ha.b<T, C, P> $$0) {
      bmy<List<T>> $$1 = bmy.a("top");
      bmy<Optional<T>> $$2 = bmy.a("type");
      bmy<bah> $$3 = bmy.a("any_type");
      bmy<T> $$4 = bmy.a("element_type");
      bmy<T> $$5 = bmy.a("tag_type");
      bmy<List<T>> $$6 = bmy.a("conditions");
      bmy<List<T>> $$7 = bmy.a("alternatives");
      bmy<T> $$8 = bmy.a("term");
      bmy<T> $$9 = bmy.a("negation");
      bmy<T> $$10 = bmy.a("test");
      bmy<C> $$11 = bmy.a("component_type");
      bmy<P> $$12 = bmy.a("predicate_type");
      bmy<alb> $$13 = bmy.a("id");
      bmy<vc> $$14 = bmy.a("tag");
      bna<StringReader> $$15 = new bna<>();
      $$15.a($$1, bnh.b(bnh.a(bnh.a($$2), bnn.a('['), bnh.a(), bnh.a(bnh.a($$6)), bnn.a(']')), bnh.a($$2)), $$2x -> {
         Builder<T> $$3x = ImmutableList.builder();
         $$2x.b($$2).ifPresent($$3x::add);
         List<T> $$4x = $$2x.a($$6);
         if ($$4x != null) {
            $$3x.addAll($$4x);
         }

         return $$3x.build();
      });
      $$15.a($$2, bnh.b(bnh.a($$4), bnh.a(bnn.a('#'), bnh.a(), bnh.a($$5)), bnh.a($$3)), $$2x -> Optional.ofNullable($$2x.a($$4, $$5)));
      $$15.a($$3, bnn.a('*'), $$0x -> bah.a);
      $$15.a($$4, new ha.c<>($$13, $$0));
      $$15.a($$5, new ha.e<>($$13, $$0));
      $$15.a($$6, bnh.a(bnh.a($$7), bnh.a(bnh.a(bnn.a(','), bnh.a($$6)))), $$3x -> {
         T $$4x = $$0.a($$3x.b($$7));
         return Optional.ofNullable($$3x.a($$6)).map($$1xx -> ad.a($$4x, $$1xx)).orElse(List.of($$4x));
      });
      $$15.a($$7, bnh.a(bnh.a($$8), bnh.a(bnh.a(bnn.a('|'), bnh.a($$7)))), $$2x -> {
         T $$3x = $$2x.b($$8);
         return Optional.ofNullable($$2x.a($$7)).map($$1xx -> ad.a($$3x, $$1xx)).orElse(List.of($$3x));
      });
      $$15.a($$8, bnh.b(bnh.a($$10), bnh.a(bnn.a('!'), bnh.a($$9))), $$2x -> $$2x.b($$10, $$9));
      $$15.a($$9, bnh.a($$10), $$2x -> $$0.a($$2x.b($$10)));
      $$15.a(
         $$10,
         bnh.b(bnh.a(bnh.a($$11), bnn.a('='), bnh.a(), bnh.a($$14)), bnh.a(bnh.a($$12), bnn.a('~'), bnh.a(), bnh.a($$14)), bnh.a($$11)),
         ($$4x, $$5x) -> {
            P $$6x = $$5x.a($$12);

            try {
               if ($$6x != null) {
                  vc $$7x = $$5x.b($$14);
                  return Optional.of($$0.b((ImmutableStringReader)$$4x.b(), $$6x, $$7x));
               } else {
                  C $$8x = $$5x.b($$11);
                  vc $$9x = $$5x.a($$14);
                  return Optional.of($$9x != null ? $$0.a((ImmutableStringReader)$$4x.b(), $$8x, $$9x) : $$0.a((ImmutableStringReader)$$4x.b(), $$8x));
               }
            } catch (CommandSyntaxException var9x) {
               $$4x.a().a($$4x.c(), var9x);
               return Optional.empty();
            }
         }
      );
      $$15.a($$11, new ha.a<>($$13, $$0));
      $$15.a($$12, new ha.d<>($$13, $$0));
      $$15.a($$14, bno.a);
      $$15.a($$13, bnj.a);
      return new bni<>($$15, $$1);
   }

   static class a<T, C, P> extends bnk<ha.b<T, C, P>, C> {
      a(bmy<alb> $$0, ha.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected C a(ImmutableStringReader $$0, alb $$1) throws Exception {
         return this.a.c($$0, $$1);
      }

      @Override
      public Stream<alb> a() {
         return this.a.c();
      }
   }

   public interface b<T, C, P> {
      T a(ImmutableStringReader var1, alb var2) throws CommandSyntaxException;

      Stream<alb> a();

      T b(ImmutableStringReader var1, alb var2) throws CommandSyntaxException;

      Stream<alb> b();

      C c(ImmutableStringReader var1, alb var2) throws CommandSyntaxException;

      Stream<alb> c();

      T a(ImmutableStringReader var1, C var2, vc var3) throws CommandSyntaxException;

      T a(ImmutableStringReader var1, C var2);

      P d(ImmutableStringReader var1, alb var2) throws CommandSyntaxException;

      Stream<alb> d();

      T b(ImmutableStringReader var1, P var2, vc var3) throws CommandSyntaxException;

      T a(T var1);

      T a(List<T> var1);
   }

   static class c<T, C, P> extends bnk<ha.b<T, C, P>, T> {
      c(bmy<alb> $$0, ha.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, alb $$1) throws Exception {
         return this.a.a($$0, $$1);
      }

      @Override
      public Stream<alb> a() {
         return this.a.a();
      }
   }

   static class d<T, C, P> extends bnk<ha.b<T, C, P>, P> {
      d(bmy<alb> $$0, ha.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected P a(ImmutableStringReader $$0, alb $$1) throws Exception {
         return this.a.d($$0, $$1);
      }

      @Override
      public Stream<alb> a() {
         return this.a.d();
      }
   }

   static class e<T, C, P> extends bnk<ha.b<T, C, P>, T> {
      e(bmy<alb> $$0, ha.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, alb $$1) throws Exception {
         return this.a.b($$0, $$1);
      }

      @Override
      public Stream<alb> a() {
         return this.a.b();
      }
   }
}

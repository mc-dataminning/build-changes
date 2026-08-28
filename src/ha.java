import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ha {
   public static <T, C, P> bnn<List<T>> a(ha.b<T, C, P> $$0) {
      bnd<List<T>> $$1 = bnd.a("top");
      bnd<Optional<T>> $$2 = bnd.a("type");
      bnd<bai> $$3 = bnd.a("any_type");
      bnd<T> $$4 = bnd.a("element_type");
      bnd<T> $$5 = bnd.a("tag_type");
      bnd<List<T>> $$6 = bnd.a("conditions");
      bnd<List<T>> $$7 = bnd.a("alternatives");
      bnd<T> $$8 = bnd.a("term");
      bnd<T> $$9 = bnd.a("negation");
      bnd<T> $$10 = bnd.a("test");
      bnd<C> $$11 = bnd.a("component_type");
      bnd<P> $$12 = bnd.a("predicate_type");
      bnd<alc> $$13 = bnd.a("id");
      bnd<vc> $$14 = bnd.a("tag");
      bnf<StringReader> $$15 = new bnf<>();
      $$15.a($$1, bnm.b(bnm.a(bnm.a($$2), bns.a('['), bnm.a(), bnm.a(bnm.a($$6)), bns.a(']')), bnm.a($$2)), $$2x -> {
         Builder<T> $$3x = ImmutableList.builder();
         $$2x.b($$2).ifPresent($$3x::add);
         List<T> $$4x = $$2x.a($$6);
         if ($$4x != null) {
            $$3x.addAll($$4x);
         }

         return $$3x.build();
      });
      $$15.a($$2, bnm.b(bnm.a($$4), bnm.a(bns.a('#'), bnm.a(), bnm.a($$5)), bnm.a($$3)), $$2x -> Optional.ofNullable($$2x.a($$4, $$5)));
      $$15.a($$3, bns.a('*'), $$0x -> bai.a);
      $$15.a($$4, new ha.c<>($$13, $$0));
      $$15.a($$5, new ha.e<>($$13, $$0));
      $$15.a($$6, bnm.a(bnm.a($$7), bnm.a(bnm.a(bns.a(','), bnm.a($$6)))), $$3x -> {
         T $$4x = $$0.a($$3x.b($$7));
         return Optional.ofNullable($$3x.a($$6)).map($$1xx -> ad.a($$4x, $$1xx)).orElse(List.of($$4x));
      });
      $$15.a($$7, bnm.a(bnm.a($$8), bnm.a(bnm.a(bns.a('|'), bnm.a($$7)))), $$2x -> {
         T $$3x = $$2x.b($$8);
         return Optional.ofNullable($$2x.a($$7)).map($$1xx -> ad.a($$3x, $$1xx)).orElse(List.of($$3x));
      });
      $$15.a($$8, bnm.b(bnm.a($$10), bnm.a(bns.a('!'), bnm.a($$9))), $$2x -> $$2x.b($$10, $$9));
      $$15.a($$9, bnm.a($$10), $$2x -> $$0.a($$2x.b($$10)));
      $$15.a(
         $$10,
         bnm.b(bnm.a(bnm.a($$11), bns.a('='), bnm.a(), bnm.a($$14)), bnm.a(bnm.a($$12), bns.a('~'), bnm.a(), bnm.a($$14)), bnm.a($$11)),
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
      $$15.a($$14, bnt.a);
      $$15.a($$13, bno.a);
      return new bnn<>($$15, $$1);
   }

   static class a<T, C, P> extends bnp<ha.b<T, C, P>, C> {
      a(bnd<alc> $$0, ha.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected C a(ImmutableStringReader $$0, alc $$1) throws Exception {
         return this.a.c($$0, $$1);
      }

      @Override
      public Stream<alc> a() {
         return this.a.c();
      }
   }

   public interface b<T, C, P> {
      T a(ImmutableStringReader var1, alc var2) throws CommandSyntaxException;

      Stream<alc> a();

      T b(ImmutableStringReader var1, alc var2) throws CommandSyntaxException;

      Stream<alc> b();

      C c(ImmutableStringReader var1, alc var2) throws CommandSyntaxException;

      Stream<alc> c();

      T a(ImmutableStringReader var1, C var2, vc var3) throws CommandSyntaxException;

      T a(ImmutableStringReader var1, C var2);

      P d(ImmutableStringReader var1, alc var2) throws CommandSyntaxException;

      Stream<alc> d();

      T b(ImmutableStringReader var1, P var2, vc var3) throws CommandSyntaxException;

      T a(T var1);

      T a(List<T> var1);
   }

   static class c<T, C, P> extends bnp<ha.b<T, C, P>, T> {
      c(bnd<alc> $$0, ha.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, alc $$1) throws Exception {
         return this.a.a($$0, $$1);
      }

      @Override
      public Stream<alc> a() {
         return this.a.a();
      }
   }

   static class d<T, C, P> extends bnp<ha.b<T, C, P>, P> {
      d(bnd<alc> $$0, ha.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected P a(ImmutableStringReader $$0, alc $$1) throws Exception {
         return this.a.d($$0, $$1);
      }

      @Override
      public Stream<alc> a() {
         return this.a.d();
      }
   }

   static class e<T, C, P> extends bnp<ha.b<T, C, P>, T> {
      e(bnd<alc> $$0, ha.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, alc $$1) throws Exception {
         return this.a.b($$0, $$1);
      }

      @Override
      public Stream<alc> a() {
         return this.a.b();
      }
   }
}

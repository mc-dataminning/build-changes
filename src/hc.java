import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class hc {
   public static <T, C, P> bnu<List<T>> a(hc.b<T, C, P> $$0) {
      bnk<List<T>> $$1 = bnk.a("top");
      bnk<Optional<T>> $$2 = bnk.a("type");
      bnk<bao> $$3 = bnk.a("any_type");
      bnk<T> $$4 = bnk.a("element_type");
      bnk<T> $$5 = bnk.a("tag_type");
      bnk<List<T>> $$6 = bnk.a("conditions");
      bnk<List<T>> $$7 = bnk.a("alternatives");
      bnk<T> $$8 = bnk.a("term");
      bnk<T> $$9 = bnk.a("negation");
      bnk<T> $$10 = bnk.a("test");
      bnk<C> $$11 = bnk.a("component_type");
      bnk<P> $$12 = bnk.a("predicate_type");
      bnk<alh> $$13 = bnk.a("id");
      bnk<vg> $$14 = bnk.a("tag");
      bnm<StringReader> $$15 = new bnm<>();
      $$15.a($$1, bnt.b(bnt.a(bnt.a($$2), bnz.a('['), bnt.a(), bnt.a(bnt.a($$6)), bnz.a(']')), bnt.a($$2)), $$2x -> {
         Builder<T> $$3x = ImmutableList.builder();
         $$2x.b($$2).ifPresent($$3x::add);
         List<T> $$4x = $$2x.a($$6);
         if ($$4x != null) {
            $$3x.addAll($$4x);
         }

         return $$3x.build();
      });
      $$15.a($$2, bnt.b(bnt.a($$4), bnt.a(bnz.a('#'), bnt.a(), bnt.a($$5)), bnt.a($$3)), $$2x -> Optional.ofNullable($$2x.a($$4, $$5)));
      $$15.a($$3, bnz.a('*'), $$0x -> bao.a);
      $$15.a($$4, new hc.c<>($$13, $$0));
      $$15.a($$5, new hc.e<>($$13, $$0));
      $$15.a($$6, bnt.a(bnt.a($$7), bnt.a(bnt.a(bnz.a(','), bnt.a($$6)))), $$3x -> {
         T $$4x = $$0.a($$3x.b($$7));
         return Optional.ofNullable($$3x.a($$6)).map($$1xx -> ad.a($$4x, $$1xx)).orElse(List.of($$4x));
      });
      $$15.a($$7, bnt.a(bnt.a($$8), bnt.a(bnt.a(bnz.a('|'), bnt.a($$7)))), $$2x -> {
         T $$3x = $$2x.b($$8);
         return Optional.ofNullable($$2x.a($$7)).map($$1xx -> ad.a($$3x, $$1xx)).orElse(List.of($$3x));
      });
      $$15.a($$8, bnt.b(bnt.a($$10), bnt.a(bnz.a('!'), bnt.a($$9))), $$2x -> $$2x.b($$10, $$9));
      $$15.a($$9, bnt.a($$10), $$2x -> $$0.a($$2x.b($$10)));
      $$15.a(
         $$10,
         bnt.b(bnt.a(bnt.a($$11), bnz.a('='), bnt.a(), bnt.a($$14)), bnt.a(bnt.a($$12), bnz.a('~'), bnt.a(), bnt.a($$14)), bnt.a($$11)),
         ($$4x, $$5x) -> {
            P $$6x = $$5x.a($$12);

            try {
               if ($$6x != null) {
                  vg $$7x = $$5x.b($$14);
                  return Optional.of($$0.b((ImmutableStringReader)$$4x.b(), $$6x, $$7x));
               } else {
                  C $$8x = $$5x.b($$11);
                  vg $$9x = $$5x.a($$14);
                  return Optional.of($$9x != null ? $$0.a((ImmutableStringReader)$$4x.b(), $$8x, $$9x) : $$0.a((ImmutableStringReader)$$4x.b(), $$8x));
               }
            } catch (CommandSyntaxException var9x) {
               $$4x.a().a($$4x.c(), var9x);
               return Optional.empty();
            }
         }
      );
      $$15.a($$11, new hc.a<>($$13, $$0));
      $$15.a($$12, new hc.d<>($$13, $$0));
      $$15.a($$14, boa.a);
      $$15.a($$13, bnv.a);
      return new bnu<>($$15, $$1);
   }

   static class a<T, C, P> extends bnw<hc.b<T, C, P>, C> {
      a(bnk<alh> $$0, hc.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected C a(ImmutableStringReader $$0, alh $$1) throws Exception {
         return this.a.c($$0, $$1);
      }

      @Override
      public Stream<alh> a() {
         return this.a.c();
      }
   }

   public interface b<T, C, P> {
      T a(ImmutableStringReader var1, alh var2) throws CommandSyntaxException;

      Stream<alh> a();

      T b(ImmutableStringReader var1, alh var2) throws CommandSyntaxException;

      Stream<alh> b();

      C c(ImmutableStringReader var1, alh var2) throws CommandSyntaxException;

      Stream<alh> c();

      T a(ImmutableStringReader var1, C var2, vg var3) throws CommandSyntaxException;

      T a(ImmutableStringReader var1, C var2);

      P d(ImmutableStringReader var1, alh var2) throws CommandSyntaxException;

      Stream<alh> d();

      T b(ImmutableStringReader var1, P var2, vg var3) throws CommandSyntaxException;

      T a(T var1);

      T a(List<T> var1);
   }

   static class c<T, C, P> extends bnw<hc.b<T, C, P>, T> {
      c(bnk<alh> $$0, hc.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, alh $$1) throws Exception {
         return this.a.a($$0, $$1);
      }

      @Override
      public Stream<alh> a() {
         return this.a.a();
      }
   }

   static class d<T, C, P> extends bnw<hc.b<T, C, P>, P> {
      d(bnk<alh> $$0, hc.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected P a(ImmutableStringReader $$0, alh $$1) throws Exception {
         return this.a.d($$0, $$1);
      }

      @Override
      public Stream<alh> a() {
         return this.a.d();
      }
   }

   static class e<T, C, P> extends bnw<hc.b<T, C, P>, T> {
      e(bnk<alh> $$0, hc.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, alh $$1) throws Exception {
         return this.a.b($$0, $$1);
      }

      @Override
      public Stream<alh> a() {
         return this.a.b();
      }
   }
}

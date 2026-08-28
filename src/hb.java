import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class hb {
   public static <T, C, P> bnq<List<T>> a(hb.b<T, C, P> $$0) {
      bng<List<T>> $$1 = bng.a("top");
      bng<Optional<T>> $$2 = bng.a("type");
      bng<bak> $$3 = bng.a("any_type");
      bng<T> $$4 = bng.a("element_type");
      bng<T> $$5 = bng.a("tag_type");
      bng<List<T>> $$6 = bng.a("conditions");
      bng<List<T>> $$7 = bng.a("alternatives");
      bng<T> $$8 = bng.a("term");
      bng<T> $$9 = bng.a("negation");
      bng<T> $$10 = bng.a("test");
      bng<C> $$11 = bng.a("component_type");
      bng<P> $$12 = bng.a("predicate_type");
      bng<ale> $$13 = bng.a("id");
      bng<vd> $$14 = bng.a("tag");
      bni<StringReader> $$15 = new bni<>();
      $$15.a($$1, bnp.b(bnp.a(bnp.a($$2), bnv.a('['), bnp.a(), bnp.a(bnp.a($$6)), bnv.a(']')), bnp.a($$2)), $$2x -> {
         Builder<T> $$3x = ImmutableList.builder();
         $$2x.b($$2).ifPresent($$3x::add);
         List<T> $$4x = $$2x.a($$6);
         if ($$4x != null) {
            $$3x.addAll($$4x);
         }

         return $$3x.build();
      });
      $$15.a($$2, bnp.b(bnp.a($$4), bnp.a(bnv.a('#'), bnp.a(), bnp.a($$5)), bnp.a($$3)), $$2x -> Optional.ofNullable($$2x.a($$4, $$5)));
      $$15.a($$3, bnv.a('*'), $$0x -> bak.a);
      $$15.a($$4, new hb.c<>($$13, $$0));
      $$15.a($$5, new hb.e<>($$13, $$0));
      $$15.a($$6, bnp.a(bnp.a($$7), bnp.a(bnp.a(bnv.a(','), bnp.a($$6)))), $$3x -> {
         T $$4x = $$0.a($$3x.b($$7));
         return Optional.ofNullable($$3x.a($$6)).map($$1xx -> ad.a($$4x, $$1xx)).orElse(List.of($$4x));
      });
      $$15.a($$7, bnp.a(bnp.a($$8), bnp.a(bnp.a(bnv.a('|'), bnp.a($$7)))), $$2x -> {
         T $$3x = $$2x.b($$8);
         return Optional.ofNullable($$2x.a($$7)).map($$1xx -> ad.a($$3x, $$1xx)).orElse(List.of($$3x));
      });
      $$15.a($$8, bnp.b(bnp.a($$10), bnp.a(bnv.a('!'), bnp.a($$9))), $$2x -> $$2x.b($$10, $$9));
      $$15.a($$9, bnp.a($$10), $$2x -> $$0.a($$2x.b($$10)));
      $$15.a(
         $$10,
         bnp.b(bnp.a(bnp.a($$11), bnv.a('='), bnp.a(), bnp.a($$14)), bnp.a(bnp.a($$12), bnv.a('~'), bnp.a(), bnp.a($$14)), bnp.a($$11)),
         ($$4x, $$5x) -> {
            P $$6x = $$5x.a($$12);

            try {
               if ($$6x != null) {
                  vd $$7x = $$5x.b($$14);
                  return Optional.of($$0.b((ImmutableStringReader)$$4x.b(), $$6x, $$7x));
               } else {
                  C $$8x = $$5x.b($$11);
                  vd $$9x = $$5x.a($$14);
                  return Optional.of($$9x != null ? $$0.a((ImmutableStringReader)$$4x.b(), $$8x, $$9x) : $$0.a((ImmutableStringReader)$$4x.b(), $$8x));
               }
            } catch (CommandSyntaxException var9x) {
               $$4x.a().a($$4x.c(), var9x);
               return Optional.empty();
            }
         }
      );
      $$15.a($$11, new hb.a<>($$13, $$0));
      $$15.a($$12, new hb.d<>($$13, $$0));
      $$15.a($$14, bnw.a);
      $$15.a($$13, bnr.a);
      return new bnq<>($$15, $$1);
   }

   static class a<T, C, P> extends bns<hb.b<T, C, P>, C> {
      a(bng<ale> $$0, hb.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected C a(ImmutableStringReader $$0, ale $$1) throws Exception {
         return this.a.c($$0, $$1);
      }

      @Override
      public Stream<ale> a() {
         return this.a.c();
      }
   }

   public interface b<T, C, P> {
      T a(ImmutableStringReader var1, ale var2) throws CommandSyntaxException;

      Stream<ale> a();

      T b(ImmutableStringReader var1, ale var2) throws CommandSyntaxException;

      Stream<ale> b();

      C c(ImmutableStringReader var1, ale var2) throws CommandSyntaxException;

      Stream<ale> c();

      T a(ImmutableStringReader var1, C var2, vd var3) throws CommandSyntaxException;

      T a(ImmutableStringReader var1, C var2);

      P d(ImmutableStringReader var1, ale var2) throws CommandSyntaxException;

      Stream<ale> d();

      T b(ImmutableStringReader var1, P var2, vd var3) throws CommandSyntaxException;

      T a(T var1);

      T a(List<T> var1);
   }

   static class c<T, C, P> extends bns<hb.b<T, C, P>, T> {
      c(bng<ale> $$0, hb.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, ale $$1) throws Exception {
         return this.a.a($$0, $$1);
      }

      @Override
      public Stream<ale> a() {
         return this.a.a();
      }
   }

   static class d<T, C, P> extends bns<hb.b<T, C, P>, P> {
      d(bng<ale> $$0, hb.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected P a(ImmutableStringReader $$0, ale $$1) throws Exception {
         return this.a.d($$0, $$1);
      }

      @Override
      public Stream<ale> a() {
         return this.a.d();
      }
   }

   static class e<T, C, P> extends bns<hb.b<T, C, P>, T> {
      e(bng<ale> $$0, hb.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, ale $$1) throws Exception {
         return this.a.b($$0, $$1);
      }

      @Override
      public Stream<ale> a() {
         return this.a.b();
      }
   }
}

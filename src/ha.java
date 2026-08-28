import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ha {
   public static <T, C, P> bmo<List<T>> a(ha.b<T, C, P> $$0) {
      bme<List<T>> $$1 = bme.a("top");
      bme<Optional<T>> $$2 = bme.a("type");
      bme<azr> $$3 = bme.a("any_type");
      bme<T> $$4 = bme.a("element_type");
      bme<T> $$5 = bme.a("tag_type");
      bme<List<T>> $$6 = bme.a("conditions");
      bme<List<T>> $$7 = bme.a("alternatives");
      bme<T> $$8 = bme.a("term");
      bme<T> $$9 = bme.a("negation");
      bme<T> $$10 = bme.a("test");
      bme<C> $$11 = bme.a("component_type");
      bme<P> $$12 = bme.a("predicate_type");
      bme<akq> $$13 = bme.a("id");
      bme<ux> $$14 = bme.a("tag");
      bmg<StringReader> $$15 = new bmg<>();
      $$15.a($$1, bmn.b(bmn.a(bmn.a($$2), bmt.a('['), bmn.a(), bmn.a(bmn.a($$6)), bmt.a(']')), bmn.a($$2)), $$2x -> {
         Builder<T> $$3x = ImmutableList.builder();
         $$2x.b($$2).ifPresent($$3x::add);
         List<T> $$4x = $$2x.a($$6);
         if ($$4x != null) {
            $$3x.addAll($$4x);
         }

         return $$3x.build();
      });
      $$15.a($$2, bmn.b(bmn.a($$4), bmn.a(bmt.a('#'), bmn.a(), bmn.a($$5)), bmn.a($$3)), $$2x -> Optional.ofNullable($$2x.a($$4, $$5)));
      $$15.a($$3, bmt.a('*'), $$0x -> azr.a);
      $$15.a($$4, new ha.c<>($$13, $$0));
      $$15.a($$5, new ha.e<>($$13, $$0));
      $$15.a($$6, bmn.a(bmn.a($$7), bmn.a(bmn.a(bmt.a(','), bmn.a($$6)))), $$3x -> {
         T $$4x = $$0.a($$3x.b($$7));
         return Optional.ofNullable($$3x.a($$6)).map($$1xx -> ad.a($$4x, $$1xx)).orElse(List.of($$4x));
      });
      $$15.a($$7, bmn.a(bmn.a($$8), bmn.a(bmn.a(bmt.a('|'), bmn.a($$7)))), $$2x -> {
         T $$3x = $$2x.b($$8);
         return Optional.ofNullable($$2x.a($$7)).map($$1xx -> ad.a($$3x, $$1xx)).orElse(List.of($$3x));
      });
      $$15.a($$8, bmn.b(bmn.a($$10), bmn.a(bmt.a('!'), bmn.a($$9))), $$2x -> $$2x.b($$10, $$9));
      $$15.a($$9, bmn.a($$10), $$2x -> $$0.a($$2x.b($$10)));
      $$15.a(
         $$10,
         bmn.b(bmn.a(bmn.a($$11), bmt.a('='), bmn.a(), bmn.a($$14)), bmn.a(bmn.a($$12), bmt.a('~'), bmn.a(), bmn.a($$14)), bmn.a($$11)),
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
      $$15.a($$11, new ha.a<>($$13, $$0));
      $$15.a($$12, new ha.d<>($$13, $$0));
      $$15.a($$14, bmu.a);
      $$15.a($$13, bmp.a);
      return new bmo<>($$15, $$1);
   }

   static class a<T, C, P> extends bmq<ha.b<T, C, P>, C> {
      a(bme<akq> $$0, ha.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected C a(ImmutableStringReader $$0, akq $$1) throws Exception {
         return this.a.c($$0, $$1);
      }

      @Override
      public Stream<akq> a() {
         return this.a.c();
      }
   }

   public interface b<T, C, P> {
      T a(ImmutableStringReader var1, akq var2) throws CommandSyntaxException;

      Stream<akq> a();

      T b(ImmutableStringReader var1, akq var2) throws CommandSyntaxException;

      Stream<akq> b();

      C c(ImmutableStringReader var1, akq var2) throws CommandSyntaxException;

      Stream<akq> c();

      T a(ImmutableStringReader var1, C var2, ux var3) throws CommandSyntaxException;

      T a(ImmutableStringReader var1, C var2);

      P d(ImmutableStringReader var1, akq var2) throws CommandSyntaxException;

      Stream<akq> d();

      T b(ImmutableStringReader var1, P var2, ux var3) throws CommandSyntaxException;

      T a(T var1);

      T a(List<T> var1);
   }

   static class c<T, C, P> extends bmq<ha.b<T, C, P>, T> {
      c(bme<akq> $$0, ha.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, akq $$1) throws Exception {
         return this.a.a($$0, $$1);
      }

      @Override
      public Stream<akq> a() {
         return this.a.a();
      }
   }

   static class d<T, C, P> extends bmq<ha.b<T, C, P>, P> {
      d(bme<akq> $$0, ha.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected P a(ImmutableStringReader $$0, akq $$1) throws Exception {
         return this.a.d($$0, $$1);
      }

      @Override
      public Stream<akq> a() {
         return this.a.d();
      }
   }

   static class e<T, C, P> extends bmq<ha.b<T, C, P>, T> {
      e(bme<akq> $$0, ha.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, akq $$1) throws Exception {
         return this.a.b($$0, $$1);
      }

      @Override
      public Stream<akq> a() {
         return this.a.b();
      }
   }
}

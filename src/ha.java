import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ha {
   public static <T, C, P> bmp<List<T>> a(ha.b<T, C, P> $$0) {
      bmf<List<T>> $$1 = bmf.a("top");
      bmf<Optional<T>> $$2 = bmf.a("type");
      bmf<azs> $$3 = bmf.a("any_type");
      bmf<T> $$4 = bmf.a("element_type");
      bmf<T> $$5 = bmf.a("tag_type");
      bmf<List<T>> $$6 = bmf.a("conditions");
      bmf<List<T>> $$7 = bmf.a("alternatives");
      bmf<T> $$8 = bmf.a("term");
      bmf<T> $$9 = bmf.a("negation");
      bmf<T> $$10 = bmf.a("test");
      bmf<C> $$11 = bmf.a("component_type");
      bmf<P> $$12 = bmf.a("predicate_type");
      bmf<akr> $$13 = bmf.a("id");
      bmf<uy> $$14 = bmf.a("tag");
      bmh<StringReader> $$15 = new bmh<>();
      $$15.a($$1, bmo.b(bmo.a(bmo.a($$2), bmu.a('['), bmo.a(), bmo.a(bmo.a($$6)), bmu.a(']')), bmo.a($$2)), $$2x -> {
         Builder<T> $$3x = ImmutableList.builder();
         $$2x.b($$2).ifPresent($$3x::add);
         List<T> $$4x = $$2x.a($$6);
         if ($$4x != null) {
            $$3x.addAll($$4x);
         }

         return $$3x.build();
      });
      $$15.a($$2, bmo.b(bmo.a($$4), bmo.a(bmu.a('#'), bmo.a(), bmo.a($$5)), bmo.a($$3)), $$2x -> Optional.ofNullable($$2x.a($$4, $$5)));
      $$15.a($$3, bmu.a('*'), $$0x -> azs.a);
      $$15.a($$4, new ha.c<>($$13, $$0));
      $$15.a($$5, new ha.e<>($$13, $$0));
      $$15.a($$6, bmo.a(bmo.a($$7), bmo.a(bmo.a(bmu.a(','), bmo.a($$6)))), $$3x -> {
         T $$4x = $$0.a($$3x.b($$7));
         return Optional.ofNullable($$3x.a($$6)).map($$1xx -> ad.a($$4x, $$1xx)).orElse(List.of($$4x));
      });
      $$15.a($$7, bmo.a(bmo.a($$8), bmo.a(bmo.a(bmu.a('|'), bmo.a($$7)))), $$2x -> {
         T $$3x = $$2x.b($$8);
         return Optional.ofNullable($$2x.a($$7)).map($$1xx -> ad.a($$3x, $$1xx)).orElse(List.of($$3x));
      });
      $$15.a($$8, bmo.b(bmo.a($$10), bmo.a(bmu.a('!'), bmo.a($$9))), $$2x -> $$2x.b($$10, $$9));
      $$15.a($$9, bmo.a($$10), $$2x -> $$0.a($$2x.b($$10)));
      $$15.a(
         $$10,
         bmo.b(bmo.a(bmo.a($$11), bmu.a('='), bmo.a(), bmo.a($$14)), bmo.a(bmo.a($$12), bmu.a('~'), bmo.a(), bmo.a($$14)), bmo.a($$11)),
         ($$4x, $$5x) -> {
            P $$6x = $$5x.a($$12);

            try {
               if ($$6x != null) {
                  uy $$7x = $$5x.b($$14);
                  return Optional.of($$0.b((ImmutableStringReader)$$4x.b(), $$6x, $$7x));
               } else {
                  C $$8x = $$5x.b($$11);
                  uy $$9x = $$5x.a($$14);
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
      $$15.a($$14, bmv.a);
      $$15.a($$13, bmq.a);
      return new bmp<>($$15, $$1);
   }

   static class a<T, C, P> extends bmr<ha.b<T, C, P>, C> {
      a(bmf<akr> $$0, ha.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected C a(ImmutableStringReader $$0, akr $$1) throws Exception {
         return this.a.c($$0, $$1);
      }

      @Override
      public Stream<akr> a() {
         return this.a.c();
      }
   }

   public interface b<T, C, P> {
      T a(ImmutableStringReader var1, akr var2) throws CommandSyntaxException;

      Stream<akr> a();

      T b(ImmutableStringReader var1, akr var2) throws CommandSyntaxException;

      Stream<akr> b();

      C c(ImmutableStringReader var1, akr var2) throws CommandSyntaxException;

      Stream<akr> c();

      T a(ImmutableStringReader var1, C var2, uy var3) throws CommandSyntaxException;

      T a(ImmutableStringReader var1, C var2);

      P d(ImmutableStringReader var1, akr var2) throws CommandSyntaxException;

      Stream<akr> d();

      T b(ImmutableStringReader var1, P var2, uy var3) throws CommandSyntaxException;

      T a(T var1);

      T a(List<T> var1);
   }

   static class c<T, C, P> extends bmr<ha.b<T, C, P>, T> {
      c(bmf<akr> $$0, ha.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, akr $$1) throws Exception {
         return this.a.a($$0, $$1);
      }

      @Override
      public Stream<akr> a() {
         return this.a.a();
      }
   }

   static class d<T, C, P> extends bmr<ha.b<T, C, P>, P> {
      d(bmf<akr> $$0, ha.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected P a(ImmutableStringReader $$0, akr $$1) throws Exception {
         return this.a.d($$0, $$1);
      }

      @Override
      public Stream<akr> a() {
         return this.a.d();
      }
   }

   static class e<T, C, P> extends bmr<ha.b<T, C, P>, T> {
      e(bmf<akr> $$0, ha.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, akr $$1) throws Exception {
         return this.a.b($$0, $$1);
      }

      @Override
      public Stream<akr> a() {
         return this.a.b();
      }
   }
}

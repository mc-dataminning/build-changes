import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class gx {
   public static <T, C, P> bme<List<T>> a(gx.b<T, C, P> $$0) {
      blu<List<T>> $$1 = blu.a("top");
      blu<Optional<T>> $$2 = blu.a("type");
      blu<azk> $$3 = blu.a("any_type");
      blu<T> $$4 = blu.a("element_type");
      blu<T> $$5 = blu.a("tag_type");
      blu<List<T>> $$6 = blu.a("conditions");
      blu<List<T>> $$7 = blu.a("alternatives");
      blu<T> $$8 = blu.a("term");
      blu<T> $$9 = blu.a("negation");
      blu<T> $$10 = blu.a("test");
      blu<C> $$11 = blu.a("component_type");
      blu<P> $$12 = blu.a("predicate_type");
      blu<akk> $$13 = blu.a("id");
      blu<uu> $$14 = blu.a("tag");
      blw<StringReader> $$15 = new blw<>();
      $$15.a($$1, bmd.b(bmd.a(bmd.a($$2), bmj.a('['), bmd.a(), bmd.a(bmd.a($$6)), bmj.a(']')), bmd.a($$2)), $$2x -> {
         Builder<T> $$3x = ImmutableList.builder();
         $$2x.b($$2).ifPresent($$3x::add);
         List<T> $$4x = $$2x.a($$6);
         if ($$4x != null) {
            $$3x.addAll($$4x);
         }

         return $$3x.build();
      });
      $$15.a($$2, bmd.b(bmd.a($$4), bmd.a(bmj.a('#'), bmd.a(), bmd.a($$5)), bmd.a($$3)), $$2x -> Optional.ofNullable($$2x.a($$4, $$5)));
      $$15.a($$3, bmj.a('*'), $$0x -> azk.a);
      $$15.a($$4, new gx.c<>($$13, $$0));
      $$15.a($$5, new gx.e<>($$13, $$0));
      $$15.a($$6, bmd.a(bmd.a($$7), bmd.a(bmd.a(bmj.a(','), bmd.a($$6)))), $$3x -> {
         T $$4x = $$0.a($$3x.b($$7));
         return Optional.ofNullable($$3x.a($$6)).map($$1xx -> ac.a($$4x, $$1xx)).orElse(List.of($$4x));
      });
      $$15.a($$7, bmd.a(bmd.a($$8), bmd.a(bmd.a(bmj.a('|'), bmd.a($$7)))), $$2x -> {
         T $$3x = $$2x.b($$8);
         return Optional.ofNullable($$2x.a($$7)).map($$1xx -> ac.a($$3x, $$1xx)).orElse(List.of($$3x));
      });
      $$15.a($$8, bmd.b(bmd.a($$10), bmd.a(bmj.a('!'), bmd.a($$9))), $$2x -> $$2x.b($$10, $$9));
      $$15.a($$9, bmd.a($$10), $$2x -> $$0.a($$2x.b($$10)));
      $$15.a(
         $$10,
         bmd.b(bmd.a(bmd.a($$11), bmj.a('='), bmd.a(), bmd.a($$14)), bmd.a(bmd.a($$12), bmj.a('~'), bmd.a(), bmd.a($$14)), bmd.a($$11)),
         ($$4x, $$5x) -> {
            P $$6x = $$5x.a($$12);

            try {
               if ($$6x != null) {
                  uu $$7x = $$5x.b($$14);
                  return Optional.of($$0.b((ImmutableStringReader)$$4x.b(), $$6x, $$7x));
               } else {
                  C $$8x = $$5x.b($$11);
                  uu $$9x = $$5x.a($$14);
                  return Optional.of($$9x != null ? $$0.a((ImmutableStringReader)$$4x.b(), $$8x, $$9x) : $$0.a((ImmutableStringReader)$$4x.b(), $$8x));
               }
            } catch (CommandSyntaxException var9x) {
               $$4x.a().a($$4x.c(), var9x);
               return Optional.empty();
            }
         }
      );
      $$15.a($$11, new gx.a<>($$13, $$0));
      $$15.a($$12, new gx.d<>($$13, $$0));
      $$15.a($$14, bmk.a);
      $$15.a($$13, bmf.a);
      return new bme<>($$15, $$1);
   }

   static class a<T, C, P> extends bmg<gx.b<T, C, P>, C> {
      a(blu<akk> $$0, gx.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected C a(ImmutableStringReader $$0, akk $$1) throws Exception {
         return this.a.c($$0, $$1);
      }

      @Override
      public Stream<akk> a() {
         return this.a.c();
      }
   }

   public interface b<T, C, P> {
      T a(ImmutableStringReader var1, akk var2) throws CommandSyntaxException;

      Stream<akk> a();

      T b(ImmutableStringReader var1, akk var2) throws CommandSyntaxException;

      Stream<akk> b();

      C c(ImmutableStringReader var1, akk var2) throws CommandSyntaxException;

      Stream<akk> c();

      T a(ImmutableStringReader var1, C var2, uu var3) throws CommandSyntaxException;

      T a(ImmutableStringReader var1, C var2);

      P d(ImmutableStringReader var1, akk var2) throws CommandSyntaxException;

      Stream<akk> d();

      T b(ImmutableStringReader var1, P var2, uu var3) throws CommandSyntaxException;

      T a(T var1);

      T a(List<T> var1);
   }

   static class c<T, C, P> extends bmg<gx.b<T, C, P>, T> {
      c(blu<akk> $$0, gx.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, akk $$1) throws Exception {
         return this.a.a($$0, $$1);
      }

      @Override
      public Stream<akk> a() {
         return this.a.a();
      }
   }

   static class d<T, C, P> extends bmg<gx.b<T, C, P>, P> {
      d(blu<akk> $$0, gx.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected P a(ImmutableStringReader $$0, akk $$1) throws Exception {
         return this.a.d($$0, $$1);
      }

      @Override
      public Stream<akk> a() {
         return this.a.d();
      }
   }

   static class e<T, C, P> extends bmg<gx.b<T, C, P>, T> {
      e(blu<akk> $$0, gx.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, akk $$1) throws Exception {
         return this.a.b($$0, $$1);
      }

      @Override
      public Stream<akk> a() {
         return this.a.b();
      }
   }
}

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class go {
   public static <T, C, P> bly<List<T>> a(go.b<T, C, P> $$0) {
      blo<List<T>> $$1 = blo.a("top");
      blo<Optional<T>> $$2 = blo.a("type");
      blo<azo> $$3 = blo.a("any_type");
      blo<T> $$4 = blo.a("element_type");
      blo<T> $$5 = blo.a("tag_type");
      blo<List<T>> $$6 = blo.a("conditions");
      blo<List<T>> $$7 = blo.a("alternatives");
      blo<T> $$8 = blo.a("term");
      blo<T> $$9 = blo.a("negation");
      blo<T> $$10 = blo.a("test");
      blo<C> $$11 = blo.a("component_type");
      blo<P> $$12 = blo.a("predicate_type");
      blo<akt> $$13 = blo.a("id");
      blo<vh> $$14 = blo.a("tag");
      blq<StringReader> $$15 = new blq<>();
      $$15.a($$1, blx.b(blx.a(blx.a($$2), bmd.a('['), blx.a(), blx.a(blx.a($$6)), bmd.a(']')), blx.a($$2)), $$2x -> {
         Builder<T> $$3x = ImmutableList.builder();
         $$2x.b($$2).ifPresent($$3x::add);
         List<T> $$4x = $$2x.a($$6);
         if ($$4x != null) {
            $$3x.addAll($$4x);
         }

         return $$3x.build();
      });
      $$15.a($$2, blx.b(blx.a($$4), blx.a(bmd.a('#'), blx.a(), blx.a($$5)), blx.a($$3)), $$2x -> Optional.ofNullable($$2x.a($$4, $$5)));
      $$15.a($$3, bmd.a('*'), $$0x -> azo.a);
      $$15.a($$4, new go.c<>($$13, $$0));
      $$15.a($$5, new go.e<>($$13, $$0));
      $$15.a($$6, blx.a(blx.a($$7), blx.a(blx.a(bmd.a(','), blx.a($$6)))), $$3x -> {
         T $$4x = $$0.a($$3x.b($$7));
         return Optional.ofNullable($$3x.a($$6)).map($$1xx -> ad.a($$4x, $$1xx)).orElse(List.of($$4x));
      });
      $$15.a($$7, blx.a(blx.a($$8), blx.a(blx.a(bmd.a('|'), blx.a($$7)))), $$2x -> {
         T $$3x = $$2x.b($$8);
         return Optional.ofNullable($$2x.a($$7)).map($$1xx -> ad.a($$3x, $$1xx)).orElse(List.of($$3x));
      });
      $$15.a($$8, blx.b(blx.a($$10), blx.a(bmd.a('!'), blx.a($$9))), $$2x -> $$2x.b($$10, $$9));
      $$15.a($$9, blx.a($$10), $$2x -> $$0.a($$2x.b($$10)));
      $$15.a(
         $$10,
         blx.b(blx.a(blx.a($$11), bmd.a('='), blx.a(), blx.a($$14)), blx.a(blx.a($$12), bmd.a('~'), blx.a(), blx.a($$14)), blx.a($$11)),
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
      $$15.a($$11, new go.a<>($$13, $$0));
      $$15.a($$12, new go.d<>($$13, $$0));
      $$15.a($$14, bme.a);
      $$15.a($$13, blz.a);
      return new bly<>($$15, $$1);
   }

   static class a<T, C, P> extends bma<go.b<T, C, P>, C> {
      a(blo<akt> $$0, go.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected C a(ImmutableStringReader $$0, akt $$1) throws Exception {
         return this.a.c($$0, $$1);
      }

      @Override
      public Stream<akt> a() {
         return this.a.c();
      }
   }

   public interface b<T, C, P> {
      T a(ImmutableStringReader var1, akt var2) throws CommandSyntaxException;

      Stream<akt> a();

      T b(ImmutableStringReader var1, akt var2) throws CommandSyntaxException;

      Stream<akt> b();

      C c(ImmutableStringReader var1, akt var2) throws CommandSyntaxException;

      Stream<akt> c();

      T a(ImmutableStringReader var1, C var2, vh var3) throws CommandSyntaxException;

      T a(ImmutableStringReader var1, C var2);

      P d(ImmutableStringReader var1, akt var2) throws CommandSyntaxException;

      Stream<akt> d();

      T b(ImmutableStringReader var1, P var2, vh var3) throws CommandSyntaxException;

      T a(T var1);

      T a(List<T> var1);
   }

   static class c<T, C, P> extends bma<go.b<T, C, P>, T> {
      c(blo<akt> $$0, go.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, akt $$1) throws Exception {
         return this.a.a($$0, $$1);
      }

      @Override
      public Stream<akt> a() {
         return this.a.a();
      }
   }

   static class d<T, C, P> extends bma<go.b<T, C, P>, P> {
      d(blo<akt> $$0, go.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected P a(ImmutableStringReader $$0, akt $$1) throws Exception {
         return this.a.d($$0, $$1);
      }

      @Override
      public Stream<akt> a() {
         return this.a.d();
      }
   }

   static class e<T, C, P> extends bma<go.b<T, C, P>, T> {
      e(blo<akt> $$0, go.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, akt $$1) throws Exception {
         return this.a.b($$0, $$1);
      }

      @Override
      public Stream<akt> a() {
         return this.a.b();
      }
   }
}

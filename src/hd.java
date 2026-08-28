import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class hd {
   public static <T, C, P> box<List<T>> a(hd.b<T, C, P> $$0) {
      bon<List<T>> $$1 = bon.a("top");
      bon<Optional<T>> $$2 = bon.a("type");
      bon<bbk> $$3 = bon.a("any_type");
      bon<T> $$4 = bon.a("element_type");
      bon<T> $$5 = bon.a("tag_type");
      bon<List<T>> $$6 = bon.a("conditions");
      bon<List<T>> $$7 = bon.a("alternatives");
      bon<T> $$8 = bon.a("term");
      bon<T> $$9 = bon.a("negation");
      bon<T> $$10 = bon.a("test");
      bon<C> $$11 = bon.a("component_type");
      bon<P> $$12 = bon.a("predicate_type");
      bon<alz> $$13 = bon.a("id");
      bon<vu> $$14 = bon.a("tag");
      bop<StringReader> $$15 = new bop<>();
      $$15.a($$1, bow.b(bow.a(bow.a($$2), bpc.a('['), bow.a(), bow.a(bow.a($$6)), bpc.a(']')), bow.a($$2)), $$2x -> {
         Builder<T> $$3x = ImmutableList.builder();
         $$2x.b($$2).ifPresent($$3x::add);
         List<T> $$4x = $$2x.a($$6);
         if ($$4x != null) {
            $$3x.addAll($$4x);
         }

         return $$3x.build();
      });
      $$15.a($$2, bow.b(bow.a($$4), bow.a(bpc.a('#'), bow.a(), bow.a($$5)), bow.a($$3)), $$2x -> Optional.ofNullable($$2x.a($$4, $$5)));
      $$15.a($$3, bpc.a('*'), $$0x -> bbk.a);
      $$15.a($$4, new hd.c<>($$13, $$0));
      $$15.a($$5, new hd.e<>($$13, $$0));
      $$15.a($$6, bow.a(bow.a($$7), bow.a(bow.a(bpc.a(','), bow.a($$6)))), $$3x -> {
         T $$4x = $$0.a($$3x.b($$7));
         return Optional.ofNullable($$3x.a($$6)).map($$1xx -> ae.a($$4x, $$1xx)).orElse(List.of($$4x));
      });
      $$15.a($$7, bow.a(bow.a($$8), bow.a(bow.a(bpc.a('|'), bow.a($$7)))), $$2x -> {
         T $$3x = $$2x.b($$8);
         return Optional.ofNullable($$2x.a($$7)).map($$1xx -> ae.a($$3x, $$1xx)).orElse(List.of($$3x));
      });
      $$15.a($$8, bow.b(bow.a($$10), bow.a(bpc.a('!'), bow.a($$9))), $$2x -> $$2x.b($$10, $$9));
      $$15.a($$9, bow.a($$10), $$2x -> $$0.a($$2x.b($$10)));
      $$15.a(
         $$10,
         bow.b(bow.a(bow.a($$11), bpc.a('='), bow.a(), bow.a($$14)), bow.a(bow.a($$12), bpc.a('~'), bow.a(), bow.a($$14)), bow.a($$11)),
         ($$4x, $$5x) -> {
            P $$6x = $$5x.a($$12);

            try {
               if ($$6x != null) {
                  vu $$7x = $$5x.b($$14);
                  return Optional.of($$0.b((ImmutableStringReader)$$4x.b(), $$6x, $$7x));
               } else {
                  C $$8x = $$5x.b($$11);
                  vu $$9x = $$5x.a($$14);
                  return Optional.of($$9x != null ? $$0.a((ImmutableStringReader)$$4x.b(), $$8x, $$9x) : $$0.a((ImmutableStringReader)$$4x.b(), $$8x));
               }
            } catch (CommandSyntaxException var9x) {
               $$4x.a().a($$4x.c(), var9x);
               return Optional.empty();
            }
         }
      );
      $$15.a($$11, new hd.a<>($$13, $$0));
      $$15.a($$12, new hd.d<>($$13, $$0));
      $$15.a($$14, bpd.a);
      $$15.a($$13, boy.a);
      return new box<>($$15, $$1);
   }

   static class a<T, C, P> extends boz<hd.b<T, C, P>, C> {
      a(bon<alz> $$0, hd.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected C a(ImmutableStringReader $$0, alz $$1) throws Exception {
         return this.a.c($$0, $$1);
      }

      @Override
      public Stream<alz> a() {
         return this.a.c();
      }
   }

   public interface b<T, C, P> {
      T a(ImmutableStringReader var1, alz var2) throws CommandSyntaxException;

      Stream<alz> a();

      T b(ImmutableStringReader var1, alz var2) throws CommandSyntaxException;

      Stream<alz> b();

      C c(ImmutableStringReader var1, alz var2) throws CommandSyntaxException;

      Stream<alz> c();

      T a(ImmutableStringReader var1, C var2, vu var3) throws CommandSyntaxException;

      T a(ImmutableStringReader var1, C var2);

      P d(ImmutableStringReader var1, alz var2) throws CommandSyntaxException;

      Stream<alz> d();

      T b(ImmutableStringReader var1, P var2, vu var3) throws CommandSyntaxException;

      T a(T var1);

      T a(List<T> var1);
   }

   static class c<T, C, P> extends boz<hd.b<T, C, P>, T> {
      c(bon<alz> $$0, hd.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, alz $$1) throws Exception {
         return this.a.a($$0, $$1);
      }

      @Override
      public Stream<alz> a() {
         return this.a.a();
      }
   }

   static class d<T, C, P> extends boz<hd.b<T, C, P>, P> {
      d(bon<alz> $$0, hd.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected P a(ImmutableStringReader $$0, alz $$1) throws Exception {
         return this.a.d($$0, $$1);
      }

      @Override
      public Stream<alz> a() {
         return this.a.d();
      }
   }

   static class e<T, C, P> extends boz<hd.b<T, C, P>, T> {
      e(bon<alz> $$0, hd.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, alz $$1) throws Exception {
         return this.a.b($$0, $$1);
      }

      @Override
      public Stream<alz> a() {
         return this.a.b();
      }
   }
}

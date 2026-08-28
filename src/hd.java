import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class hd {
   public static <T, C, P> bpb<List<T>> a(hd.b<T, C, P> $$0) {
      bor<List<T>> $$1 = bor.a("top");
      bor<Optional<T>> $$2 = bor.a("type");
      bor<bbk> $$3 = bor.a("any_type");
      bor<T> $$4 = bor.a("element_type");
      bor<T> $$5 = bor.a("tag_type");
      bor<List<T>> $$6 = bor.a("conditions");
      bor<List<T>> $$7 = bor.a("alternatives");
      bor<T> $$8 = bor.a("term");
      bor<T> $$9 = bor.a("negation");
      bor<T> $$10 = bor.a("test");
      bor<C> $$11 = bor.a("component_type");
      bor<P> $$12 = bor.a("predicate_type");
      bor<alz> $$13 = bor.a("id");
      bor<vu> $$14 = bor.a("tag");
      bot<StringReader> $$15 = new bot<>();
      $$15.a($$1, bpa.b(bpa.a(bpa.a($$2), bpg.a('['), bpa.a(), bpa.a(bpa.a($$6)), bpg.a(']')), bpa.a($$2)), $$2x -> {
         Builder<T> $$3x = ImmutableList.builder();
         $$2x.b($$2).ifPresent($$3x::add);
         List<T> $$4x = $$2x.a($$6);
         if ($$4x != null) {
            $$3x.addAll($$4x);
         }

         return $$3x.build();
      });
      $$15.a($$2, bpa.b(bpa.a($$4), bpa.a(bpg.a('#'), bpa.a(), bpa.a($$5)), bpa.a($$3)), $$2x -> Optional.ofNullable($$2x.a($$4, $$5)));
      $$15.a($$3, bpg.a('*'), $$0x -> bbk.a);
      $$15.a($$4, new hd.c<>($$13, $$0));
      $$15.a($$5, new hd.e<>($$13, $$0));
      $$15.a($$6, bpa.a(bpa.a($$7), bpa.a(bpa.a(bpg.a(','), bpa.a($$6)))), $$3x -> {
         T $$4x = $$0.a($$3x.b($$7));
         return Optional.ofNullable($$3x.a($$6)).map($$1xx -> ae.a($$4x, $$1xx)).orElse(List.of($$4x));
      });
      $$15.a($$7, bpa.a(bpa.a($$8), bpa.a(bpa.a(bpg.a('|'), bpa.a($$7)))), $$2x -> {
         T $$3x = $$2x.b($$8);
         return Optional.ofNullable($$2x.a($$7)).map($$1xx -> ae.a($$3x, $$1xx)).orElse(List.of($$3x));
      });
      $$15.a($$8, bpa.b(bpa.a($$10), bpa.a(bpg.a('!'), bpa.a($$9))), $$2x -> $$2x.b($$10, $$9));
      $$15.a($$9, bpa.a($$10), $$2x -> $$0.a($$2x.b($$10)));
      $$15.a(
         $$10,
         bpa.b(bpa.a(bpa.a($$11), bpg.a('='), bpa.a(), bpa.a($$14)), bpa.a(bpa.a($$12), bpg.a('~'), bpa.a(), bpa.a($$14)), bpa.a($$11)),
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
      $$15.a($$14, bph.a);
      $$15.a($$13, bpc.a);
      return new bpb<>($$15, $$1);
   }

   static class a<T, C, P> extends bpd<hd.b<T, C, P>, C> {
      a(bor<alz> $$0, hd.b<T, C, P> $$1) {
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

   static class c<T, C, P> extends bpd<hd.b<T, C, P>, T> {
      c(bor<alz> $$0, hd.b<T, C, P> $$1) {
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

   static class d<T, C, P> extends bpd<hd.b<T, C, P>, P> {
      d(bor<alz> $$0, hd.b<T, C, P> $$1) {
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

   static class e<T, C, P> extends bpd<hd.b<T, C, P>, T> {
      e(bor<alz> $$0, hd.b<T, C, P> $$1) {
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

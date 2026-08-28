import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class hd {
   public static <T, C, P> bpc<List<T>> a(hd.b<T, C, P> $$0) {
      bos<List<T>> $$1 = bos.a("top");
      bos<Optional<T>> $$2 = bos.a("type");
      bos<bbk> $$3 = bos.a("any_type");
      bos<T> $$4 = bos.a("element_type");
      bos<T> $$5 = bos.a("tag_type");
      bos<List<T>> $$6 = bos.a("conditions");
      bos<List<T>> $$7 = bos.a("alternatives");
      bos<T> $$8 = bos.a("term");
      bos<T> $$9 = bos.a("negation");
      bos<T> $$10 = bos.a("test");
      bos<C> $$11 = bos.a("component_type");
      bos<P> $$12 = bos.a("predicate_type");
      bos<alz> $$13 = bos.a("id");
      bos<vu> $$14 = bos.a("tag");
      bou<StringReader> $$15 = new bou<>();
      $$15.a($$1, bpb.b(bpb.a(bpb.a($$2), bph.a('['), bpb.a(), bpb.a(bpb.a($$6)), bph.a(']')), bpb.a($$2)), $$2x -> {
         Builder<T> $$3x = ImmutableList.builder();
         $$2x.b($$2).ifPresent($$3x::add);
         List<T> $$4x = $$2x.a($$6);
         if ($$4x != null) {
            $$3x.addAll($$4x);
         }

         return $$3x.build();
      });
      $$15.a($$2, bpb.b(bpb.a($$4), bpb.a(bph.a('#'), bpb.a(), bpb.a($$5)), bpb.a($$3)), $$2x -> Optional.ofNullable($$2x.a($$4, $$5)));
      $$15.a($$3, bph.a('*'), $$0x -> bbk.a);
      $$15.a($$4, new hd.c<>($$13, $$0));
      $$15.a($$5, new hd.e<>($$13, $$0));
      $$15.a($$6, bpb.a(bpb.a($$7), bpb.a(bpb.a(bph.a(','), bpb.a($$6)))), $$3x -> {
         T $$4x = $$0.a($$3x.b($$7));
         return Optional.ofNullable($$3x.a($$6)).map($$1xx -> ae.a($$4x, $$1xx)).orElse(List.of($$4x));
      });
      $$15.a($$7, bpb.a(bpb.a($$8), bpb.a(bpb.a(bph.a('|'), bpb.a($$7)))), $$2x -> {
         T $$3x = $$2x.b($$8);
         return Optional.ofNullable($$2x.a($$7)).map($$1xx -> ae.a($$3x, $$1xx)).orElse(List.of($$3x));
      });
      $$15.a($$8, bpb.b(bpb.a($$10), bpb.a(bph.a('!'), bpb.a($$9))), $$2x -> $$2x.b($$10, $$9));
      $$15.a($$9, bpb.a($$10), $$2x -> $$0.a($$2x.b($$10)));
      $$15.a(
         $$10,
         bpb.b(bpb.a(bpb.a($$11), bph.a('='), bpb.a(), bpb.a($$14)), bpb.a(bpb.a($$12), bph.a('~'), bpb.a(), bpb.a($$14)), bpb.a($$11)),
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
      $$15.a($$14, bpi.a);
      $$15.a($$13, bpd.a);
      return new bpc<>($$15, $$1);
   }

   static class a<T, C, P> extends bpe<hd.b<T, C, P>, C> {
      a(bos<alz> $$0, hd.b<T, C, P> $$1) {
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

   static class c<T, C, P> extends bpe<hd.b<T, C, P>, T> {
      c(bos<alz> $$0, hd.b<T, C, P> $$1) {
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

   static class d<T, C, P> extends bpe<hd.b<T, C, P>, P> {
      d(bos<alz> $$0, hd.b<T, C, P> $$1) {
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

   static class e<T, C, P> extends bpe<hd.b<T, C, P>, T> {
      e(bos<alz> $$0, hd.b<T, C, P> $$1) {
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

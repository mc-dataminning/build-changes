import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class hf {
   public static <T, C, P> bpk<List<T>> a(hf.b<T, C, P> $$0) {
      bpa<List<T>> $$1 = bpa.a("top");
      bpa<Optional<T>> $$2 = bpa.a("type");
      bpa<baq> $$3 = bpa.a("any_type");
      bpa<T> $$4 = bpa.a("element_type");
      bpa<T> $$5 = bpa.a("tag_type");
      bpa<List<T>> $$6 = bpa.a("conditions");
      bpa<List<T>> $$7 = bpa.a("alternatives");
      bpa<T> $$8 = bpa.a("term");
      bpa<T> $$9 = bpa.a("negation");
      bpa<T> $$10 = bpa.a("test");
      bpa<C> $$11 = bpa.a("component_type");
      bpa<P> $$12 = bpa.a("predicate_type");
      bpa<ald> $$13 = bpa.a("id");
      bpa<ut> $$14 = bpa.a("tag");
      bpc<StringReader> $$15 = new bpc<>();
      $$15.a($$1, bpj.b(bpj.a(bpj.a($$2), bpp.a('['), bpj.a(), bpj.a(bpj.a($$6)), bpp.a(']')), bpj.a($$2)), $$2x -> {
         Builder<T> $$3x = ImmutableList.builder();
         $$2x.b($$2).ifPresent($$3x::add);
         List<T> $$4x = $$2x.a($$6);
         if ($$4x != null) {
            $$3x.addAll($$4x);
         }

         return $$3x.build();
      });
      $$15.a($$2, bpj.b(bpj.a($$4), bpj.a(bpp.a('#'), bpj.a(), bpj.a($$5)), bpj.a($$3)), $$2x -> Optional.ofNullable($$2x.a($$4, $$5)));
      $$15.a($$3, bpp.a('*'), $$0x -> baq.a);
      $$15.a($$4, new hf.c<>($$13, $$0));
      $$15.a($$5, new hf.e<>($$13, $$0));
      $$15.a($$6, bpj.a(bpj.a($$7), bpj.a(bpj.a(bpp.a(','), bpj.a($$6)))), $$3x -> {
         T $$4x = $$0.a($$3x.b($$7));
         return Optional.ofNullable($$3x.a($$6)).map($$1xx -> af.a($$4x, $$1xx)).orElse(List.of($$4x));
      });
      $$15.a($$7, bpj.a(bpj.a($$8), bpj.a(bpj.a(bpp.a('|'), bpj.a($$7)))), $$2x -> {
         T $$3x = $$2x.b($$8);
         return Optional.ofNullable($$2x.a($$7)).map($$1xx -> af.a($$3x, $$1xx)).orElse(List.of($$3x));
      });
      $$15.a($$8, bpj.b(bpj.a($$10), bpj.a(bpp.a('!'), bpj.a($$9))), $$2x -> $$2x.b($$10, $$9));
      $$15.a($$9, bpj.a($$10), $$2x -> $$0.a($$2x.b($$10)));
      $$15.a(
         $$10,
         bpj.b(bpj.a(bpj.a($$11), bpp.a('='), bpj.a(), bpj.a($$14)), bpj.a(bpj.a($$12), bpp.a('~'), bpj.a(), bpj.a($$14)), bpj.a($$11)),
         ($$4x, $$5x) -> {
            P $$6x = $$5x.a($$12);

            try {
               if ($$6x != null) {
                  ut $$7x = $$5x.b($$14);
                  return Optional.of($$0.b((ImmutableStringReader)$$4x.b(), $$6x, $$7x));
               } else {
                  C $$8x = $$5x.b($$11);
                  ut $$9x = $$5x.a($$14);
                  return Optional.of($$9x != null ? $$0.a((ImmutableStringReader)$$4x.b(), $$8x, $$9x) : $$0.a((ImmutableStringReader)$$4x.b(), $$8x));
               }
            } catch (CommandSyntaxException var9x) {
               $$4x.a().a($$4x.c(), var9x);
               return Optional.empty();
            }
         }
      );
      $$15.a($$11, new hf.a<>($$13, $$0));
      $$15.a($$12, new hf.d<>($$13, $$0));
      $$15.a($$14, bpq.a);
      $$15.a($$13, bpl.a);
      return new bpk<>($$15, $$1);
   }

   static class a<T, C, P> extends bpm<hf.b<T, C, P>, C> {
      a(bpa<ald> $$0, hf.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected C a(ImmutableStringReader $$0, ald $$1) throws Exception {
         return this.a.c($$0, $$1);
      }

      @Override
      public Stream<ald> a() {
         return this.a.c();
      }
   }

   public interface b<T, C, P> {
      T a(ImmutableStringReader var1, ald var2) throws CommandSyntaxException;

      Stream<ald> a();

      T b(ImmutableStringReader var1, ald var2) throws CommandSyntaxException;

      Stream<ald> b();

      C c(ImmutableStringReader var1, ald var2) throws CommandSyntaxException;

      Stream<ald> c();

      T a(ImmutableStringReader var1, C var2, ut var3) throws CommandSyntaxException;

      T a(ImmutableStringReader var1, C var2);

      P d(ImmutableStringReader var1, ald var2) throws CommandSyntaxException;

      Stream<ald> d();

      T b(ImmutableStringReader var1, P var2, ut var3) throws CommandSyntaxException;

      T a(T var1);

      T a(List<T> var1);
   }

   static class c<T, C, P> extends bpm<hf.b<T, C, P>, T> {
      c(bpa<ald> $$0, hf.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, ald $$1) throws Exception {
         return this.a.a($$0, $$1);
      }

      @Override
      public Stream<ald> a() {
         return this.a.a();
      }
   }

   static class d<T, C, P> extends bpm<hf.b<T, C, P>, P> {
      d(bpa<ald> $$0, hf.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected P a(ImmutableStringReader $$0, ald $$1) throws Exception {
         return this.a.d($$0, $$1);
      }

      @Override
      public Stream<ald> a() {
         return this.a.d();
      }
   }

   static class e<T, C, P> extends bpm<hf.b<T, C, P>, T> {
      e(bpa<ald> $$0, hf.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, ald $$1) throws Exception {
         return this.a.b($$0, $$1);
      }

      @Override
      public Stream<ald> a() {
         return this.a.b();
      }
   }
}

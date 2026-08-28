import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.JavaOps;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class gr {
   public static <T, C, P> bqf<List<T>> a(gr.b<T, C, P> $$0) {
      bpr<List<T>> $$1 = bpr.a("top");
      bpr<Optional<T>> $$2 = bpr.a("type");
      bpr<baw> $$3 = bpr.a("any_type");
      bpr<T> $$4 = bpr.a("element_type");
      bpr<T> $$5 = bpr.a("tag_type");
      bpr<List<T>> $$6 = bpr.a("conditions");
      bpr<List<T>> $$7 = bpr.a("alternatives");
      bpr<T> $$8 = bpr.a("term");
      bpr<T> $$9 = bpr.a("negation");
      bpr<T> $$10 = bpr.a("test");
      bpr<C> $$11 = bpr.a("component_type");
      bpr<P> $$12 = bpr.a("predicate_type");
      bpr<ali> $$13 = bpr.a("id");
      bpr<Dynamic<?>> $$14 = bpr.a("tag");
      bpv<StringReader> $$15 = new bpv<>();
      bpy<StringReader, ali> $$16 = $$15.a($$13, bqk.a);
      bpy<StringReader, List<T>> $$17 = $$15.a($$1, bqd.b(bqd.a($$15.c($$2), bqo.a('['), bqd.c(), bqd.a($$15.c($$6)), bqo.a(']')), $$15.c($$2)), $$2x -> {
         Builder<T> $$3x = ImmutableList.builder();
         $$2x.b($$2).ifPresent($$3x::add);
         List<T> $$4x = $$2x.a($$6);
         if ($$4x != null) {
            $$3x.addAll($$4x);
         }

         return $$3x.build();
      });
      $$15.a($$2, bqd.b($$15.c($$4), bqd.a(bqo.a('#'), bqd.c(), $$15.c($$5)), $$15.c($$3)), $$2x -> Optional.ofNullable($$2x.b($$4, $$5)));
      $$15.a($$3, bqo.a('*'), $$0x -> baw.a);
      $$15.a($$4, new gr.c<>($$16, $$0));
      $$15.a($$5, new gr.e<>($$16, $$0));
      $$15.a($$6, bqd.a($$15.c($$7), bqd.a(bqd.a(bqo.a(','), $$15.c($$6)))), $$3x -> {
         T $$4x = $$0.a($$3x.b($$7));
         return Optional.ofNullable($$3x.a($$6)).map($$1xx -> ag.a($$4x, $$1xx)).orElse(List.of($$4x));
      });
      $$15.a($$7, bqd.a($$15.c($$8), bqd.a(bqd.a(bqo.a('|'), $$15.c($$7)))), $$2x -> {
         T $$3x = $$2x.b($$8);
         return Optional.ofNullable($$2x.a($$7)).map($$1xx -> ag.a($$3x, $$1xx)).orElse(List.of($$3x));
      });
      $$15.a($$8, bqd.b($$15.c($$10), bqd.a(bqo.a('!'), $$15.c($$9))), $$2x -> $$2x.c($$10, $$9));
      $$15.a($$9, $$15.c($$10), $$2x -> $$0.a($$2x.b($$10)));
      $$15.a(
         $$10, bqd.b(bqd.a($$15.c($$11), bqo.a('='), bqd.c(), $$15.c($$14)), bqd.a($$15.c($$12), bqo.a('~'), bqd.c(), $$15.c($$14)), $$15.c($$11)), $$4x -> {
            bqb $$5x = $$4x.a();
            P $$6x = $$5x.a($$12);

            try {
               if ($$6x != null) {
                  Dynamic<?> $$7x = $$5x.b($$14);
                  return $$0.b((ImmutableStringReader)$$4x.f(), $$6x, $$7x);
               } else {
                  C $$8x = $$5x.b($$11);
                  Dynamic<?> $$9x = $$5x.a($$14);
                  return $$9x != null ? $$0.a((ImmutableStringReader)$$4x.f(), $$8x, $$9x) : $$0.a((ImmutableStringReader)$$4x.f(), $$8x);
               }
            } catch (CommandSyntaxException var9x) {
               $$4x.b().a($$4x.g(), var9x);
               return null;
            }
         }
      );
      $$15.a($$11, new gr.a<>($$16, $$0));
      $$15.a($$12, new gr.d<>($$16, $$0));
      $$15.a($$14, new bqp(JavaOps.INSTANCE));
      return new bqf<>($$15, $$17);
   }

   static class a<T, C, P> extends bql<gr.b<T, C, P>, C> {
      a(bpy<StringReader, ali> $$0, gr.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected C a(ImmutableStringReader $$0, ali $$1) throws Exception {
         return this.a.c($$0, $$1);
      }

      @Override
      public Stream<ali> a() {
         return this.a.c();
      }
   }

   public interface b<T, C, P> {
      T a(ImmutableStringReader var1, ali var2) throws CommandSyntaxException;

      Stream<ali> a();

      T b(ImmutableStringReader var1, ali var2) throws CommandSyntaxException;

      Stream<ali> b();

      C c(ImmutableStringReader var1, ali var2) throws CommandSyntaxException;

      Stream<ali> c();

      T a(ImmutableStringReader var1, C var2, Dynamic<?> var3) throws CommandSyntaxException;

      T a(ImmutableStringReader var1, C var2);

      P d(ImmutableStringReader var1, ali var2) throws CommandSyntaxException;

      Stream<ali> d();

      T b(ImmutableStringReader var1, P var2, Dynamic<?> var3) throws CommandSyntaxException;

      T a(T var1);

      T a(List<T> var1);
   }

   static class c<T, C, P> extends bql<gr.b<T, C, P>, T> {
      c(bpy<StringReader, ali> $$0, gr.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, ali $$1) throws Exception {
         return this.a.a($$0, $$1);
      }

      @Override
      public Stream<ali> a() {
         return this.a.a();
      }
   }

   static class d<T, C, P> extends bql<gr.b<T, C, P>, P> {
      d(bpy<StringReader, ali> $$0, gr.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected P a(ImmutableStringReader $$0, ali $$1) throws Exception {
         return this.a.d($$0, $$1);
      }

      @Override
      public Stream<ali> a() {
         return this.a.d();
      }
   }

   static class e<T, C, P> extends bql<gr.b<T, C, P>, T> {
      e(bpy<StringReader, ali> $$0, gr.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, ali $$1) throws Exception {
         return this.a.b($$0, $$1);
      }

      @Override
      public Stream<ali> a() {
         return this.a.b();
      }
   }
}

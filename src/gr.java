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
   public static <T, C, P> bpz<List<T>> a(gr.b<T, C, P> $$0) {
      bpp<List<T>> $$1 = bpp.a("top");
      bpp<Optional<T>> $$2 = bpp.a("type");
      bpp<bau> $$3 = bpp.a("any_type");
      bpp<T> $$4 = bpp.a("element_type");
      bpp<T> $$5 = bpp.a("tag_type");
      bpp<List<T>> $$6 = bpp.a("conditions");
      bpp<List<T>> $$7 = bpp.a("alternatives");
      bpp<T> $$8 = bpp.a("term");
      bpp<T> $$9 = bpp.a("negation");
      bpp<T> $$10 = bpp.a("test");
      bpp<C> $$11 = bpp.a("component_type");
      bpp<P> $$12 = bpp.a("predicate_type");
      bpp<alg> $$13 = bpp.a("id");
      bpp<Dynamic<?>> $$14 = bpp.a("tag");
      bpr<StringReader> $$15 = new bpr<>();
      $$15.a($$1, bpy.b(bpy.a(bpy.a($$2), bqe.a('['), bpy.a(), bpy.a(bpy.a($$6)), bqe.a(']')), bpy.a($$2)), $$2x -> {
         Builder<T> $$3x = ImmutableList.builder();
         $$2x.b($$2).ifPresent($$3x::add);
         List<T> $$4x = $$2x.a($$6);
         if ($$4x != null) {
            $$3x.addAll($$4x);
         }

         return $$3x.build();
      });
      $$15.a($$2, bpy.b(bpy.a($$4), bpy.a(bqe.a('#'), bpy.a(), bpy.a($$5)), bpy.a($$3)), $$2x -> Optional.ofNullable($$2x.a($$4, $$5)));
      $$15.a($$3, bqe.a('*'), $$0x -> bau.a);
      $$15.a($$4, new gr.c<>($$13, $$0));
      $$15.a($$5, new gr.e<>($$13, $$0));
      $$15.a($$6, bpy.a(bpy.a($$7), bpy.a(bpy.a(bqe.a(','), bpy.a($$6)))), $$3x -> {
         T $$4x = $$0.a($$3x.b($$7));
         return Optional.ofNullable($$3x.a($$6)).map($$1xx -> ag.a($$4x, $$1xx)).orElse(List.of($$4x));
      });
      $$15.a($$7, bpy.a(bpy.a($$8), bpy.a(bpy.a(bqe.a('|'), bpy.a($$7)))), $$2x -> {
         T $$3x = $$2x.b($$8);
         return Optional.ofNullable($$2x.a($$7)).map($$1xx -> ag.a($$3x, $$1xx)).orElse(List.of($$3x));
      });
      $$15.a($$8, bpy.b(bpy.a($$10), bpy.a(bqe.a('!'), bpy.a($$9))), $$2x -> $$2x.b($$10, $$9));
      $$15.a($$9, bpy.a($$10), $$2x -> $$0.a($$2x.b($$10)));
      $$15.a(
         $$10,
         bpy.b(bpy.a(bpy.a($$11), bqe.a('='), bpy.a(), bpy.a($$14)), bpy.a(bpy.a($$12), bqe.a('~'), bpy.a(), bpy.a($$14)), bpy.a($$11)),
         ($$4x, $$5x) -> {
            P $$6x = $$5x.a($$12);

            try {
               if ($$6x != null) {
                  Dynamic<?> $$7x = $$5x.b($$14);
                  return Optional.of($$0.b((ImmutableStringReader)$$4x.b(), $$6x, $$7x));
               } else {
                  C $$8x = $$5x.b($$11);
                  Dynamic<?> $$9x = $$5x.a($$14);
                  return Optional.of($$9x != null ? $$0.a((ImmutableStringReader)$$4x.b(), $$8x, $$9x) : $$0.a((ImmutableStringReader)$$4x.b(), $$8x));
               }
            } catch (CommandSyntaxException var9x) {
               $$4x.a().a($$4x.c(), var9x);
               return Optional.empty();
            }
         }
      );
      $$15.a($$11, new gr.a<>($$13, $$0));
      $$15.a($$12, new gr.d<>($$13, $$0));
      $$15.a($$14, new bqf(JavaOps.INSTANCE));
      $$15.a($$13, bqa.a);
      return new bpz<>($$15, $$1);
   }

   static class a<T, C, P> extends bqb<gr.b<T, C, P>, C> {
      a(bpp<alg> $$0, gr.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected C a(ImmutableStringReader $$0, alg $$1) throws Exception {
         return this.a.c($$0, $$1);
      }

      @Override
      public Stream<alg> a() {
         return this.a.c();
      }
   }

   public interface b<T, C, P> {
      T a(ImmutableStringReader var1, alg var2) throws CommandSyntaxException;

      Stream<alg> a();

      T b(ImmutableStringReader var1, alg var2) throws CommandSyntaxException;

      Stream<alg> b();

      C c(ImmutableStringReader var1, alg var2) throws CommandSyntaxException;

      Stream<alg> c();

      T a(ImmutableStringReader var1, C var2, Dynamic<?> var3) throws CommandSyntaxException;

      T a(ImmutableStringReader var1, C var2);

      P d(ImmutableStringReader var1, alg var2) throws CommandSyntaxException;

      Stream<alg> d();

      T b(ImmutableStringReader var1, P var2, Dynamic<?> var3) throws CommandSyntaxException;

      T a(T var1);

      T a(List<T> var1);
   }

   static class c<T, C, P> extends bqb<gr.b<T, C, P>, T> {
      c(bpp<alg> $$0, gr.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, alg $$1) throws Exception {
         return this.a.a($$0, $$1);
      }

      @Override
      public Stream<alg> a() {
         return this.a.a();
      }
   }

   static class d<T, C, P> extends bqb<gr.b<T, C, P>, P> {
      d(bpp<alg> $$0, gr.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected P a(ImmutableStringReader $$0, alg $$1) throws Exception {
         return this.a.d($$0, $$1);
      }

      @Override
      public Stream<alg> a() {
         return this.a.d();
      }
   }

   static class e<T, C, P> extends bqb<gr.b<T, C, P>, T> {
      e(bpp<alg> $$0, gr.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, alg $$1) throws Exception {
         return this.a.b($$0, $$1);
      }

      @Override
      public Stream<alg> a() {
         return this.a.b();
      }
   }
}

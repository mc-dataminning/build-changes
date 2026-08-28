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

public class gq {
   public static <T, C, P> bpx<List<T>> a(gq.b<T, C, P> $$0) {
      bpn<List<T>> $$1 = bpn.a("top");
      bpn<Optional<T>> $$2 = bpn.a("type");
      bpn<bau> $$3 = bpn.a("any_type");
      bpn<T> $$4 = bpn.a("element_type");
      bpn<T> $$5 = bpn.a("tag_type");
      bpn<List<T>> $$6 = bpn.a("conditions");
      bpn<List<T>> $$7 = bpn.a("alternatives");
      bpn<T> $$8 = bpn.a("term");
      bpn<T> $$9 = bpn.a("negation");
      bpn<T> $$10 = bpn.a("test");
      bpn<C> $$11 = bpn.a("component_type");
      bpn<P> $$12 = bpn.a("predicate_type");
      bpn<alg> $$13 = bpn.a("id");
      bpn<Dynamic<?>> $$14 = bpn.a("tag");
      bpp<StringReader> $$15 = new bpp<>();
      $$15.a($$1, bpw.b(bpw.a(bpw.a($$2), bqc.a('['), bpw.a(), bpw.a(bpw.a($$6)), bqc.a(']')), bpw.a($$2)), $$2x -> {
         Builder<T> $$3x = ImmutableList.builder();
         $$2x.b($$2).ifPresent($$3x::add);
         List<T> $$4x = $$2x.a($$6);
         if ($$4x != null) {
            $$3x.addAll($$4x);
         }

         return $$3x.build();
      });
      $$15.a($$2, bpw.b(bpw.a($$4), bpw.a(bqc.a('#'), bpw.a(), bpw.a($$5)), bpw.a($$3)), $$2x -> Optional.ofNullable($$2x.a($$4, $$5)));
      $$15.a($$3, bqc.a('*'), $$0x -> bau.a);
      $$15.a($$4, new gq.c<>($$13, $$0));
      $$15.a($$5, new gq.e<>($$13, $$0));
      $$15.a($$6, bpw.a(bpw.a($$7), bpw.a(bpw.a(bqc.a(','), bpw.a($$6)))), $$3x -> {
         T $$4x = $$0.a($$3x.b($$7));
         return Optional.ofNullable($$3x.a($$6)).map($$1xx -> af.a($$4x, $$1xx)).orElse(List.of($$4x));
      });
      $$15.a($$7, bpw.a(bpw.a($$8), bpw.a(bpw.a(bqc.a('|'), bpw.a($$7)))), $$2x -> {
         T $$3x = $$2x.b($$8);
         return Optional.ofNullable($$2x.a($$7)).map($$1xx -> af.a($$3x, $$1xx)).orElse(List.of($$3x));
      });
      $$15.a($$8, bpw.b(bpw.a($$10), bpw.a(bqc.a('!'), bpw.a($$9))), $$2x -> $$2x.b($$10, $$9));
      $$15.a($$9, bpw.a($$10), $$2x -> $$0.a($$2x.b($$10)));
      $$15.a(
         $$10,
         bpw.b(bpw.a(bpw.a($$11), bqc.a('='), bpw.a(), bpw.a($$14)), bpw.a(bpw.a($$12), bqc.a('~'), bpw.a(), bpw.a($$14)), bpw.a($$11)),
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
      $$15.a($$11, new gq.a<>($$13, $$0));
      $$15.a($$12, new gq.d<>($$13, $$0));
      $$15.a($$14, new bqd(JavaOps.INSTANCE));
      $$15.a($$13, bpy.a);
      return new bpx<>($$15, $$1);
   }

   static class a<T, C, P> extends bpz<gq.b<T, C, P>, C> {
      a(bpn<alg> $$0, gq.b<T, C, P> $$1) {
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

   static class c<T, C, P> extends bpz<gq.b<T, C, P>, T> {
      c(bpn<alg> $$0, gq.b<T, C, P> $$1) {
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

   static class d<T, C, P> extends bpz<gq.b<T, C, P>, P> {
      d(bpn<alg> $$0, gq.b<T, C, P> $$1) {
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

   static class e<T, C, P> extends bpz<gq.b<T, C, P>, T> {
      e(bpn<alg> $$0, gq.b<T, C, P> $$1) {
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

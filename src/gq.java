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
   public static <T, C, P> bps<List<T>> a(gq.b<T, C, P> $$0) {
      bpi<List<T>> $$1 = bpi.a("top");
      bpi<Optional<T>> $$2 = bpi.a("type");
      bpi<bas> $$3 = bpi.a("any_type");
      bpi<T> $$4 = bpi.a("element_type");
      bpi<T> $$5 = bpi.a("tag_type");
      bpi<List<T>> $$6 = bpi.a("conditions");
      bpi<List<T>> $$7 = bpi.a("alternatives");
      bpi<T> $$8 = bpi.a("term");
      bpi<T> $$9 = bpi.a("negation");
      bpi<T> $$10 = bpi.a("test");
      bpi<C> $$11 = bpi.a("component_type");
      bpi<P> $$12 = bpi.a("predicate_type");
      bpi<ale> $$13 = bpi.a("id");
      bpi<Dynamic<?>> $$14 = bpi.a("tag");
      bpk<StringReader> $$15 = new bpk<>();
      $$15.a($$1, bpr.b(bpr.a(bpr.a($$2), bpx.a('['), bpr.a(), bpr.a(bpr.a($$6)), bpx.a(']')), bpr.a($$2)), $$2x -> {
         Builder<T> $$3x = ImmutableList.builder();
         $$2x.b($$2).ifPresent($$3x::add);
         List<T> $$4x = $$2x.a($$6);
         if ($$4x != null) {
            $$3x.addAll($$4x);
         }

         return $$3x.build();
      });
      $$15.a($$2, bpr.b(bpr.a($$4), bpr.a(bpx.a('#'), bpr.a(), bpr.a($$5)), bpr.a($$3)), $$2x -> Optional.ofNullable($$2x.a($$4, $$5)));
      $$15.a($$3, bpx.a('*'), $$0x -> bas.a);
      $$15.a($$4, new gq.c<>($$13, $$0));
      $$15.a($$5, new gq.e<>($$13, $$0));
      $$15.a($$6, bpr.a(bpr.a($$7), bpr.a(bpr.a(bpx.a(','), bpr.a($$6)))), $$3x -> {
         T $$4x = $$0.a($$3x.b($$7));
         return Optional.ofNullable($$3x.a($$6)).map($$1xx -> af.a($$4x, $$1xx)).orElse(List.of($$4x));
      });
      $$15.a($$7, bpr.a(bpr.a($$8), bpr.a(bpr.a(bpx.a('|'), bpr.a($$7)))), $$2x -> {
         T $$3x = $$2x.b($$8);
         return Optional.ofNullable($$2x.a($$7)).map($$1xx -> af.a($$3x, $$1xx)).orElse(List.of($$3x));
      });
      $$15.a($$8, bpr.b(bpr.a($$10), bpr.a(bpx.a('!'), bpr.a($$9))), $$2x -> $$2x.b($$10, $$9));
      $$15.a($$9, bpr.a($$10), $$2x -> $$0.a($$2x.b($$10)));
      $$15.a(
         $$10,
         bpr.b(bpr.a(bpr.a($$11), bpx.a('='), bpr.a(), bpr.a($$14)), bpr.a(bpr.a($$12), bpx.a('~'), bpr.a(), bpr.a($$14)), bpr.a($$11)),
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
      $$15.a($$14, new bpy(JavaOps.INSTANCE));
      $$15.a($$13, bpt.a);
      return new bps<>($$15, $$1);
   }

   static class a<T, C, P> extends bpu<gq.b<T, C, P>, C> {
      a(bpi<ale> $$0, gq.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected C a(ImmutableStringReader $$0, ale $$1) throws Exception {
         return this.a.c($$0, $$1);
      }

      @Override
      public Stream<ale> a() {
         return this.a.c();
      }
   }

   public interface b<T, C, P> {
      T a(ImmutableStringReader var1, ale var2) throws CommandSyntaxException;

      Stream<ale> a();

      T b(ImmutableStringReader var1, ale var2) throws CommandSyntaxException;

      Stream<ale> b();

      C c(ImmutableStringReader var1, ale var2) throws CommandSyntaxException;

      Stream<ale> c();

      T a(ImmutableStringReader var1, C var2, Dynamic<?> var3) throws CommandSyntaxException;

      T a(ImmutableStringReader var1, C var2);

      P d(ImmutableStringReader var1, ale var2) throws CommandSyntaxException;

      Stream<ale> d();

      T b(ImmutableStringReader var1, P var2, Dynamic<?> var3) throws CommandSyntaxException;

      T a(T var1);

      T a(List<T> var1);
   }

   static class c<T, C, P> extends bpu<gq.b<T, C, P>, T> {
      c(bpi<ale> $$0, gq.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, ale $$1) throws Exception {
         return this.a.a($$0, $$1);
      }

      @Override
      public Stream<ale> a() {
         return this.a.a();
      }
   }

   static class d<T, C, P> extends bpu<gq.b<T, C, P>, P> {
      d(bpi<ale> $$0, gq.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected P a(ImmutableStringReader $$0, ale $$1) throws Exception {
         return this.a.d($$0, $$1);
      }

      @Override
      public Stream<ale> a() {
         return this.a.d();
      }
   }

   static class e<T, C, P> extends bpu<gq.b<T, C, P>, T> {
      e(bpi<ale> $$0, gq.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, ale $$1) throws Exception {
         return this.a.b($$0, $$1);
      }

      @Override
      public Stream<ale> a() {
         return this.a.b();
      }
   }
}

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

public class gs {
   public static <T, C, P> bqh<List<T>> a(gs.b<T, C, P> $$0) {
      bpt<List<T>> $$1 = bpt.a("top");
      bpt<Optional<T>> $$2 = bpt.a("type");
      bpt<bay> $$3 = bpt.a("any_type");
      bpt<T> $$4 = bpt.a("element_type");
      bpt<T> $$5 = bpt.a("tag_type");
      bpt<List<T>> $$6 = bpt.a("conditions");
      bpt<List<T>> $$7 = bpt.a("alternatives");
      bpt<T> $$8 = bpt.a("term");
      bpt<T> $$9 = bpt.a("negation");
      bpt<T> $$10 = bpt.a("test");
      bpt<C> $$11 = bpt.a("component_type");
      bpt<P> $$12 = bpt.a("predicate_type");
      bpt<alk> $$13 = bpt.a("id");
      bpt<Dynamic<?>> $$14 = bpt.a("tag");
      bpx<StringReader> $$15 = new bpx<>();
      bqa<StringReader, alk> $$16 = $$15.a($$13, bqm.a);
      bqa<StringReader, List<T>> $$17 = $$15.a($$1, bqf.b(bqf.a($$15.c($$2), bqq.a('['), bqf.c(), bqf.a($$15.c($$6)), bqq.a(']')), $$15.c($$2)), $$2x -> {
         Builder<T> $$3x = ImmutableList.builder();
         $$2x.b($$2).ifPresent($$3x::add);
         List<T> $$4x = $$2x.a($$6);
         if ($$4x != null) {
            $$3x.addAll($$4x);
         }

         return $$3x.build();
      });
      $$15.a($$2, bqf.b($$15.c($$4), bqf.a(bqq.a('#'), bqf.c(), $$15.c($$5)), $$15.c($$3)), $$2x -> Optional.ofNullable($$2x.b($$4, $$5)));
      $$15.a($$3, bqq.a('*'), $$0x -> bay.a);
      $$15.a($$4, new gs.c<>($$16, $$0));
      $$15.a($$5, new gs.e<>($$16, $$0));
      $$15.a($$6, bqf.a($$15.c($$7), bqf.a(bqf.a(bqq.a(','), $$15.c($$6)))), $$3x -> {
         T $$4x = $$0.a($$3x.b($$7));
         return Optional.ofNullable($$3x.a($$6)).map($$1xx -> ag.a($$4x, $$1xx)).orElse(List.of($$4x));
      });
      $$15.a($$7, bqf.a($$15.c($$8), bqf.a(bqf.a(bqq.a('|'), $$15.c($$7)))), $$2x -> {
         T $$3x = $$2x.b($$8);
         return Optional.ofNullable($$2x.a($$7)).map($$1xx -> ag.a($$3x, $$1xx)).orElse(List.of($$3x));
      });
      $$15.a($$8, bqf.b($$15.c($$10), bqf.a(bqq.a('!'), $$15.c($$9))), $$2x -> $$2x.c($$10, $$9));
      $$15.a($$9, $$15.c($$10), $$2x -> $$0.a($$2x.b($$10)));
      $$15.a(
         $$10, bqf.b(bqf.a($$15.c($$11), bqq.a('='), bqf.c(), $$15.c($$14)), bqf.a($$15.c($$12), bqq.a('~'), bqf.c(), $$15.c($$14)), $$15.c($$11)), $$4x -> {
            bqd $$5x = $$4x.a();
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
      $$15.a($$11, new gs.a<>($$16, $$0));
      $$15.a($$12, new gs.d<>($$16, $$0));
      $$15.a($$14, new bqr(JavaOps.INSTANCE));
      return new bqh<>($$15, $$17);
   }

   static class a<T, C, P> extends bqn<gs.b<T, C, P>, C> {
      a(bqa<StringReader, alk> $$0, gs.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected C a(ImmutableStringReader $$0, alk $$1) throws Exception {
         return this.a.c($$0, $$1);
      }

      @Override
      public Stream<alk> a() {
         return this.a.c();
      }
   }

   public interface b<T, C, P> {
      T a(ImmutableStringReader var1, alk var2) throws CommandSyntaxException;

      Stream<alk> a();

      T b(ImmutableStringReader var1, alk var2) throws CommandSyntaxException;

      Stream<alk> b();

      C c(ImmutableStringReader var1, alk var2) throws CommandSyntaxException;

      Stream<alk> c();

      T a(ImmutableStringReader var1, C var2, Dynamic<?> var3) throws CommandSyntaxException;

      T a(ImmutableStringReader var1, C var2);

      P d(ImmutableStringReader var1, alk var2) throws CommandSyntaxException;

      Stream<alk> d();

      T b(ImmutableStringReader var1, P var2, Dynamic<?> var3) throws CommandSyntaxException;

      T a(T var1);

      T a(List<T> var1);
   }

   static class c<T, C, P> extends bqn<gs.b<T, C, P>, T> {
      c(bqa<StringReader, alk> $$0, gs.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, alk $$1) throws Exception {
         return this.a.a($$0, $$1);
      }

      @Override
      public Stream<alk> a() {
         return this.a.a();
      }
   }

   static class d<T, C, P> extends bqn<gs.b<T, C, P>, P> {
      d(bqa<StringReader, alk> $$0, gs.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected P a(ImmutableStringReader $$0, alk $$1) throws Exception {
         return this.a.d($$0, $$1);
      }

      @Override
      public Stream<alk> a() {
         return this.a.d();
      }
   }

   static class e<T, C, P> extends bqn<gs.b<T, C, P>, T> {
      e(bqa<StringReader, alk> $$0, gs.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, alk $$1) throws Exception {
         return this.a.b($$0, $$1);
      }

      @Override
      public Stream<alk> a() {
         return this.a.b();
      }
   }
}

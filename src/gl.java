import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class gl {
   public static <T, C, P> bls<List<T>> a(gl.b<T, C, P> $$0) {
      bli<List<T>> $$1 = bli.a("top");
      bli<Optional<T>> $$2 = bli.a("type");
      bli<azf> $$3 = bli.a("any_type");
      bli<T> $$4 = bli.a("element_type");
      bli<T> $$5 = bli.a("tag_type");
      bli<List<T>> $$6 = bli.a("conditions");
      bli<List<T>> $$7 = bli.a("alternatives");
      bli<T> $$8 = bli.a("term");
      bli<T> $$9 = bli.a("negation");
      bli<T> $$10 = bli.a("test");
      bli<C> $$11 = bli.a("component_type");
      bli<P> $$12 = bli.a("predicate_type");
      bli<akm> $$13 = bli.a("id");
      bli<va> $$14 = bli.a("tag");
      blk<StringReader> $$15 = new blk<>();
      $$15.a($$1, blr.b(blr.a(blr.a($$2), blx.a('['), blr.a(), blr.a(blr.a($$6)), blx.a(']')), blr.a($$2)), $$2x -> {
         Builder<T> $$3x = ImmutableList.builder();
         $$2x.b($$2).ifPresent($$3x::add);
         List<T> $$4x = $$2x.a($$6);
         if ($$4x != null) {
            $$3x.addAll($$4x);
         }

         return $$3x.build();
      });
      $$15.a($$2, blr.b(blr.a($$4), blr.a(blx.a('#'), blr.a(), blr.a($$5)), blr.a($$3)), $$2x -> Optional.ofNullable($$2x.a($$4, $$5)));
      $$15.a($$3, blx.a('*'), $$0x -> azf.a);
      $$15.a($$4, new gl.c<>($$13, $$0));
      $$15.a($$5, new gl.e<>($$13, $$0));
      $$15.a($$6, blr.a(blr.a($$7), blr.a(blr.a(blx.a(','), blr.a($$6)))), $$3x -> {
         T $$4x = $$0.a($$3x.b($$7));
         return Optional.ofNullable($$3x.a($$6)).map($$1xx -> ac.a($$4x, $$1xx)).orElse(List.of($$4x));
      });
      $$15.a($$7, blr.a(blr.a($$8), blr.a(blr.a(blx.a('|'), blr.a($$7)))), $$2x -> {
         T $$3x = $$2x.b($$8);
         return Optional.ofNullable($$2x.a($$7)).map($$1xx -> ac.a($$3x, $$1xx)).orElse(List.of($$3x));
      });
      $$15.a($$8, blr.b(blr.a($$10), blr.a(blx.a('!'), blr.a($$9))), $$2x -> $$2x.b($$10, $$9));
      $$15.a($$9, blr.a($$10), $$2x -> $$0.a($$2x.b($$10)));
      $$15.a(
         $$10,
         blr.b(blr.a(blr.a($$11), blx.a('='), blr.a(), blr.a($$14)), blr.a(blr.a($$12), blx.a('~'), blr.a(), blr.a($$14)), blr.a($$11)),
         ($$4x, $$5x) -> {
            P $$6x = $$5x.a($$12);

            try {
               if ($$6x != null) {
                  va $$7x = $$5x.b($$14);
                  return Optional.of($$0.b((ImmutableStringReader)$$4x.b(), $$6x, $$7x));
               } else {
                  C $$8x = $$5x.b($$11);
                  va $$9x = $$5x.a($$14);
                  return Optional.of($$9x != null ? $$0.a((ImmutableStringReader)$$4x.b(), $$8x, $$9x) : $$0.a((ImmutableStringReader)$$4x.b(), $$8x));
               }
            } catch (CommandSyntaxException var9x) {
               $$4x.a().a($$4x.c(), var9x);
               return Optional.empty();
            }
         }
      );
      $$15.a($$11, new gl.a<>($$13, $$0));
      $$15.a($$12, new gl.d<>($$13, $$0));
      $$15.a($$14, bly.a);
      $$15.a($$13, blt.a);
      return new bls<>($$15, $$1);
   }

   static class a<T, C, P> extends blu<gl.b<T, C, P>, C> {
      a(bli<akm> $$0, gl.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected C a(ImmutableStringReader $$0, akm $$1) throws Exception {
         return this.a.c($$0, $$1);
      }

      @Override
      public Stream<akm> a() {
         return this.a.c();
      }
   }

   public interface b<T, C, P> {
      T a(ImmutableStringReader var1, akm var2) throws CommandSyntaxException;

      Stream<akm> a();

      T b(ImmutableStringReader var1, akm var2) throws CommandSyntaxException;

      Stream<akm> b();

      C c(ImmutableStringReader var1, akm var2) throws CommandSyntaxException;

      Stream<akm> c();

      T a(ImmutableStringReader var1, C var2, va var3) throws CommandSyntaxException;

      T a(ImmutableStringReader var1, C var2);

      P d(ImmutableStringReader var1, akm var2) throws CommandSyntaxException;

      Stream<akm> d();

      T b(ImmutableStringReader var1, P var2, va var3) throws CommandSyntaxException;

      T a(T var1);

      T a(List<T> var1);
   }

   static class c<T, C, P> extends blu<gl.b<T, C, P>, T> {
      c(bli<akm> $$0, gl.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, akm $$1) throws Exception {
         return this.a.a($$0, $$1);
      }

      @Override
      public Stream<akm> a() {
         return this.a.a();
      }
   }

   static class d<T, C, P> extends blu<gl.b<T, C, P>, P> {
      d(bli<akm> $$0, gl.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected P a(ImmutableStringReader $$0, akm $$1) throws Exception {
         return this.a.d($$0, $$1);
      }

      @Override
      public Stream<akm> a() {
         return this.a.d();
      }
   }

   static class e<T, C, P> extends blu<gl.b<T, C, P>, T> {
      e(bli<akm> $$0, gl.b<T, C, P> $$1) {
         super($$0, $$1);
      }

      @Override
      protected T a(ImmutableStringReader $$0, akm $$1) throws Exception {
         return this.a.b($$0, $$1);
      }

      @Override
      public Stream<akm> a() {
         return this.a.b();
      }
   }
}

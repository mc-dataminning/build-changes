import com.mojang.brigadier.context.CommandContext;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class tp<T> implements tk, ts {
   static final ts a = Stream::empty;
   static final tk b = Stream::empty;
   private final ts c;
   private final tk d;
   private final ed e;
   private final Function<tp<T>, T> f;

   @Override
   public Stream<in> findStructureBlockPos() {
      return this.d.findStructureBlockPos();
   }

   tp(ed $$0, Function<tp<T>, T> $$1, ts $$2, tk $$3) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   T b() {
      return this.f.apply(this);
   }

   public ed a() {
      return this.e;
   }

   @Override
   public Stream<tq> findTestFunctions() {
      return this.c.findTestFunctions();
   }

   public static class a<T> {
      private final Function<tp<T>, T> a;
      private final UnaryOperator<Supplier<Stream<tq>>> b;
      private final UnaryOperator<Supplier<Stream<in>>> c;

      public a(Function<tp<T>, T> $$0) {
         this.a = $$0;
         this.b = $$0x -> $$0x;
         this.c = $$0x -> $$0x;
      }

      private a(Function<tp<T>, T> $$0, UnaryOperator<Supplier<Stream<tq>>> $$1, UnaryOperator<Supplier<Stream<in>>> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public tp.a<T> a(int $$0) {
         return new tp.a<>(this.a, b($$0), b($$0));
      }

      private static <Q> UnaryOperator<Supplier<Stream<Q>>> b(int $$0) {
         return $$1 -> {
            List<Q> $$2 = new LinkedList<>();
            List<Q> $$3 = ((Stream)$$1.get()).toList();

            for (int $$4 = 0; $$4 < $$0; $$4++) {
               $$2.addAll($$3);
            }

            return $$2::stream;
         };
      }

      private T a(ed $$0, ts $$1, tk $$2) {
         return new tp<>($$0, this.a, this.b.apply($$1::findTestFunctions)::get, this.c.apply($$2::findStructureBlockPos)::get).b();
      }

      public T a(CommandContext<ed> $$0, int $$1) {
         ed $$2 = (ed)$$0.getSource();
         return this.a($$2, tp.a, () -> tm.a($$1, $$2.d(), $$2.e()));
      }

      public T a(CommandContext<ed> $$0) {
         ed $$1 = (ed)$$0.getSource();
         in $$2 = in.a($$1.d());
         return this.a($$1, tp.a, () -> tm.b($$2, 15, $$1.e()).stream());
      }

      public T b(CommandContext<ed> $$0) {
         ed $$1 = (ed)$$0.getSource();
         in $$2 = in.a($$1.d());
         return this.a($$1, tp.a, () -> tm.c($$2, 200, $$1.e()));
      }

      public T c(CommandContext<ed> $$0) {
         ed $$1 = (ed)$$0.getSource();
         return this.a($$1, tp.a, () -> tm.a(in.a($$1.d()), $$1.i().K(), $$1.e()));
      }

      public T d(CommandContext<ed> $$0) {
         return this.a((ed)$$0.getSource(), () -> sy.a().stream().filter($$0x -> !$$0x.i()), tp.b);
      }

      public T a(CommandContext<ed> $$0, String $$1) {
         return this.a((ed)$$0.getSource(), () -> sy.a($$1).filter($$0xx -> !$$0xx.i()), tp.b);
      }

      public T a(CommandContext<ed> $$0, boolean $$1) {
         return this.a((ed)$$0.getSource(), () -> sy.c().filter($$1x -> !$$1 || $$1x.h()), tp.b);
      }

      public T b(CommandContext<ed> $$0, String $$1) {
         return this.a((ed)$$0.getSource(), () -> Stream.of(tr.a($$0, $$1)), tp.b);
      }

      public T e(CommandContext<ed> $$0) {
         return this.a($$0, false);
      }
   }
}

import com.mojang.brigadier.context.CommandContext;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class td<T> implements sy, tg {
   static final tg a = Stream::empty;
   static final sy b = Stream::empty;
   private final tg c;
   private final sy d;
   private final dv e;
   private final Function<td<T>, T> f;

   @Override
   public Stream<id> findStructureBlockPos() {
      return this.d.findStructureBlockPos();
   }

   td(dv $$0, Function<td<T>, T> $$1, tg $$2, sy $$3) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   T b() {
      return this.f.apply(this);
   }

   public dv a() {
      return this.e;
   }

   @Override
   public Stream<te> findTestFunctions() {
      return this.c.findTestFunctions();
   }

   public static class a<T> {
      private final Function<td<T>, T> a;
      private final UnaryOperator<Supplier<Stream<te>>> b;
      private final UnaryOperator<Supplier<Stream<id>>> c;

      public a(Function<td<T>, T> $$0) {
         this.a = $$0;
         this.b = $$0x -> $$0x;
         this.c = $$0x -> $$0x;
      }

      private a(Function<td<T>, T> $$0, UnaryOperator<Supplier<Stream<te>>> $$1, UnaryOperator<Supplier<Stream<id>>> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public td.a<T> a(int $$0) {
         return new td.a<>(this.a, b($$0), b($$0));
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

      private T a(dv $$0, tg $$1, sy $$2) {
         return new td<>($$0, this.a, this.b.apply($$1::findTestFunctions)::get, this.c.apply($$2::findStructureBlockPos)::get).b();
      }

      public T a(CommandContext<dv> $$0, int $$1) {
         dv $$2 = (dv)$$0.getSource();
         return this.a($$2, td.a, () -> ta.a($$1, $$2.d(), $$2.e()));
      }

      public T a(CommandContext<dv> $$0) {
         dv $$1 = (dv)$$0.getSource();
         id $$2 = id.a($$1.d());
         return this.a($$1, td.a, () -> ta.b($$2, 15, $$1.e()).stream());
      }

      public T b(CommandContext<dv> $$0) {
         dv $$1 = (dv)$$0.getSource();
         id $$2 = id.a($$1.d());
         return this.a($$1, td.a, () -> ta.c($$2, 200, $$1.e()));
      }

      public T c(CommandContext<dv> $$0) {
         dv $$1 = (dv)$$0.getSource();
         return this.a($$1, td.a, () -> ta.a(id.a($$1.d()), $$1.i().K(), $$1.e()));
      }

      public T d(CommandContext<dv> $$0) {
         return this.a((dv)$$0.getSource(), () -> sm.a().stream().filter($$0x -> !$$0x.i()), td.b);
      }

      public T a(CommandContext<dv> $$0, String $$1) {
         return this.a((dv)$$0.getSource(), () -> sm.a($$1).filter($$0xx -> !$$0xx.i()), td.b);
      }

      public T a(CommandContext<dv> $$0, boolean $$1) {
         return this.a((dv)$$0.getSource(), () -> sm.c().filter($$1x -> !$$1 || $$1x.h()), td.b);
      }

      public T b(CommandContext<dv> $$0, String $$1) {
         return this.a((dv)$$0.getSource(), () -> Stream.of(tf.a($$0, $$1)), td.b);
      }

      public T e(CommandContext<dv> $$0) {
         return this.a($$0, false);
      }
   }
}
